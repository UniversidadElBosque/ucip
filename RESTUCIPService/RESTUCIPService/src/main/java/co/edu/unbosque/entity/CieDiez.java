/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "cie_diez", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CieDiez.findAll", query = "SELECT c FROM CieDiez c"),
    @NamedQuery(name = "CieDiez.findById", query = "SELECT c FROM CieDiez c WHERE c.id = :id"),
    @NamedQuery(name = "CieDiez.findByCodigoCie", query = "SELECT c FROM CieDiez c WHERE c.codigoCie = :codigoCie"),
    @NamedQuery(name = "CieDiez.findByNombreCie", query = "SELECT c FROM CieDiez c WHERE c.nombreCie = :nombreCie")})
public class CieDiez implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "codigo_cie")
    private String codigoCie;
    @Column(name = "nombre_cie")
    private String nombreCie;
    @OneToMany(mappedBy = "idCie10")
    private Collection<Diagnostico> diagnosticoCollection;

    public CieDiez() {
    }

    public CieDiez(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoCie() {
        return codigoCie;
    }

    public void setCodigoCie(String codigoCie) {
        this.codigoCie = codigoCie;
    }

    public String getNombreCie() {
        return nombreCie;
    }

    public void setNombreCie(String nombreCie) {
        this.nombreCie = nombreCie;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Diagnostico> getDiagnosticoCollection() {
        return diagnosticoCollection;
    }

    public void setDiagnosticoCollection(Collection<Diagnostico> diagnosticoCollection) {
        this.diagnosticoCollection = diagnosticoCollection;
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
        if (!(object instanceof CieDiez)) {
            return false;
        }
        CieDiez other = (CieDiez) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.CieDiez[ id=" + id + " ]";
    }
    
}
