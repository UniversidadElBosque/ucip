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
@Table(name = "otros_procedimientosucip", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OtrosProcedimientosucip.findAll", query = "SELECT o FROM OtrosProcedimientosucip o"),
    @NamedQuery(name = "OtrosProcedimientosucip.findById", query = "SELECT o FROM OtrosProcedimientosucip o WHERE o.id = :id"),
    @NamedQuery(name = "OtrosProcedimientosucip.findByEcmova", query = "SELECT o FROM OtrosProcedimientosucip o WHERE o.ecmova = :ecmova"),
    @NamedQuery(name = "OtrosProcedimientosucip.findByEcmovv", query = "SELECT o FROM OtrosProcedimientosucip o WHERE o.ecmovv = :ecmovv"),
    @NamedQuery(name = "OtrosProcedimientosucip.findByMarcaPasosPermanente", query = "SELECT o FROM OtrosProcedimientosucip o WHERE o.marcaPasosPermanente = :marcaPasosPermanente"),
    @NamedQuery(name = "OtrosProcedimientosucip.findByMarcaPasosTransitorio", query = "SELECT o FROM OtrosProcedimientosucip o WHERE o.marcaPasosTransitorio = :marcaPasosTransitorio"),
    @NamedQuery(name = "OtrosProcedimientosucip.findByNumDiasEcmo", query = "SELECT o FROM OtrosProcedimientosucip o WHERE o.numDiasEcmo = :numDiasEcmo")})
public class OtrosProcedimientosucip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "ecmova", length = 255)
    private String ecmova;
    @Column(name = "ecmovv", length = 255)
    private String ecmovv;
    @Column(name = "marca_pasos_permanente", length = 255)
    private String marcaPasosPermanente;
    @Column(name = "marca_pasos_transitorio", length = 255)
    private String marcaPasosTransitorio;
    @Column(name = "num_dias_ecmo")
    private Integer numDiasEcmo;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public OtrosProcedimientosucip() {
    }

    public OtrosProcedimientosucip(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEcmova() {
        return ecmova;
    }

    public void setEcmova(String ecmova) {
        this.ecmova = ecmova;
    }

    public String getEcmovv() {
        return ecmovv;
    }

    public void setEcmovv(String ecmovv) {
        this.ecmovv = ecmovv;
    }

    public String getMarcaPasosPermanente() {
        return marcaPasosPermanente;
    }

    public void setMarcaPasosPermanente(String marcaPasosPermanente) {
        this.marcaPasosPermanente = marcaPasosPermanente;
    }

    public String getMarcaPasosTransitorio() {
        return marcaPasosTransitorio;
    }

    public void setMarcaPasosTransitorio(String marcaPasosTransitorio) {
        this.marcaPasosTransitorio = marcaPasosTransitorio;
    }

    public Integer getNumDiasEcmo() {
        return numDiasEcmo;
    }

    public void setNumDiasEcmo(Integer numDiasEcmo) {
        this.numDiasEcmo = numDiasEcmo;
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
        if (!(object instanceof OtrosProcedimientosucip)) {
            return false;
        }
        OtrosProcedimientosucip other = (OtrosProcedimientosucip) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.OtrosProcedimientosucip[ id=" + id + " ]";
    }
    
}
