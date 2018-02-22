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
@Table(name = "disfuncion_cardiovascular", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionCardiovascular.findAll", query = "SELECT d FROM DisfuncionCardiovascular d"),
    @NamedQuery(name = "DisfuncionCardiovascular.findById", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByBeVenosa", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.beVenosa = :beVenosa"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByCardiovascular", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.cardiovascular = :cardiovascular"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByCo2arterial", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.co2arterial = :co2arterial"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByCo2venoso", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.co2venoso = :co2venoso"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByFechaDxDisfuncionCardiovascular", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.fechaDxDisfuncionCardiovascular = :fechaDxDisfuncionCardiovascular"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByFio2", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.fio2 = :fio2"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByGapco2", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.gapco2 = :gapco2"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByHco3a", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.hco3a = :hco3a"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByHco3v", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.hco3v = :hco3v"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByHipotension", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.hipotension = :hipotension"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByLactato", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.lactato = :lactato"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByOliguria", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.oliguria = :oliguria"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByPao2", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.pao2 = :pao2"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByPhIngreso", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.phIngreso = :phIngreso"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByPvo2", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.pvo2 = :pvo2"),
    @NamedQuery(name = "DisfuncionCardiovascular.findBySao2", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.sao2 = :sao2"),
    @NamedQuery(name = "DisfuncionCardiovascular.findBySvo2", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.svo2 = :svo2"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByTiempoAclaramientoLactato", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.tiempoAclaramientoLactato = :tiempoAclaramientoLactato"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByTiempoLlenadoCapilar", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.tiempoLlenadoCapilar = :tiempoLlenadoCapilar"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByTiempoNormalizacionGap", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.tiempoNormalizacionGap = :tiempoNormalizacionGap"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByTiempoNormalizacionpo2venosa", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.tiempoNormalizacionpo2venosa = :tiempoNormalizacionpo2venosa"),
    @NamedQuery(name = "DisfuncionCardiovascular.findByVasoactivo", query = "SELECT d FROM DisfuncionCardiovascular d WHERE d.vasoactivo = :vasoactivo")})
public class DisfuncionCardiovascular implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "be_venosa")
    private double beVenosa;
    @Column(name = "cardiovascular")
    private String cardiovascular;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "co2arterial")
    private Double co2arterial;
    @Column(name = "co2venoso")
    private Double co2venoso;
    @Column(name = "fecha_dx_disfuncion_cardiovascular")
    @Temporal(TemporalType.DATE)
    private Date fechaDxDisfuncionCardiovascular;
    @Basic(optional = false)
    @Column(name = "fio2")
    private float fio2;
    @Column(name = "gapco2")
    private Double gapco2;
    @Basic(optional = false)
    @Column(name = "hco3a")
    private double hco3a;
    @Basic(optional = false)
    @Column(name = "hco3v")
    private double hco3v;
    @Column(name = "hipotension")
    private String hipotension;
    @Basic(optional = false)
    @Column(name = "lactato")
    private double lactato;
    @Column(name = "oliguria")
    private String oliguria;
    @Basic(optional = false)
    @Column(name = "pao2")
    private double pao2;
    @Basic(optional = false)
    @Column(name = "ph_ingreso")
    private double phIngreso;
    @Basic(optional = false)
    @Column(name = "pvo2")
    private double pvo2;
    @Basic(optional = false)
    @Column(name = "sao2")
    private double sao2;
    @Basic(optional = false)
    @Column(name = "svo2")
    private double svo2;
    @Basic(optional = false)
    @Column(name = "tiempo_aclaramiento_lactato")
    private int tiempoAclaramientoLactato;
    @Basic(optional = false)
    @Column(name = "tiempo_llenado_capilar")
    private int tiempoLlenadoCapilar;
    @Basic(optional = false)
    @Column(name = "tiempo_normalizacion_gap")
    private int tiempoNormalizacionGap;
    @Basic(optional = false)
    @Column(name = "tiempo_normalizacionpo2venosa")
    private int tiempoNormalizacionpo2venosa;
    @Column(name = "vasoactivo")
    private String vasoactivo;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionCardiovascular() {
    }

    public DisfuncionCardiovascular(Long id) {
        this.id = id;
    }

    public DisfuncionCardiovascular(Long id, double beVenosa, float fio2, double hco3a, double hco3v, double lactato, double pao2, double phIngreso, double pvo2, double sao2, double svo2, int tiempoAclaramientoLactato, int tiempoLlenadoCapilar, int tiempoNormalizacionGap, int tiempoNormalizacionpo2venosa) {
        this.id = id;
        this.beVenosa = beVenosa;
        this.fio2 = fio2;
        this.hco3a = hco3a;
        this.hco3v = hco3v;
        this.lactato = lactato;
        this.pao2 = pao2;
        this.phIngreso = phIngreso;
        this.pvo2 = pvo2;
        this.sao2 = sao2;
        this.svo2 = svo2;
        this.tiempoAclaramientoLactato = tiempoAclaramientoLactato;
        this.tiempoLlenadoCapilar = tiempoLlenadoCapilar;
        this.tiempoNormalizacionGap = tiempoNormalizacionGap;
        this.tiempoNormalizacionpo2venosa = tiempoNormalizacionpo2venosa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBeVenosa() {
        return beVenosa;
    }

    public void setBeVenosa(double beVenosa) {
        this.beVenosa = beVenosa;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public Double getCo2arterial() {
        return co2arterial;
    }

    public void setCo2arterial(Double co2arterial) {
        this.co2arterial = co2arterial;
    }

    public Double getCo2venoso() {
        return co2venoso;
    }

    public void setCo2venoso(Double co2venoso) {
        this.co2venoso = co2venoso;
    }

    public Date getFechaDxDisfuncionCardiovascular() {
        return fechaDxDisfuncionCardiovascular;
    }

    public void setFechaDxDisfuncionCardiovascular(Date fechaDxDisfuncionCardiovascular) {
        this.fechaDxDisfuncionCardiovascular = fechaDxDisfuncionCardiovascular;
    }

    public float getFio2() {
        return fio2;
    }

    public void setFio2(float fio2) {
        this.fio2 = fio2;
    }

    public Double getGapco2() {
        return gapco2;
    }

    public void setGapco2(Double gapco2) {
        this.gapco2 = gapco2;
    }

    public double getHco3a() {
        return hco3a;
    }

    public void setHco3a(double hco3a) {
        this.hco3a = hco3a;
    }

    public double getHco3v() {
        return hco3v;
    }

    public void setHco3v(double hco3v) {
        this.hco3v = hco3v;
    }

    public String getHipotension() {
        return hipotension;
    }

    public void setHipotension(String hipotension) {
        this.hipotension = hipotension;
    }

    public double getLactato() {
        return lactato;
    }

    public void setLactato(double lactato) {
        this.lactato = lactato;
    }

    public String getOliguria() {
        return oliguria;
    }

    public void setOliguria(String oliguria) {
        this.oliguria = oliguria;
    }

    public double getPao2() {
        return pao2;
    }

    public void setPao2(double pao2) {
        this.pao2 = pao2;
    }

    public double getPhIngreso() {
        return phIngreso;
    }

    public void setPhIngreso(double phIngreso) {
        this.phIngreso = phIngreso;
    }

    public double getPvo2() {
        return pvo2;
    }

    public void setPvo2(double pvo2) {
        this.pvo2 = pvo2;
    }

    public double getSao2() {
        return sao2;
    }

    public void setSao2(double sao2) {
        this.sao2 = sao2;
    }

    public double getSvo2() {
        return svo2;
    }

    public void setSvo2(double svo2) {
        this.svo2 = svo2;
    }

    public int getTiempoAclaramientoLactato() {
        return tiempoAclaramientoLactato;
    }

    public void setTiempoAclaramientoLactato(int tiempoAclaramientoLactato) {
        this.tiempoAclaramientoLactato = tiempoAclaramientoLactato;
    }

    public int getTiempoLlenadoCapilar() {
        return tiempoLlenadoCapilar;
    }

    public void setTiempoLlenadoCapilar(int tiempoLlenadoCapilar) {
        this.tiempoLlenadoCapilar = tiempoLlenadoCapilar;
    }

    public int getTiempoNormalizacionGap() {
        return tiempoNormalizacionGap;
    }

    public void setTiempoNormalizacionGap(int tiempoNormalizacionGap) {
        this.tiempoNormalizacionGap = tiempoNormalizacionGap;
    }

    public int getTiempoNormalizacionpo2venosa() {
        return tiempoNormalizacionpo2venosa;
    }

    public void setTiempoNormalizacionpo2venosa(int tiempoNormalizacionpo2venosa) {
        this.tiempoNormalizacionpo2venosa = tiempoNormalizacionpo2venosa;
    }

    public String getVasoactivo() {
        return vasoactivo;
    }

    public void setVasoactivo(String vasoactivo) {
        this.vasoactivo = vasoactivo;
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
        if (!(object instanceof DisfuncionCardiovascular)) {
            return false;
        }
        DisfuncionCardiovascular other = (DisfuncionCardiovascular) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionCardiovascular[ id=" + id + " ]";
    }
    
}
