/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "estancia_ucip", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstanciaUcip.countByClasificacion", query = "SELECT e.clasificacionPaciente, COUNT(e) FROM EstanciaUcip e WHERE e.fechaIngreso >= :fecha1 AND e.fechaIngreso <= :fecha2 GROUP BY e.clasificacionPaciente ORDER BY e.clasificacionPaciente"),
    @NamedQuery(name = "EstanciaUcip.findCountByIngreso", query = "SELECT COUNT(e) FROM EstanciaUcip e WHERE e.fechaIngreso >= :fecha1 AND e.fechaIngreso <= :fecha2"),
    @NamedQuery(name = "EstanciaUcip.findAll", query = "SELECT e FROM EstanciaUcip e"),
    @NamedQuery(name = "EstanciaUcip.findById", query = "SELECT e FROM EstanciaUcip e WHERE e.id = :id"),
    @NamedQuery(name = "EstanciaUcip.findByClasificacionPaciente", query = "SELECT e FROM EstanciaUcip e WHERE e.clasificacionPaciente = :clasificacionPaciente"),
    @NamedQuery(name = "EstanciaUcip.findByDepartamento", query = "SELECT e FROM EstanciaUcip e WHERE e.departamento = :departamento"),
    @NamedQuery(name = "EstanciaUcip.findByDiagnosticoIngresoUcip", query = "SELECT e FROM EstanciaUcip e WHERE e.diagnosticoIngresoUcip = :diagnosticoIngresoUcip"),
    @NamedQuery(name = "EstanciaUcip.findByDiasEstancia", query = "SELECT e FROM EstanciaUcip e WHERE e.diasEstancia = :diasEstancia"),
    @NamedQuery(name = "EstanciaUcip.findByDireccion", query = "SELECT e FROM EstanciaUcip e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "EstanciaUcip.findByFechaEgreso", query = "SELECT e FROM EstanciaUcip e WHERE e.fechaEgreso = :fechaEgreso"),
    @NamedQuery(name = "EstanciaUcip.findByFechaIngreso", query = "SELECT e FROM EstanciaUcip e WHERE e.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "EstanciaUcip.findByInstitucionalizado", query = "SELECT e FROM EstanciaUcip e WHERE e.institucionalizado = :institucionalizado"),
    @NamedQuery(name = "EstanciaUcip.findByNivelEducaMadre", query = "SELECT e FROM EstanciaUcip e WHERE e.nivelEducaMadre = :nivelEducaMadre"),
    @NamedQuery(name = "EstanciaUcip.findByNivelEducaPadre", query = "SELECT e FROM EstanciaUcip e WHERE e.nivelEducaPadre = :nivelEducaPadre"),
    @NamedQuery(name = "EstanciaUcip.findByNombreSeguridadSocial", query = "SELECT e FROM EstanciaUcip e WHERE e.nombreSeguridadSocial = :nombreSeguridadSocial"),
    @NamedQuery(name = "EstanciaUcip.findByPeso", query = "SELECT e FROM EstanciaUcip e WHERE e.peso = :peso"),
    @NamedQuery(name = "EstanciaUcip.findByProcedencia", query = "SELECT e FROM EstanciaUcip e WHERE e.procedencia = :procedencia"),
    @NamedQuery(name = "EstanciaUcip.findBySeguridadSocial", query = "SELECT e FROM EstanciaUcip e WHERE e.seguridadSocial = :seguridadSocial"),
    @NamedQuery(name = "EstanciaUcip.findByTalla", query = "SELECT e FROM EstanciaUcip e WHERE e.talla = :talla"),
    @NamedQuery(name = "EstanciaUcip.findByTelefono", query = "SELECT e FROM EstanciaUcip e WHERE e.telefono = :telefono")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "EstanciaUcip.countIngresos", query = "select to_char(fecha_ingreso, 'YYYY-MM') as x, count(*) from estancia_ucip where fecha_ingreso >= ? and fecha_ingreso <= ? group by x order by x")
})
public class EstanciaUcip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "clasificacion_paciente", length = 255)
    private String clasificacionPaciente;
    @Column(name = "departamento", length = 255)
    private String departamento;
    @Column(name = "diagnostico_ingreso_ucip", length = 255)
    private String diagnosticoIngresoUcip;
    @Basic(optional = false)
    @Column(name = "dias_estancia", nullable = false)
    private long diasEstancia;
    @Column(name = "direccion", length = 255)
    private String direccion;
    @Column(name = "fecha_egreso")
    @Temporal(TemporalType.DATE)
    private Date fechaEgreso;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "institucionalizado", length = 255)
    private String institucionalizado;
    @Column(name = "nivel_educa_madre", length = 255)
    private String nivelEducaMadre;
    @Column(name = "nivel_educa_padre", length = 255)
    private String nivelEducaPadre;
    @Column(name = "nombre_seguridad_social", length = 255)
    private String nombreSeguridadSocial;
    @Basic(optional = false)
    @Column(name = "peso", nullable = false)
    private float peso;
    @Column(name = "procedencia", length = 255)
    private String procedencia;
    @Column(name = "seguridad_social", length = 255)
    private String seguridadSocial;
    @Basic(optional = false)
    @Column(name = "talla", nullable = false)
    private float talla;
    @Column(name = "telefono", length = 255)
    private String telefono;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionRespiratoria> disfuncionRespiratoriaCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesNeurologicas> variablesNeurologicasCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<Evidencia> evidenciaCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<RespuestaInflamatoria> respuestaInflamatoriaCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesQuirurgicas> variablesQuirurgicasCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesSoporteRenal> variablesSoporteRenalCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesDesenlaces> variablesDesenlacesCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionIntestinal> disfuncionIntestinalCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<HipertensionPulmonar> hipertensionPulmonarCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesSoporteInfeccioso> variablesSoporteInfecciosoCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesSoporteNutricional> variablesSoporteNutricionalCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<InjuriaRenal> injuriaRenalCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<HipertensionAbdominal> hipertensionAbdominalCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<OtrosProcedimientosucip> otrosProcedimientosucipCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<SoporteVentilatorio> soporteVentilatorioCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesPatBase> variablesPatBaseCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionHematologica> disfuncionHematologicaCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<SoporteCardiovascular> soporteCardiovascularCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionRenal> disfuncionRenalCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesMicrobiologicas> variablesMicrobiologicasCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<OrganosDisfuncionales> organosDisfuncionalesCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionHepatica> disfuncionHepaticaCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionNeurologica> disfuncionNeurologicaCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesSoporteHematologico> variablesSoporteHematologicoCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<Diagnostico> diagnosticoCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<DisfuncionCardiovascular> disfuncionCardiovascularCollection;
    @JoinColumn(name = "acudiente", referencedColumnName = "id")
    @ManyToOne
    private Acudiente acudiente;
    @JoinColumn(name = "paciente", referencedColumnName = "id")
    @ManyToOne
    private Paciente paciente;
    @OneToMany(mappedBy = "estancia")
    private Collection<CalidadEnucip> calidadEnucipCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<Prehospitalario> prehospitalarioCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<Sepsis> sepsisCollection;
    @OneToMany(mappedBy = "estancia")
    private Collection<VariablesCardiovasculares> variablesCardiovascularesCollection;

    public EstanciaUcip() {
    }

    public EstanciaUcip(Long id) {
        this.id = id;
    }

    public EstanciaUcip(Long id, long diasEstancia, float peso, float talla) {
        this.id = id;
        this.diasEstancia = diasEstancia;
        this.peso = peso;
        this.talla = talla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasificacionPaciente() {
        return clasificacionPaciente;
    }

    public void setClasificacionPaciente(String clasificacionPaciente) {
        this.clasificacionPaciente = clasificacionPaciente;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDiagnosticoIngresoUcip() {
        return diagnosticoIngresoUcip;
    }

    public void setDiagnosticoIngresoUcip(String diagnosticoIngresoUcip) {
        this.diagnosticoIngresoUcip = diagnosticoIngresoUcip;
    }

    public long getDiasEstancia() {
        return diasEstancia;
    }

    public void setDiasEstancia(long diasEstancia) {
        this.diasEstancia = diasEstancia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getInstitucionalizado() {
        return institucionalizado;
    }

    public void setInstitucionalizado(String institucionalizado) {
        this.institucionalizado = institucionalizado;
    }

    public String getNivelEducaMadre() {
        return nivelEducaMadre;
    }

    public void setNivelEducaMadre(String nivelEducaMadre) {
        this.nivelEducaMadre = nivelEducaMadre;
    }

    public String getNivelEducaPadre() {
        return nivelEducaPadre;
    }

    public void setNivelEducaPadre(String nivelEducaPadre) {
        this.nivelEducaPadre = nivelEducaPadre;
    }

    public String getNombreSeguridadSocial() {
        return nombreSeguridadSocial;
    }

    public void setNombreSeguridadSocial(String nombreSeguridadSocial) {
        this.nombreSeguridadSocial = nombreSeguridadSocial;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(String seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionRespiratoria> getDisfuncionRespiratoriaCollection() {
        return disfuncionRespiratoriaCollection;
    }

    public void setDisfuncionRespiratoriaCollection(Collection<DisfuncionRespiratoria> disfuncionRespiratoriaCollection) {
        this.disfuncionRespiratoriaCollection = disfuncionRespiratoriaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesNeurologicas> getVariablesNeurologicasCollection() {
        return variablesNeurologicasCollection;
    }

    public void setVariablesNeurologicasCollection(Collection<VariablesNeurologicas> variablesNeurologicasCollection) {
        this.variablesNeurologicasCollection = variablesNeurologicasCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Evidencia> getEvidenciaCollection() {
        return evidenciaCollection;
    }

    public void setEvidenciaCollection(Collection<Evidencia> evidenciaCollection) {
        this.evidenciaCollection = evidenciaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<RespuestaInflamatoria> getRespuestaInflamatoriaCollection() {
        return respuestaInflamatoriaCollection;
    }

    public void setRespuestaInflamatoriaCollection(Collection<RespuestaInflamatoria> respuestaInflamatoriaCollection) {
        this.respuestaInflamatoriaCollection = respuestaInflamatoriaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesQuirurgicas> getVariablesQuirurgicasCollection() {
        return variablesQuirurgicasCollection;
    }

    public void setVariablesQuirurgicasCollection(Collection<VariablesQuirurgicas> variablesQuirurgicasCollection) {
        this.variablesQuirurgicasCollection = variablesQuirurgicasCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesSoporteRenal> getVariablesSoporteRenalCollection() {
        return variablesSoporteRenalCollection;
    }

    public void setVariablesSoporteRenalCollection(Collection<VariablesSoporteRenal> variablesSoporteRenalCollection) {
        this.variablesSoporteRenalCollection = variablesSoporteRenalCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesDesenlaces> getVariablesDesenlacesCollection() {
        return variablesDesenlacesCollection;
    }

    public void setVariablesDesenlacesCollection(Collection<VariablesDesenlaces> variablesDesenlacesCollection) {
        this.variablesDesenlacesCollection = variablesDesenlacesCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionIntestinal> getDisfuncionIntestinalCollection() {
        return disfuncionIntestinalCollection;
    }

    public void setDisfuncionIntestinalCollection(Collection<DisfuncionIntestinal> disfuncionIntestinalCollection) {
        this.disfuncionIntestinalCollection = disfuncionIntestinalCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<HipertensionPulmonar> getHipertensionPulmonarCollection() {
        return hipertensionPulmonarCollection;
    }

    public void setHipertensionPulmonarCollection(Collection<HipertensionPulmonar> hipertensionPulmonarCollection) {
        this.hipertensionPulmonarCollection = hipertensionPulmonarCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesSoporteInfeccioso> getVariablesSoporteInfecciosoCollection() {
        return variablesSoporteInfecciosoCollection;
    }

    public void setVariablesSoporteInfecciosoCollection(Collection<VariablesSoporteInfeccioso> variablesSoporteInfecciosoCollection) {
        this.variablesSoporteInfecciosoCollection = variablesSoporteInfecciosoCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesSoporteNutricional> getVariablesSoporteNutricionalCollection() {
        return variablesSoporteNutricionalCollection;
    }

    public void setVariablesSoporteNutricionalCollection(Collection<VariablesSoporteNutricional> variablesSoporteNutricionalCollection) {
        this.variablesSoporteNutricionalCollection = variablesSoporteNutricionalCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<InjuriaRenal> getInjuriaRenalCollection() {
        return injuriaRenalCollection;
    }

    public void setInjuriaRenalCollection(Collection<InjuriaRenal> injuriaRenalCollection) {
        this.injuriaRenalCollection = injuriaRenalCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<HipertensionAbdominal> getHipertensionAbdominalCollection() {
        return hipertensionAbdominalCollection;
    }

    public void setHipertensionAbdominalCollection(Collection<HipertensionAbdominal> hipertensionAbdominalCollection) {
        this.hipertensionAbdominalCollection = hipertensionAbdominalCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<OtrosProcedimientosucip> getOtrosProcedimientosucipCollection() {
        return otrosProcedimientosucipCollection;
    }

    public void setOtrosProcedimientosucipCollection(Collection<OtrosProcedimientosucip> otrosProcedimientosucipCollection) {
        this.otrosProcedimientosucipCollection = otrosProcedimientosucipCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<SoporteVentilatorio> getSoporteVentilatorioCollection() {
        return soporteVentilatorioCollection;
    }

    public void setSoporteVentilatorioCollection(Collection<SoporteVentilatorio> soporteVentilatorioCollection) {
        this.soporteVentilatorioCollection = soporteVentilatorioCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesPatBase> getVariablesPatBaseCollection() {
        return variablesPatBaseCollection;
    }

    public void setVariablesPatBaseCollection(Collection<VariablesPatBase> variablesPatBaseCollection) {
        this.variablesPatBaseCollection = variablesPatBaseCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionHematologica> getDisfuncionHematologicaCollection() {
        return disfuncionHematologicaCollection;
    }

    public void setDisfuncionHematologicaCollection(Collection<DisfuncionHematologica> disfuncionHematologicaCollection) {
        this.disfuncionHematologicaCollection = disfuncionHematologicaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<SoporteCardiovascular> getSoporteCardiovascularCollection() {
        return soporteCardiovascularCollection;
    }

    public void setSoporteCardiovascularCollection(Collection<SoporteCardiovascular> soporteCardiovascularCollection) {
        this.soporteCardiovascularCollection = soporteCardiovascularCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionRenal> getDisfuncionRenalCollection() {
        return disfuncionRenalCollection;
    }

    public void setDisfuncionRenalCollection(Collection<DisfuncionRenal> disfuncionRenalCollection) {
        this.disfuncionRenalCollection = disfuncionRenalCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesMicrobiologicas> getVariablesMicrobiologicasCollection() {
        return variablesMicrobiologicasCollection;
    }

    public void setVariablesMicrobiologicasCollection(Collection<VariablesMicrobiologicas> variablesMicrobiologicasCollection) {
        this.variablesMicrobiologicasCollection = variablesMicrobiologicasCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<OrganosDisfuncionales> getOrganosDisfuncionalesCollection() {
        return organosDisfuncionalesCollection;
    }

    public void setOrganosDisfuncionalesCollection(Collection<OrganosDisfuncionales> organosDisfuncionalesCollection) {
        this.organosDisfuncionalesCollection = organosDisfuncionalesCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionHepatica> getDisfuncionHepaticaCollection() {
        return disfuncionHepaticaCollection;
    }

    public void setDisfuncionHepaticaCollection(Collection<DisfuncionHepatica> disfuncionHepaticaCollection) {
        this.disfuncionHepaticaCollection = disfuncionHepaticaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionNeurologica> getDisfuncionNeurologicaCollection() {
        return disfuncionNeurologicaCollection;
    }

    public void setDisfuncionNeurologicaCollection(Collection<DisfuncionNeurologica> disfuncionNeurologicaCollection) {
        this.disfuncionNeurologicaCollection = disfuncionNeurologicaCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesSoporteHematologico> getVariablesSoporteHematologicoCollection() {
        return variablesSoporteHematologicoCollection;
    }

    public void setVariablesSoporteHematologicoCollection(Collection<VariablesSoporteHematologico> variablesSoporteHematologicoCollection) {
        this.variablesSoporteHematologicoCollection = variablesSoporteHematologicoCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Diagnostico> getDiagnosticoCollection() {
        return diagnosticoCollection;
    }

    public void setDiagnosticoCollection(Collection<Diagnostico> diagnosticoCollection) {
        this.diagnosticoCollection = diagnosticoCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<DisfuncionCardiovascular> getDisfuncionCardiovascularCollection() {
        return disfuncionCardiovascularCollection;
    }

    public void setDisfuncionCardiovascularCollection(Collection<DisfuncionCardiovascular> disfuncionCardiovascularCollection) {
        this.disfuncionCardiovascularCollection = disfuncionCardiovascularCollection;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<CalidadEnucip> getCalidadEnucipCollection() {
        return calidadEnucipCollection;
    }

    public void setCalidadEnucipCollection(Collection<CalidadEnucip> calidadEnucipCollection) {
        this.calidadEnucipCollection = calidadEnucipCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Prehospitalario> getPrehospitalarioCollection() {
        return prehospitalarioCollection;
    }

    public void setPrehospitalarioCollection(Collection<Prehospitalario> prehospitalarioCollection) {
        this.prehospitalarioCollection = prehospitalarioCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Sepsis> getSepsisCollection() {
        return sepsisCollection;
    }

    public void setSepsisCollection(Collection<Sepsis> sepsisCollection) {
        this.sepsisCollection = sepsisCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<VariablesCardiovasculares> getVariablesCardiovascularesCollection() {
        return variablesCardiovascularesCollection;
    }

    public void setVariablesCardiovascularesCollection(Collection<VariablesCardiovasculares> variablesCardiovascularesCollection) {
        this.variablesCardiovascularesCollection = variablesCardiovascularesCollection;
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
        if (!(object instanceof EstanciaUcip)) {
            return false;
        }
        EstanciaUcip other = (EstanciaUcip) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.EstanciaUcip[ id=" + id + " ]";
    }
    
}
