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
@Table(name = "injuria_renal", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InjuriaRenal.findAll", query = "SELECT i FROM InjuriaRenal i"),
    @NamedQuery(name = "InjuriaRenal.findById", query = "SELECT i FROM InjuriaRenal i WHERE i.id = :id"),
    @NamedQuery(name = "InjuriaRenal.findByBiopsiaRenal", query = "SELECT i FROM InjuriaRenal i WHERE i.biopsiaRenal = :biopsiaRenal"),
    @NamedQuery(name = "InjuriaRenal.findByBundxira", query = "SELECT i FROM InjuriaRenal i WHERE i.bundxira = :bundxira"),
    @NamedQuery(name = "InjuriaRenal.findByBunsobreCreat", query = "SELECT i FROM InjuriaRenal i WHERE i.bunsobreCreat = :bunsobreCreat"),
    @NamedQuery(name = "InjuriaRenal.findByCreatininaDxira", query = "SELECT i FROM InjuriaRenal i WHERE i.creatininaDxira = :creatininaDxira"),
    @NamedQuery(name = "InjuriaRenal.findByDiasaines", query = "SELECT i FROM InjuriaRenal i WHERE i.diasaines = :diasaines"),
    @NamedQuery(name = "InjuriaRenal.findByDiaseica", query = "SELECT i FROM InjuriaRenal i WHERE i.diaseica = :diaseica"),
    @NamedQuery(name = "InjuriaRenal.findByEcorenal", query = "SELECT i FROM InjuriaRenal i WHERE i.ecorenal = :ecorenal"),
    @NamedQuery(name = "InjuriaRenal.findByFena", query = "SELECT i FROM InjuriaRenal i WHERE i.fena = :fena"),
    @NamedQuery(name = "InjuriaRenal.findByHidrocsalbypass", query = "SELECT i FROM InjuriaRenal i WHERE i.hidrocsalbypass = :hidrocsalbypass"),
    @NamedQuery(name = "InjuriaRenal.findByHipotens2horas", query = "SELECT i FROM InjuriaRenal i WHERE i.hipotens2horas = :hipotens2horas"),
    @NamedQuery(name = "InjuriaRenal.findByHorasAnuria", query = "SELECT i FROM InjuriaRenal i WHERE i.horasAnuria = :horasAnuria"),
    @NamedQuery(name = "InjuriaRenal.findByHorasOliguria", query = "SELECT i FROM InjuriaRenal i WHERE i.horasOliguria = :horasOliguria"),
    @NamedQuery(name = "InjuriaRenal.findByIndiceResistenciaRenalDerecho", query = "SELECT i FROM InjuriaRenal i WHERE i.indiceResistenciaRenalDerecho = :indiceResistenciaRenalDerecho"),
    @NamedQuery(name = "InjuriaRenal.findByIndiceResistenciaRenalIzquierdo", query = "SELECT i FROM InjuriaRenal i WHERE i.indiceResistenciaRenalIzquierdo = :indiceResistenciaRenalIzquierdo"),
    @NamedQuery(name = "InjuriaRenal.findByInfusionFurosemida", query = "SELECT i FROM InjuriaRenal i WHERE i.infusionFurosemida = :infusionFurosemida"),
    @NamedQuery(name = "InjuriaRenal.findByMediocontras", query = "SELECT i FROM InjuriaRenal i WHERE i.mediocontras = :mediocontras"),
    @NamedQuery(name = "InjuriaRenal.findByNefroproteccion", query = "SELECT i FROM InjuriaRenal i WHERE i.nefroproteccion = :nefroproteccion"),
    @NamedQuery(name = "InjuriaRenal.findByNomabnefro", query = "SELECT i FROM InjuriaRenal i WHERE i.nomabnefro = :nomabnefro"),
    @NamedQuery(name = "InjuriaRenal.findByPorcentajeFiltraGlom", query = "SELECT i FROM InjuriaRenal i WHERE i.porcentajeFiltraGlom = :porcentajeFiltraGlom"),
    @NamedQuery(name = "InjuriaRenal.findByReporteEcorenal", query = "SELECT i FROM InjuriaRenal i WHERE i.reporteEcorenal = :reporteEcorenal"),
    @NamedQuery(name = "InjuriaRenal.findByResultadoBiopsiaRenal", query = "SELECT i FROM InjuriaRenal i WHERE i.resultadoBiopsiaRenal = :resultadoBiopsiaRenal"),
    @NamedQuery(name = "InjuriaRenal.findByUsoabnefrot", query = "SELECT i FROM InjuriaRenal i WHERE i.usoabnefrot = :usoabnefrot"),
    @NamedQuery(name = "InjuriaRenal.findByValfena", query = "SELECT i FROM InjuriaRenal i WHERE i.valfena = :valfena")})
