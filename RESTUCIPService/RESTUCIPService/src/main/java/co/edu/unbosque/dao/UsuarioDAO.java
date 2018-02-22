/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.dao;

import co.edu.unbosque.entity.Usuario;
import java.util.List;

/**
 *
 * @author eduardob
 */
public class UsuarioDAO extends GenericDAO<Usuario>{
    private static final long serialVersionUID = 1L;
 
    public UsuarioDAO() {
        super(Usuario.class);
    }     
    
}

