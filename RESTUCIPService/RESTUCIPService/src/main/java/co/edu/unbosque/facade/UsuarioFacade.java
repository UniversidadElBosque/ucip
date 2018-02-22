/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.facade;

import co.edu.unbosque.dao.UsuarioDAO;
import co.edu.unbosque.entity.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author eduardob
 */
public class UsuarioFacade {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public UsuarioFacade() {
    }

    private List<Usuario> listar() {
        usuarioDAO.beginTransaction();
        List<Usuario> result = usuarioDAO.findAll();
        usuarioDAO.commitAndCloseTransaction();
        return result;
    }

    public List<Usuario> validateUser(String usuario, String clave) {
        usuarioDAO.beginTransaction();
        Query q = usuarioDAO.validarUsuario("Usuario.findByClave");
        q.setParameter("clave", clave);
        q.setParameter("nombreUsuario", usuario);
        List<Usuario> listaUs = q.getResultList();
        usuarioDAO.commitAndCloseTransaction();
        return listaUs;
    }
}
