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
@Table(name = "variables_quirurgicas", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesQuirurgicas.findAll", query = "SELECT v FROM VariablesQuirurgicas v"),
    @NamedQuery(name = "VariablesQuirurgicas.findById", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesQuirurgicas.findByBloqueo", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.bloqueo = :bloqueo"),
    @NamedQuery(name = "VariablesQuirurgicas.findByCraneotomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.craneotomia = :craneotomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByCraniectomiaDescompresiva", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.craniectomiaDescompresiva = :craniectomiaDescompresiva"),
    @NamedQuery(name = "VariablesQuirurgicas.findByDecorticacionFibroncoscopia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.decorticacionFibroncoscopia = :decorticacionFibroncoscopia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByDefectoResidual", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.defectoResidual = :defectoResidual"),
    @NamedQuery(name = "VariablesQuirurgicas.findByDerivacion", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.derivacion = :derivacion"),
    @NamedQuery(name = "VariablesQuirurgicas.findByDrenajeHematomaIntracane", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.drenajeHematomaIntracane = :drenajeHematomaIntracane"),
    @NamedQuery(name = "VariablesQuirurgicas.findByEndosocopia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.endosocopia = :endosocopia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByGastrostomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.gastrostomia = :gastrostomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByLaparostomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.laparostomia = :laparostomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByLaparotomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.laparotomia = :laparotomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByLavadoOseoArticular", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.lavadoOseoArticular = :lavadoOseoArticular"),
    @NamedQuery(name = "VariablesQuirurgicas.findByLavadoPeritoneal", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.lavadoPeritoneal = :lavadoPeritoneal"),
    @NamedQuery(name = "VariablesQuirurgicas.findByLobectomiaNeumonectomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.lobectomiaNeumonectomia = :lobectomiaNeumonectomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByManejoPicElevada", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.manejoPicElevada = :manejoPicElevada"),
    @NamedQuery(name = "VariablesQuirurgicas.findByMediastinitis", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.mediastinitis = :mediastinitis"),
    @NamedQuery(name = "VariablesQuirurgicas.findByReduccionLesionesTraumatica", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.reduccionLesionesTraumatica = :reduccionLesionesTraumatica"),
    @NamedQuery(name = "VariablesQuirurgicas.findBySangradoHemomediastinoHemotorax", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.sangradoHemomediastinoHemotorax = :sangradoHemomediastinoHemotorax"),
    @NamedQuery(name = "VariablesQuirurgicas.findByTenkoof", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.tenkoof = :tenkoof"),
    @NamedQuery(name = "VariablesQuirurgicas.findByToracostomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.toracostomia = :toracostomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByToracotomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.toracotomia = :toracotomia"),
    @NamedQuery(name = "VariablesQuirurgicas.findByTraqueostomia", query = "SELECT v FROM VariablesQuirurgicas v WHERE v.traqueostomia = :traqueostomia")})
public class VariablesQuirurgicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "bloqueo")
    private Integer bloqueo;
    @Column(name = "craneotomia")
    private Integer craneotomia;
    @Column(name = "craniectomia_descompresiva")
    private Integer craniectomiaDescompresiva;
    @Column(name = "decorticacion_fibroncoscopia")
    private Integer decorticacionFibroncoscopia;
    @Column(name = "defecto_residual")
    private Integer defectoResidual;
    @Column(name = "derivacion")
    private Integer derivacion;
    @Column(name = "drenaje_hematoma_intracane")
    private Integer drenajeHematomaIntracane;
    @Column(name = "endosocopia")
    private Integer endosocopia;
    @Column(name = "gastrostomia")
    private Integer gastrostomia;
    @Column(name = "laparostomia")
    private Integer laparostomia;
    @Column(name = "laparotomia")
    private Integer laparotomia;
    @Column(name = "lavado_oseo_articular")
    private Integer lavadoOseoArticular;
    @Column(name = "lavado_peritoneal")
    private Integer lavadoPeritoneal;
    @Column(name = "lobectomia_neumonectomia")
    private Integer lobectomiaNeumonectomia;
    @Column(name = "manejo_pic_elevada")
    private Integer manejoPicElevada;
    @Column(name = "mediastinitis")
    private Integer mediastinitis;
    @Column(name = "reduccion_lesiones_traumatica")
    private Integer reduccionLesionesTraumatica;
    @Column(name = "sangrado_hemomediastino_hemotorax")
    private Integer sangradoHemomediastinoHemotorax;
    @Column(name = "tenkoof")
    private Integer tenkoof;
    @Column(name = "toracostomia")
    private Integer toracostomia;
    @Column(name = "toracotomia")
    private Integer toracotomia;
    @Column(name = "traqueostomia")
    private Integer traqueostomia;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesQuirurgicas() {
    }

    public VariablesQuirurgicas(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(Integer bloqueo) {
        this.bloqueo = bloqueo;
    }

    public Integer getCraneotomia() {
        return craneotomia;
    }

    public void setCraneotomia(Integer craneotomia) {
        this.craneotomia = craneotomia;
    }

    public Integer getCraniectomiaDescompresiva() {
        return craniectomiaDescompresiva;
    }

    public void setCraniectomiaDescompresiva(Integer craniectomiaDescompresiva) {
        this.craniectomiaDescompresiva = craniectomiaDescompresiva;
    }

    public Integer getDecorticacionFibroncoscopia() {
        return decorticacionFibroncoscopia;
    }

    public void setDecorticacionFibroncoscopia(Integer decorticacionFibroncoscopia) {
        this.decorticacionFibroncoscopia = decorticacionFibroncoscopia;
    }

    public Integer getDefectoResidual() {
        return defectoResidual;
    }

    public void setDefectoResidual(Integer defectoResidual) {
        this.defectoResidual = defectoResidual;
    }

    public Integer getDerivacion() {
        return derivacion;
    }

    public void setDerivacion(Integer derivacion) {
        this.derivacion = derivacion;
    }

    public Integer getDrenajeHematomaIntracane() {
        return drenajeHematomaIntracane;
    }

    public void setDrenajeHematomaIntracane(Integer drenajeHematomaIntracane) {
        this.drenajeHematomaIntracane = drenajeHematomaIntracane;
    }

    public Integer getEndosocopia() {
        return endosocopia;
    }

    public void setEndosocopia(Integer endosocopia) {
        this.endosocopia = endosocopia;
    }

    public Integer getGastrostomia() {
        return gastrostomia;
    }

    public void setGastrostomia(Integer gastrostomia) {
        this.gastrostomia = gastrostomia;
    }

    public Integer getLaparostomia() {
        return laparostomia;
    }

    public void setLaparostomia(Integer laparostomia) {
        this.laparostomia = laparostomia;
    }

    public Integer getLaparotomia() {
        return laparotomia;
    }

    public void setLaparotomia(Integer laparotomia) {
        this.laparotomia = laparotomia;
    }

    public Integer getLavadoOseoArticular() {
        return lavadoOseoArticular;
    }

    public void setLavadoOseoArticular(Integer lavadoOseoArticular) {
        this.lavadoOseoArticular = lavadoOseoArticular;
    }

    public Integer getLavadoPeritoneal() {
        return lavadoPeritoneal;
    }

    public void setLavadoPeritoneal(Integer lavadoPeritoneal) {
        this.lavadoPeritoneal = lavadoPeritoneal;
    }

    public Integer getLobectomiaNeumonectomia() {
        return lobectomiaNeumonectomia;
    }

    public void setLobectomiaNeumonectomia(Integer lobectomiaNeumonectomia) {
        this.lobectomiaNeumonectomia = lobectomiaNeumonectomia;
    }

    public Integer getManejoPicElevada() {
        return manejoPicElevada;
    }

    public void setManejoPicElevada(Integer manejoPicElevada) {
        this.manejoPicElevada = manejoPicElevada;
    }

    public Integer getMediastinitis() {
        return mediastinitis;
    }

    public void setMediastinitis(Integer mediastinitis) {
        this.mediastinitis = mediastinitis;
    }

    public Integer getReduccionLesionesTraumatica() {
        return reduccionLesionesTraumatica;
    }

    public void setReduccionLesionesTraumatica(Integer reduccionLesionesTraumatica) {
        this.reduccionLesionesTraumatica = reduccionLesionesTraumatica;
    }

    public Integer getSangradoHemomediastinoHemotorax() {
        return sangradoHemomediastinoHemotorax;
    }

    public void setSangradoHemomediastinoHemotorax(Integer sangradoHemomediastinoHemotorax) {
        this.sangradoHemomediastinoHemotorax = sangradoHemomediastinoHemotorax;
    }

    public Integer getTenkoof() {
        return tenkoof;
    }

    public void setTenkoof(Integer tenkoof) {
        this.tenkoof = tenkoof;
    }

    public Integer getToracostomia() {
        return toracostomia;
    }

    public void setToracostomia(Integer toracostomia) {
        this.toracostomia = toracostomia;
    }

    public Integer getToracotomia() {
        return toracotomia;
    }

    public void setToracotomia(Integer toracotomia) {
        this.toracotomia = toracotomia;
    }

    public Integer getTraqueostomia() {
        return traqueostomia;
    }

    public void setTraqueostomia(Integer traqueostomia) {
        this.traqueostomia = traqueostomia;
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
        if (!(object instanceof VariablesQuirurgicas)) {
            return false;
        }
        VariablesQuirurgicas other = (VariablesQuirurgicas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesQuirurgicas[ id=" + id + " ]";
    }
    
}
