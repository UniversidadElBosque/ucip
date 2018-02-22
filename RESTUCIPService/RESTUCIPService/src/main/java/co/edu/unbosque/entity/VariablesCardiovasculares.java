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
@Table(name = "variables_cardiovasculares", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VariablesCardiovasculares.findAll", query = "SELECT v FROM VariablesCardiovasculares v"),
    @NamedQuery(name = "VariablesCardiovasculares.findById", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.id = :id"),
    @NamedQuery(name = "VariablesCardiovasculares.findByCausaExtubacionFallida", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.causaExtubacionFallida = :causaExtubacionFallida"),
    @NamedQuery(name = "VariablesCardiovasculares.findByComplicaInfecciosas", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.complicaInfecciosas = :complicaInfecciosas"),
    @NamedQuery(name = "VariablesCardiovasculares.findByComplicaSistemiPostqx1", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.complicaSistemiPostqx1 = :complicaSistemiPostqx1"),
    @NamedQuery(name = "VariablesCardiovasculares.findByComplicaSistemiPostqx2", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.complicaSistemiPostqx2 = :complicaSistemiPostqx2"),
    @NamedQuery(name = "VariablesCardiovasculares.findByComplicaSistemiPostqx3", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.complicaSistemiPostqx3 = :complicaSistemiPostqx3"),
    @NamedQuery(name = "VariablesCardiovasculares.findByComplicacionesIntraoperatorio", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.complicacionesIntraoperatorio = :complicacionesIntraoperatorio"),
    @NamedQuery(name = "VariablesCardiovasculares.findByComportaHemodinamico", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.comportaHemodinamico = :comportaHemodinamico"),
    @NamedQuery(name = "VariablesCardiovasculares.findByDeficitBaseIngreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.deficitBaseIngreso = :deficitBaseIngreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findByDiasRelajacion", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.diasRelajacion = :diasRelajacion"),
    @NamedQuery(name = "VariablesCardiovasculares.findByEcocardiogramaPop", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.ecocardiogramaPop = :ecocardiogramaPop"),
    @NamedQuery(name = "VariablesCardiovasculares.findByEstaciaPrevUcipDias", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.estaciaPrevUcipDias = :estaciaPrevUcipDias"),
    @NamedQuery(name = "VariablesCardiovasculares.findByGapCo2ingreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.gapCo2ingreso = :gapCo2ingreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findByHemodinamia", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.hemodinamia = :hemodinamia"),
    @NamedQuery(name = "VariablesCardiovasculares.findByHorasVentiPostCirugia", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.horasVentiPostCirugia = :horasVentiPostCirugia"),
    @NamedQuery(name = "VariablesCardiovasculares.findByHospiProlonPrevia", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.hospiProlonPrevia = :hospiProlonPrevia"),
    @NamedQuery(name = "VariablesCardiovasculares.findByInfeccPrevCirugia", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.infeccPrevCirugia = :infeccPrevCirugia"),
    @NamedQuery(name = "VariablesCardiovasculares.findByInfeccionAntes72horas", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.infeccionAntes72horas = :infeccionAntes72horas"),
    @NamedQuery(name = "VariablesCardiovasculares.findByInfeccionLuego72horas", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.infeccionLuego72horas = :infeccionLuego72horas"),
    @NamedQuery(name = "VariablesCardiovasculares.findByNecesiReintervencion", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.necesiReintervencion = :necesiReintervencion"),
    @NamedQuery(name = "VariablesCardiovasculares.findByNivelLactatoSericoIngreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.nivelLactatoSericoIngreso = :nivelLactatoSericoIngreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findByNivelPhIngreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.nivelPhIngreso = :nivelPhIngreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findByNomProcediCardiaco", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.nomProcediCardiaco = :nomProcediCardiaco"),
    @NamedQuery(name = "VariablesCardiovasculares.findByRachs1", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.rachs1 = :rachs1"),
    @NamedQuery(name = "VariablesCardiovasculares.findByReentubaIngreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.reentubaIngreso = :reentubaIngreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findBySaturaVenosaIngreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.saturaVenosaIngreso = :saturaVenosaIngreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findBySinSoporteIngreso", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.sinSoporteIngreso = :sinSoporteIngreso"),
    @NamedQuery(name = "VariablesCardiovasculares.findBySoporHemoDinaPrev", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.soporHemoDinaPrev = :soporHemoDinaPrev"),
    @NamedQuery(name = "VariablesCardiovasculares.findBySoporIngreMayor2vasoac", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.soporIngreMayor2vasoac = :soporIngreMayor2vasoac"),
    @NamedQuery(name = "VariablesCardiovasculares.findBySoporIngreMenor2vasoac", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.soporIngreMenor2vasoac = :soporIngreMenor2vasoac"),
    @NamedQuery(name = "VariablesCardiovasculares.findByTiempoArrestoCirculatorio", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.tiempoArrestoCirculatorio = :tiempoArrestoCirculatorio"),
    @NamedQuery(name = "VariablesCardiovasculares.findByTiempoBombaMinutos", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.tiempoBombaMinutos = :tiempoBombaMinutos"),
    @NamedQuery(name = "VariablesCardiovasculares.findByTiempoPinzamiAortico", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.tiempoPinzamiAortico = :tiempoPinzamiAortico"),
    @NamedQuery(name = "VariablesCardiovasculares.findByTipoReintervencion", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.tipoReintervencion = :tipoReintervencion"),
    @NamedQuery(name = "VariablesCardiovasculares.findByToraxAbierto", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.toraxAbierto = :toraxAbierto"),
    @NamedQuery(name = "VariablesCardiovasculares.findByTransfusionMasiva", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.transfusionMasiva = :transfusionMasiva"),
    @NamedQuery(name = "VariablesCardiovasculares.findByVenMecPrevCirugia", query = "SELECT v FROM VariablesCardiovasculares v WHERE v.venMecPrevCirugia = :venMecPrevCirugia")})
public class VariablesCardiovasculares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "causa_extubacion_fallida", length = 255)
    private String causaExtubacionFallida;
    @Column(name = "complica_infecciosas", length = 255)
    private String complicaInfecciosas;
    @Column(name = "complica_sistemi_postqx1", length = 255)
    private String complicaSistemiPostqx1;
    @Column(name = "complica_sistemi_postqx2", length = 255)
    private String complicaSistemiPostqx2;
    @Column(name = "complica_sistemi_postqx3", length = 255)
    private String complicaSistemiPostqx3;
    @Column(name = "complicaciones_intraoperatorio", length = 255)
    private String complicacionesIntraoperatorio;
    @Column(name = "comporta_hemodinamico", length = 255)
    private String comportaHemodinamico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "deficit_base_ingreso", precision = 17, scale = 17)
    private Double deficitBaseIngreso;
    @Column(name = "dias_relajacion")
    private Integer diasRelajacion;
    @Column(name = "ecocardiograma_pop", length = 255)
    private String ecocardiogramaPop;
    @Column(name = "estacia_prev_ucip_dias")
    private Integer estaciaPrevUcipDias;
    @Column(name = "gap_co2ingreso", precision = 17, scale = 17)
    private Double gapCo2ingreso;
    @Column(name = "hemodinamia", length = 255)
    private String hemodinamia;
    @Column(name = "horas_venti_post_cirugia")
    private Integer horasVentiPostCirugia;
    @Column(name = "hospi_prolon_previa", length = 255)
    private String hospiProlonPrevia;
    @Column(name = "infecc_prev_cirugia", length = 255)
    private String infeccPrevCirugia;
    @Column(name = "infeccion_antes72horas", length = 255)
    private String infeccionAntes72horas;
    @Column(name = "infeccion_luego72horas", length = 255)
    private String infeccionLuego72horas;
    @Column(name = "necesi_reintervencion", length = 255)
    private String necesiReintervencion;
    @Column(name = "nivel_lactato_serico_ingreso", precision = 17, scale = 17)
    private Double nivelLactatoSericoIngreso;
    @Column(name = "nivel_ph_ingreso", precision = 17, scale = 17)
    private Double nivelPhIngreso;
    @Column(name = "nom_procedi_cardiaco", length = 255)
    private String nomProcediCardiaco;
    @Column(name = "rachs1", length = 255)
    private String rachs1;
    @Column(name = "reentuba_ingreso", length = 255)
    private String reentubaIngreso;
    @Column(name = "satura_venosa_ingreso", precision = 17, scale = 17)
    private Double saturaVenosaIngreso;
    @Column(name = "sin_soporte_ingreso", length = 255)
    private String sinSoporteIngreso;
    @Column(name = "sopor_hemo_dina_prev", length = 255)
    private String soporHemoDinaPrev;
    @Column(name = "sopor_ingre_mayor2vasoac", length = 255)
    private String soporIngreMayor2vasoac;
    @Column(name = "sopor_ingre_menor2vasoac", length = 255)
    private String soporIngreMenor2vasoac;
    @Column(name = "tiempo_arresto_circulatorio")
    private Integer tiempoArrestoCirculatorio;
    @Column(name = "tiempo_bomba_minutos")
    private Integer tiempoBombaMinutos;
    @Column(name = "tiempo_pinzami_aortico")
    private Integer tiempoPinzamiAortico;
    @Column(name = "tipo_reintervencion", length = 255)
    private String tipoReintervencion;
    @Column(name = "torax_abierto", length = 255)
    private String toraxAbierto;
    @Column(name = "transfusion_masiva", length = 255)
    private String transfusionMasiva;
    @Column(name = "ven_mec_prev_cirugia")
    private Integer venMecPrevCirugia;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public VariablesCardiovasculares() {
    }

    public VariablesCardiovasculares(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCausaExtubacionFallida() {
        return causaExtubacionFallida;
    }

    public void setCausaExtubacionFallida(String causaExtubacionFallida) {
        this.causaExtubacionFallida = causaExtubacionFallida;
    }

    public String getComplicaInfecciosas() {
        return complicaInfecciosas;
    }

    public void setComplicaInfecciosas(String complicaInfecciosas) {
        this.complicaInfecciosas = complicaInfecciosas;
    }

    public String getComplicaSistemiPostqx1() {
        return complicaSistemiPostqx1;
    }

    public void setComplicaSistemiPostqx1(String complicaSistemiPostqx1) {
        this.complicaSistemiPostqx1 = complicaSistemiPostqx1;
    }

    public String getComplicaSistemiPostqx2() {
        return complicaSistemiPostqx2;
    }

    public void setComplicaSistemiPostqx2(String complicaSistemiPostqx2) {
        this.complicaSistemiPostqx2 = complicaSistemiPostqx2;
    }

    public String getComplicaSistemiPostqx3() {
        return complicaSistemiPostqx3;
    }

    public void setComplicaSistemiPostqx3(String complicaSistemiPostqx3) {
        this.complicaSistemiPostqx3 = complicaSistemiPostqx3;
    }

    public String getComplicacionesIntraoperatorio() {
        return complicacionesIntraoperatorio;
    }

    public void setComplicacionesIntraoperatorio(String complicacionesIntraoperatorio) {
        this.complicacionesIntraoperatorio = complicacionesIntraoperatorio;
    }

    public String getComportaHemodinamico() {
        return comportaHemodinamico;
    }

    public void setComportaHemodinamico(String comportaHemodinamico) {
        this.comportaHemodinamico = comportaHemodinamico;
    }

    public Double getDeficitBaseIngreso() {
        return deficitBaseIngreso;
    }

    public void setDeficitBaseIngreso(Double deficitBaseIngreso) {
        this.deficitBaseIngreso = deficitBaseIngreso;
    }

    public Integer getDiasRelajacion() {
        return diasRelajacion;
    }

    public void setDiasRelajacion(Integer diasRelajacion) {
        this.diasRelajacion = diasRelajacion;
    }

    public String getEcocardiogramaPop() {
        return ecocardiogramaPop;
    }

    public void setEcocardiogramaPop(String ecocardiogramaPop) {
        this.ecocardiogramaPop = ecocardiogramaPop;
    }

    public Integer getEstaciaPrevUcipDias() {
        return estaciaPrevUcipDias;
    }

    public void setEstaciaPrevUcipDias(Integer estaciaPrevUcipDias) {
        this.estaciaPrevUcipDias = estaciaPrevUcipDias;
    }

    public Double getGapCo2ingreso() {
        return gapCo2ingreso;
    }

    public void setGapCo2ingreso(Double gapCo2ingreso) {
        this.gapCo2ingreso = gapCo2ingreso;
    }

    public String getHemodinamia() {
        return hemodinamia;
    }

    public void setHemodinamia(String hemodinamia) {
        this.hemodinamia = hemodinamia;
    }

    public Integer getHorasVentiPostCirugia() {
        return horasVentiPostCirugia;
    }

    public void setHorasVentiPostCirugia(Integer horasVentiPostCirugia) {
        this.horasVentiPostCirugia = horasVentiPostCirugia;
    }

    public String getHospiProlonPrevia() {
        return hospiProlonPrevia;
    }

    public void setHospiProlonPrevia(String hospiProlonPrevia) {
        this.hospiProlonPrevia = hospiProlonPrevia;
    }

    public String getInfeccPrevCirugia() {
        return infeccPrevCirugia;
    }

    public void setInfeccPrevCirugia(String infeccPrevCirugia) {
        this.infeccPrevCirugia = infeccPrevCirugia;
    }

    public String getInfeccionAntes72horas() {
        return infeccionAntes72horas;
    }

    public void setInfeccionAntes72horas(String infeccionAntes72horas) {
        this.infeccionAntes72horas = infeccionAntes72horas;
    }

    public String getInfeccionLuego72horas() {
        return infeccionLuego72horas;
    }

    public void setInfeccionLuego72horas(String infeccionLuego72horas) {
        this.infeccionLuego72horas = infeccionLuego72horas;
    }

    public String getNecesiReintervencion() {
        return necesiReintervencion;
    }

    public void setNecesiReintervencion(String necesiReintervencion) {
        this.necesiReintervencion = necesiReintervencion;
    }

    public Double getNivelLactatoSericoIngreso() {
        return nivelLactatoSericoIngreso;
    }

    public void setNivelLactatoSericoIngreso(Double nivelLactatoSericoIngreso) {
        this.nivelLactatoSericoIngreso = nivelLactatoSericoIngreso;
    }

    public Double getNivelPhIngreso() {
        return nivelPhIngreso;
    }

    public void setNivelPhIngreso(Double nivelPhIngreso) {
        this.nivelPhIngreso = nivelPhIngreso;
    }

    public String getNomProcediCardiaco() {
        return nomProcediCardiaco;
    }

    public void setNomProcediCardiaco(String nomProcediCardiaco) {
        this.nomProcediCardiaco = nomProcediCardiaco;
    }

    public String getRachs1() {
        return rachs1;
    }

    public void setRachs1(String rachs1) {
        this.rachs1 = rachs1;
    }

    public String getReentubaIngreso() {
        return reentubaIngreso;
    }

    public void setReentubaIngreso(String reentubaIngreso) {
        this.reentubaIngreso = reentubaIngreso;
    }

    public Double getSaturaVenosaIngreso() {
        return saturaVenosaIngreso;
    }

    public void setSaturaVenosaIngreso(Double saturaVenosaIngreso) {
        this.saturaVenosaIngreso = saturaVenosaIngreso;
    }

    public String getSinSoporteIngreso() {
        return sinSoporteIngreso;
    }

    public void setSinSoporteIngreso(String sinSoporteIngreso) {
        this.sinSoporteIngreso = sinSoporteIngreso;
    }

    public String getSoporHemoDinaPrev() {
        return soporHemoDinaPrev;
    }

    public void setSoporHemoDinaPrev(String soporHemoDinaPrev) {
        this.soporHemoDinaPrev = soporHemoDinaPrev;
    }

    public String getSoporIngreMayor2vasoac() {
        return soporIngreMayor2vasoac;
    }

    public void setSoporIngreMayor2vasoac(String soporIngreMayor2vasoac) {
        this.soporIngreMayor2vasoac = soporIngreMayor2vasoac;
    }

    public String getSoporIngreMenor2vasoac() {
        return soporIngreMenor2vasoac;
    }

    public void setSoporIngreMenor2vasoac(String soporIngreMenor2vasoac) {
        this.soporIngreMenor2vasoac = soporIngreMenor2vasoac;
    }

    public Integer getTiempoArrestoCirculatorio() {
        return tiempoArrestoCirculatorio;
    }

    public void setTiempoArrestoCirculatorio(Integer tiempoArrestoCirculatorio) {
        this.tiempoArrestoCirculatorio = tiempoArrestoCirculatorio;
    }

    public Integer getTiempoBombaMinutos() {
        return tiempoBombaMinutos;
    }

    public void setTiempoBombaMinutos(Integer tiempoBombaMinutos) {
        this.tiempoBombaMinutos = tiempoBombaMinutos;
    }

    public Integer getTiempoPinzamiAortico() {
        return tiempoPinzamiAortico;
    }

    public void setTiempoPinzamiAortico(Integer tiempoPinzamiAortico) {
        this.tiempoPinzamiAortico = tiempoPinzamiAortico;
    }

    public String getTipoReintervencion() {
        return tipoReintervencion;
    }

    public void setTipoReintervencion(String tipoReintervencion) {
        this.tipoReintervencion = tipoReintervencion;
    }

    public String getToraxAbierto() {
        return toraxAbierto;
    }

    public void setToraxAbierto(String toraxAbierto) {
        this.toraxAbierto = toraxAbierto;
    }

    public String getTransfusionMasiva() {
        return transfusionMasiva;
    }

    public void setTransfusionMasiva(String transfusionMasiva) {
        this.transfusionMasiva = transfusionMasiva;
    }

    public Integer getVenMecPrevCirugia() {
        return venMecPrevCirugia;
    }

    public void setVenMecPrevCirugia(Integer venMecPrevCirugia) {
        this.venMecPrevCirugia = venMecPrevCirugia;
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
        if (!(object instanceof VariablesCardiovasculares)) {
            return false;
        }
        VariablesCardiovasculares other = (VariablesCardiovasculares) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.VariablesCardiovasculares[ id=" + id + " ]";
    }
    
}
