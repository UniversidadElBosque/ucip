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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "soporte_ventilatorio", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({//select avg(s.diasvmc) from soporte_ventilatorio s where s.diasvmc is not null    
    
    @NamedQuery(name = "SoporteVentilatorio.prueba", query = "SELECT AVG(s.diasvmc) FROM SoporteVentilatorio s WHERE s.diasvmc IS NOT NULL AND s.estancia.fechaIngreso >= :fecha1 AND s.estancia.fechaIngreso <= :fecha2")
    ,
    @NamedQuery(name = "SoporteVentilatorio.countByCausa", query = "SELECT s.causaExtFalli, COUNT(s) FROM SoporteVentilatorio s WHERE s.estancia.fechaIngreso >= :fecha1 AND s.estancia.fechaIngreso <= :fecha2 GROUP BY s.causaExtFalli")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findAll", query = "SELECT s FROM SoporteVentilatorio s")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findById", query = "SELECT s FROM SoporteVentilatorio s WHERE s.id = :id")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByCausaExtFalli", query = "SELECT s FROM SoporteVentilatorio s WHERE s.causaExtFalli = :causaExtFalli")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByCorticoiextub", query = "SELECT s FROM SoporteVentilatorio s WHERE s.corticoiextub = :corticoiextub")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasCortinv", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasCortinv = :diasCortinv")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasCortioral", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasCortioral = :diasCortioral")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasLibreVenti28", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasLibreVenti28 = :diasLibreVenti28")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasLibreVenti45", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasLibreVenti45 = :diasLibreVenti45")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasOxidoNitrico", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasOxidoNitrico = :diasOxidoNitrico")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasProno", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasProno = :diasProno")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasSindenafilo", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasSindenafilo = :diasSindenafilo")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasvafo", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasvafo = :diasvafo")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasvmc", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasvmc = :diasvmc")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByDiasvni", query = "SELECT s FROM SoporteVentilatorio s WHERE s.diasvni = :diasvni")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByNumExtubFalli", query = "SELECT s FROM SoporteVentilatorio s WHERE s.numExtubFalli = :numExtubFalli")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPcompliance", query = "SELECT s FROM SoporteVentilatorio s WHERE s.pcompliance = :pcompliance")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPeorSaturacion", query = "SELECT s FROM SoporteVentilatorio s WHERE s.peorSaturacion = :peorSaturacion")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPeorVolumenCorriente", query = "SELECT s FROM SoporteVentilatorio s WHERE s.peorVolumenCorriente = :peorVolumenCorriente")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPeroMomentoVenti", query = "SELECT s FROM SoporteVentilatorio s WHERE s.peroMomentoVenti = :peroMomentoVenti")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPfioDos", query = "SELECT s FROM SoporteVentilatorio s WHERE s.pfioDos = :pfioDos")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPfr", query = "SELECT s FROM SoporteVentilatorio s WHERE s.pfr = :pfr")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPio", query = "SELECT s FROM SoporteVentilatorio s WHERE s.pio = :pio")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPpaoDos", query = "SELECT s FROM SoporteVentilatorio s WHERE s.ppaoDos = :ppaoDos")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPpaoSbrefio", query = "SELECT s FROM SoporteVentilatorio s WHERE s.ppaoSbrefio = :ppaoSbrefio")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPpeed", query = "SELECT s FROM SoporteVentilatorio s WHERE s.ppeed = :ppeed")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPpip", query = "SELECT s FROM SoporteVentilatorio s WHERE s.ppip = :ppip")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPplateau", query = "SELECT s FROM SoporteVentilatorio s WHERE s.pplateau = :pplateau")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPpmva", query = "SELECT s FROM SoporteVentilatorio s WHERE s.ppmva = :ppmva")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPsatSobrefio", query = "SELECT s FROM SoporteVentilatorio s WHERE s.psatSobrefio = :psatSobrefio")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByPvolmin", query = "SELECT s FROM SoporteVentilatorio s WHERE s.pvolmin = :pvolmin")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByRon", query = "SELECT s FROM SoporteVentilatorio s WHERE s.ron = :ron")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByRpeep", query = "SELECT s FROM SoporteVentilatorio s WHERE s.rpeep = :rpeep")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByRprono", query = "SELECT s FROM SoporteVentilatorio s WHERE s.rprono = :rprono")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByRpronoo2", query = "SELECT s FROM SoporteVentilatorio s WHERE s.rpronoo2 = :rpronoo2")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findBySurfact", query = "SELECT s FROM SoporteVentilatorio s WHERE s.surfact = :surfact")
    ,
    @NamedQuery(name = "SoporteVentilatorio.findByUsoPosicionProno", query = "SELECT s FROM SoporteVentilatorio s WHERE s.usoPosicionProno = :usoPosicionProno")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "SoporteVentilatorio.promediodiasvmc", query = "select avg(s.diasvmc) from soporte_ventilatorio s where s.diasvmc is not null AND s.estancia.fechaIngreso >= ? AND s.estancia.fechaIngreso <= ?")
})
public class SoporteVentilatorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "causa_ext_falli", length = 255)
    private String causaExtFalli;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "corticoiextub", precision = 17, scale = 17)
    private Double corticoiextub;
    @Column(name = "dias_cortinv", precision = 17, scale = 17)
    private Double diasCortinv;
    @Column(name = "dias_cortioral", precision = 17, scale = 17)
    private Double diasCortioral;
    @Column(name = "dias_libre_venti28", precision = 17, scale = 17)
    private Double diasLibreVenti28;
    @Column(name = "dias_libre_venti45", precision = 17, scale = 17)
    private Double diasLibreVenti45;
    @Column(name = "dias_oxido_nitrico", precision = 17, scale = 17)
    private Double diasOxidoNitrico;
    @Column(name = "dias_prono", precision = 17, scale = 17)
    private Double diasProno;
    @Column(name = "dias_sindenafilo", precision = 17, scale = 17)
    private Double diasSindenafilo;
    @Column(name = "diasvafo", precision = 17, scale = 17)
    private Double diasvafo;
    @Column(name = "diasvmc", precision = 17, scale = 17)
    private Double diasvmc;
    @Column(name = "diasvni", precision = 17, scale = 17)
    private Double diasvni;
    @Column(name = "num_extub_falli", precision = 17, scale = 17)
    private Double numExtubFalli;
    @Column(name = "pcompliance", precision = 17, scale = 17)
    private Double pcompliance;
    @Column(name = "peor_saturacion", precision = 17, scale = 17)
    private Double peorSaturacion;
    @Column(name = "peor_volumen_corriente", precision = 17, scale = 17)
    private Double peorVolumenCorriente;
    @Column(name = "pero_momento_venti", length = 255)
    private String peroMomentoVenti;
    @Column(name = "pfio_dos", precision = 17, scale = 17)
    private Double pfioDos;
    @Column(name = "pfr", precision = 17, scale = 17)
    private Double pfr;
    @Column(name = "pio", precision = 17, scale = 17)
    private Double pio;
    @Column(name = "ppao_dos", precision = 17, scale = 17)
    private Double ppaoDos;
    @Column(name = "ppao_sbrefio", precision = 17, scale = 17)
    private Double ppaoSbrefio;
    @Column(name = "ppeed", precision = 17, scale = 17)
    private Double ppeed;
    @Column(name = "ppip", precision = 17, scale = 17)
    private Double ppip;
    @Column(name = "pplateau", precision = 17, scale = 17)
    private Double pplateau;
    @Column(name = "ppmva", precision = 17, scale = 17)
    private Double ppmva;
    @Column(name = "psat_sobrefio", precision = 17, scale = 17)
    private Double psatSobrefio;
    @Column(name = "pvolmin", precision = 17, scale = 17)
    private Double pvolmin;
    @Column(name = "ron", length = 255)
    private String ron;
    @Column(name = "rpeep", length = 255)
    private String rpeep;
    @Column(name = "rprono", precision = 17, scale = 17)
    private Double rprono;
    @Column(name = "rpronoo2", length = 255)
    private String rpronoo2;
    @Column(name = "surfact", length = 255)
    private String surfact;
    @Column(name = "uso_posicion_prono", length = 255)
    private String usoPosicionProno;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public SoporteVentilatorio() {
    }

    public SoporteVentilatorio(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCausaExtFalli() {
        return causaExtFalli;
    }

    public void setCausaExtFalli(String causaExtFalli) {
        this.causaExtFalli = causaExtFalli;
    }

    public Double getCorticoiextub() {
        return corticoiextub;
    }

    public void setCorticoiextub(Double corticoiextub) {
        this.corticoiextub = corticoiextub;
    }

    public Double getDiasCortinv() {
        return diasCortinv;
    }

    public void setDiasCortinv(Double diasCortinv) {
        this.diasCortinv = diasCortinv;
    }

    public Double getDiasCortioral() {
        return diasCortioral;
    }

    public void setDiasCortioral(Double diasCortioral) {
        this.diasCortioral = diasCortioral;
    }

    public Double getDiasLibreVenti28() {
        return diasLibreVenti28;
    }

    public void setDiasLibreVenti28(Double diasLibreVenti28) {
        this.diasLibreVenti28 = diasLibreVenti28;
    }

    public Double getDiasLibreVenti45() {
        return diasLibreVenti45;
    }

    public void setDiasLibreVenti45(Double diasLibreVenti45) {
        this.diasLibreVenti45 = diasLibreVenti45;
    }

    public Double getDiasOxidoNitrico() {
        return diasOxidoNitrico;
    }

    public void setDiasOxidoNitrico(Double diasOxidoNitrico) {
        this.diasOxidoNitrico = diasOxidoNitrico;
    }

    public Double getDiasProno() {
        return diasProno;
    }

    public void setDiasProno(Double diasProno) {
        this.diasProno = diasProno;
    }

    public Double getDiasSindenafilo() {
        return diasSindenafilo;
    }

    public void setDiasSindenafilo(Double diasSindenafilo) {
        this.diasSindenafilo = diasSindenafilo;
    }

    public Double getDiasvafo() {
        return diasvafo;
    }

    public void setDiasvafo(Double diasvafo) {
        this.diasvafo = diasvafo;
    }

    public Double getDiasvmc() {
        return diasvmc;
    }

    public void setDiasvmc(Double diasvmc) {
        this.diasvmc = diasvmc;
    }

    public Double getDiasvni() {
        return diasvni;
    }

    public void setDiasvni(Double diasvni) {
        this.diasvni = diasvni;
    }

    public Double getNumExtubFalli() {
        return numExtubFalli;
    }

    public void setNumExtubFalli(Double numExtubFalli) {
        this.numExtubFalli = numExtubFalli;
    }

    public Double getPcompliance() {
        return pcompliance;
    }

    public void setPcompliance(Double pcompliance) {
        this.pcompliance = pcompliance;
    }

    public Double getPeorSaturacion() {
        return peorSaturacion;
    }

    public void setPeorSaturacion(Double peorSaturacion) {
        this.peorSaturacion = peorSaturacion;
    }

    public Double getPeorVolumenCorriente() {
        return peorVolumenCorriente;
    }

    public void setPeorVolumenCorriente(Double peorVolumenCorriente) {
        this.peorVolumenCorriente = peorVolumenCorriente;
    }

    public String getPeroMomentoVenti() {
        return peroMomentoVenti;
    }

    public void setPeroMomentoVenti(String peroMomentoVenti) {
        this.peroMomentoVenti = peroMomentoVenti;
    }

    public Double getPfioDos() {
        return pfioDos;
    }

    public void setPfioDos(Double pfioDos) {
        this.pfioDos = pfioDos;
    }

    public Double getPfr() {
        return pfr;
    }

    public void setPfr(Double pfr) {
        this.pfr = pfr;
    }

    public Double getPio() {
        return pio;
    }

    public void setPio(Double pio) {
        this.pio = pio;
    }

    public Double getPpaoDos() {
        return ppaoDos;
    }

    public void setPpaoDos(Double ppaoDos) {
        this.ppaoDos = ppaoDos;
    }

    public Double getPpaoSbrefio() {
        return ppaoSbrefio;
    }

    public void setPpaoSbrefio(Double ppaoSbrefio) {
        this.ppaoSbrefio = ppaoSbrefio;
    }

    public Double getPpeed() {
        return ppeed;
    }

    public void setPpeed(Double ppeed) {
        this.ppeed = ppeed;
    }

    public Double getPpip() {
        return ppip;
    }

    public void setPpip(Double ppip) {
        this.ppip = ppip;
    }

    public Double getPplateau() {
        return pplateau;
    }

    public void setPplateau(Double pplateau) {
        this.pplateau = pplateau;
    }

    public Double getPpmva() {
        return ppmva;
    }

    public void setPpmva(Double ppmva) {
        this.ppmva = ppmva;
    }

    public Double getPsatSobrefio() {
        return psatSobrefio;
    }

    public void setPsatSobrefio(Double psatSobrefio) {
        this.psatSobrefio = psatSobrefio;
    }

    public Double getPvolmin() {
        return pvolmin;
    }

    public void setPvolmin(Double pvolmin) {
        this.pvolmin = pvolmin;
    }

    public String getRon() {
        return ron;
    }

    public void setRon(String ron) {
        this.ron = ron;
    }

    public String getRpeep() {
        return rpeep;
    }

    public void setRpeep(String rpeep) {
        this.rpeep = rpeep;
    }

    public Double getRprono() {
        return rprono;
    }

    public void setRprono(Double rprono) {
        this.rprono = rprono;
    }

    public String getRpronoo2() {
        return rpronoo2;
    }

    public void setRpronoo2(String rpronoo2) {
        this.rpronoo2 = rpronoo2;
    }

    public String getSurfact() {
        return surfact;
    }

    public void setSurfact(String surfact) {
        this.surfact = surfact;
    }

    public String getUsoPosicionProno() {
        return usoPosicionProno;
    }

    public void setUsoPosicionProno(String usoPosicionProno) {
        this.usoPosicionProno = usoPosicionProno;
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
        if (!(object instanceof SoporteVentilatorio)) {
            return false;
        }
        SoporteVentilatorio other = (SoporteVentilatorio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.SoporteVentilatorio[ id=" + id + " ]";
    }

}
