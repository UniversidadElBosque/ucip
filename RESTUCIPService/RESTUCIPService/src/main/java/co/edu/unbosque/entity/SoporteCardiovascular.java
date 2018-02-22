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
@Table(name = "soporte_cardiovascular", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoporteCardiovascular.findAll", query = "SELECT s FROM SoporteCardiovascular s"),
    @NamedQuery(name = "SoporteCardiovascular.findById", query = "SELECT s FROM SoporteCardiovascular s WHERE s.id = :id"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasAdrenalina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasAdrenalina = :diasAdrenalina"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasAdrenalinaMcg", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasAdrenalinaMcg = :diasAdrenalinaMcg"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasAlbumina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasAlbumina = :diasAlbumina"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasDobutamina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasDobutamina = :diasDobutamina"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasDobutaminaMcg", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasDobutaminaMcg = :diasDobutaminaMcg"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasDopamina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasDopamina = :diasDopamina"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasDopaminaMcg", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasDopaminaMcg = :diasDopaminaMcg"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasLevosimendan", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasLevosimendan = :diasLevosimendan"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasLevosimendanMcg", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasLevosimendanMcg = :diasLevosimendanMcg"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasMilrinone", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasMilrinone = :diasMilrinone"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasMilrinoneMcg", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasMilrinoneMcg = :diasMilrinoneMcg"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasNoradrenalina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasNoradrenalina = :diasNoradrenalina"),
    @NamedQuery(name = "SoporteCardiovascular.findByDiasNoradrenalinaMcg", query = "SELECT s FROM SoporteCardiovascular s WHERE s.diasNoradrenalinaMcg = :diasNoradrenalinaMcg"),
    @NamedQuery(name = "SoporteCardiovascular.findByHidrocortisona", query = "SELECT s FROM SoporteCardiovascular s WHERE s.hidrocortisona = :hidrocortisona"),
    @NamedQuery(name = "SoporteCardiovascular.findByInotropico", query = "SELECT s FROM SoporteCardiovascular s WHERE s.inotropico = :inotropico"),
    @NamedQuery(name = "SoporteCardiovascular.findByProtasglandinae", query = "SELECT s FROM SoporteCardiovascular s WHERE s.protasglandinae = :protasglandinae"),
    @NamedQuery(name = "SoporteCardiovascular.findByTipoAlbumina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.tipoAlbumina = :tipoAlbumina"),
    @NamedQuery(name = "SoporteCardiovascular.findByVasopresina", query = "SELECT s FROM SoporteCardiovascular s WHERE s.vasopresina = :vasopresina")})
