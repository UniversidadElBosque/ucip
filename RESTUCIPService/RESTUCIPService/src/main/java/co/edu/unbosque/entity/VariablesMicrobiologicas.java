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
@Table(name = "variables_microbiologicas", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesMicrobiologicas.findAll", query = "SELECT v FROM VariablesMicrobiologicas v"),
    @NamedQuery(name = "VariablesMicrobiologicas.findById", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByAislagerm", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.aislagerm = :aislagerm"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByAislagermen1", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.aislagermen1 = :aislagermen1"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByAislagermen2", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.aislagermen2 = :aislagermen2"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByAislagermen3", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.aislagermen3 = :aislagermen3"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByAislagermen4", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.aislagermen4 = :aislagermen4"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByDiasCateterCentral", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.diasCateterCentral = :diasCateterCentral"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByDiasFoley", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.diasFoley = :diasFoley"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByDiasTet", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.diasTet = :diasTet"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByFechaCultivo1", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.fechaCultivo1 = :fechaCultivo1"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByFechaCultivo2", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.fechaCultivo2 = :fechaCultivo2"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByFechaCultivo3", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.fechaCultivo3 = :fechaCultivo3"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByFechaCultivo4", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.fechaCultivo4 = :fechaCultivo4"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByInfcatetnoso", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.infcatetnoso = :infcatetnoso"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByInfenoso", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.infenoso = :infenoso"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByIvunoso", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.ivunoso = :ivunoso"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByNeumonoso", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.neumonoso = :neumonoso"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByNumeroGermenes", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.numeroGermenes = :numeroGermenes"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByTipoCultivo1", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.tipoCultivo1 = :tipoCultivo1"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByTipoCultivo2", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.tipoCultivo2 = :tipoCultivo2"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByTipoCultivo3", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.tipoCultivo3 = :tipoCultivo3"),
    @NamedQuery(name = "VariablesMicrobiologicas.findByTipoCultivo4", query = "SELECT v FROM VariablesMicrobiologicas v WHERE v.tipoCultivo4 = :tipoCultivo4")})
