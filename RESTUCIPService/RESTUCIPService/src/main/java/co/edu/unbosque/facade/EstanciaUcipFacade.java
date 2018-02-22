package co.edu.unbosque.facade;

import co.edu.unbosque.dao.EstanciaUcipDAO;
import co.edu.unbosque.dto.CountData;
import co.edu.unbosque.dto.DataSoporteVentilatorio;
import co.edu.unbosque.dto.IndMortalidad;
import co.edu.unbosque.dto.SerieGrafico;
import co.edu.unbosque.dto.SerieGraficoClasificacion;
import co.edu.unbosque.entity.EstanciaUcip;
import static java.lang.Double.NaN;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author eduardob
 */
public class EstanciaUcipFacade {

    private final EstanciaUcipDAO estanciaUcipDAO;

    public EstanciaUcipFacade() {
        this.estanciaUcipDAO = new EstanciaUcipDAO();
    }

    public List<EstanciaUcip> listar() {
        estanciaUcipDAO.beginTransaction();
        List<EstanciaUcip> result = estanciaUcipDAO.findAll();
        estanciaUcipDAO.commitAndCloseTransaction();
        return result;
    }

    public List<SerieGrafico> getEstadisticaIngresos(Date fechaDesde, Date fechaHasta) {

        estanciaUcipDAO.beginTransaction();
        Query q = estanciaUcipDAO.getQuery("EstanciaUcip.countIngresos");
        q.setParameter(1, fechaDesde);
        q.setParameter(2, fechaHasta);

        List<Object[]> tmp = q.getResultList();
        estanciaUcipDAO.commitAndCloseTransaction();

        List<SerieGrafico> result = new ArrayList<SerieGrafico>();
        for (Object[] objects : tmp) {
            SerieGrafico item = new SerieGrafico();
            item.setEjeX(objects[0].toString());
            item.setEjeY(new Double(objects[1].toString()));
            result.add(item);
        }

        return result;
    }

    public List<SerieGraficoClasificacion> getEstadisticaClasificacion(Date fechaDesde, Date fechaHasta) {

        estanciaUcipDAO.beginTransaction();
        Query q = estanciaUcipDAO.getQuery("EstanciaUcip.countByClasificacion");
        q.setParameter("fecha1", fechaDesde);
        q.setParameter("fecha2", fechaHasta);

        List<Object[]> tmp = q.getResultList();
        estanciaUcipDAO.commitAndCloseTransaction();

        List<SerieGraficoClasificacion> result = new ArrayList<SerieGraficoClasificacion>();
        for (Object[] objects : tmp) {
            SerieGraficoClasificacion item = new SerieGraficoClasificacion();

            item.setValue(new Integer(objects[1].toString()));
            item.setName(objects[0].toString() + ": " + item.getValue());
            // System.out.println("item value 1: " + new Integer (objects[1].toString()));
            //System.out.println("item value 0: " + objects[0].toString());

            System.out.println("x: " + item.getValue());
            System.out.println("y: " + item.getName());
            result.add(item);
        }
        System.out.println("resultado: " + result.size());
        return result;
    }

    public List<SerieGraficoClasificacion> getEstadisticaExtubacion(Date fechaDesde, Date fechaHasta) {

        estanciaUcipDAO.beginTransaction();
        Query q = estanciaUcipDAO.getQuery("SoporteVentilatorio.countByCausa");
        q.setParameter("fecha1", fechaDesde);
        q.setParameter("fecha2", fechaHasta);

        List<Object[]> tmp = q.getResultList();
        estanciaUcipDAO.commitAndCloseTransaction();

        List<SerieGraficoClasificacion> result = new ArrayList<SerieGraficoClasificacion>();
        for (Object[] objects : tmp) {
            SerieGraficoClasificacion item = new SerieGraficoClasificacion();

            item.setValue(new Integer(objects[1].toString()));
            item.setName(objects[0].toString() + ": " + item.getValue());
            // System.out.println("item value 1: " + new Integer (objects[1].toString()));
            //System.out.println("item value 0: " + objects[0].toString());

            System.out.println("x: " + item.getName());
            System.out.println("y: " + item.getValue());
            result.add(item);
        }
        System.out.println("resultado: " + result.size());
        return result;
    }

