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
@Table(name = "disfuncion_respiratoria", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisfuncionRespiratoria.countByRespiratoria", query = "SELECT COUNT(d) FROM DisfuncionRespiratoria d WHERE d.respiratoria = 'SI' AND d.estancia.fechaIngreso >= :fecha1 AND d.estancia.fechaIngreso <= :fecha2"),
    @NamedQuery(name = "DisfuncionRespiratoria.countTotalRespiratoria", query = "SELECT COUNT(d) FROM DisfuncionRespiratoria d WHERE d.estancia.fechaIngreso >= :fecha1 AND d.estancia.fechaIngreso <= :fecha2"),
    @NamedQuery(name = "DisfuncionRespiratoria.findAll", query = "SELECT d FROM DisfuncionRespiratoria d"),
    @NamedQuery(name = "DisfuncionRespiratoria.findById", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.id = :id"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByFechaDx", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.fechaDx = :fechaDx"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByFio2", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.fio2 = :fio2"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByFio250", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.fio250 = :fio250"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByIo", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.io = :io"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByNecesvm", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.necesvm = :necesvm"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByPaco2", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.paco2 = :paco2"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByPafi", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.pafi = :pafi"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByPafiCorregida", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.pafiCorregida = :pafiCorregida"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByPao2", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.pao2 = :pao2"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByPeepDxsdra", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.peepDxsdra = :peepDxsdra"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByPmwa", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.pmwa = :pmwa"),
    @NamedQuery(name = "DisfuncionRespiratoria.findByRespiratoria", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.respiratoria = :respiratoria"),
    @NamedQuery(name = "DisfuncionRespiratoria.findBySafi", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.safi = :safi"),
    @NamedQuery(name = "DisfuncionRespiratoria.findBySafiCorregida", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.safiCorregida = :safiCorregida"),
    @NamedQuery(name = "DisfuncionRespiratoria.findBySao2", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.sao2 = :sao2"),
    @NamedQuery(name = "DisfuncionRespiratoria.findBySdra", query = "SELECT d FROM DisfuncionRespiratoria d WHERE d.sdra = :sdra")})
public class DisfuncionRespiratoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "fecha_dx")
    @Temporal(TemporalType.DATE)
    private Date fechaDx;
    @Basic(optional = false)
    @Column(name = "fio2")
    private double fio2;
    @Column(name = "fio250")
    private String fio250;
    @Basic(optional = false)
    @Column(name = "io")
    private double io;
    @Column(name = "necesvm")
    private String necesvm;
    @Basic(optional = false)
    @Column(name = "paco2")
    private double paco2;
    @Basic(optional = false)
    @Column(name = "pafi")
    private double pafi;
    @Basic(optional = false)
    @Column(name = "pafi_corregida")
    private double pafiCorregida;
    @Basic(optional = false)
    @Column(name = "pao2")
    private double pao2;
    @Basic(optional = false)
    @Column(name = "peep_dxsdra")
    private double peepDxsdra;
    @Basic(optional = false)
    @Column(name = "pmwa")
    private double pmwa;
    @Column(name = "respiratoria")
    private String respiratoria;
    @Basic(optional = false)
    @Column(name = "safi")
    private double safi;
    @Basic(optional = false)
    @Column(name = "safi_corregida")
    private double safiCorregida;
    @Basic(optional = false)
    @Column(name = "sao2")
    private double sao2;
    @Column(name = "sdra")
    private String sdra;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public DisfuncionRespiratoria() {
    }

    public DisfuncionRespiratoria(Long id) {
        this.id = id;
    }

    public DisfuncionRespiratoria(Long id, double fio2, double io, double paco2, double pafi, double pafiCorregida, double pao2, double peepDxsdra, double pmwa, double safi, double safiCorregida, double sao2) {
        this.id = id;
        this.fio2 = fio2;
        this.io = io;
        this.paco2 = paco2;
        this.pafi = pafi;
        this.pafiCorregida = pafiCorregida;
        this.pao2 = pao2;
        this.peepDxsdra = peepDxsdra;
        this.pmwa = pmwa;
        this.safi = safi;
        this.safiCorregida = safiCorregida;
        this.sao2 = sao2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaDx() {
        return fechaDx;
    }

    public void setFechaDx(Date fechaDx) {
        this.fechaDx = fechaDx;
    }

    public double getFio2() {
        return fio2;
    }

    public void setFio2(double fio2) {
        this.fio2 = fio2;
    }

    public String getFio250() {
        return fio250;
    }

    public void setFio250(String fio250) {
        this.fio250 = fio250;
    }

    public double getIo() {
        return io;
    }

    public void setIo(double io) {
        this.io = io;
    }

    public String getNecesvm() {
        return necesvm;
    }

    public void setNecesvm(String necesvm) {
        this.necesvm = necesvm;
    }

    public double getPaco2() {
        return paco2;
    }

    public void setPaco2(double paco2) {
        this.paco2 = paco2;
    }

    public double getPafi() {
        return pafi;
    }

    public void setPafi(double pafi) {
        this.pafi = pafi;
    }

    public double getPafiCorregida() {
        return pafiCorregida;
    }

    public void setPafiCorregida(double pafiCorregida) {
        this.pafiCorregida = pafiCorregida;
    }

    public double getPao2() {
        return pao2;
    }

    public void setPao2(double pao2) {
        this.pao2 = pao2;
    }

    public double getPeepDxsdra() {
        return peepDxsdra;
    }

    public void setPeepDxsdra(double peepDxsdra) {
        this.peepDxsdra = peepDxsdra;
    }

    public double getPmwa() {
        return pmwa;
    }

    public void setPmwa(double pmwa) {
        this.pmwa = pmwa;
    }

    public String getRespiratoria() {
        return respiratoria;
    }

    public void setRespiratoria(String respiratoria) {
        this.respiratoria = respiratoria;
    }

    public double getSafi() {
        return safi;
    }

    public void setSafi(double safi) {
        this.safi = safi;
    }

    public double getSafiCorregida() {
        return safiCorregida;
    }

    public void setSafiCorregida(double safiCorregida) {
        this.safiCorregida = safiCorregida;
    }

    public double getSao2() {
        return sao2;
    }

    public void setSao2(double sao2) {
        this.sao2 = sao2;
    }

    public String getSdra() {
        return sdra;
    }

    public void setSdra(String sdra) {
        this.sdra = sdra;
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
        if (!(object instanceof DisfuncionRespiratoria)) {
            return false;
        }
        DisfuncionRespiratoria other = (DisfuncionRespiratoria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.DisfuncionRespiratoria[ id=" + id + " ]";
    }
    
}
