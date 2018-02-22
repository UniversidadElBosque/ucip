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
@Table(name = "variables_neurologicas", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesNeurologicas.findAll", query = "SELECT v FROM VariablesNeurologicas v"),
    @NamedQuery(name = "VariablesNeurologicas.findById", query = "SELECT v FROM VariablesNeurologicas v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesNeurologicas.findByClonidina", query = "SELECT v FROM VariablesNeurologicas v WHERE v.clonidina = :clonidina"),
    @NamedQuery(name = "VariablesNeurologicas.findByDelirium", query = "SELECT v FROM VariablesNeurologicas v WHERE v.delirium = :delirium"),
    @NamedQuery(name = "VariablesNeurologicas.findByDexmetome", query = "SELECT v FROM VariablesNeurologicas v WHERE v.dexmetome = :dexmetome"),
    @NamedQuery(name = "VariablesNeurologicas.findByDosisAcumuRelajMuscu", query = "SELECT v FROM VariablesNeurologicas v WHERE v.dosisAcumuRelajMuscu = :dosisAcumuRelajMuscu"),
    @NamedQuery(name = "VariablesNeurologicas.findByFentanilo", query = "SELECT v FROM VariablesNeurologicas v WHERE v.fentanilo = :fentanilo"),
    @NamedQuery(name = "VariablesNeurologicas.findByIniterapfisi", query = "SELECT v FROM VariablesNeurologicas v WHERE v.initerapfisi = :initerapfisi"),
    @NamedQuery(name = "VariablesNeurologicas.findByKetamina", query = "SELECT v FROM VariablesNeurologicas v WHERE v.ketamina = :ketamina"),
    @NamedQuery(name = "VariablesNeurologicas.findByLorazepam", query = "SELECT v FROM VariablesNeurologicas v WHERE v.lorazepam = :lorazepam"),
    @NamedQuery(name = "VariablesNeurologicas.findByMetadona", query = "SELECT v FROM VariablesNeurologicas v WHERE v.metadona = :metadona"),
    @NamedQuery(name = "VariablesNeurologicas.findByMidazolam", query = "SELECT v FROM VariablesNeurologicas v WHERE v.midazolam = :midazolam"),
    @NamedQuery(name = "VariablesNeurologicas.findByMorfina", query = "SELECT v FROM VariablesNeurologicas v WHERE v.morfina = :morfina"),
    @NamedQuery(name = "VariablesNeurologicas.findByRelajante", query = "SELECT v FROM VariablesNeurologicas v WHERE v.relajante = :relajante"),
    @NamedQuery(name = "VariablesNeurologicas.findBySindabstine", query = "SELECT v FROM VariablesNeurologicas v WHERE v.sindabstine = :sindabstine")})
public class VariablesNeurologicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "clonidina", precision = 17, scale = 17)
    private Double clonidina;
    @Column(name = "delirium", length = 255)
    private String delirium;
    @Column(name = "dexmetome", precision = 17, scale = 17)
    private Double dexmetome;
    @Column(name = "dosis_acumu_relaj_muscu", precision = 17, scale = 17)
    private Double dosisAcumuRelajMuscu;
    @Column(name = "fentanilo", precision = 17, scale = 17)
    private Double fentanilo;
    @Column(name = "initerapfisi")
    @Temporal(TemporalType.DATE)
    private Date initerapfisi;
    @Column(name = "ketamina", precision = 17, scale = 17)
    private Double ketamina;
    @Column(name = "lorazepam", precision = 17, scale = 17)
    private Double lorazepam;
    @Column(name = "metadona", precision = 17, scale = 17)
    private Double metadona;
    @Column(name = "midazolam", precision = 17, scale = 17)
    private Double midazolam;
    @Column(name = "morfina", precision = 17, scale = 17)
    private Double morfina;
    @Column(name = "relajante", length = 255)
    private String relajante;
    @Column(name = "sindabstine", length = 255)
    private String sindabstine;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesNeurologicas() {
    }

    public VariablesNeurologicas(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getClonidina() {
        return clonidina;
    }

    public void setClonidina(Double clonidina) {
        this.clonidina = clonidina;
    }

    public String getDelirium() {
        return delirium;
    }

    public void setDelirium(String delirium) {
        this.delirium = delirium;
    }

    public Double getDexmetome() {
        return dexmetome;
    }

    public void setDexmetome(Double dexmetome) {
        this.dexmetome = dexmetome;
    }

    public Double getDosisAcumuRelajMuscu() {
        return dosisAcumuRelajMuscu;
    }

    public void setDosisAcumuRelajMuscu(Double dosisAcumuRelajMuscu) {
        this.dosisAcumuRelajMuscu = dosisAcumuRelajMuscu;
    }

    public Double getFentanilo() {
        return fentanilo;
    }

    public void setFentanilo(Double fentanilo) {
        this.fentanilo = fentanilo;
    }

    public Date getIniterapfisi() {
        return initerapfisi;
    }

    public void setIniterapfisi(Date initerapfisi) {
        this.initerapfisi = initerapfisi;
    }

    public Double getKetamina() {
        return ketamina;
    }

    public void setKetamina(Double ketamina) {
        this.ketamina = ketamina;
    }

    public Double getLorazepam() {
        return lorazepam;
    }

    public void setLorazepam(Double lorazepam) {
        this.lorazepam = lorazepam;
    }

    public Double getMetadona() {
        return metadona;
    }

    public void setMetadona(Double metadona) {
        this.metadona = metadona;
    }

    public Double getMidazolam() {
        return midazolam;
    }

    public void setMidazolam(Double midazolam) {
        this.midazolam = midazolam;
    }

    public Double getMorfina() {
        return morfina;
    }

    public void setMorfina(Double morfina) {
        this.morfina = morfina;
    }

    public String getRelajante() {
        return relajante;
    }

    public void setRelajante(String relajante) {
        this.relajante = relajante;
    }

    public String getSindabstine() {
        return sindabstine;
    }

    public void setSindabstine(String sindabstine) {
        this.sindabstine = sindabstine;
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
        if (!(object instanceof VariablesNeurologicas)) {
            return false;
        }
        VariablesNeurologicas other = (VariablesNeurologicas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesNeurologicas[ id=" + id + " ]";
    }
    
}
