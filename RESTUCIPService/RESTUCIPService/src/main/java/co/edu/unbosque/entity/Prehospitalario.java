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
@Table(name = "prehospitalario", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prehospitalario.findAll", query = "SELECT p FROM Prehospitalario p"),
    @NamedQuery(name = "Prehospitalario.findById", query = "SELECT p FROM Prehospitalario p WHERE p.id = :id"),
    @NamedQuery(name = "Prehospitalario.findByEsquemaVacuna", query = "SELECT p FROM Prehospitalario p WHERE p.esquemaVacuna = :esquemaVacuna"),
    @NamedQuery(name = "Prehospitalario.findByEsquemaVacunaCompleta", query = "SELECT p FROM Prehospitalario p WHERE p.esquemaVacunaCompleta = :esquemaVacunaCompleta"),
    @NamedQuery(name = "Prehospitalario.findByFarmacologico", query = "SELECT p FROM Prehospitalario p WHERE p.farmacologico = :farmacologico"),
    @NamedQuery(name = "Prehospitalario.findByFechaRemision", query = "SELECT p FROM Prehospitalario p WHERE p.fechaRemision = :fechaRemision"),
    @NamedQuery(name = "Prehospitalario.findByHoraRemision", query = "SELECT p FROM Prehospitalario p WHERE p.horaRemision = :horaRemision"),
    @NamedQuery(name = "Prehospitalario.findByMedicamento1", query = "SELECT p FROM Prehospitalario p WHERE p.medicamento1 = :medicamento1"),
    @NamedQuery(name = "Prehospitalario.findByMedicamento2", query = "SELECT p FROM Prehospitalario p WHERE p.medicamento2 = :medicamento2"),
    @NamedQuery(name = "Prehospitalario.findByNHospitalizaciones", query = "SELECT p FROM Prehospitalario p WHERE p.nHospitalizaciones = :nHospitalizaciones"),
    @NamedQuery(name = "Prehospitalario.findByNivel", query = "SELECT p FROM Prehospitalario p WHERE p.nivel = :nivel"),
    @NamedQuery(name = "Prehospitalario.findByProfesional", query = "SELECT p FROM Prehospitalario p WHERE p.profesional = :profesional"),
    @NamedQuery(name = "Prehospitalario.findBySitioRemision", query = "SELECT p FROM Prehospitalario p WHERE p.sitioRemision = :sitioRemision"),
    @NamedQuery(name = "Prehospitalario.findByTiemplugatencion", query = "SELECT p FROM Prehospitalario p WHERE p.tiemplugatencion = :tiemplugatencion"),
    @NamedQuery(name = "Prehospitalario.findByTiempoAntibiotico", query = "SELECT p FROM Prehospitalario p WHERE p.tiempoAntibiotico = :tiempoAntibiotico"),
    @NamedQuery(name = "Prehospitalario.findByTiempoLlegada", query = "SELECT p FROM Prehospitalario p WHERE p.tiempoLlegada = :tiempoLlegada"),
    @NamedQuery(name = "Prehospitalario.findByTipoSicomotor", query = "SELECT p FROM Prehospitalario p WHERE p.tipoSicomotor = :tipoSicomotor"),
    @NamedQuery(name = "Prehospitalario.findByTrastDeglucion", query = "SELECT p FROM Prehospitalario p WHERE p.trastDeglucion = :trastDeglucion")})
public class Prehospitalario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "esquema_vacuna", length = 255)
    private String esquemaVacuna;
    @Column(name = "esquema_vacuna_completa", length = 255)
    private String esquemaVacunaCompleta;
    @Column(name = "farmacologico", length = 255)
    private String farmacologico;
    @Column(name = "fecha_remision")
    @Temporal(TemporalType.DATE)
    private Date fechaRemision;
    @Column(name = "hora_remision")
    private Integer horaRemision;
    @Column(name = "medicamento1", length = 255)
    private String medicamento1;
    @Column(name = "medicamento2", length = 255)
    private String medicamento2;
    @Column(name = "n_hospitalizaciones")
    private Integer nHospitalizaciones;
    @Column(name = "nivel", length = 255)
    private String nivel;
    @Column(name = "profesional", length = 255)
    private String profesional;
    @Column(name = "sitio_remision", length = 255)
    private String sitioRemision;
    @Column(name = "tiemplugatencion")
    private Integer tiemplugatencion;
    @Column(name = "tiempo_antibiotico")
    private Integer tiempoAntibiotico;
    @Column(name = "tiempo_llegada")
    private Integer tiempoLlegada;
    @Column(name = "tipo_sicomotor", length = 255)
    private String tipoSicomotor;
    @Column(name = "trast_deglucion", length = 255)
    private String trastDeglucion;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public Prehospitalario() {
    }

    public Prehospitalario(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEsquemaVacuna() {
        return esquemaVacuna;
    }

    public void setEsquemaVacuna(String esquemaVacuna) {
        this.esquemaVacuna = esquemaVacuna;
    }

    public String getEsquemaVacunaCompleta() {
        return esquemaVacunaCompleta;
    }

    public void setEsquemaVacunaCompleta(String esquemaVacunaCompleta) {
        this.esquemaVacunaCompleta = esquemaVacunaCompleta;
    }

    public String getFarmacologico() {
        return farmacologico;
    }

    public void setFarmacologico(String farmacologico) {
        this.farmacologico = farmacologico;
    }

    public Date getFechaRemision() {
        return fechaRemision;
    }

    public void setFechaRemision(Date fechaRemision) {
        this.fechaRemision = fechaRemision;
    }

    public Integer getHoraRemision() {
        return horaRemision;
    }

    public void setHoraRemision(Integer horaRemision) {
        this.horaRemision = horaRemision;
    }

    public String getMedicamento1() {
        return medicamento1;
    }

    public void setMedicamento1(String medicamento1) {
        this.medicamento1 = medicamento1;
    }

    public String getMedicamento2() {
        return medicamento2;
    }

    public void setMedicamento2(String medicamento2) {
        this.medicamento2 = medicamento2;
    }

    public Integer getNHospitalizaciones() {
        return nHospitalizaciones;
    }

    public void setNHospitalizaciones(Integer nHospitalizaciones) {
        this.nHospitalizaciones = nHospitalizaciones;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public String getSitioRemision() {
        return sitioRemision;
    }

    public void setSitioRemision(String sitioRemision) {
        this.sitioRemision = sitioRemision;
    }

    public Integer getTiemplugatencion() {
        return tiemplugatencion;
    }

    public void setTiemplugatencion(Integer tiemplugatencion) {
        this.tiemplugatencion = tiemplugatencion;
    }

    public Integer getTiempoAntibiotico() {
        return tiempoAntibiotico;
    }

    public void setTiempoAntibiotico(Integer tiempoAntibiotico) {
        this.tiempoAntibiotico = tiempoAntibiotico;
    }

    public Integer getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(Integer tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public String getTipoSicomotor() {
        return tipoSicomotor;
    }

    public void setTipoSicomotor(String tipoSicomotor) {
        this.tipoSicomotor = tipoSicomotor;
    }

    public String getTrastDeglucion() {
        return trastDeglucion;
    }

    public void setTrastDeglucion(String trastDeglucion) {
        this.trastDeglucion = trastDeglucion;
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
        if (!(object instanceof Prehospitalario)) {
            return false;
        }
        Prehospitalario other = (Prehospitalario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.Prehospitalario[ id=" + id + " ]";
    }
    
}
