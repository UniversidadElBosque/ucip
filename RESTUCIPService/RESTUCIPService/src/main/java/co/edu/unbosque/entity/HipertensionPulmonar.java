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
@Table(name = "hipertension_pulmonar", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HipertensionPulmonar.findAll", query = "SELECT h FROM HipertensionPulmonar h"),
    @NamedQuery(name = "HipertensionPulmonar.findById", query = "SELECT h FROM HipertensionPulmonar h WHERE h.id = :id"),
    @NamedQuery(name = "HipertensionPulmonar.findByCardiomegalia", query = "SELECT h FROM HipertensionPulmonar h WHERE h.cardiomegalia = :cardiomegalia"),
    @NamedQuery(name = "HipertensionPulmonar.findByCeco", query = "SELECT h FROM HipertensionPulmonar h WHERE h.ceco = :ceco"),
    @NamedQuery(name = "HipertensionPulmonar.findByCoarterial", query = "SELECT h FROM HipertensionPulmonar h WHERE h.coarterial = :coarterial"),
    @NamedQuery(name = "HipertensionPulmonar.findByEcofecha", query = "SELECT h FROM HipertensionPulmonar h WHERE h.ecofecha = :ecofecha"),
    @NamedQuery(name = "HipertensionPulmonar.findByEcomplince", query = "SELECT h FROM HipertensionPulmonar h WHERE h.ecomplince = :ecomplince"),
    @NamedQuery(name = "HipertensionPulmonar.findByEio", query = "SELECT h FROM HipertensionPulmonar h WHERE h.eio = :eio"),
    @NamedQuery(name = "HipertensionPulmonar.findByEon", query = "SELECT h FROM HipertensionPulmonar h WHERE h.eon = :eon"),
    @NamedQuery(name = "HipertensionPulmonar.findByEpafcorregi", query = "SELECT h FROM HipertensionPulmonar h WHERE h.epafcorregi = :epafcorregi"),
    @NamedQuery(name = "HipertensionPulmonar.findByEpaofio", query = "SELECT h FROM HipertensionPulmonar h WHERE h.epaofio = :epaofio"),
    @NamedQuery(name = "HipertensionPulmonar.findByEpplateau", query = "SELECT h FROM HipertensionPulmonar h WHERE h.epplateau = :epplateau"),
    @NamedQuery(name = "HipertensionPulmonar.findByEsat", query = "SELECT h FROM HipertensionPulmonar h WHERE h.esat = :esat"),
    @NamedQuery(name = "HipertensionPulmonar.findByFechaPrimEco", query = "SELECT h FROM HipertensionPulmonar h WHERE h.fechaPrimEco = :fechaPrimEco"),
    @NamedQuery(name = "HipertensionPulmonar.findByFracEyecVentri", query = "SELECT h FROM HipertensionPulmonar h WHERE h.fracEyecVentri = :fracEyecVentri"),
    @NamedQuery(name = "HipertensionPulmonar.findByFracoxige", query = "SELECT h FROM HipertensionPulmonar h WHERE h.fracoxige = :fracoxige"),
    @NamedQuery(name = "HipertensionPulmonar.findByFrecurespi", query = "SELECT h FROM HipertensionPulmonar h WHERE h.frecurespi = :frecurespi"),
    @NamedQuery(name = "HipertensionPulmonar.findByGradohtp", query = "SELECT h FROM HipertensionPulmonar h WHERE h.gradohtp = :gradohtp"),
    @NamedQuery(name = "HipertensionPulmonar.findByHcoarterial", query = "SELECT h FROM HipertensionPulmonar h WHERE h.hcoarterial = :hcoarterial"),
    @NamedQuery(name = "HipertensionPulmonar.findByHgb", query = "SELECT h FROM HipertensionPulmonar h WHERE h.hgb = :hgb"),
    @NamedQuery(name = "HipertensionPulmonar.findByHtc", query = "SELECT h FROM HipertensionPulmonar h WHERE h.htc = :htc"),
    @NamedQuery(name = "HipertensionPulmonar.findByMetahemoglobinemia", query = "SELECT h FROM HipertensionPulmonar h WHERE h.metahemoglobinemia = :metahemoglobinemia"),
    @NamedQuery(name = "HipertensionPulmonar.findByModoventi", query = "SELECT h FROM HipertensionPulmonar h WHERE h.modoventi = :modoventi"),
    @NamedQuery(name = "HipertensionPulmonar.findByPartpSistolica", query = "SELECT h FROM HipertensionPulmonar h WHERE h.partpSistolica = :partpSistolica"),
    @NamedQuery(name = "HipertensionPulmonar.findByPeep", query = "SELECT h FROM HipertensionPulmonar h WHERE h.peep = :peep"),
    @NamedQuery(name = "HipertensionPulmonar.findByPharterial", query = "SELECT h FROM HipertensionPulmonar h WHERE h.pharterial = :pharterial"),
    @NamedQuery(name = "HipertensionPulmonar.findByPip", query = "SELECT h FROM HipertensionPulmonar h WHERE h.pip = :pip"),
    @NamedQuery(name = "HipertensionPulmonar.findByPmva", query = "SELECT h FROM HipertensionPulmonar h WHERE h.pmva = :pmva"),
    @NamedQuery(name = "HipertensionPulmonar.findByPresioarte", query = "SELECT h FROM HipertensionPulmonar h WHERE h.presioarte = :presioarte"),
    @NamedQuery(name = "HipertensionPulmonar.findByPresplateau", query = "SELECT h FROM HipertensionPulmonar h WHERE h.presplateau = :presplateau"),
    @NamedQuery(name = "HipertensionPulmonar.findByResultadoproc", query = "SELECT h FROM HipertensionPulmonar h WHERE h.resultadoproc = :resultadoproc"),
    @NamedQuery(name = "HipertensionPulmonar.findByRxtorax", query = "SELECT h FROM HipertensionPulmonar h WHERE h.rxtorax = :rxtorax"),
    @NamedQuery(name = "HipertensionPulmonar.findBySatfio", query = "SELECT h FROM HipertensionPulmonar h WHERE h.satfio = :satfio"),
    @NamedQuery(name = "HipertensionPulmonar.findBySatfiocorreg", query = "SELECT h FROM HipertensionPulmonar h WHERE h.satfiocorreg = :satfiocorreg"),
    @NamedQuery(name = "HipertensionPulmonar.findBySildenafi", query = "SELECT h FROM HipertensionPulmonar h WHERE h.sildenafi = :sildenafi"),
    @NamedQuery(name = "HipertensionPulmonar.findByTarteSistolica", query = "SELECT h FROM HipertensionPulmonar h WHERE h.tarteSistolica = :tarteSistolica"),
    @NamedQuery(name = "HipertensionPulmonar.findByVcorri", query = "SELECT h FROM HipertensionPulmonar h WHERE h.vcorri = :vcorri"),
    @NamedQuery(name = "HipertensionPulmonar.findByVminu", query = "SELECT h FROM HipertensionPulmonar h WHERE h.vminu = :vminu"),
    @NamedQuery(name = "HipertensionPulmonar.findByVpsap", query = "SELECT h FROM HipertensionPulmonar h WHERE h.vpsap = :vpsap")})
