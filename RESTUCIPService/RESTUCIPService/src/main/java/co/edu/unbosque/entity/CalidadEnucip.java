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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "calidad_enucip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CalidadEnucip.findAll", query = "SELECT c FROM CalidadEnucip c")
    , @NamedQuery(name = "CalidadEnucip.findById", query = "SELECT c FROM CalidadEnucip c WHERE c.id = :id")
    , @NamedQuery(name = "CalidadEnucip.findByCaidaPaciente", query = "SELECT c FROM CalidadEnucip c WHERE c.caidaPaciente = :caidaPaciente")
    , @NamedQuery(name = "CalidadEnucip.findByCateterCentral", query = "SELECT c FROM CalidadEnucip c WHERE c.cateterCentral = :cateterCentral")
    , @NamedQuery(name = "CalidadEnucip.findBySalidaTuboOrotraquial", query = "SELECT c FROM CalidadEnucip c WHERE c.salidaTuboOrotraquial = :salidaTuboOrotraquial")
    , @NamedQuery(name = "CalidadEnucip.findByTuboTorax", query = "SELECT c FROM CalidadEnucip c WHERE c.tuboTorax = :tuboTorax")
    , @NamedQuery(name = "CalidadEnucip.findByTrombosisDispositivoArterial", query = "SELECT c FROM CalidadEnucip c WHERE c.trombosisDispositivoArterial = :trombosisDispositivoArterial")
    , @NamedQuery(name = "CalidadEnucip.findByTrombosisDispositivoVenoso", query = "SELECT c FROM CalidadEnucip c WHERE c.trombosisDispositivoVenoso = :trombosisDispositivoVenoso")
    , @NamedQuery(name = "CalidadEnucip.findByObservacionesEnucip", query = "SELECT c FROM CalidadEnucip c WHERE c.observacionesEnucip = :observacionesEnucip")})
public class CalidadEnucip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "caida_paciente")
    private String caidaPaciente;
    @Size(max = 255)
    @Column(name = "cateter_central")
    private String cateterCentral;
    @Size(max = 255)
    @Column(name = "salida_tubo_orotraquial")
    private String salidaTuboOrotraquial;
    @Size(max = 255)
    @Column(name = "tubo_torax")
    private String tuboTorax;
    @Size(max = 255)
    @Column(name = "trombosis_dispositivo_arterial")
    private String trombosisDispositivoArterial;
    @Size(max = 255)
    @Column(name = "trombosis_dispositivo_venoso")
    private String trombosisDispositivoVenoso;
    @Size(max = 2147483647)
    @Column(name = "observaciones_enucip")
    private String observacionesEnucip;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public CalidadEnucip() {
    }

    public CalidadEnucip(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaidaPaciente() {
        return caidaPaciente;
    }

    public void setCaidaPaciente(String caidaPaciente) {
        this.caidaPaciente = caidaPaciente;
    }

    public String getCateterCentral() {
        return cateterCentral;
    }

    public void setCateterCentral(String cateterCentral) {
        this.cateterCentral = cateterCentral;
    }

    public String getSalidaTuboOrotraquial() {
        return salidaTuboOrotraquial;
    }

    public void setSalidaTuboOrotraquial(String salidaTuboOrotraquial) {
        this.salidaTuboOrotraquial = salidaTuboOrotraquial;
    }

    public String getTuboTorax() {
        return tuboTorax;
    }

    public void setTuboTorax(String tuboTorax) {
        this.tuboTorax = tuboTorax;
    }

    public String getTrombosisDispositivoArterial() {
        return trombosisDispositivoArterial;
    }

    public void setTrombosisDispositivoArterial(String trombosisDispositivoArterial) {
        this.trombosisDispositivoArterial = trombosisDispositivoArterial;
    }

    public String getTrombosisDispositivoVenoso() {
        return trombosisDispositivoVenoso;
    }

    public void setTrombosisDispositivoVenoso(String trombosisDispositivoVenoso) {
        this.trombosisDispositivoVenoso = trombosisDispositivoVenoso;
    }

    public String getObservacionesEnucip() {
        return observacionesEnucip;
    }

    public void setObservacionesEnucip(String observacionesEnucip) {
        this.observacionesEnucip = observacionesEnucip;
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
        if (!(object instanceof CalidadEnucip)) {
            return false;
        }
        CalidadEnucip other = (CalidadEnucip) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.CalidadEnucip[ id=" + id + " ]";
    }
    
}
