/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.facade;

import co.edu.unbosque.dao.PacienteDAO;
import co.edu.unbosque.dto.CountData;

import co.edu.unbosque.entity.Paciente;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author eduardob
 */
public class PacienteFacade {
    
    private PacienteDAO pacienteDAO = new PacienteDAO();
    
    public PacienteFacade() {
    }
    
    public List<Paciente> listar() {
        pacienteDAO.beginTransaction();
        List<Paciente> result = pacienteDAO.findAll();
        pacienteDAO.commitAndCloseTransaction();
        return result;
    }
    
    public CountData pacienteCount(Date fecha1, Date fecha2, Date fecha3, Date fecha4) {
        
        pacienteDAO.beginTransaction();
        Query q1 = pacienteDAO.getQuery("Paciente.countPacientes");
        q1.setParameter(1, fecha1);
        q1.setParameter(2, fecha2);
        System.out.println(q1);
        
        List<Paciente> tmp1 = q1.getResultList();
        
        Query q2 = pacienteDAO.getQuery("Paciente.countPacientes");
        q2.setParameter(1, fecha3);
        q2.setParameter(2, fecha4);
        
        List<Paciente> tmp2 = q2.getResultList();
        
        pacienteDAO.commitAndCloseTransaction();
       
        CountData countEstancia = new CountData();       
        
        countEstancia.setCuenta(new Long (tmp1.size()));
        countEstancia.setCuentaTotal(new Long (tmp2.size()));

        //System.out.println("total pacientes por fecha: " + countEstancia.getCuenta());
        //System.out.println("total pacientes anual: " + countEstancia.getCunetaTotal());
        return countEstancia;
    }
    
}
