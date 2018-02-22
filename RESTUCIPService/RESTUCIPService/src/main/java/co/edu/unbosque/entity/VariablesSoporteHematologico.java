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
@Table(name = "variables_soporte_hematologico", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesSoporteHematologico.findAll", query = "SELECT v FROM VariablesSoporteHematologico v"),
    @NamedQuery(name = "VariablesSoporteHematologico.findById", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesSoporteHematologico.findByAntifibrinoli", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.antifibrinoli = :antifibrinoli"),
    @NamedQuery(name = "VariablesSoporteHematologico.findByCrioprecipitados", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.crioprecipitados = :crioprecipitados"),
    @NamedQuery(name = "VariablesSoporteHematologico.findByGre", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.gre = :gre"),
    @NamedQuery(name = "VariablesSoporteHematologico.findByHemoderivados", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.hemoderivados = :hemoderivados"),
    @NamedQuery(name = "VariablesSoporteHematologico.findByPfc", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.pfc = :pfc"),
    @NamedQuery(name = "VariablesSoporteHematologico.findByPlaquetas", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.plaquetas = :plaquetas"),
    @NamedQuery(name = "VariablesSoporteHematologico.findBySoporteInsulina", query = "SELECT v FROM VariablesSoporteHematologico v WHERE v.soporteInsulina = :soporteInsulina")})
public class VariablesSoporteHematologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "antifibrinoli", length = 255)
    private String antifibrinoli;
    @Basic(optional = false)
    @Column(name = "crioprecipitados", nullable = false)
    private int crioprecipitados;
    @Basic(optional = false)
    @Column(name = "gre", nullable = false)
    private int gre;
    @Column(name = "hemoderivados", length = 255)
    private String hemoderivados;
    @Basic(optional = false)
    @Column(name = "pfc", nullable = false)
    private int pfc;
    @Basic(optional = false)
    @Column(name = "plaquetas", nullable = false)
    private int plaquetas;
    @Column(name = "soporte_insulina", length = 255)
    private String soporteInsulina;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesSoporteHematologico() {
    }

    public VariablesSoporteHematologico(Long id) {
        this.id = id;
    }

    public VariablesSoporteHematologico(Long id, int crioprecipitados, int gre, int pfc, int plaquetas) {
        this.id = id;
        this.crioprecipitados = crioprecipitados;
        this.gre = gre;
        this.pfc = pfc;
        this.plaquetas = plaquetas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAntifibrinoli() {
        return antifibrinoli;
    }

    public void setAntifibrinoli(String antifibrinoli) {
        this.antifibrinoli = antifibrinoli;
    }

    public int getCrioprecipitados() {
        return crioprecipitados;
    }

    public void setCrioprecipitados(int crioprecipitados) {
        this.crioprecipitados = crioprecipitados;
    }

    public int getGre() {
        return gre;
    }

    public void setGre(int gre) {
        this.gre = gre;
    }

    public String getHemoderivados() {
        return hemoderivados;
    }

    public void setHemoderivados(String hemoderivados) {
        this.hemoderivados = hemoderivados;
    }

    public int getPfc() {
        return pfc;
    }

    public void setPfc(int pfc) {
        this.pfc = pfc;
    }

    public int getPlaquetas() {
        return plaquetas;
    }

    public void setPlaquetas(int plaquetas) {
        this.plaquetas = plaquetas;
    }

    public String getSoporteInsulina() {
        return soporteInsulina;
    }

    public void setSoporteInsulina(String soporteInsulina) {
        this.soporteInsulina = soporteInsulina;
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
        if (!(object instanceof VariablesSoporteHematologico)) {
            return false;
        }
        VariablesSoporteHematologico other = (VariablesSoporteHematologico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesSoporteHematologico[ id=" + id + " ]";
    }
    
}
