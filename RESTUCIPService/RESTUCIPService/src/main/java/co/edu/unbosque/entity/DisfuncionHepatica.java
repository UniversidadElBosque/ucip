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
@Table(name = "disfuncion_hepatica", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionHepatica.findAll", query = "SELECT d FROM DisfuncionHepatica d"),
    @NamedQuery(name = "DisfuncionHepatica.findById", query = "SELECT d FROM DisfuncionHepatica d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionHepatica.findByBilirrubina", query = "SELECT d FROM DisfuncionHepatica d WHERE d.bilirrubina = :bilirrubina"),
    @NamedQuery(name = "DisfuncionHepatica.findByFechaHepatica", query = "SELECT d FROM DisfuncionHepatica d WHERE d.fechaHepatica = :fechaHepatica"),
    @NamedQuery(name = "DisfuncionHepatica.findByHepatica", query = "SELECT d FROM DisfuncionHepatica d WHERE d.hepatica = :hepatica"),
    @NamedQuery(name = "DisfuncionHepatica.findByTgo", query = "SELECT d FROM DisfuncionHepatica d WHERE d.tgo = :tgo"),
    @NamedQuery(name = "DisfuncionHepatica.findByTgp", query = "SELECT d FROM DisfuncionHepatica d WHERE d.tgp = :tgp")})
public class DisfuncionHepatica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "bilirrubina")
    private double bilirrubina;
    @Column(name = "fecha_hepatica")
    @Temporal(TemporalType.DATE)
    private Date fechaHepatica;
    @Column(name = "hepatica")
    private String hepatica;
    @Basic(optional = false)
    @Column(name = "tgo")
    private double tgo;
    @Basic(optional = false)
    @Column(name = "tgp")
    private double tgp;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionHepatica() {
    }

    public DisfuncionHepatica(Long id) {
        this.id = id;
    }

    public DisfuncionHepatica(Long id, double bilirrubina, double tgo, double tgp) {
        this.id = id;
        this.bilirrubina = bilirrubina;
        this.tgo = tgo;
        this.tgp = tgp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBilirrubina() {
        return bilirrubina;
    }

    public void setBilirrubina(double bilirrubina) {
        this.bilirrubina = bilirrubina;
    }

    public Date getFechaHepatica() {
        return fechaHepatica;
    }

    public void setFechaHepatica(Date fechaHepatica) {
        this.fechaHepatica = fechaHepatica;
    }

    public String getHepatica() {
        return hepatica;
    }

    public void setHepatica(String hepatica) {
        this.hepatica = hepatica;
    }

    public double getTgo() {
        return tgo;
    }

    public void setTgo(double tgo) {
        this.tgo = tgo;
    }

    public double getTgp() {
        return tgp;
    }

    public void setTgp(double tgp) {
        this.tgp = tgp;
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
        if (!(object instanceof DisfuncionHepatica)) {
            return false;
        }
        DisfuncionHepatica other = (DisfuncionHepatica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionHepatica[ id=" + id + " ]";
    }
    
}