public class InjuriaRenal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "biopsia_renal", length = 255)
    private String biopsiaRenal;
    @Basic(optional = false)
    @Column(name = "bundxira", nullable = false)
    private double bundxira;
    @Basic(optional = false)
    @Column(name = "bunsobre_creat", nullable = false)
    private double bunsobreCreat;
    @Basic(optional = false)
    @Column(name = "creatinina_dxira", nullable = false)
    private double creatininaDxira;
    @Column(name = "diasaines")
    private Integer diasaines;
    @Column(name = "diaseica")
    private Integer diaseica;
    @Column(name = "ecorenal", length = 255)
    private String ecorenal;
    @Column(name = "fena", length = 255)
    private String fena;
    @Column(name = "hidrocsalbypass")
    private Integer hidrocsalbypass;
    @Column(name = "hipotens2horas", length = 255)
    private String hipotens2horas;
    @Column(name = "horas_anuria")
    private Integer horasAnuria;
    @Column(name = "horas_oliguria")
    private Integer horasOliguria;
    @Basic(optional = false)
    @Column(name = "indice_resistencia_renal_derecho", nullable = false)
    private double indiceResistenciaRenalDerecho;
    @Basic(optional = false)
    @Column(name = "indice_resistencia_renal_izquierdo", nullable = false)
    private double indiceResistenciaRenalIzquierdo;
    @Column(name = "infusion_furosemida")
    private Integer infusionFurosemida;
    @Column(name = "mediocontras", length = 255)
    private String mediocontras;
    @Column(name = "nefroproteccion", length = 255)
    private String nefroproteccion;
    @Column(name = "nomabnefro", length = 255)
    private String nomabnefro;
    @Basic(optional = false)
    @Column(name = "porcentaje_filtra_glom", nullable = false)
    private double porcentajeFiltraGlom;
    @Column(name = "reporte_ecorenal", length = 255)
    private String reporteEcorenal;
    @Column(name = "resultado_biopsia_renal", length = 255)
    private String resultadoBiopsiaRenal;
    @Column(name = "usoabnefrot", length = 255)
    private String usoabnefrot;
    @Basic(optional = false)
    @Column(name = "valfena", nullable = false)
    private double valfena;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public InjuriaRenal() {
    }

    public InjuriaRenal(Long id) {
        this.id = id;
    }

    public InjuriaRenal(Long id, double bundxira, double bunsobreCreat, double creatininaDxira, double indiceResistenciaRenalDerecho, double indiceResistenciaRenalIzquierdo, double porcentajeFiltraGlom, double valfena) {
        this.id = id;
        this.bundxira = bundxira;
        this.bunsobreCreat = bunsobreCreat;
        this.creatininaDxira = creatininaDxira;
        this.indiceResistenciaRenalDerecho = indiceResistenciaRenalDerecho;
        this.indiceResistenciaRenalIzquierdo = indiceResistenciaRenalIzquierdo;
        this.porcentajeFiltraGlom = porcentajeFiltraGlom;
        this.valfena = valfena;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBiopsiaRenal() {
        return biopsiaRenal;
    }

    public void setBiopsiaRenal(String biopsiaRenal) {
        this.biopsiaRenal = biopsiaRenal;
    }

    public double getBundxira() {
        return bundxira;
    }

    public void setBundxira(double bundxira) {
        this.bundxira = bundxira;
    }

    public double getBunsobreCreat() {
        return bunsobreCreat;
    }

    public void setBunsobreCreat(double bunsobreCreat) {
        this.bunsobreCreat = bunsobreCreat;
    }

    public double getCreatininaDxira() {
        return creatininaDxira;
    }

    public void setCreatininaDxira(double creatininaDxira) {
        this.creatininaDxira = creatininaDxira;
    }

    public Integer getDiasaines() {
        return diasaines;
    }

    public void setDiasaines(Integer diasaines) {
        this.diasaines = diasaines;
    }

    public Integer getDiaseica() {
        return diaseica;
    }

    public void setDiaseica(Integer diaseica) {
        this.diaseica = diaseica;
    }

    public String getEcorenal() {
        return ecorenal;
    }

    public void setEcorenal(String ecorenal) {
        this.ecorenal = ecorenal;
    }

    public String getFena() {
        return fena;
    }

    public void setFena(String fena) {
        this.fena = fena;
    }

    public Integer getHidrocsalbypass() {
        return hidrocsalbypass;
    }

    public void setHidrocsalbypass(Integer hidrocsalbypass) {
        this.hidrocsalbypass = hidrocsalbypass;
    }

    public String getHipotens2horas() {
        return hipotens2horas;
    }

    public void setHipotens2horas(String hipotens2horas) {
        this.hipotens2horas = hipotens2horas;
    }

    public Integer getHorasAnuria() {
        return horasAnuria;
    }

    public void setHorasAnuria(Integer horasAnuria) {
        this.horasAnuria = horasAnuria;
    }

    public Integer getHorasOliguria() {
        return horasOliguria;
    }

    public void setHorasOliguria(Integer horasOliguria) {
        this.horasOliguria = horasOliguria;
    }

    public double getIndiceResistenciaRenalDerecho() {
        return indiceResistenciaRenalDerecho;
    }

    public void setIndiceResistenciaRenalDerecho(double indiceResistenciaRenalDerecho) {
        this.indiceResistenciaRenalDerecho = indiceResistenciaRenalDerecho;
    }

    public double getIndiceResistenciaRenalIzquierdo() {
        return indiceResistenciaRenalIzquierdo;
    }

    public void setIndiceResistenciaRenalIzquierdo(double indiceResistenciaRenalIzquierdo) {
        this.indiceResistenciaRenalIzquierdo = indiceResistenciaRenalIzquierdo;
    }

    public Integer getInfusionFurosemida() {
        return infusionFurosemida;
    }

    public void setInfusionFurosemida(Integer infusionFurosemida) {
        this.infusionFurosemida = infusionFurosemida;
    }

    public String getMediocontras() {
        return mediocontras;
    }

    public void setMediocontras(String mediocontras) {
        this.mediocontras = mediocontras;
    }

    public String getNefroproteccion() {
        return nefroproteccion;
    }

    public void setNefroproteccion(String nefroproteccion) {
        this.nefroproteccion = nefroproteccion;
    }

    public String getNomabnefro() {
        return nomabnefro;
    }

    public void setNomabnefro(String nomabnefro) {
        this.nomabnefro = nomabnefro;
    }

    public double getPorcentajeFiltraGlom() {
        return porcentajeFiltraGlom;
    }

    public void setPorcentajeFiltraGlom(double porcentajeFiltraGlom) {
        this.porcentajeFiltraGlom = porcentajeFiltraGlom;
    }

    public String getReporteEcorenal() {
        return reporteEcorenal;
    }

    public void setReporteEcorenal(String reporteEcorenal) {
        this.reporteEcorenal = reporteEcorenal;
    }

    public String getResultadoBiopsiaRenal() {
        return resultadoBiopsiaRenal;
    }

    public void setResultadoBiopsiaRenal(String resultadoBiopsiaRenal) {
        this.resultadoBiopsiaRenal = resultadoBiopsiaRenal;
    }

    public String getUsoabnefrot() {
        return usoabnefrot;
    }

    public void setUsoabnefrot(String usoabnefrot) {
        this.usoabnefrot = usoabnefrot;
    }

    public double getValfena() {
        return valfena;
    }

    public void setValfena(double valfena) {
        this.valfena = valfena;
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
        if (!(object instanceof InjuriaRenal)) {
            return false;
        }
        InjuriaRenal other = (InjuriaRenal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.InjuriaRenal[ id=" + id + " ]";
    }
    
}
