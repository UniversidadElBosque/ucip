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
@Table(name = "variables_soporte_nutricional", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesSoporteNutricional.findAll", query = "SELECT v FROM VariablesSoporteNutricional v"),
    @NamedQuery(name = "VariablesSoporteNutricional.findById", query = "SELECT v FROM VariablesSoporteNutricional v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesSoporteNutricional.findByNumDiasNutricionParental", query = "SELECT v FROM VariablesSoporteNutricional v WHERE v.numDiasNutricionParental = :numDiasNutricionParental"),
    @NamedQuery(name = "VariablesSoporteNutricional.findByTiempoInicioNutricion", query = "SELECT v FROM VariablesSoporteNutricional v WHERE v.tiempoInicioNutricion = :tiempoInicioNutricion"),
    @NamedQuery(name = "VariablesSoporteNutricional.findByTiempoTomaLlegar", query = "SELECT v FROM VariablesSoporteNutricional v WHERE v.tiempoTomaLlegar = :tiempoTomaLlegar")})
public class VariablesSoporteNutricional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "num_dias_nutricion_parental", nullable = false)
    private int numDiasNutricionParental;
    @Basic(optional = false)
    @Column(name = "tiempo_inicio_nutricion", nullable = false)
    private int tiempoInicioNutricion;
    @Basic(optional = false)
    @Column(name = "tiempo_toma_llegar", nullable = false)
    private int tiempoTomaLlegar;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesSoporteNutricional() {
    }

    public VariablesSoporteNutricional(Long id) {
        this.id = id;
    }

    public VariablesSoporteNutricional(Long id, int numDiasNutricionParental, int tiempoInicioNutricion, int tiempoTomaLlegar) {
        this.id = id;
        this.numDiasNutricionParental = numDiasNutricionParental;
        this.tiempoInicioNutricion = tiempoInicioNutricion;
        this.tiempoTomaLlegar = tiempoTomaLlegar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumDiasNutricionParental() {
        return numDiasNutricionParental;
    }

    public void setNumDiasNutricionParental(int numDiasNutricionParental) {
        this.numDiasNutricionParental = numDiasNutricionParental;
    }

    public int getTiempoInicioNutricion() {
        return tiempoInicioNutricion;
    }

    public void setTiempoInicioNutricion(int tiempoInicioNutricion) {
        this.tiempoInicioNutricion = tiempoInicioNutricion;
    }

    public int getTiempoTomaLlegar() {
        return tiempoTomaLlegar;
    }

    public void setTiempoTomaLlegar(int tiempoTomaLlegar) {
        this.tiempoTomaLlegar = tiempoTomaLlegar;
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
        if (!(object instanceof VariablesSoporteNutricional)) {
            return false;
        }
        VariablesSoporteNutricional other = (VariablesSoporteNutricional) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesSoporteNutricional[ id=" + id + " ]";
    }
    
}
