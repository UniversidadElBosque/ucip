/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "evidencia", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evidencia.findAll", query = "SELECT e FROM Evidencia e"),
    @NamedQuery(name = "Evidencia.findById", query = "SELECT e FROM Evidencia e WHERE e.id = :id"),
    @NamedQuery(name = "Evidencia.findByCodigoModulo", query = "SELECT e FROM Evidencia e WHERE e.codigoModulo = :codigoModulo"),
    @NamedQuery(name = "Evidencia.findByIdEspecificoEvidencia", query = "SELECT e FROM Evidencia e WHERE e.idEspecificoEvidencia = :idEspecificoEvidencia")})
public class Evidencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "codigo_modulo")
    private BigInteger codigoModulo;
    @Column(name = "id_especifico_evidencia")
    private BigInteger idEspecificoEvidencia;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;
    @OneToMany(mappedBy = "evidencia")
    private Collection<Auditoria> auditoriaCollection;
    @OneToMany(mappedBy = "evidencia")
    private Collection<NombreEvidenciaModulo> nombreEvidenciaModuloCollection;

    public Evidencia() {
    }

    public Evidencia(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(BigInteger codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public BigInteger getIdEspecificoEvidencia() {
        return idEspecificoEvidencia;
    }

    public void setIdEspecificoEvidencia(BigInteger idEspecificoEvidencia) {
        this.idEspecificoEvidencia = idEspecificoEvidencia;
    }

    public EstanciaUcip getEstancia() {
        return estancia;
    }

    public void setEstancia(EstanciaUcip estancia) {
        this.estancia = estancia;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Auditoria> getAuditoriaCollection() {
        return auditoriaCollection;
    }

    public void setAuditoriaCollection(Collection<Auditoria> auditoriaCollection) {
        this.auditoriaCollection = auditoriaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<NombreEvidenciaModulo> getNombreEvidenciaModuloCollection() {
        return nombreEvidenciaModuloCollection;
    }

    public void setNombreEvidenciaModuloCollection(Collection<NombreEvidenciaModulo> nombreEvidenciaModuloCollection) {
        this.nombreEvidenciaModuloCollection = nombreEvidenciaModuloCollection;
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
        if (!(object instanceof Evidencia)) {
            return false;
        }
        Evidencia other = (Evidencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.Evidencia[ id=" + id + " ]";
    }
    
}
