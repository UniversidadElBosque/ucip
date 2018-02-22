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
@Table(name = "disfuncion_hematologica", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionHematologica.findAll", query = "SELECT d FROM DisfuncionHematologica d"),
    @NamedQuery(name = "DisfuncionHematologica.findById", query = "SELECT d FROM DisfuncionHematologica d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionHematologica.findByDescensoPlaquetas", query = "SELECT d FROM DisfuncionHematologica d WHERE d.descensoPlaquetas = :descensoPlaquetas"),
    @NamedQuery(name = "DisfuncionHematologica.findByFechaHematologica", query = "SELECT d FROM DisfuncionHematologica d WHERE d.fechaHematologica = :fechaHematologica"),
    @NamedQuery(name = "DisfuncionHematologica.findByHbdXSep", query = "SELECT d FROM DisfuncionHematologica d WHERE d.hbdXSep = :hbdXSep"),
    @NamedQuery(name = "DisfuncionHematologica.findByHematologica", query = "SELECT d FROM DisfuncionHematologica d WHERE d.hematologica = :hematologica"),
    @NamedQuery(name = "DisfuncionHematologica.findByInr", query = "SELECT d FROM DisfuncionHematologica d WHERE d.inr = :inr"),
    @NamedQuery(name = "DisfuncionHematologica.findByRecuentoPlaquetas", query = "SELECT d FROM DisfuncionHematologica d WHERE d.recuentoPlaquetas = :recuentoPlaquetas")})
public class DisfuncionHematologica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "descenso_plaquetas")
    private String descensoPlaquetas;
    @Column(name = "fecha_hematologica")
    @Temporal(TemporalType.DATE)
    private Date fechaHematologica;
    @Basic(optional = false)
    @Column(name = "hbd_x_sep")
    private double hbdXSep;
    @Column(name = "hematologica")
    private String hematologica;
    @Basic(optional = false)
    @Column(name = "inr")
    private double inr;
    @Column(name = "recuento_plaquetas")
    private String recuentoPlaquetas;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionHematologica() {
    }

    public DisfuncionHematologica(Long id) {
        this.id = id;
    }

    public DisfuncionHematologica(Long id, double hbdXSep, double inr) {
        this.id = id;
        this.hbdXSep = hbdXSep;
        this.inr = inr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescensoPlaquetas() {
        return descensoPlaquetas;
    }

    public void setDescensoPlaquetas(String descensoPlaquetas) {
        this.descensoPlaquetas = descensoPlaquetas;
    }

    public Date getFechaHematologica() {
        return fechaHematologica;
    }

    public void setFechaHematologica(Date fechaHematologica) {
        this.fechaHematologica = fechaHematologica;
    }

    public double getHbdXSep() {
        return hbdXSep;
    }

    public void setHbdXSep(double hbdXSep) {
        this.hbdXSep = hbdXSep;
    }

    public String getHematologica() {
        return hematologica;
    }

    public void setHematologica(String hematologica) {
        this.hematologica = hematologica;
    }

    public double getInr() {
        return inr;
    }

    public void setInr(double inr) {
        this.inr = inr;
    }

    public String getRecuentoPlaquetas() {
        return recuentoPlaquetas;
    }

    public void setRecuentoPlaquetas(String recuentoPlaquetas) {
        this.recuentoPlaquetas = recuentoPlaquetas;
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
        if (!(object instanceof DisfuncionHematologica)) {
            return false;
        }
        DisfuncionHematologica other = (DisfuncionHematologica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionHematologica[ id=" + id + " ]";
    }
    
}
