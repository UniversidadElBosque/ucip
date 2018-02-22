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
@Table(name = "nom_procedqxcardiovascular", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NomProcedqxcardiovascular.findAll", query = "SELECT n FROM NomProcedqxcardiovascular n"),
    @NamedQuery(name = "NomProcedqxcardiovascular.findById", query = "SELECT n FROM NomProcedqxcardiovascular n WHERE n.id = :id"),
    @NamedQuery(name = "NomProcedqxcardiovascular.findByNombre", query = "SELECT n FROM NomProcedqxcardiovascular n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "NomProcedqxcardiovascular.findByRiesgo", query = "SELECT n FROM NomProcedqxcardiovascular n WHERE n.riesgo = :riesgo")})
public class NomProcedqxcardiovascular implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombre", length = 255)
    private String nombre;
    @Column(name = "riesgo", length = 255)
    private String riesgo;

    public NomProcedqxcardiovascular() {
    }

    public NomProcedqxcardiovascular(Long id) {
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

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
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
        if (!(object instanceof NomProcedqxcardiovascular)) {
            return false;
        }
        NomProcedqxcardiovascular other = (NomProcedqxcardiovascular) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.NomProcedqxcardiovascular[ id=" + id + " ]";
    }
    
}
