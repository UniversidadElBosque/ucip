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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "paciente_acudiente", catalog = "ucip", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"paciente", "acudiente"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteAcudiente.findAll", query = "SELECT p FROM PacienteAcudiente p"),
    @NamedQuery(name = "PacienteAcudiente.findById", query = "SELECT p FROM PacienteAcudiente p WHERE p.id = :id"),
    @NamedQuery(name = "PacienteAcudiente.findByParentesco", query = "SELECT p FROM PacienteAcudiente p WHERE p.parentesco = :parentesco")})
public class PacienteAcudiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "parentesco", length = 255)
    private String parentesco;
    @JoinColumn(name = "acudiente", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Acudiente acudiente;
    @JoinColumn(name = "paciente", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Paciente paciente;

    public PacienteAcudiente() {
    }

    public PacienteAcudiente(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
        if (!(object instanceof PacienteAcudiente)) {
            return false;
        }
        PacienteAcudiente other = (PacienteAcudiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.PacienteAcudiente[ id=" + id + " ]";
    }
    
}
