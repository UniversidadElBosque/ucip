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
@Table(name = "variables_pat_base", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesPatBase.findAll", query = "SELECT v FROM VariablesPatBase v"),
    @NamedQuery(name = "VariablesPatBase.findById", query = "SELECT v FROM VariablesPatBase v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesPatBase.findByCardiovascular", query = "SELECT v FROM VariablesPatBase v WHERE v.cardiovascular = :cardiovascular"),
    @NamedQuery(name = "VariablesPatBase.findByEstadoNutricional", query = "SELECT v FROM VariablesPatBase v WHERE v.estadoNutricional = :estadoNutricional"),
    @NamedQuery(name = "VariablesPatBase.findByHepatomegalia", query = "SELECT v FROM VariablesPatBase v WHERE v.hepatomegalia = :hepatomegalia"),
    @NamedQuery(name = "VariablesPatBase.findByInmunoprimaria", query = "SELECT v FROM VariablesPatBase v WHERE v.inmunoprimaria = :inmunoprimaria"),
    @NamedQuery(name = "VariablesPatBase.findByNefrologica", query = "SELECT v FROM VariablesPatBase v WHERE v.nefrologica = :nefrologica"),
    @NamedQuery(name = "VariablesPatBase.findByNeurologica", query = "SELECT v FROM VariablesPatBase v WHERE v.neurologica = :neurologica"),
    @NamedQuery(name = "VariablesPatBase.findByPostcardio", query = "SELECT v FROM VariablesPatBase v WHERE v.postcardio = :postcardio"),
    @NamedQuery(name = "VariablesPatBase.findByRespiratoriaCronica", query = "SELECT v FROM VariablesPatBase v WHERE v.respiratoriaCronica = :respiratoriaCronica")})
public class VariablesPatBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "cardiovascular", length = 255)
    private String cardiovascular;
    @Column(name = "estado_nutricional", length = 255)
    private String estadoNutricional;
    @Column(name = "hepatomegalia", length = 255)
    private String hepatomegalia;
    @Column(name = "inmunoprimaria", length = 255)
    private String inmunoprimaria;
    @Column(name = "nefrologica", length = 255)
    private String nefrologica;
    @Column(name = "neurologica", length = 255)
    private String neurologica;
    @Column(name = "postcardio", length = 255)
    private String postcardio;
    @Column(name = "respiratoria_cronica", length = 255)
    private String respiratoriaCronica;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesPatBase() {
    }

    public VariablesPatBase(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getEstadoNutricional() {
        return estadoNutricional;
    }

    public void setEstadoNutricional(String estadoNutricional) {
        this.estadoNutricional = estadoNutricional;
    }

    public String getHepatomegalia() {
        return hepatomegalia;
    }

    public void setHepatomegalia(String hepatomegalia) {
        this.hepatomegalia = hepatomegalia;
    }

    public String getInmunoprimaria() {
        return inmunoprimaria;
    }

    public void setInmunoprimaria(String inmunoprimaria) {
        this.inmunoprimaria = inmunoprimaria;
    }

    public String getNefrologica() {
        return nefrologica;
    }

    public void setNefrologica(String nefrologica) {
        this.nefrologica = nefrologica;
    }

    public String getNeurologica() {
        return neurologica;
    }

    public void setNeurologica(String neurologica) {
        this.neurologica = neurologica;
    }

    public String getPostcardio() {
        return postcardio;
    }

    public void setPostcardio(String postcardio) {
        this.postcardio = postcardio;
    }

    public String getRespiratoriaCronica() {
        return respiratoriaCronica;
    }

    public void setRespiratoriaCronica(String respiratoriaCronica) {
        this.respiratoriaCronica = respiratoriaCronica;
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
        if (!(object instanceof VariablesPatBase)) {
            return false;
        }
        VariablesPatBase other = (VariablesPatBase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesPatBase[ id=" + id + " ]";
    }
    
}
