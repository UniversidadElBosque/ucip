/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "disfuncion_neurologica", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionNeurologica.findAll", query = "SELECT d FROM DisfuncionNeurologica d"),
    @NamedQuery(name = "DisfuncionNeurologica.findById", query = "SELECT d FROM DisfuncionNeurologica d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionNeurologica.findByDisminucionGlasgow", query = "SELECT d FROM DisfuncionNeurologica d WHERE d.disminucionGlasgow = :disminucionGlasgow"),
    @NamedQuery(name = "DisfuncionNeurologica.findByFechaDiag", query = "SELECT d FROM DisfuncionNeurologica d WHERE d.fechaDiag = :fechaDiag"),
    @NamedQuery(name = "DisfuncionNeurologica.findByGlasgow", query = "SELECT d FROM DisfuncionNeurologica d WHERE d.glasgow = :glasgow"),
    @NamedQuery(name = "DisfuncionNeurologica.findByNeurologica", query = "SELECT d FROM DisfuncionNeurologica d WHERE d.neurologica = :neurologica")})
public class DisfuncionNeurologica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "disminucion_glasgow")
    private String disminucionGlasgow;
    @Column(name = "fecha_diag")
    @Temporal(TemporalType.DATE)
    private Date fechaDiag;
    @Basic(optional = false)
    @Column(name = "glasgow")
    private int glasgow;
    @Column(name = "neurologica")
    private String neurologica;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionNeurologica() {
    }

    public DisfuncionNeurologica(Long id) {
        this.id = id;
    }

    public DisfuncionNeurologica(Long id, int glasgow) {
        this.id = id;
        this.glasgow = glasgow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisminucionGlasgow() {
        return disminucionGlasgow;
    }

    public void setDisminucionGlasgow(String disminucionGlasgow) {
        this.disminucionGlasgow = disminucionGlasgow;
    }

    public Date getFechaDiag() {
        return fechaDiag;
    }

    public void setFechaDiag(Date fechaDiag) {
        this.fechaDiag = fechaDiag;
    }

    public int getGlasgow() {
        return glasgow;
    }

    public void setGlasgow(int glasgow) {
        this.glasgow = glasgow;
    }

    public String getNeurologica() {
        return neurologica;
    }

    public void setNeurologica(String neurologica) {
        this.neurologica = neurologica;
    }

    public EstanciaUcip getEstancia() {
        return estancia;
    }

    public void setEstancia(EstanciaUcip estancia) {
        this.estancia = estancia;
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
        if (!(object instanceof DisfuncionNeurologica)) {
            return false;
        }
        DisfuncionNeurologica other = (DisfuncionNeurologica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionNeurologica[ id=" + id + " ]";
    }
    
}