public class VariablesMicrobiologicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "aislagerm", length = 255)
    private String aislagerm;
    @Column(name = "aislagermen1", length = 255)
    private String aislagermen1;
    @Column(name = "aislagermen2", length = 255)
    private String aislagermen2;
    @Column(name = "aislagermen3", length = 255)
    private String aislagermen3;
    @Column(name = "aislagermen4", length = 255)
    private String aislagermen4;
    @Column(name = "dias_cateter_central")
    private Integer diasCateterCentral;
    @Column(name = "dias_foley")
    private Integer diasFoley;
    @Column(name = "dias_tet")
    private Integer diasTet;
    @Column(name = "fecha_cultivo1")
    @Temporal(TemporalType.DATE)
    private Date fechaCultivo1;
    @Column(name = "fecha_cultivo2")
    @Temporal(TemporalType.DATE)
    private Date fechaCultivo2;
    @Column(name = "fecha_cultivo3")
    @Temporal(TemporalType.DATE)
    private Date fechaCultivo3;
    @Column(name = "fecha_cultivo4")
    @Temporal(TemporalType.DATE)
    private Date fechaCultivo4;
    @Column(name = "infcatetnoso", length = 255)
    private String infcatetnoso;
    @Column(name = "infenoso", length = 255)
    private String infenoso;
    @Column(name = "ivunoso", length = 255)
    private String ivunoso;
    @Column(name = "neumonoso", length = 255)
    private String neumonoso;
    @Column(name = "numero_germenes")
    private Integer numeroGermenes;
    @Column(name = "tipo_cultivo1", length = 255)
    private String tipoCultivo1;
    @Column(name = "tipo_cultivo2", length = 255)
    private String tipoCultivo2;
    @Column(name = "tipo_cultivo3", length = 255)
    private String tipoCultivo3;
    @Column(name = "tipo_cultivo4", length = 255)
    private String tipoCultivo4;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesMicrobiologicas() {
    }

    public VariablesMicrobiologicas(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAislagerm() {
        return aislagerm;
    }

    public void setAislagerm(String aislagerm) {
        this.aislagerm = aislagerm;
    }

    public String getAislagermen1() {
        return aislagermen1;
    }

    public void setAislagermen1(String aislagermen1) {
        this.aislagermen1 = aislagermen1;
    }

    public String getAislagermen2() {
        return aislagermen2;
    }

    public void setAislagermen2(String aislagermen2) {
        this.aislagermen2 = aislagermen2;
    }

    public String getAislagermen3() {
        return aislagermen3;
    }

    public void setAislagermen3(String aislagermen3) {
        this.aislagermen3 = aislagermen3;
    }

    public String getAislagermen4() {
        return aislagermen4;
    }

    public void setAislagermen4(String aislagermen4) {
        this.aislagermen4 = aislagermen4;
    }

    public Integer getDiasCateterCentral() {
        return diasCateterCentral;
    }

    public void setDiasCateterCentral(Integer diasCateterCentral) {
        this.diasCateterCentral = diasCateterCentral;
    }

    public Integer getDiasFoley() {
        return diasFoley;
    }

    public void setDiasFoley(Integer diasFoley) {
        this.diasFoley = diasFoley;
    }

    public Integer getDiasTet() {
        return diasTet;
    }

    public void setDiasTet(Integer diasTet) {
        this.diasTet = diasTet;
    }

    public Date getFechaCultivo1() {
        return fechaCultivo1;
    }

    public void setFechaCultivo1(Date fechaCultivo1) {
        this.fechaCultivo1 = fechaCultivo1;
    }

    public Date getFechaCultivo2() {
        return fechaCultivo2;
    }

    public void setFechaCultivo2(Date fechaCultivo2) {
        this.fechaCultivo2 = fechaCultivo2;
    }

    public Date getFechaCultivo3() {
        return fechaCultivo3;
    }

    public void setFechaCultivo3(Date fechaCultivo3) {
        this.fechaCultivo3 = fechaCultivo3;
    }

    public Date getFechaCultivo4() {
        return fechaCultivo4;
    }

    public void setFechaCultivo4(Date fechaCultivo4) {
        this.fechaCultivo4 = fechaCultivo4;
    }

    public String getInfcatetnoso() {
        return infcatetnoso;
    }

    public void setInfcatetnoso(String infcatetnoso) {
        this.infcatetnoso = infcatetnoso;
    }

    public String getInfenoso() {
        return infenoso;
    }

    public void setInfenoso(String infenoso) {
        this.infenoso = infenoso;
    }

    public String getIvunoso() {
        return ivunoso;
    }

    public void setIvunoso(String ivunoso) {
        this.ivunoso = ivunoso;
    }

    public String getNeumonoso() {
        return neumonoso;
    }

    public void setNeumonoso(String neumonoso) {
        this.neumonoso = neumonoso;
    }

    public Integer getNumeroGermenes() {
        return numeroGermenes;
    }

    public void setNumeroGermenes(Integer numeroGermenes) {
        this.numeroGermenes = numeroGermenes;
    }

    public String getTipoCultivo1() {
        return tipoCultivo1;
    }

    public void setTipoCultivo1(String tipoCultivo1) {
        this.tipoCultivo1 = tipoCultivo1;
    }

    public String getTipoCultivo2() {
        return tipoCultivo2;
    }

    public void setTipoCultivo2(String tipoCultivo2) {
        this.tipoCultivo2 = tipoCultivo2;
    }

    public String getTipoCultivo3() {
        return tipoCultivo3;
    }

    public void setTipoCultivo3(String tipoCultivo3) {
        this.tipoCultivo3 = tipoCultivo3;
    }

    public String getTipoCultivo4() {
        return tipoCultivo4;
    }

    public void setTipoCultivo4(String tipoCultivo4) {
        this.tipoCultivo4 = tipoCultivo4;
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
        if (!(object instanceof VariablesMicrobiologicas)) {
            return false;
        }
        VariablesMicrobiologicas other = (VariablesMicrobiologicas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesMicrobiologicas[ id=" + id + " ]";
    }
    
}
