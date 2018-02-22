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
@Table(name = "disfuncion_intestinal", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionIntestinal.findAll", query = "SELECT d FROM DisfuncionIntestinal d"),
    @NamedQuery(name = "DisfuncionIntestinal.findById", query = "SELECT d FROM DisfuncionIntestinal d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionIntestinal.findByDescenHb2", query = "SELECT d FROM DisfuncionIntestinal d WHERE d.descenHb2 = :descenHb2"),
    @NamedQuery(name = "DisfuncionIntestinal.findByFechaIntestinal", query = "SELECT d FROM DisfuncionIntestinal d WHERE d.fechaIntestinal = :fechaIntestinal"),
    @NamedQuery(name = "DisfuncionIntestinal.findByHipotension", query = "SELECT d FROM DisfuncionIntestinal d WHERE d.hipotension = :hipotension"),
    @NamedQuery(name = "DisfuncionIntestinal.findByIntestinal", query = "SELECT d FROM DisfuncionIntestinal d WHERE d.intestinal = :intestinal"),
    @NamedQuery(name = "DisfuncionIntestinal.findByPostcxGastriDuo", query = "SELECT d FROM DisfuncionIntestinal d WHERE d.postcxGastriDuo = :postcxGastriDuo")})
public class DisfuncionIntestinal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "descen_hb2")
    private String descenHb2;
    @Column(name = "fecha_intestinal")
    @Temporal(TemporalType.DATE)
    private Date fechaIntestinal;
    @Column(name = "hipotension")
    private String hipotension;
    @Column(name = "intestinal")
    private String intestinal;
    @Column(name = "postcx_gastri_duo")
    private String postcxGastriDuo;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionIntestinal() {
    }

    public DisfuncionIntestinal(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescenHb2() {
        return descenHb2;
    }

    public void setDescenHb2(String descenHb2) {
        this.descenHb2 = descenHb2;
    }

    public Date getFechaIntestinal() {
        return fechaIntestinal;
    }

    public void setFechaIntestinal(Date fechaIntestinal) {
        this.fechaIntestinal = fechaIntestinal;
    }

    public String getHipotension() {
        return hipotension;
    }

    public void setHipotension(String hipotension) {
        this.hipotension = hipotension;
    }

    public String getIntestinal() {
        return intestinal;
    }

    public void setIntestinal(String intestinal) {
        this.intestinal = intestinal;
    }

    public String getPostcxGastriDuo() {
        return postcxGastriDuo;
    }

    public void setPostcxGastriDuo(String postcxGastriDuo) {
        this.postcxGastriDuo = postcxGastriDuo;
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
        if (!(object instanceof DisfuncionIntestinal)) {
            return false;
        }
        DisfuncionIntestinal other = (DisfuncionIntestinal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionIntestinal[ id=" + id + " ]";
    }
    
}
