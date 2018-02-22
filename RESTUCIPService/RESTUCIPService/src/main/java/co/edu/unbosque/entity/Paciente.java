/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author eduardob
 */
@Entity
@Table(name = "paciente", catalog = "ucip", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"documento"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.countFechaByingreso", query = "SELECT COUNT(p) FROM EstanciaUcip e JOIN Paciente p ON e.paciente.id = p.id WHERE e.fechaIngreso >= :fecha1 AND e.fechaIngreso <= :fecha2 GROUP BY p.documento"),
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findById", query = "SELECT p FROM Paciente p WHERE p.id = :id"),
    @NamedQuery(name = "Paciente.findByApellidos", query = "SELECT p FROM Paciente p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Paciente.findByApellidosDos", query = "SELECT p FROM Paciente p WHERE p.apellidosDos = :apellidosDos"),
    @NamedQuery(name = "Paciente.findByCaracteristicaFenotipica", query = "SELECT p FROM Paciente p WHERE p.caracteristicaFenotipica = :caracteristicaFenotipica"),
    @NamedQuery(name = "Paciente.findByDias", query = "SELECT p FROM Paciente p WHERE p.dias = :dias"),
    @NamedQuery(name = "Paciente.findByDocumento", query = "SELECT p FROM Paciente p WHERE p.documento = :documento"),
    @NamedQuery(name = "Paciente.findByEdad", query = "SELECT p FROM Paciente p WHERE p.edad = :edad"),
    @NamedQuery(name = "Paciente.findByFechaNacimiento", query = "SELECT p FROM Paciente p WHERE p.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Paciente.findByFenotipoSexual", query = "SELECT p FROM Paciente p WHERE p.fenotipoSexual = :fenotipoSexual"),
    @NamedQuery(name = "Paciente.findByHistoriaClinica", query = "SELECT p FROM Paciente p WHERE p.historiaClinica = :historiaClinica"),
    @NamedQuery(name = "Paciente.findByMeses", query = "SELECT p FROM Paciente p WHERE p.meses = :meses"),
    @NamedQuery(name = "Paciente.findByNombre", query = "SELECT p FROM Paciente p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Paciente.findByNombreDos", query = "SELECT p FROM Paciente p WHERE p.nombreDos = :nombreDos"),
    @NamedQuery(name = "Paciente.findByNumeroIgreso", query = "SELECT p FROM Paciente p WHERE p.numeroIgreso = :numeroIgreso"),
    @NamedQuery(name = "Paciente.findByTipoDocumento", query = "SELECT p FROM Paciente p WHERE p.tipoDocumento = :tipoDocumento")})
@NamedNativeQueries({
    @NamedNativeQuery(name = "Paciente.countPacientes", query = "SELECT COUNT(t0.id),t0.documento FROM ucip.public.paciente t0, ucip.public.paciente t2, ucip.public.estancia_ucip t1 WHERE (((t1.fecha_ingreso >= ?) AND (t1.fecha_ingreso <= ?)) AND ((t2.id = t1.paciente) AND (t2.id = t0.id))) GROUP BY t0.documento")
})
public class Paciente implements Serializable {

    @Column(name = "historia_clinica")
    private BigInteger historiaClinica;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Collection<PacienteAcudiente> pacienteAcudienteCollection;
    @OneToMany(mappedBy = "paciente")
    private Collection<EstanciaUcip> estanciaUcipCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "apellidos", length = 255)
    private String apellidos;
    @Column(name = "apellidos_dos", length = 255)
    private String apellidosDos;
    @Column(name = "caracteristica_fenotipica", length = 255)
    private String caracteristicaFenotipica;
    @Column(name = "dias")
    private Integer dias;
    @Column(name = "documento")
    private BigInteger documento;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "fenotipo_sexual", length = 255)
    private String fenotipoSexual;
    @Column(name = "meses")
    private Integer meses;
    @Column(name = "nombre", length = 255)
    private String nombre;
    @Column(name = "nombre_dos", length = 255)
    private String nombreDos;
    @Column(name = "numero_igreso")
    private Integer numeroIgreso;
    @Column(name = "tipo_documento", length = 255)
    private String tipoDocumento;

    public Paciente() {
    }

    public Paciente(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidosDos() {
        return apellidosDos;
    }

    public void setApellidosDos(String apellidosDos) {
        this.apellidosDos = apellidosDos;
    }

    public String getCaracteristicaFenotipica() {
        return caracteristicaFenotipica;
    }

    public void setCaracteristicaFenotipica(String caracteristicaFenotipica) {
        this.caracteristicaFenotipica = caracteristicaFenotipica;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public BigInteger getDocumento() {
        return documento;
    }

    public void setDocumento(BigInteger documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFenotipoSexual() {
        return fenotipoSexual;
    }

    public void setFenotipoSexual(String fenotipoSexual) {
        this.fenotipoSexual = fenotipoSexual;
    }

    public BigInteger getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(BigInteger historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDos() {
        return nombreDos;
    }

    public void setNombreDos(String nombreDos) {
        this.nombreDos = nombreDos;
    }

    public Integer getNumeroIgreso() {
        return numeroIgreso;
    }

    public void setNumeroIgreso(Integer numeroIgreso) {
        this.numeroIgreso = numeroIgreso;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Paciente[ id=" + id + " ]";
    }

    @XmlTransient
    @JsonIgnore
    public Collection<PacienteAcudiente> getPacienteAcudienteCollection() {
        return pacienteAcudienteCollection;
    }

    public void setPacienteAcudienteCollection(Collection<PacienteAcudiente> pacienteAcudienteCollection) {
        this.pacienteAcudienteCollection = pacienteAcudienteCollection;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<EstanciaUcip> getEstanciaUcipCollection() {
        return estanciaUcipCollection;
    }

    public void setEstanciaUcipCollection(Collection<EstanciaUcip> estanciaUcipCollection) {
        this.estanciaUcipCollection = estanciaUcipCollection;
    }
    
    
}
