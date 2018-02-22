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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "acudiente", catalog = "ucip", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"documente"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acudiente.findAll", query = "SELECT a FROM Acudiente a"),
    @NamedQuery(name = "Acudiente.findById", query = "SELECT a FROM Acudiente a WHERE a.id = :id"),
    @NamedQuery(name = "Acudiente.findByApellidoDos", query = "SELECT a FROM Acudiente a WHERE a.apellidoDos = :apellidoDos"),
    @NamedQuery(name = "Acudiente.findByApellidoUno", query = "SELECT a FROM Acudiente a WHERE a.apellidoUno = :apellidoUno"),
    @NamedQuery(name = "Acudiente.findByDocumente", query = "SELECT a FROM Acudiente a WHERE a.documento = :documento"),
    @NamedQuery(name = "Acudiente.findByNombreDos", query = "SELECT a FROM Acudiente a WHERE a.nombreDos = :nombreDos"),
    @NamedQuery(name = "Acudiente.findByNombreUno", query = "SELECT a FROM Acudiente a WHERE a.nombreUno = :nombreUno"),
    @NamedQuery(name = "Acudiente.findByTipoDocumento", query = "SELECT a FROM Acudiente a WHERE a.tipoDocumento = :tipoDocumento")})
public class Acudiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "apellido_dos", length = 255)
    private String apellidoDos;
    @Column(name = "apellido_uno", length = 255)
    private String apellidoUno;
    @Column(name = "documento")
    private BigInteger documento;
    @Column(name = "nombre_dos", length = 255)
    private String nombreDos;
    @Column(name = "nombre_uno", length = 255)
    private String nombreUno;
    @Column(name = "tipo_documento", length = 255)
    private String tipoDocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acudiente")
    private Collection<PacienteAcudiente> pacienteAcudienteCollection;
    @OneToMany(mappedBy = "acudiente")
    private Collection<EstanciaUcip> estanciaUcipCollection;

    public Acudiente() {
    }

    public Acudiente(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public BigInteger getDocumento() {
        return documento;
    }

    public void setDocumento(BigInteger documento) {
        this.documento = documento;
    }

    public String getNombreDos() {
        return nombreDos;
    }

    public void setNombreDos(String nombreDos) {
        this.nombreDos = nombreDos;
    }

    public String getNombreUno() {
        return nombreUno;
    }

    public void setNombreUno(String nombreUno) {
        this.nombreUno = nombreUno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<PacienteAcudiente> getPacienteAcudienteCollection() {
        return pacienteAcudienteCollection;
    }

    public void setPacienteAcudienteCollection(Collection<PacienteAcudiente> pacienteAcudienteCollection) {
        this.pacienteAcudienteCollection = pacienteAcudienteCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<EstanciaUcip> getEstanciaUcipCollection() {
        return estanciaUcipCollection;
    }

    public void setEstanciaUcipCollection(Collection<EstanciaUcip> estanciaUcipCollection) {
        this.estanciaUcipCollection = estanciaUcipCollection;
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
        if (!(object instanceof Acudiente)) {
            return false;
        }
        Acudiente other = (Acudiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.Acudiente[ id=" + id + " ]";
    }
    
}
