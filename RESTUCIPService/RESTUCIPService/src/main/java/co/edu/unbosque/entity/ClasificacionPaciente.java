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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "clasificacion_paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasificacionPaciente.findAll", query = "SELECT c FROM ClasificacionPaciente c WHERE c.estado = 'true' ")
    ,
    @NamedQuery(name = "ClasificacionPaciente.findById", query = "SELECT c FROM ClasificacionPaciente c WHERE c.id = :id")
    ,
    @NamedQuery(name = "ClasificacionPaciente.findByEstado", query = "SELECT c FROM ClasificacionPaciente c WHERE c.estado = :estado")
    ,
    @NamedQuery(name = "ClasificacionPaciente.findByLabel", query = "SELECT c FROM ClasificacionPaciente c WHERE c.label = :label")
    ,
    @NamedQuery(name = "ClasificacionPaciente.findByValor", query = "SELECT c FROM ClasificacionPaciente c WHERE c.valor = :valor")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "ClasificacionPaciente.findByListaId", query = "select * from clasificacion_paciente where string_to_array(?, ',') @> ARRAY[id||'']", resultClass = ClasificacionPaciente.class)
})
public class ClasificacionPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "label")
    private String label;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "valor")
    private String valor;

    public ClasificacionPaciente() {
    }

    public ClasificacionPaciente(Integer id) {
        this.id = id;
    }

    public ClasificacionPaciente(Integer id, String estado, String label, String valor) {
        this.id = id;
        this.estado = estado;
        this.label = label;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
        if (!(object instanceof ClasificacionPaciente)) {
            return false;
        }
        ClasificacionPaciente other = (ClasificacionPaciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.ClasificacionPaciente[ id=" + id + " ]";
    }

}
