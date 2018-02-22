/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "aseguradora", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aseguradora.findAll", query = "SELECT a FROM Aseguradora a"),
    @NamedQuery(name = "Aseguradora.findById", query = "SELECT a FROM Aseguradora a WHERE a.id = :id"),
    @NamedQuery(name = "Aseguradora.findByNombre", query = "SELECT a FROM Aseguradora a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Aseguradora.findByTipoAsegurador", query = "SELECT a FROM Aseguradora a WHERE a.tipoAsegurador = :tipoAsegurador")})
public class Aseguradora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo_asegurador")
    private String tipoAsegurador;

    public Aseguradora() {
    }

    public Aseguradora(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAsegurador() {
        return tipoAsegurador;
    }

    public void setTipoAsegurador(String tipoAsegurador) {
        this.tipoAsegurador = tipoAsegurador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aseguradora)) {
            return false;
        }
        Aseguradora other = (Aseguradora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.Aseguradora[ id=" + id + " ]";
    }
    
}
