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
@Table(name = "nombre_evidencia_modulo", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NombreEvidenciaModulo.findAll", query = "SELECT n FROM NombreEvidenciaModulo n"),
    @NamedQuery(name = "NombreEvidenciaModulo.findById", query = "SELECT n FROM NombreEvidenciaModulo n WHERE n.id = :id"),
    @NamedQuery(name = "NombreEvidenciaModulo.findByNombreModulo", query = "SELECT n FROM NombreEvidenciaModulo n WHERE n.nombreModulo = :nombreModulo")})
public class NombreEvidenciaModulo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombre_modulo", length = 255)
    private String nombreModulo;
    @JoinColumn(name = "evidencia", referencedColumnName = "id")
    @ManyToOne
    private Evidencia evidencia;

    public NombreEvidenciaModulo() {
    }

    public NombreEvidenciaModulo(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public Evidencia getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(Evidencia evidencia) {
        this.evidencia = evidencia;
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
        if (!(object instanceof NombreEvidenciaModulo)) {
            return false;
        }
        NombreEvidenciaModulo other = (NombreEvidenciaModulo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.NombreEvidenciaModulo[ id=" + id + " ]";
    }
    
}