public class HipertensionPulmonar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "cardiomegalia", length = 255)
    private String cardiomegalia;
    @Column(name = "ceco", length = 255)
    private String ceco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "coarterial", precision = 17, scale = 17)
    private Double coarterial;
    @Column(name = "ecofecha")
    @Temporal(TemporalType.DATE)
    private Date ecofecha;
    @Column(name = "ecomplince", precision = 17, scale = 17)
    private Double ecomplince;
    @Column(name = "eio", precision = 17, scale = 17)
    private Double eio;
    @Column(name = "eon", length = 255)
    private String eon;
    @Column(name = "epafcorregi", precision = 17, scale = 17)
    private Double epafcorregi;
    @Column(name = "epaofio", precision = 17, scale = 17)
    private Double epaofio;
    @Column(name = "epplateau", precision = 17, scale = 17)
    private Double epplateau;
    @Column(name = "esat", precision = 17, scale = 17)
    private Double esat;
    @Column(name = "fecha_prim_eco")
    @Temporal(TemporalType.DATE)
    private Date fechaPrimEco;
    @Column(name = "frac_eyec_ventri", precision = 17, scale = 17)
    private Double fracEyecVentri;
    @Column(name = "fracoxige", precision = 17, scale = 17)
    private Double fracoxige;
    @Column(name = "frecurespi", precision = 17, scale = 17)
    private Double frecurespi;
    @Column(name = "gradohtp", length = 255)
    private String gradohtp;
    @Column(name = "hcoarterial", precision = 17, scale = 17)
    private Double hcoarterial;
    @Column(name = "hgb", precision = 17, scale = 17)
    private Double hgb;
    @Column(name = "htc", precision = 17, scale = 17)
    private Double htc;
    @Column(name = "metahemoglobinemia", length = 255)
    private String metahemoglobinemia;
    @Column(name = "modoventi", length = 255)
    private String modoventi;
    @Column(name = "partp_sistolica", precision = 17, scale = 17)
    private Double partpSistolica;
    @Column(name = "peep", precision = 17, scale = 17)
    private Double peep;
    @Column(name = "pharterial", precision = 17, scale = 17)
    private Double pharterial;
    @Column(name = "pip", precision = 17, scale = 17)
    private Double pip;
    @Column(name = "pmva", precision = 17, scale = 17)
    private Double pmva;
    @Column(name = "presioarte", precision = 17, scale = 17)
    private Double presioarte;
    @Column(name = "presplateau", precision = 17, scale = 17)
    private Double presplateau;
    @Column(name = "resultadoproc", length = 255)
    private String resultadoproc;
    @Column(name = "rxtorax", length = 255)
    private String rxtorax;
    @Column(name = "satfio", precision = 17, scale = 17)
    private Double satfio;
    @Column(name = "satfiocorreg", precision = 17, scale = 17)
    private Double satfiocorreg;
    @Column(name = "sildenafi", length = 255)
    private String sildenafi;
    @Column(name = "tarte_sistolica", precision = 17, scale = 17)
    private Double tarteSistolica;
    @Column(name = "vcorri", precision = 17, scale = 17)
    private Double vcorri;
    @Column(name = "vminu", precision = 17, scale = 17)
    private Double vminu;
    @Column(name = "vpsap", precision = 17, scale = 17)
    private Double vpsap;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public HipertensionPulmonar() {
    }

    public HipertensionPulmonar(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardiomegalia() {
        return cardiomegalia;
    }

    public void setCardiomegalia(String cardiomegalia) {
        this.cardiomegalia = cardiomegalia;
    }

    public String getCeco() {
        return ceco;
    }

    public void setCeco(String ceco) {
        this.ceco = ceco;
    }

    public Double getCoarterial() {
        return coarterial;
    }

    public void setCoarterial(Double coarterial) {
        this.coarterial = coarterial;
    }

    public Date getEcofecha() {
        return ecofecha;
    }

    public void setEcofecha(Date ecofecha) {
        this.ecofecha = ecofecha;
    }

    public Double getEcomplince() {
        return ecomplince;
    }

    public void setEcomplince(Double ecomplince) {
        this.ecomplince = ecomplince;
    }

    public Double getEio() {
        return eio;
    }

    public void setEio(Double eio) {
        this.eio = eio;
    }

    public String getEon() {
        return eon;
    }

    public void setEon(String eon) {
        this.eon = eon;
    }

    public Double getEpafcorregi() {
        return epafcorregi;
    }

    public void setEpafcorregi(Double epafcorregi) {
        this.epafcorregi = epafcorregi;
    }

    public Double getEpaofio() {
        return epaofio;
    }

    public void setEpaofio(Double epaofio) {
        this.epaofio = epaofio;
    }

    public Double getEpplateau() {
        return epplateau;
    }

    public void setEpplateau(Double epplateau) {
        this.epplateau = epplateau;
    }

    public Double getEsat() {
        return esat;
    }

    public void setEsat(Double esat) {
        this.esat = esat;
    }

    public Date getFechaPrimEco() {
        return fechaPrimEco;
    }

    public void setFechaPrimEco(Date fechaPrimEco) {
        this.fechaPrimEco = fechaPrimEco;
    }

    public Double getFracEyecVentri() {
        return fracEyecVentri;
    }

    public void setFracEyecVentri(Double fracEyecVentri) {
        this.fracEyecVentri = fracEyecVentri;
    }

    public Double getFracoxige() {
        return fracoxige;
    }

    public void setFracoxige(Double fracoxige) {
        this.fracoxige = fracoxige;
    }

    public Double getFrecurespi() {
        return frecurespi;
    }

    public void setFrecurespi(Double frecurespi) {
        this.frecurespi = frecurespi;
    }

    public String getGradohtp() {
        return gradohtp;
    }

    public void setGradohtp(String gradohtp) {
        this.gradohtp = gradohtp;
    }

    public Double getHcoarterial() {
        return hcoarterial;
    }

    public void setHcoarterial(Double hcoarterial) {
        this.hcoarterial = hcoarterial;
    }

    public Double getHgb() {
        return hgb;
    }

    public void setHgb(Double hgb) {
        this.hgb = hgb;
    }

    public Double getHtc() {
        return htc;
    }

    public void setHtc(Double htc) {
        this.htc = htc;
    }

    public String getMetahemoglobinemia() {
        return metahemoglobinemia;
    }

    public void setMetahemoglobinemia(String metahemoglobinemia) {
        this.metahemoglobinemia = metahemoglobinemia;
    }

    public String getModoventi() {
        return modoventi;
    }

    public void setModoventi(String modoventi) {
        this.modoventi = modoventi;
    }

    public Double getPartpSistolica() {
        return partpSistolica;
    }

    public void setPartpSistolica(Double partpSistolica) {
        this.partpSistolica = partpSistolica;
    }

    public Double getPeep() {
        return peep;
    }

    public void setPeep(Double peep) {
        this.peep = peep;
    }

    public Double getPharterial() {
        return pharterial;
    }

    public void setPharterial(Double pharterial) {
        this.pharterial = pharterial;
    }

    public Double getPip() {
        return pip;
    }

    public void setPip(Double pip) {
        this.pip = pip;
    }

    public Double getPmva() {
        return pmva;
    }

    public void setPmva(Double pmva) {
        this.pmva = pmva;
    }

    public Double getPresioarte() {
        return presioarte;
    }

    public void setPresioarte(Double presioarte) {
        this.presioarte = presioarte;
    }

    public Double getPresplateau() {
        return presplateau;
    }

    public void setPresplateau(Double presplateau) {
        this.presplateau = presplateau;
    }

    public String getResultadoproc() {
        return resultadoproc;
    }

    public void setResultadoproc(String resultadoproc) {
        this.resultadoproc = resultadoproc;
    }

    public String getRxtorax() {
        return rxtorax;
    }

    public void setRxtorax(String rxtorax) {
        this.rxtorax = rxtorax;
    }

    public Double getSatfio() {
        return satfio;
    }

    public void setSatfio(Double satfio) {
        this.satfio = satfio;
    }

    public Double getSatfiocorreg() {
        return satfiocorreg;
    }

    public void setSatfiocorreg(Double satfiocorreg) {
        this.satfiocorreg = satfiocorreg;
    }

    public String getSildenafi() {
        return sildenafi;
    }

    public void setSildenafi(String sildenafi) {
        this.sildenafi = sildenafi;
    }

    public Double getTarteSistolica() {
        return tarteSistolica;
    }

    public void setTarteSistolica(Double tarteSistolica) {
        this.tarteSistolica = tarteSistolica;
    }

    public Double getVcorri() {
        return vcorri;
    }

    public void setVcorri(Double vcorri) {
        this.vcorri = vcorri;
    }

    public Double getVminu() {
        return vminu;
    }

    public void setVminu(Double vminu) {
        this.vminu = vminu;
    }

    public Double getVpsap() {
        return vpsap;
    }

    public void setVpsap(Double vpsap) {
        this.vpsap = vpsap;
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
        if (!(object instanceof HipertensionPulmonar)) {
            return false;
        }
        HipertensionPulmonar other = (HipertensionPulmonar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.HipertensionPulmonar[ id=" + id + " ]";
    }
    
}
