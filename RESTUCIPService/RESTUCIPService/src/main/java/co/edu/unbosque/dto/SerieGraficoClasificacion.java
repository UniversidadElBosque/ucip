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
public class SerieGraficoClasificacion {
    private  int value;
    private String name;

    public SerieGraficoClasificacion() {
    }

    public SerieGraficoClasificacion(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
