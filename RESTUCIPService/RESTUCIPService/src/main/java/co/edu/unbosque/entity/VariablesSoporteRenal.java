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
@Table(name = "variables_soporte_renal", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesSoporteRenal.findAll", query = "SELECT v FROM VariablesSoporteRenal v"),
    @NamedQuery(name = "VariablesSoporteRenal.findById", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesSoporteRenal.findByDialisisPeritoneal", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.dialisisPeritoneal = :dialisisPeritoneal"),
    @NamedQuery(name = "VariablesSoporteRenal.findByDiasDialisisPeritoneal", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.diasDialisisPeritoneal = :diasDialisisPeritoneal"),
    @NamedQuery(name = "VariablesSoporteRenal.findByDiasHemdoFilVenoConti", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.diasHemdoFilVenoConti = :diasHemdoFilVenoConti"),
    @NamedQuery(name = "VariablesSoporteRenal.findByDiasHemoFilVenoConti", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.diasHemoFilVenoConti = :diasHemoFilVenoConti"),
    @NamedQuery(name = "VariablesSoporteRenal.findByDiasHemodiaVenCon", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.diasHemodiaVenCon = :diasHemodiaVenCon"),
    @NamedQuery(name = "VariablesSoporteRenal.findByDiasScuf", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.diasScuf = :diasScuf"),
    @NamedQuery(name = "VariablesSoporteRenal.findByEgresUcipCon", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.egresUcipCon = :egresUcipCon"),
    @NamedQuery(name = "VariablesSoporteRenal.findByEnferRenalResi5025", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.enferRenalResi5025 = :enferRenalResi5025"),
    @NamedQuery(name = "VariablesSoporteRenal.findByEnferRenalResi8050", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.enferRenalResi8050 = :enferRenalResi8050"),
    @NamedQuery(name = "VariablesSoporteRenal.findByEnferRenalResiM25", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.enferRenalResiM25 = :enferRenalResiM25"),
    @NamedQuery(name = "VariablesSoporteRenal.findByFechaInicioSoporteRenal", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.fechaInicioSoporteRenal = :fechaInicioSoporteRenal"),
    @NamedQuery(name = "VariablesSoporteRenal.findByFurosemida", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.furosemida = :furosemida"),
    @NamedQuery(name = "VariablesSoporteRenal.findByNumDiasEstancPostDxIra", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.numDiasEstancPostDxIra = :numDiasEstancPostDxIra"),
    @NamedQuery(name = "VariablesSoporteRenal.findByNumPlasmaferesis", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.numPlasmaferesis = :numPlasmaferesis"),
    @NamedQuery(name = "VariablesSoporteRenal.findByReanimacionHidrica", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.reanimacionHidrica = :reanimacionHidrica"),
    @NamedQuery(name = "VariablesSoporteRenal.findByRequiSopHemofilico", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.requiSopHemofilico = :requiSopHemofilico"),
    @NamedQuery(name = "VariablesSoporteRenal.findByRequieraIniSopTsrr", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.requieraIniSopTsrr = :requieraIniSopTsrr"),
    @NamedQuery(name = "VariablesSoporteRenal.findByTipoCompliDialiPerito", query = "SELECT v FROM VariablesSoporteRenal v WHERE v.tipoCompliDialiPerito = :tipoCompliDialiPerito")})
public class VariablesSoporteRenal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "dialisis_peritoneal", length = 255)
    private String dialisisPeritoneal;
    @Basic(optional = false)
    @Column(name = "dias_dialisis_peritoneal", nullable = false)
    private int diasDialisisPeritoneal;
    @Basic(optional = false)
    @Column(name = "dias_hemdo_fil_veno_conti", nullable = false)
    private int diasHemdoFilVenoConti;
    @Basic(optional = false)
    @Column(name = "dias_hemo_fil_veno_conti", nullable = false)
    private int diasHemoFilVenoConti;
    @Basic(optional = false)
    @Column(name = "dias_hemodia_ven_con", nullable = false)
    private int diasHemodiaVenCon;
    @Basic(optional = false)
    @Column(name = "dias_scuf", nullable = false)
    private int diasScuf;
    @Column(name = "egres_ucip_con", length = 255)
    private String egresUcipCon;
    @Column(name = "enfer_renal_resi50_25", length = 255)
    private String enferRenalResi5025;
    @Column(name = "enfer_renal_resi80_50", length = 255)
    private String enferRenalResi8050;
    @Column(name = "enfer_renal_resi_m_25", length = 255)
    private String enferRenalResiM25;
    @Column(name = "fecha_inicio_soporte_renal")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioSoporteRenal;
    @Column(name = "furosemida", length = 255)
    private String furosemida;
    @Basic(optional = false)
    @Column(name = "num_dias_estanc_post_dx_ira", nullable = false)
    private int numDiasEstancPostDxIra;
    @Basic(optional = false)
    @Column(name = "num_plasmaferesis", nullable = false)
    private int numPlasmaferesis;
    @Basic(optional = false)
    @Column(name = "reanimacion_hidrica", nullable = false)
    private int reanimacionHidrica;
    @Column(name = "requi_sop_hemofilico", length = 255)
    private String requiSopHemofilico;
    @Column(name = "requiera_ini_sop_tsrr", length = 255)
    private String requieraIniSopTsrr;
    @Column(name = "tipo_compli_diali_perito", length = 255)
    private String tipoCompliDialiPerito;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesSoporteRenal() {
    }

    public VariablesSoporteRenal(Long id) {
        this.id = id;
    }

    public VariablesSoporteRenal(Long id, int diasDialisisPeritoneal, int diasHemdoFilVenoConti, int diasHemoFilVenoConti, int diasHemodiaVenCon, int diasScuf, int numDiasEstancPostDxIra, int numPlasmaferesis, int reanimacionHidrica) {
        this.id = id;
        this.diasDialisisPeritoneal = diasDialisisPeritoneal;
        this.diasHemdoFilVenoConti = diasHemdoFilVenoConti;
        this.diasHemoFilVenoConti = diasHemoFilVenoConti;
        this.diasHemodiaVenCon = diasHemodiaVenCon;
        this.diasScuf = diasScuf;
        this.numDiasEstancPostDxIra = numDiasEstancPostDxIra;
        this.numPlasmaferesis = numPlasmaferesis;
        this.reanimacionHidrica = reanimacionHidrica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDialisisPeritoneal() {
        return dialisisPeritoneal;
    }

    public void setDialisisPeritoneal(String dialisisPeritoneal) {
        this.dialisisPeritoneal = dialisisPeritoneal;
    }

    public int getDiasDialisisPeritoneal() {
        return diasDialisisPeritoneal;
    }

    public void setDiasDialisisPeritoneal(int diasDialisisPeritoneal) {
        this.diasDialisisPeritoneal = diasDialisisPeritoneal;
    }

    public int getDiasHemdoFilVenoConti() {
        return diasHemdoFilVenoConti;
    }

    public void setDiasHemdoFilVenoConti(int diasHemdoFilVenoConti) {
        this.diasHemdoFilVenoConti = diasHemdoFilVenoConti;
    }

    public int getDiasHemoFilVenoConti() {
        return diasHemoFilVenoConti;
    }

    public void setDiasHemoFilVenoConti(int diasHemoFilVenoConti) {
        this.diasHemoFilVenoConti = diasHemoFilVenoConti;
    }

    public int getDiasHemodiaVenCon() {
        return diasHemodiaVenCon;
    }

    public void setDiasHemodiaVenCon(int diasHemodiaVenCon) {
        this.diasHemodiaVenCon = diasHemodiaVenCon;
    }

    public int getDiasScuf() {
        return diasScuf;
    }

    public void setDiasScuf(int diasScuf) {
        this.diasScuf = diasScuf;
    }

    public String getEgresUcipCon() {
        return egresUcipCon;
    }

    public void setEgresUcipCon(String egresUcipCon) {
        this.egresUcipCon = egresUcipCon;
    }

    public String getEnferRenalResi5025() {
        return enferRenalResi5025;
    }

    public void setEnferRenalResi5025(String enferRenalResi5025) {
        this.enferRenalResi5025 = enferRenalResi5025;
    }

    public String getEnferRenalResi8050() {
        return enferRenalResi8050;
    }

    public void setEnferRenalResi8050(String enferRenalResi8050) {
        this.enferRenalResi8050 = enferRenalResi8050;
    }

    public String getEnferRenalResiM25() {
        return enferRenalResiM25;
    }

    public void setEnferRenalResiM25(String enferRenalResiM25) {
        this.enferRenalResiM25 = enferRenalResiM25;
    }

    public Date getFechaInicioSoporteRenal() {
        return fechaInicioSoporteRenal;
    }

    public void setFechaInicioSoporteRenal(Date fechaInicioSoporteRenal) {
        this.fechaInicioSoporteRenal = fechaInicioSoporteRenal;
    }

    public String getFurosemida() {
        return furosemida;
    }

    public void setFurosemida(String furosemida) {
        this.furosemida = furosemida;
    }

    public int getNumDiasEstancPostDxIra() {
        return numDiasEstancPostDxIra;
    }

    public void setNumDiasEstancPostDxIra(int numDiasEstancPostDxIra) {
        this.numDiasEstancPostDxIra = numDiasEstancPostDxIra;
    }

    public int getNumPlasmaferesis() {
        return numPlasmaferesis;
    }

    public void setNumPlasmaferesis(int numPlasmaferesis) {
        this.numPlasmaferesis = numPlasmaferesis;
    }

    public int getReanimacionHidrica() {
        return reanimacionHidrica;
    }

    public void setReanimacionHidrica(int reanimacionHidrica) {
        this.reanimacionHidrica = reanimacionHidrica;
    }

    public String getRequiSopHemofilico() {
        return requiSopHemofilico;
    }

    public void setRequiSopHemofilico(String requiSopHemofilico) {
        this.requiSopHemofilico = requiSopHemofilico;
    }

    public String getRequieraIniSopTsrr() {
        return requieraIniSopTsrr;
    }

    public void setRequieraIniSopTsrr(String requieraIniSopTsrr) {
        this.requieraIniSopTsrr = requieraIniSopTsrr;
    }

    public String getTipoCompliDialiPerito() {
        return tipoCompliDialiPerito;
    }

    public void setTipoCompliDialiPerito(String tipoCompliDialiPerito) {
        this.tipoCompliDialiPerito = tipoCompliDialiPerito;
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
        if (!(object instanceof VariablesSoporteRenal)) {
            return false;
        }
        VariablesSoporteRenal other = (VariablesSoporteRenal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesSoporteRenal[ id=" + id + " ]";
    }
    
}
