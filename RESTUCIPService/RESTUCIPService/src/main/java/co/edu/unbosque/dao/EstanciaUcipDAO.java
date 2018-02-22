/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.dao;

import co.edu.unbosque.entity.EstanciaUcip;

/**
 *
 * @author eduardob
 */
public class EstanciaUcipDAO extends GenericDAO<EstanciaUcip>{
     private static final long serialVersionUID = 1L;
 
    public EstanciaUcipDAO() {
        super(EstanciaUcip.class);        
    }
}
