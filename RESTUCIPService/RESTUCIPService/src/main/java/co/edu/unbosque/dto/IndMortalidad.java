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
public class IndMortalidad {
    private int mortalidad;
    private double indicador;

    public IndMortalidad() {
    }

    public IndMortalidad(int mortalidad, double indicador) {
        this.mortalidad = mortalidad;
        this.indicador = indicador;
    }

    public int getMortalidad() {
        return mortalidad;
    }

    public void setMortalidad(int mortalidad) {
        this.mortalidad = mortalidad;
    }

    public double getIndicador() {
        return indicador;
    }

    public void setIndicador(double indicador) {
        this.indicador = indicador;
    }    
}
