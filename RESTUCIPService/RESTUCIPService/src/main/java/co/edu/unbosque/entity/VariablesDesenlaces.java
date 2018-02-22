/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "variables_desenlaces", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesDesenlaces.countByMortalidad", query = "SELECT v.caumuerte, COUNT(v) FROM VariablesDesenlaces v WHERE v.estancia.fechaIngreso >= :fecha1 AND v.estancia.fechaIngreso <= :fecha2 GROUP BY v.caumuerte HAVING v.caumuerte not in ('NO_APLICA', 'NO_HAY_DATO')"),
    @NamedQuery(name = "VariablesDesenlaces.countByFecha", query = "SELECT COUNT(v) FROM VariablesDesenlaces v WHERE v.estancia.fechaIngreso >= :fecha1 AND v.estancia.fechaIngreso <= :fecha2"),
    @NamedQuery(name = "VariablesDesenlaces.countMortalidad", query = "SELECT COUNT(v) FROM VariablesDesenlaces v WHERE v.mortalidadUcip = 'SI' AND v.estancia.fechaIngreso >= :fecha1 AND v.estancia.fechaIngreso <= :fecha2"),
    @NamedQuery(name = "VariablesDesenlaces.findAll", query = "SELECT v FROM VariablesDesenlaces v"),
    @NamedQuery(name = "VariablesDesenlaces.findById", query = "SELECT v FROM VariablesDesenlaces v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesDesenlaces.findByCaumuerte", query = "SELECT v FROM VariablesDesenlaces v WHERE v.caumuerte = :caumuerte"),
    @NamedQuery(name = "VariablesDesenlaces.findByDsmpostucip", query = "SELECT v FROM VariablesDesenlaces v WHERE v.dsmpostucip = :dsmpostucip"),
    @NamedQuery(name = "VariablesDesenlaces.findByEstancihosp", query = "SELECT v FROM VariablesDesenlaces v WHERE v.estancihosp = :estancihosp"),
    @NamedQuery(name = "VariablesDesenlaces.findByEstanhospisxantibio", query = "SELECT v FROM VariablesDesenlaces v WHERE v.estanhospisxantibio = :estanhospisxantibio"),
    @NamedQuery(name = "VariablesDesenlaces.findByFechaConsultaPostUcip", query = "SELECT v FROM VariablesDesenlaces v WHERE v.fechaConsultaPostUcip = :fechaConsultaPostUcip"),
    @NamedQuery(name = "VariablesDesenlaces.findByMortalidadHx", query = "SELECT v FROM VariablesDesenlaces v WHERE v.mortalidadHx = :mortalidadHx"),
    @NamedQuery(name = "VariablesDesenlaces.findByMortalidadUcip", query = "SELECT v FROM VariablesDesenlaces v WHERE v.mortalidadUcip = :mortalidadUcip"),
    @NamedQuery(name = "VariablesDesenlaces.findByOxigenoDomiciliario", query = "SELECT v FROM VariablesDesenlaces v WHERE v.oxigenoDomiciliario = :oxigenoDomiciliario"),
    @NamedQuery(name = "VariablesDesenlaces.findByPesoconscont", query = "SELECT v FROM VariablesDesenlaces v WHERE v.pesoconscont = :pesoconscont"),
    @NamedQuery(name = "VariablesDesenlaces.findByTallaconscont", query = "SELECT v FROM VariablesDesenlaces v WHERE v.tallaconscont = :tallaconscont")})
public class VariablesDesenlaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "caumuerte", length = 255)
    private String caumuerte;
    @Column(name = "dsmpostucip", length = 255)
    private String dsmpostucip;
    @Column(name = "estancihosp")
    private Integer estancihosp;
    @Column(name = "estanhospisxantibio")
    private Integer estanhospisxantibio;
    @Column(name = "fecha_consulta_post_ucip")
    @Temporal(TemporalType.DATE)
    private Date fechaConsultaPostUcip;
    @Column(name = "mortalidad_hx", length = 255)
    private String mortalidadHx;
    @Column(name = "mortalidad_ucip", length = 255)
    private String mortalidadUcip;
    @Column(name = "oxigeno_domiciliario")
    private Integer oxigenoDomiciliario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pesoconscont", precision = 17, scale = 17)
    private Double pesoconscont;
    @Column(name = "tallaconscont", precision = 17, scale = 17)
    private Double tallaconscont;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesDesenlaces() {
    }

    public VariablesDesenlaces(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaumuerte() {
        return caumuerte;
    }

    public void setCaumuerte(String caumuerte) {
        this.caumuerte = caumuerte;
    }

    public String getDsmpostucip() {
        return dsmpostucip;
    }

    public void setDsmpostucip(String dsmpostucip) {
        this.dsmpostucip = dsmpostucip;
    }

    public Integer getEstancihosp() {
        return estancihosp;
    }

    public void setEstancihosp(Integer estancihosp) {
        this.estancihosp = estancihosp;
    }

    public Integer getEstanhospisxantibio() {
        return estanhospisxantibio;
    }

    public void setEstanhospisxantibio(Integer estanhospisxantibio) {
        this.estanhospisxantibio = estanhospisxantibio;
    }

    public Date getFechaConsultaPostUcip() {
        return fechaConsultaPostUcip;
    }

    public void setFechaConsultaPostUcip(Date fechaConsultaPostUcip) {
        this.fechaConsultaPostUcip = fechaConsultaPostUcip;
    }

    public String getMortalidadHx() {
        return mortalidadHx;
    }

    public void setMortalidadHx(String mortalidadHx) {
        this.mortalidadHx = mortalidadHx;
    }

    public String getMortalidadUcip() {
        return mortalidadUcip;
    }

    public void setMortalidadUcip(String mortalidadUcip) {
        this.mortalidadUcip = mortalidadUcip;
    }

    public Integer getOxigenoDomiciliario() {
        return oxigenoDomiciliario;
    }

    public void setOxigenoDomiciliario(Integer oxigenoDomiciliario) {
        this.oxigenoDomiciliario = oxigenoDomiciliario;
    }

    public Double getPesoconscont() {
        return pesoconscont;
    }

    public void setPesoconscont(Double pesoconscont) {
        this.pesoconscont = pesoconscont;
    }

    public Double getTallaconscont() {
        return tallaconscont;
    }

    public void setTallaconscont(Double tallaconscont) {
        this.tallaconscont = tallaconscont;
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
        if (!(object instanceof VariablesDesenlaces)) {
            return false;
        }
        VariablesDesenlaces other = (VariablesDesenlaces) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesDesenlaces[ id=" + id + " ]";
    }
    
}