public class SoporteCardiovascular implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dias_adrenalina", precision = 17, scale = 17)
    private Double diasAdrenalina;
    @Column(name = "dias_adrenalina_mcg", precision = 17, scale = 17)
    private Double diasAdrenalinaMcg;
    @Column(name = "dias_albumina", precision = 17, scale = 17)
    private Double diasAlbumina;
    @Column(name = "dias_dobutamina", precision = 17, scale = 17)
    private Double diasDobutamina;
    @Column(name = "dias_dobutamina_mcg", precision = 17, scale = 17)
    private Double diasDobutaminaMcg;
    @Column(name = "dias_dopamina", precision = 17, scale = 17)
    private Double diasDopamina;
    @Column(name = "dias_dopamina_mcg", precision = 17, scale = 17)
    private Double diasDopaminaMcg;
    @Column(name = "dias_levosimendan", precision = 17, scale = 17)
    private Double diasLevosimendan;
    @Column(name = "dias_levosimendan_mcg", precision = 17, scale = 17)
    private Double diasLevosimendanMcg;
    @Column(name = "dias_milrinone", precision = 17, scale = 17)
    private Double diasMilrinone;
    @Column(name = "dias_milrinone_mcg", precision = 17, scale = 17)
    private Double diasMilrinoneMcg;
    @Column(name = "dias_noradrenalina", precision = 17, scale = 17)
    private Double diasNoradrenalina;
    @Column(name = "dias_noradrenalina_mcg", precision = 17, scale = 17)
    private Double diasNoradrenalinaMcg;
    @Column(name = "hidrocortisona", precision = 17, scale = 17)
    private Double hidrocortisona;
    @Column(name = "inotropico", precision = 17, scale = 17)
    private Double inotropico;
    @Column(name = "protasglandinae", precision = 17, scale = 17)
    private Double protasglandinae;
    @Column(name = "tipo_albumina", length = 255)
    private String tipoAlbumina;
    @Column(name = "vasopresina", precision = 17, scale = 17)
    private Double vasopresina;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public SoporteCardiovascular() {
    }

    public SoporteCardiovascular(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDiasAdrenalina() {
        return diasAdrenalina;
    }

    public void setDiasAdrenalina(Double diasAdrenalina) {
        this.diasAdrenalina = diasAdrenalina;
    }

    public Double getDiasAdrenalinaMcg() {
        return diasAdrenalinaMcg;
    }

    public void setDiasAdrenalinaMcg(Double diasAdrenalinaMcg) {
        this.diasAdrenalinaMcg = diasAdrenalinaMcg;
    }

    public Double getDiasAlbumina() {
        return diasAlbumina;
    }

    public void setDiasAlbumina(Double diasAlbumina) {
        this.diasAlbumina = diasAlbumina;
    }

    public Double getDiasDobutamina() {
        return diasDobutamina;
    }

    public void setDiasDobutamina(Double diasDobutamina) {
        this.diasDobutamina = diasDobutamina;
    }

    public Double getDiasDobutaminaMcg() {
        return diasDobutaminaMcg;
    }

    public void setDiasDobutaminaMcg(Double diasDobutaminaMcg) {
        this.diasDobutaminaMcg = diasDobutaminaMcg;
    }

    public Double getDiasDopamina() {
        return diasDopamina;
    }

    public void setDiasDopamina(Double diasDopamina) {
        this.diasDopamina = diasDopamina;
    }

    public Double getDiasDopaminaMcg() {
        return diasDopaminaMcg;
    }

    public void setDiasDopaminaMcg(Double diasDopaminaMcg) {
        this.diasDopaminaMcg = diasDopaminaMcg;
    }

    public Double getDiasLevosimendan() {
        return diasLevosimendan;
    }

    public void setDiasLevosimendan(Double diasLevosimendan) {
        this.diasLevosimendan = diasLevosimendan;
    }

    public Double getDiasLevosimendanMcg() {
        return diasLevosimendanMcg;
    }

    public void setDiasLevosimendanMcg(Double diasLevosimendanMcg) {
        this.diasLevosimendanMcg = diasLevosimendanMcg;
    }

    public Double getDiasMilrinone() {
        return diasMilrinone;
    }

    public void setDiasMilrinone(Double diasMilrinone) {
        this.diasMilrinone = diasMilrinone;
    }

    public Double getDiasMilrinoneMcg() {
        return diasMilrinoneMcg;
    }

    public void setDiasMilrinoneMcg(Double diasMilrinoneMcg) {
        this.diasMilrinoneMcg = diasMilrinoneMcg;
    }

    public Double getDiasNoradrenalina() {
        return diasNoradrenalina;
    }

    public void setDiasNoradrenalina(Double diasNoradrenalina) {
        this.diasNoradrenalina = diasNoradrenalina;
    }

    public Double getDiasNoradrenalinaMcg() {
        return diasNoradrenalinaMcg;
    }

    public void setDiasNoradrenalinaMcg(Double diasNoradrenalinaMcg) {
        this.diasNoradrenalinaMcg = diasNoradrenalinaMcg;
    }

    public Double getHidrocortisona() {
        return hidrocortisona;
    }

    public void setHidrocortisona(Double hidrocortisona) {
        this.hidrocortisona = hidrocortisona;
    }

    public Double getInotropico() {
        return inotropico;
    }

    public void setInotropico(Double inotropico) {
        this.inotropico = inotropico;
    }

    public Double getProtasglandinae() {
        return protasglandinae;
    }

    public void setProtasglandinae(Double protasglandinae) {
        this.protasglandinae = protasglandinae;
    }

    public String getTipoAlbumina() {
        return tipoAlbumina;
    }

    public void setTipoAlbumina(String tipoAlbumina) {
        this.tipoAlbumina = tipoAlbumina;
    }

    public Double getVasopresina() {
        return vasopresina;
    }

    public void setVasopresina(Double vasopresina) {
        this.vasopresina = vasopresina;
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
        if (!(object instanceof SoporteCardiovascular)) {
            return false;
        }
        SoporteCardiovascular other = (SoporteCardiovascular) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.SoporteCardiovascular[ id=" + id + " ]";
    }
    
}
