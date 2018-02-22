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
@Table(name = "disfuncion_renal", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionRenal.findAll", query = "SELECT d FROM DisfuncionRenal d"),
    @NamedQuery(name = "DisfuncionRenal.findById", query = "SELECT d FROM DisfuncionRenal d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionRenal.findByDiamasPeso", query = "SELECT d FROM DisfuncionRenal d WHERE d.diamasPeso = :diamasPeso"),
    @NamedQuery(name = "DisfuncionRenal.findByFechaRenal", query = "SELECT d FROM DisfuncionRenal d WHERE d.fechaRenal = :fechaRenal"),
    @NamedQuery(name = "DisfuncionRenal.findByPorcenGananciaPeso", query = "SELECT d FROM DisfuncionRenal d WHERE d.porcenGananciaPeso = :porcenGananciaPeso"),
    @NamedQuery(name = "DisfuncionRenal.findByRenal", query = "SELECT d FROM DisfuncionRenal d WHERE d.renal = :renal")})
public class DisfuncionRenal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "diamas_peso")
    private double diamasPeso;
    @Column(name = "fecha_renal")
    @Temporal(TemporalType.DATE)
    private Date fechaRenal;
    @Basic(optional = false)
    @Column(name = "porcen_ganancia_peso")
    private double porcenGananciaPeso;
    @Column(name = "renal")
    private String renal;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionRenal() {
    }

    public DisfuncionRenal(Long id) {
        this.id = id;
    }

    public DisfuncionRenal(Long id, double diamasPeso, double porcenGananciaPeso) {
        this.id = id;
        this.diamasPeso = diamasPeso;
        this.porcenGananciaPeso = porcenGananciaPeso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDiamasPeso() {
        return diamasPeso;
    }

    public void setDiamasPeso(double diamasPeso) {
        this.diamasPeso = diamasPeso;
    }

    public Date getFechaRenal() {
        return fechaRenal;
    }

    public void setFechaRenal(Date fechaRenal) {
        this.fechaRenal = fechaRenal;
    }

    public double getPorcenGananciaPeso() {
        return porcenGananciaPeso;
    }

    public void setPorcenGananciaPeso(double porcenGananciaPeso) {
        this.porcenGananciaPeso = porcenGananciaPeso;
    }

    public String getRenal() {
        return renal;
    }

    public void setRenal(String renal) {
        this.renal = renal;
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
        if (!(object instanceof DisfuncionRenal)) {
            return false;
        }
        DisfuncionRenal other = (DisfuncionRenal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionRenal[ id=" + id + " ]";
    }
    
}
