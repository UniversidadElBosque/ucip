/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@XmlRootElement
public class LlaveSesion {

    private String nombre;
    private String token;

    public LlaveSesion() {
    }

    public LlaveSesion(String nombre, String token) {
        this.nombre = nombre;
        this.token = token;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
