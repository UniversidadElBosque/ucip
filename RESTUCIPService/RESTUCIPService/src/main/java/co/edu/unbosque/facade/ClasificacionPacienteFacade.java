/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.facade;

import co.edu.unbosque.dao.ClasificacionPacienteDAO;
import co.edu.unbosque.entity.ClasificacionPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author eduardob
 */
public class ClasificacionPacienteFacade {

    private ClasificacionPacienteDAO clasPacienteDao = new ClasificacionPacienteDAO();

    public ClasificacionPacienteFacade() {
    }

    public List<ClasificacionPaciente> listarClasificacion() {
        clasPacienteDao.beginTransaction();
        List<ClasificacionPaciente> result = clasPacienteDao.listByNamedQuery("ClasificacionPaciente.findAll");
        clasPacienteDao.commitAndCloseTransaction();

        return result;
    }

    public List<ClasificacionPaciente> listarPorListaId(List<String> lstClasificacion) {

        List<Long> numsClasificacion = new ArrayList<Long>();
        for (String string : lstClasificacion) {
            numsClasificacion.add(new Long(string));
        }

        String valParamClasificacion = numsClasificacion.toString().replace("[", "").replaceAll("]", "").replaceAll(" ", "");

        clasPacienteDao.beginTransaction();
        Query q = clasPacienteDao.getQuery("ClasificacionPaciente.findByListaId");
        q.setParameter(1, valParamClasificacion);

        List<ClasificacionPaciente> result = q.getResultList();
        clasPacienteDao.commitAndCloseTransaction();

        return result;

    }

}
