/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "auditoria", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auditoria.findAll", query = "SELECT a FROM Auditoria a"),
    @NamedQuery(name = "Auditoria.findById", query = "SELECT a FROM Auditoria a WHERE a.id = :id"),
    @NamedQuery(name = "Auditoria.findByAccion", query = "SELECT a FROM Auditoria a WHERE a.accion = :accion"),
    @NamedQuery(name = "Auditoria.findByFecha", query = "SELECT a FROM Auditoria a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Auditoria.findByHora", query = "SELECT a FROM Auditoria a WHERE a.hora = :hora"),
    @NamedQuery(name = "Auditoria.findByIdEvidencia", query = "SELECT a FROM Auditoria a WHERE a.idEvidencia = :idEvidencia"),
    @NamedQuery(name = "Auditoria.findByIdTabla", query = "SELECT a FROM Auditoria a WHERE a.idTabla = :idTabla"),
    @NamedQuery(name = "Auditoria.findByTabla", query = "SELECT a FROM Auditoria a WHERE a.tabla = :tabla"),
    @NamedQuery(name = "Auditoria.findByUsuario", query = "SELECT a FROM Auditoria a WHERE a.usuario = :usuario")})
public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "accion")
    private String accion;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "hora")
    private String hora;
    @Column(name = "id_evidencia")
    private BigInteger idEvidencia;
    @Column(name = "id_tabla")
    private BigInteger idTabla;
    @Column(name = "tabla")
    private String tabla;
    @Column(name = "usuario")
    private String usuario;
    @JoinColumn(name = "evidencia", referencedColumnName = "id")
    @ManyToOne
    private Evidencia evidencia;

    public Auditoria() {
    }

    public Auditoria(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public BigInteger getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(BigInteger idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public BigInteger getIdTabla() {
        return idTabla;
    }

    public void setIdTabla(BigInteger idTabla) {
        this.idTabla = idTabla;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
        if (!(object instanceof Auditoria)) {
            return false;
        }
        Auditoria other = (Auditoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.Auditoria[ id=" + id + " ]";
    }
    
}
