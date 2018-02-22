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
@Table(name = "variables_soporte_infeccioso", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesSoporteInfeccioso.findAll", query = "SELECT v FROM VariablesSoporteInfeccioso v"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findById", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByAntifungicos", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.antifungicos = :antifungicos"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAcetilsalicina", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAcetilsalicina = :diasAcetilsalicina"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoCinco", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoCinco = :diasAntibioticoCinco"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoCuatro", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoCuatro = :diasAntibioticoCuatro"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoDos", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoDos = :diasAntibioticoDos"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoNueve", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoNueve = :diasAntibioticoNueve"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoOcho", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoOcho = :diasAntibioticoOcho"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoSeis", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoSeis = :diasAntibioticoSeis"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoSiete", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoSiete = :diasAntibioticoSiete"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoTres", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoTres = :diasAntibioticoTres"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntibioticoUno", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntibioticoUno = :diasAntibioticoUno"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasAntifungicos", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasAntifungicos = :diasAntifungicos"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasCurcuma", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasCurcuma = :diasCurcuma"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByDiasProbiotico", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.diasProbiotico = :diasProbiotico"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByNumAntibioticos", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.numAntibioticos = :numAntibioticos"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByRecibioInmunoligicas", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.recibioInmunoligicas = :recibioInmunoligicas"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByRequiEsqueAntimicro", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.requiEsqueAntimicro = :requiEsqueAntimicro"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoCinco", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoCinco = :tipoAntibioticoCinco"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoCuatro", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoCuatro = :tipoAntibioticoCuatro"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoDos", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoDos = :tipoAntibioticoDos"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoNueve", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoNueve = :tipoAntibioticoNueve"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoOcho", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoOcho = :tipoAntibioticoOcho"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoSeis", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoSeis = :tipoAntibioticoSeis"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoSiete", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoSiete = :tipoAntibioticoSiete"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoTres", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoTres = :tipoAntibioticoTres"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoAntibioticoUno", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoAntibioticoUno = :tipoAntibioticoUno"),
    @NamedQuery(name = "VariablesSoporteInfeccioso.findByTipoInmunoglobulinas", query = "SELECT v FROM VariablesSoporteInfeccioso v WHERE v.tipoInmunoglobulinas = :tipoInmunoglobulinas")})
