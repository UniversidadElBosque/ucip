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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "dash_item")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NamedQueries({
    @NamedQuery(name = "DashItem.findTablas", query = "SELECT d FROM DashItem d WHERE d.nivel = 1 AND d.estado = 'true' ORDER BY d.orden ASC ")
    ,
    @NamedQuery(name = "DashItem.findByPadre", query = "SELECT d FROM DashItem d WHERE d.idPadre = :idPadre AND d.estado = 'true' ORDER BY d.orden ASC ")
})
@NamedNativeQueries({
    @NamedNativeQuery(name = "DashItem.findByListaId", query = "SELECT * FROM dash_item WHERE string_to_array(?, ',') @> ARRAY[id||''] ORDER BY orden ", resultClass = DashItem.class)
})
public class DashItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "estado")
    private String estado;
    @Column(name = "label")
    private String label;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @Column(name = "valor")
    private String valor;
    @Basic(optional = false)
    @Column(name = "id_padre")
    private int idPadre;
    @Basic(optional = false)
    @Column(name = "orden")
    private int orden;

    public DashItem() {

    }

    public DashItem(Long id) {
        this.id = id;
    }

    public DashItem(Long id, int nivel) {
        this.id = id;
        this.nivel = nivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
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
        if (!(object instanceof DashItem)) {
            return false;
        }
        DashItem other = (DashItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DashItem[ id=" + id + " ]";
    }

}
