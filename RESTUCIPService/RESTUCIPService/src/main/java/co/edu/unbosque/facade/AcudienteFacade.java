/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.facade;

import co.edu.unbosque.dao.AcudienteDAO;
import co.edu.unbosque.entity.Acudiente;
import java.util.List;

/**
 *
 * @author eduardob
 */
public class AcudienteFacade {
    private AcudienteDAO acudienteDAO = new AcudienteDAO();

    public AcudienteFacade() {
    }

    public List<Acudiente> listar() {
        acudienteDAO.beginTransaction();
        List<Acudiente> result = acudienteDAO.findAll();
        acudienteDAO.commitAndCloseTransaction();
        return result;
    }
}
