/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.dao;

import co.edu.unbosque.entity.Paciente;



/**
 *
 * @author eduardob
 */
public class PacienteDAO extends GenericDAO<Paciente>  {    
    private static final long serialVersionUID = 1L;
 
    public PacienteDAO() {
        super(Paciente.class);
        
    }
}
