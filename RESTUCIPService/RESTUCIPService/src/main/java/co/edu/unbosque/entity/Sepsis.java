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
@Table(name = "sepsis", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sepsis.findAll", query = "SELECT s FROM Sepsis s"),
    @NamedQuery(name = "Sepsis.findById", query = "SELECT s FROM Sepsis s WHERE s.id = :id"),
    @NamedQuery(name = "Sepsis.findByNumSepsis", query = "SELECT s FROM Sepsis s WHERE s.numSepsis = :numSepsis"),
    @NamedQuery(name = "Sepsis.findBySucesionSepsis", query = "SELECT s FROM Sepsis s WHERE s.sucesionSepsis = :sucesionSepsis")})
public class Sepsis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "num_sepsis", nullable = false)
    private int numSepsis;
    @Column(name = "sucesion_sepsis", length = 255)
    private String sucesionSepsis;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public Sepsis() {
    }

    public Sepsis(Long id) {
        this.id = id;
    }

    public Sepsis(Long id, int numSepsis) {
        this.id = id;
        this.numSepsis = numSepsis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumSepsis() {
        return numSepsis;
    }

    public void setNumSepsis(int numSepsis) {
        this.numSepsis = numSepsis;
    }

    public String getSucesionSepsis() {
        return sucesionSepsis;
    }

    public void setSucesionSepsis(String sucesionSepsis) {
        this.sucesionSepsis = sucesionSepsis;
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
        if (!(object instanceof Sepsis)) {
            return false;
        }
        Sepsis other = (Sepsis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.Sepsis[ id=" + id + " ]";
    }
    
}
