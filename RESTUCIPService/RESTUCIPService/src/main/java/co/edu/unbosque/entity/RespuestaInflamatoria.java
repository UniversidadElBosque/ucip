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
@Table(name = "respuesta_inflamatoria", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestaInflamatoria.findAll", query = "SELECT r FROM RespuestaInflamatoria r"),
    @NamedQuery(name = "RespuestaInflamatoria.findById", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.id = :id"),
    @NamedQuery(name = "RespuestaInflamatoria.findByAlbuminaseps", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.albuminaseps = :albuminaseps"),
    @NamedQuery(name = "RespuestaInflamatoria.findByBradicardia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.bradicardia = :bradicardia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByGlicemia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.glicemia = :glicemia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByHipertermia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.hipertermia = :hipertermia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByHipotermia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.hipotermia = :hipotermia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByLeucocitosis", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.leucocitosis = :leucocitosis"),
    @NamedQuery(name = "RespuestaInflamatoria.findByLeucopenia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.leucopenia = :leucopenia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByLinfopenia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.linfopenia = :linfopenia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByProcalcitonina", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.procalcitonina = :procalcitonina"),
    @NamedQuery(name = "RespuestaInflamatoria.findByProteinac", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.proteinac = :proteinac"),
    @NamedQuery(name = "RespuestaInflamatoria.findBySirs", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.sirs = :sirs"),
    @NamedQuery(name = "RespuestaInflamatoria.findByTaquicardia", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.taquicardia = :taquicardia"),
    @NamedQuery(name = "RespuestaInflamatoria.findByTaquipnea", query = "SELECT r FROM RespuestaInflamatoria r WHERE r.taquipnea = :taquipnea")})
public class RespuestaInflamatoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "albuminaseps", nullable = false)
    private double albuminaseps;
    @Column(name = "bradicardia", length = 255)
    private String bradicardia;
    @Basic(optional = false)
    @Column(name = "glicemia", nullable = false)
    private double glicemia;
    @Column(name = "hipertermia", length = 255)
    private String hipertermia;
    @Column(name = "hipotermia", length = 255)
    private String hipotermia;
    @Column(name = "leucocitosis", length = 255)
    private String leucocitosis;
    @Column(name = "leucopenia", length = 255)
    private String leucopenia;
    @Column(name = "linfopenia", length = 255)
    private String linfopenia;
    @Basic(optional = false)
    @Column(name = "procalcitonina", nullable = false)
    private double procalcitonina;
    @Basic(optional = false)
    @Column(name = "proteinac", nullable = false)
    private double proteinac;
    @Column(name = "sirs", length = 255)
    private String sirs;
    @Column(name = "taquicardia", length = 255)
    private String taquicardia;
    @Column(name = "taquipnea", length = 255)
    private String taquipnea;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public RespuestaInflamatoria() {
    }

    public RespuestaInflamatoria(Long id) {
        this.id = id;
    }

    public RespuestaInflamatoria(Long id, double albuminaseps, double glicemia, double procalcitonina, double proteinac) {
        this.id = id;
        this.albuminaseps = albuminaseps;
        this.glicemia = glicemia;
        this.procalcitonina = procalcitonina;
        this.proteinac = proteinac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAlbuminaseps() {
        return albuminaseps;
    }

    public void setAlbuminaseps(double albuminaseps) {
        this.albuminaseps = albuminaseps;
    }

    public String getBradicardia() {
        return bradicardia;
    }

    public void setBradicardia(String bradicardia) {
        this.bradicardia = bradicardia;
    }

    public double getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(double glicemia) {
        this.glicemia = glicemia;
    }

    public String getHipertermia() {
        return hipertermia;
    }

    public void setHipertermia(String hipertermia) {
        this.hipertermia = hipertermia;
    }

    public String getHipotermia() {
        return hipotermia;
    }

    public void setHipotermia(String hipotermia) {
        this.hipotermia = hipotermia;
    }

    public String getLeucocitosis() {
        return leucocitosis;
    }

    public void setLeucocitosis(String leucocitosis) {
        this.leucocitosis = leucocitosis;
    }

    public String getLeucopenia() {
        return leucopenia;
    }

    public void setLeucopenia(String leucopenia) {
        this.leucopenia = leucopenia;
    }

    public String getLinfopenia() {
        return linfopenia;
    }

    public void setLinfopenia(String linfopenia) {
        this.linfopenia = linfopenia;
    }

    public double getProcalcitonina() {
        return procalcitonina;
    }

    public void setProcalcitonina(double procalcitonina) {
        this.procalcitonina = procalcitonina;
    }

    public double getProteinac() {
        return proteinac;
    }

    public void setProteinac(double proteinac) {
        this.proteinac = proteinac;
    }

    public String getSirs() {
        return sirs;
    }

    public void setSirs(String sirs) {
        this.sirs = sirs;
    }

    public String getTaquicardia() {
        return taquicardia;
    }

    public void setTaquicardia(String taquicardia) {
        this.taquicardia = taquicardia;
    }

    public String getTaquipnea() {
        return taquipnea;
    }

    public void setTaquipnea(String taquipnea) {
        this.taquipnea = taquipnea;
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
        if (!(object instanceof RespuestaInflamatoria)) {
            return false;
        }
        RespuestaInflamatoria other = (RespuestaInflamatoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.RespuestaInflamatoria[ id=" + id + " ]";
    }
    
}
