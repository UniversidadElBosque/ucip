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
public class DataSoporteVentilatorio {

    private double respiratora;
    private double promedioVentilatotio;

    public DataSoporteVentilatorio() {
    }

    public DataSoporteVentilatorio(double respiratora, double promedioVentilatotio) {
        this.respiratora = respiratora;
        this.promedioVentilatotio = promedioVentilatotio;
    }

    public double getRespiratora() {
        return respiratora;
    }

    public void setRespiratora(double respiratora) {
        this.respiratora = respiratora;
    }

    public double getPromedioVentilatotio() {
        return promedioVentilatotio;
    }

    public void setPromedioVentilatotio(double promedioVentilatotio) {
        this.promedioVentilatotio = promedioVentilatotio;
    }
}
