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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "organos_disfuncionales", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrganosDisfuncionales.pmorrir", query = "SELECT AVG(o.pmorrir) FROM OrganosDisfuncionales o WHERE o.estancia.fechaIngreso >= :fecha1 AND o.estancia.fechaIngreso <= :fecha2"),
    @NamedQuery(name = "OrganosDisfuncionales.findAll", query = "SELECT o FROM OrganosDisfuncionales o"),
    @NamedQuery(name = "OrganosDisfuncionales.findById", query = "SELECT o FROM OrganosDisfuncionales o WHERE o.id = :id"),
    @NamedQuery(name = "OrganosDisfuncionales.findByNumeroOrgDis", query = "SELECT o FROM OrganosDisfuncionales o WHERE o.numeroOrgDis = :numeroOrgDis"),
    @NamedQuery(name = "OrganosDisfuncionales.findByPelod", query = "SELECT o FROM OrganosDisfuncionales o WHERE o.pelod = :pelod"),
    @NamedQuery(name = "OrganosDisfuncionales.findByPelodMorrir", query = "SELECT o FROM OrganosDisfuncionales o WHERE o.pelodMorrir = :pelodMorrir"),
    @NamedQuery(name = "OrganosDisfuncionales.findByPmorrir", query = "SELECT o FROM OrganosDisfuncionales o WHERE o.pmorrir = :pmorrir"),
    @NamedQuery(name = "OrganosDisfuncionales.findByPrism", query = "SELECT o FROM OrganosDisfuncionales o WHERE o.prism = :prism")})
public class OrganosDisfuncionales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "numero_org_dis", nullable = false)
    private int numeroOrgDis;
    @Basic(optional = false)
    @Column(name = "pelod", nullable = false)
    private double pelod;
    @Basic(optional = false)
    @Column(name = "pelod_morrir", nullable = false)
    private double pelodMorrir;
    @Basic(optional = false)
    @Column(name = "pmorrir", nullable = false)
    private double pmorrir;
    @Basic(optional = false)
    @Column(name = "prism", nullable = false)
    private double prism;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public OrganosDisfuncionales() {
    }

    public OrganosDisfuncionales(Long id) {
        this.id = id;
    }

    public OrganosDisfuncionales(Long id, int numeroOrgDis, double pelod, double pelodMorrir, double pmorrir, double prism) {
        this.id = id;
        this.numeroOrgDis = numeroOrgDis;
        this.pelod = pelod;
        this.pelodMorrir = pelodMorrir;
        this.pmorrir = pmorrir;
        this.prism = prism;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroOrgDis() {
        return numeroOrgDis;
    }

    public void setNumeroOrgDis(int numeroOrgDis) {
        this.numeroOrgDis = numeroOrgDis;
    }

    public double getPelod() {
        return pelod;
    }

    public void setPelod(double pelod) {
        this.pelod = pelod;
    }

    public double getPelodMorrir() {
        return pelodMorrir;
    }

    public void setPelodMorrir(double pelodMorrir) {
        this.pelodMorrir = pelodMorrir;
    }

    public double getPmorrir() {
        return pmorrir;
    }

    public void setPmorrir(double pmorrir) {
        this.pmorrir = pmorrir;
    }

    public double getPrism() {
        return prism;
    }

    public void setPrism(double prism) {
        this.prism = prism;
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
        if (!(object instanceof OrganosDisfuncionales)) {
            return false;
        }
        OrganosDisfuncionales other = (OrganosDisfuncionales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.OrganosDisfuncionales[ id=" + id + " ]";
    }
    
}