    public IndMortalidad getIndicadorMortalidad(Date fechaDesde, Date fechaHasta) {

        IndMortalidad indMortalidad = new IndMortalidad();
        estanciaUcipDAO.beginTransaction();
        double esperada = 0.0;

        Query q1 = estanciaUcipDAO.getQuery("VariablesDesenlaces.countByFecha");
        q1.setParameter("fecha1", fechaDesde);
        q1.setParameter("fecha2", fechaHasta);

        List<Object> tmp1 = q1.getResultList();
        double total = new Double(tmp1.get(0).toString());

        Query q2 = estanciaUcipDAO.getQuery("VariablesDesenlaces.countMortalidad");
        q2.setParameter("fecha1", fechaDesde);
        q2.setParameter("fecha2", fechaHasta);

        List<Object> tmp2 = q2.getResultList();
        double mortalidad = new Double(tmp2.get(0).toString());

        Query q3 = estanciaUcipDAO.getQuery("OrganosDisfuncionales.pmorrir");
        q3.setParameter("fecha1", fechaDesde);
        q3.setParameter("fecha2", fechaHasta);

        if (q3.getSingleResult() != null) {
            esperada = new Double(q3.getSingleResult().toString());
        }

        estanciaUcipDAO.commitAndCloseTransaction();

        Double indicador = ((mortalidad / total) * 100.0) / esperada;
        if (indicador.isNaN()) {
            indicador = 0.0;
        }

        indMortalidad.setIndicador(indicador);
        indMortalidad.setMortalidad((int) mortalidad);

        return indMortalidad;
    }

    public CountData getCountEstancias(Date fecha1, Date fecha2, Date fecha3, Date fecha4) {

        estanciaUcipDAO.beginTransaction();
        Query q1 = estanciaUcipDAO.getQuery("EstanciaUcip.findCountByIngreso");
        q1.setParameter("fecha1", fecha1);
        q1.setParameter("fecha2", fecha2);

        Long tmp1 = (Long) q1.getSingleResult();

        Query q2 = estanciaUcipDAO.getQuery("EstanciaUcip.findCountByIngreso");
        q2.setParameter("fecha1", fecha3);
        q2.setParameter("fecha2", fecha4);

        Long tmp2 = (Long) q2.getSingleResult();
        estanciaUcipDAO.commitAndCloseTransaction();

        CountData countEstancia = new CountData();

        countEstancia.setCuenta(tmp1);
        countEstancia.setCuentaTotal(tmp2);

        return countEstancia;
    }

    public DataSoporteVentilatorio getPacientesVentilados(Date fecha1, Date fecha2) {

        DataSoporteVentilatorio dataSoporteVentilatorio = new DataSoporteVentilatorio();
        double tmp3 = 0;

        estanciaUcipDAO.beginTransaction();
        Query q1 = estanciaUcipDAO.getQuery("DisfuncionRespiratoria.countByRespiratoria");
        q1.setParameter("fecha1", fecha1);
        q1.setParameter("fecha2", fecha2);

        double tmp1 = new Double(q1.getSingleResult().toString());

        Query q2 = estanciaUcipDAO.getQuery("DisfuncionRespiratoria.countTotalRespiratoria");
        q2.setParameter("fecha1", fecha1);
        q2.setParameter("fecha2", fecha2);

        double tmp2 = new Double(q2.getSingleResult().toString());

        Query q3 = estanciaUcipDAO.getQuery("SoporteVentilatorio.prueba");
        q3.setParameter("fecha1", fecha1);
        q3.setParameter("fecha2", fecha2);

        System.out.println("SoporteVentilatorio.prueba");

        if (q3.getSingleResult() != null) {
            tmp3 = new Double(q3.getSingleResult().toString());
        }

        Double respiratoria = (tmp1 / tmp2) * 100;

        if (respiratoria.isNaN()) {
            respiratoria = 0.0;
        }

        dataSoporteVentilatorio.setRespiratora(respiratoria);
        dataSoporteVentilatorio.setPromedioVentilatotio(tmp3);

        System.out.println("Promedio getRespiratora: " + dataSoporteVentilatorio.getRespiratora());
        System.out.println("Promedio getPromedioVentilatotio: " + dataSoporteVentilatorio.getPromedioVentilatotio());
        //System.out.println("Cuenta total estancia: " + countEstancia.getCunetaTotal());

        return dataSoporteVentilatorio;
    }

   public List<SerieGraficoClasificacion> getCausaMortalidad(Date fechaDesde, Date fechaHasta) {
        estanciaUcipDAO.beginTransaction();
        Query q = estanciaUcipDAO.getQuery("VariablesDesenlaces.countByMortalidad");
        q.setParameter("fecha1", fechaDesde);
        q.setParameter("fecha2", fechaHasta);

        List<Object[]> tmp = q.getResultList();
        estanciaUcipDAO.commitAndCloseTransaction();

        List<SerieGraficoClasificacion> result = new ArrayList<SerieGraficoClasificacion>();
        for (Object[] objects : tmp) {
            SerieGraficoClasificacion item = new SerieGraficoClasificacion();

            item.setValue(new Integer(objects[1].toString()));
            item.setName(objects[0].toString() + ": " + item.getValue());
            // System.out.println("item value 1: " + new Integer (objects[1].toString()));
            //System.out.println("item value 0: " + objects[0].toString());

            System.out.println("x: " + item.getName());
            System.out.println("y: " + item.getValue());
            result.add(item);
        }
        System.out.println("resultado: " + result.size());
        return result;
    }
}
