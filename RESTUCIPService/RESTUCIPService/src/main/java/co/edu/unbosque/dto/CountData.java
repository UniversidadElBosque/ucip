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
public class CountData {
    
    private Long cuenta;
    private Long cuentaTotal;  

    public CountData() {
    }

    public CountData(Long cuenta, Long cuentaTotal) {
        this.cuenta = cuenta;
        this.cuentaTotal = cuentaTotal;
    }

    public Long getCuenta() {
        return cuenta;
    }

    public void setCuenta(Long cuenta) {
        this.cuenta = cuenta;
    }

    public Long getCuentaTotal() {
        return cuentaTotal;
    }

    public void setCuentaTotal(Long cuentaTotal) {
        this.cuentaTotal = cuentaTotal;
    }    
}