public class VariablesSoporteInfeccioso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "antifungicos", length = 255)
    private String antifungicos;
    @Basic(optional = false)
    @Column(name = "dias_acetilsalicina", nullable = false)
    private int diasAcetilsalicina;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_cinco", nullable = false)
    private int diasAntibioticoCinco;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_cuatro", nullable = false)
    private int diasAntibioticoCuatro;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_dos", nullable = false)
    private int diasAntibioticoDos;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_nueve", nullable = false)
    private int diasAntibioticoNueve;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_ocho", nullable = false)
    private int diasAntibioticoOcho;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_seis", nullable = false)
    private int diasAntibioticoSeis;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_siete", nullable = false)
    private int diasAntibioticoSiete;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_tres", nullable = false)
    private int diasAntibioticoTres;
    @Basic(optional = false)
    @Column(name = "dias_antibiotico_uno", nullable = false)
    private int diasAntibioticoUno;
    @Basic(optional = false)
    @Column(name = "dias_antifungicos", nullable = false)
    private int diasAntifungicos;
    @Basic(optional = false)
    @Column(name = "dias_curcuma", nullable = false)
    private int diasCurcuma;
    @Basic(optional = false)
    @Column(name = "dias_probiotico", nullable = false)
    private int diasProbiotico;
    @Basic(optional = false)
    @Column(name = "num_antibioticos", nullable = false)
    private int numAntibioticos;
    @Column(name = "recibio_inmunoligicas", length = 255)
    private String recibioInmunoligicas;
    @Column(name = "requi_esque_antimicro", length = 255)
    private String requiEsqueAntimicro;
    @Column(name = "tipo_antibiotico_cinco", length = 255)
    private String tipoAntibioticoCinco;
    @Column(name = "tipo_antibiotico_cuatro", length = 255)
    private String tipoAntibioticoCuatro;
    @Column(name = "tipo_antibiotico_dos", length = 255)
    private String tipoAntibioticoDos;
    @Column(name = "tipo_antibiotico_nueve", length = 255)
    private String tipoAntibioticoNueve;
    @Column(name = "tipo_antibiotico_ocho", length = 255)
    private String tipoAntibioticoOcho;
    @Column(name = "tipo_antibiotico_seis", length = 255)
    private String tipoAntibioticoSeis;
    @Column(name = "tipo_antibiotico_siete", length = 255)
    private String tipoAntibioticoSiete;
    @Column(name = "tipo_antibiotico_tres", length = 255)
    private String tipoAntibioticoTres;
    @Column(name = "tipo_antibiotico_uno", length = 255)
    private String tipoAntibioticoUno;
    @Column(name = "tipo_inmunoglobulinas", length = 255)
    private String tipoInmunoglobulinas;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesSoporteInfeccioso() {
    }

    public VariablesSoporteInfeccioso(Long id) {
        this.id = id;
    }

    public VariablesSoporteInfeccioso(Long id, int diasAcetilsalicina, int diasAntibioticoCinco, int diasAntibioticoCuatro, int diasAntibioticoDos, int diasAntibioticoNueve, int diasAntibioticoOcho, int diasAntibioticoSeis, int diasAntibioticoSiete, int diasAntibioticoTres, int diasAntibioticoUno, int diasAntifungicos, int diasCurcuma, int diasProbiotico, int numAntibioticos) {
        this.id = id;
        this.diasAcetilsalicina = diasAcetilsalicina;
        this.diasAntibioticoCinco = diasAntibioticoCinco;
        this.diasAntibioticoCuatro = diasAntibioticoCuatro;
        this.diasAntibioticoDos = diasAntibioticoDos;
        this.diasAntibioticoNueve = diasAntibioticoNueve;
        this.diasAntibioticoOcho = diasAntibioticoOcho;
        this.diasAntibioticoSeis = diasAntibioticoSeis;
        this.diasAntibioticoSiete = diasAntibioticoSiete;
        this.diasAntibioticoTres = diasAntibioticoTres;
        this.diasAntibioticoUno = diasAntibioticoUno;
        this.diasAntifungicos = diasAntifungicos;
        this.diasCurcuma = diasCurcuma;
        this.diasProbiotico = diasProbiotico;
        this.numAntibioticos = numAntibioticos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAntifungicos() {
        return antifungicos;
    }

    public void setAntifungicos(String antifungicos) {
        this.antifungicos = antifungicos;
    }

    public int getDiasAcetilsalicina() {
        return diasAcetilsalicina;
    }

    public void setDiasAcetilsalicina(int diasAcetilsalicina) {
        this.diasAcetilsalicina = diasAcetilsalicina;
    }

    public int getDiasAntibioticoCinco() {
        return diasAntibioticoCinco;
    }

    public void setDiasAntibioticoCinco(int diasAntibioticoCinco) {
        this.diasAntibioticoCinco = diasAntibioticoCinco;
    }

    public int getDiasAntibioticoCuatro() {
        return diasAntibioticoCuatro;
    }

    public void setDiasAntibioticoCuatro(int diasAntibioticoCuatro) {
        this.diasAntibioticoCuatro = diasAntibioticoCuatro;
    }

    public int getDiasAntibioticoDos() {
        return diasAntibioticoDos;
    }

    public void setDiasAntibioticoDos(int diasAntibioticoDos) {
        this.diasAntibioticoDos = diasAntibioticoDos;
    }

    public int getDiasAntibioticoNueve() {
        return diasAntibioticoNueve;
    }

    public void setDiasAntibioticoNueve(int diasAntibioticoNueve) {
        this.diasAntibioticoNueve = diasAntibioticoNueve;
    }

    public int getDiasAntibioticoOcho() {
        return diasAntibioticoOcho;
    }

    public void setDiasAntibioticoOcho(int diasAntibioticoOcho) {
        this.diasAntibioticoOcho = diasAntibioticoOcho;
    }

    public int getDiasAntibioticoSeis() {
        return diasAntibioticoSeis;
    }

    public void setDiasAntibioticoSeis(int diasAntibioticoSeis) {
        this.diasAntibioticoSeis = diasAntibioticoSeis;
    }

    public int getDiasAntibioticoSiete() {
        return diasAntibioticoSiete;
    }

    public void setDiasAntibioticoSiete(int diasAntibioticoSiete) {
        this.diasAntibioticoSiete = diasAntibioticoSiete;
    }

    public int getDiasAntibioticoTres() {
        return diasAntibioticoTres;
    }

    public void setDiasAntibioticoTres(int diasAntibioticoTres) {
        this.diasAntibioticoTres = diasAntibioticoTres;
    }

    public int getDiasAntibioticoUno() {
        return diasAntibioticoUno;
    }

    public void setDiasAntibioticoUno(int diasAntibioticoUno) {
        this.diasAntibioticoUno = diasAntibioticoUno;
    }

    public int getDiasAntifungicos() {
        return diasAntifungicos;
    }

    public void setDiasAntifungicos(int diasAntifungicos) {
        this.diasAntifungicos = diasAntifungicos;
    }

    public int getDiasCurcuma() {
        return diasCurcuma;
    }

    public void setDiasCurcuma(int diasCurcuma) {
        this.diasCurcuma = diasCurcuma;
    }

    public int getDiasProbiotico() {
        return diasProbiotico;
    }

    public void setDiasProbiotico(int diasProbiotico) {
        this.diasProbiotico = diasProbiotico;
    }

    public int getNumAntibioticos() {
        return numAntibioticos;
    }

    public void setNumAntibioticos(int numAntibioticos) {
        this.numAntibioticos = numAntibioticos;
    }

    public String getRecibioInmunoligicas() {
        return recibioInmunoligicas;
    }

    public void setRecibioInmunoligicas(String recibioInmunoligicas) {
        this.recibioInmunoligicas = recibioInmunoligicas;
    }

    public String getRequiEsqueAntimicro() {
        return requiEsqueAntimicro;
    }

    public void setRequiEsqueAntimicro(String requiEsqueAntimicro) {
        this.requiEsqueAntimicro = requiEsqueAntimicro;
    }

    public String getTipoAntibioticoCinco() {
        return tipoAntibioticoCinco;
    }

    public void setTipoAntibioticoCinco(String tipoAntibioticoCinco) {
        this.tipoAntibioticoCinco = tipoAntibioticoCinco;
    }

    public String getTipoAntibioticoCuatro() {
        return tipoAntibioticoCuatro;
    }

    public void setTipoAntibioticoCuatro(String tipoAntibioticoCuatro) {
        this.tipoAntibioticoCuatro = tipoAntibioticoCuatro;
    }

    public String getTipoAntibioticoDos() {
        return tipoAntibioticoDos;
    }

    public void setTipoAntibioticoDos(String tipoAntibioticoDos) {
        this.tipoAntibioticoDos = tipoAntibioticoDos;
    }

    public String getTipoAntibioticoNueve() {
        return tipoAntibioticoNueve;
    }

    public void setTipoAntibioticoNueve(String tipoAntibioticoNueve) {
        this.tipoAntibioticoNueve = tipoAntibioticoNueve;
    }

    public String getTipoAntibioticoOcho() {
        return tipoAntibioticoOcho;
    }

    public void setTipoAntibioticoOcho(String tipoAntibioticoOcho) {
        this.tipoAntibioticoOcho = tipoAntibioticoOcho;
    }

    public String getTipoAntibioticoSeis() {
        return tipoAntibioticoSeis;
    }

    public void setTipoAntibioticoSeis(String tipoAntibioticoSeis) {
        this.tipoAntibioticoSeis = tipoAntibioticoSeis;
    }

    public String getTipoAntibioticoSiete() {
        return tipoAntibioticoSiete;
    }

    public void setTipoAntibioticoSiete(String tipoAntibioticoSiete) {
        this.tipoAntibioticoSiete = tipoAntibioticoSiete;
    }

    public String getTipoAntibioticoTres() {
        return tipoAntibioticoTres;
    }

    public void setTipoAntibioticoTres(String tipoAntibioticoTres) {
        this.tipoAntibioticoTres = tipoAntibioticoTres;
    }

    public String getTipoAntibioticoUno() {
        return tipoAntibioticoUno;
    }

    public void setTipoAntibioticoUno(String tipoAntibioticoUno) {
        this.tipoAntibioticoUno = tipoAntibioticoUno;
    }

    public String getTipoInmunoglobulinas() {
        return tipoInmunoglobulinas;
    }

    public void setTipoInmunoglobulinas(String tipoInmunoglobulinas) {
        this.tipoInmunoglobulinas = tipoInmunoglobulinas;
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
        if (!(object instanceof VariablesSoporteInfeccioso)) {
            return false;
        }
        VariablesSoporteInfeccioso other = (VariablesSoporteInfeccioso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesSoporteInfeccioso[ id=" + id + " ]";
    }
    
}
