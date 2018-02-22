/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.facade;

import co.edu.unbosque.dao.DashItemDAO;
import co.edu.unbosque.entity.ClasificacionPaciente;
import co.edu.unbosque.entity.DashItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author eduardob
 */
public class DashItemFacade {

    private DashItemDAO dashItemDAO = new DashItemDAO();

    public DashItemFacade() {
    }

    /**
     * Lista las tablas (módulos) disponibles para consultar
     *
     * @return
     */
    public List<DashItem> listarTablas() {
        dashItemDAO.beginTransaction();
        List<DashItem> result = dashItemDAO.listByNamedQuery("DashItem.findTablas");
        dashItemDAO.commitAndCloseTransaction();
        return result;
    }

    /**
     * Lista los campos (variables) disponibles en una tabla dada
     *
     * @param padre Tabla padre
     * @return
     */
    public List<DashItem> listarPorTabla(DashItem padre) {
        dashItemDAO.beginTransaction();
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("idPadre", padre.getId());

        List<DashItem> result = dashItemDAO.listByNamedQuery("DashItem.findByPadre", param);
        dashItemDAO.commitAndCloseTransaction();

        return result;
    }

    /**
     * Lista los items dada una lista de variables
     *
     * @param lstVariables Lista de IDs de las variables
     * @return
     */
    public List<DashItem> listarPorListaId(List<String> lstVariables) {

        List<Long> numsVariables = new ArrayList<Long>();
        for (String string : lstVariables) {
            numsVariables.add(new Long(string));
        }

        String valParamVariables = numsVariables.toString().replace("[", "").replaceAll("]", "").replaceAll(" ", "");

        dashItemDAO.beginTransaction();
        Query q = dashItemDAO.getQuery("DashItem.findByListaId");
        q.setParameter(1, valParamVariables);

        List<DashItem> result = q.getResultList();
        dashItemDAO.commitAndCloseTransaction();

        return result;
    }

    /**
     * Lista los datos solicitados de acuerdo a una lista de items
     * seleccionados, de clasificaciones seleccionadas y de un rango de fecha
     *
     * @param lstVariables Lista de variables seleccionadas
     * @param lstClasificacion Lista de clasificaciones seleccionadas
     * @param fecha1 Fecha inicial
     * @param fecha2 Fecha final
     * @return
     */
    public String listarDatos(List<DashItem> lstVariables,
            List<ClasificacionPaciente> lstClasificacion,
            Date fecha1,
            Date fecha2) {
        final String inicial = " FROM estancia_ucip ";

        String select = "SELECT ";
        String joins = inicial;
        String where = " WHERE ";

        for (DashItem item : lstVariables) {

            if (item.getNivel() == 1) {
                //Es una tabla

                if (item.getId() == 1) {
                    //Si es la tabla acudiente
                    joins += "LEFT JOIN acudiente ON estancia_ucip.acudiente = acudiente.id ";
                    joins += "LEFT JOIN paciente_acudiente pa ON estancia_ucip.paciente = pa.paciente AND estancia_ucip.acudiente = pa.acudiente ";
                    select += " pa.parentesco,";
                } else if (item.getId() == 23) {
                    //Si es la tabla paciente
                    joins += "JOIN paciente ON estancia_ucip.paciente = paciente.id ";
                } else if (item.getId() == 6 || item.getId() == 14) {
                    //no hacer nada
                } else {
                    //Si es otra tabla, cruzar con estancia
                    joins += " LEFT JOIN " + item.getValor() + " ON estancia_ucip.id = " + item.getValor() + ".estancia ";
                }

                //Incluir campos de la tabla
                for (DashItem item2 : lstVariables) {

                    if (item2.getNivel() == 2 && item2.getIdPadre() == item.getId()) {
                        //Es un campo de la tabla que se está recorriendo
                        //Incluir campos en el select
                        System.out.println("item id: " + item2.getId());
                        if (item2.getId() == 73) {
                            //no hacer nada
                        } else if (item2.getId() == 72) {
                            //Si es la tabla diagnostico (campo cie_diez)
                            select += " (select string_agg(c.codigo_cie||' '||nombre_cie, ' -- ') from diagnostico d join cie_diez c on d.id_cie10=c.id where d.estancia = estancia_ucip.id) cie10,";
                        } else {
                            select += item.getValor() + "." + item2.getValor() + ",";
                        }
                    }
                }

            }

        }

        //Quitando última coma
        select = select.substring(0, select.length() - 1);

        //Filtrando clasificaciones de paciente
        String txtClasificaciones = " estancia_ucip.clasificacion_paciente IN (";
        for (ClasificacionPaciente clasificacion : lstClasificacion) {
            txtClasificaciones += "'" + clasificacion.getValor() + "',";
        }
        txtClasificaciones = txtClasificaciones.substring(0, txtClasificaciones.length() - 1);
        txtClasificaciones += ") ";

        where += txtClasificaciones;

        //Filtrando el rango de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String txtFechas = String.format(" AND estancia_ucip.fecha_ingreso >= '%s' AND estancia_ucip.fecha_ingreso <= '%s' ", sdf.format(fecha1), sdf.format(fecha2));

        where += txtFechas;

        String sql = select + joins + where;
        sql = "SELECT array_to_json(array_agg(t)) FROM (" + sql + ")t ";

        System.out.println(
                "sql " + sql);

        dashItemDAO.beginTransaction();
        List<Object> result = dashItemDAO.ejecutarSQLNativo(sql);
        String JSON = "[]";
        if (result.get(0) != null) {
            JSON = result.get(0).toString();
        }

        dashItemDAO.commitAndCloseTransaction();

        return JSON;
    }

}
