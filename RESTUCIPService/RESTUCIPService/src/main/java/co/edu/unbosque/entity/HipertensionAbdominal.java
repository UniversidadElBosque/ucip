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
@Table(name = "hipertension_abdominal", catalog = "ucip", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HipertensionAbdominal.findAll", query = "SELECT h FROM HipertensionAbdominal h"),
    @NamedQuery(name = "HipertensionAbdominal.findById", query = "SELECT h FROM HipertensionAbdominal h WHERE h.id = :id"),
    @NamedQuery(name = "HipertensionAbdominal.findByAlbumprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.albumprepercutaneo = :albumprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByAltprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.altprepercutaneo = :altprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByAstprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.astprepercutaneo = :astprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByBalpre", query = "SELECT h FROM HipertensionAbdominal h WHERE h.balpre = :balpre"),
    @NamedQuery(name = "HipertensionAbdominal.findByBunpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.bunpospercutaneo24 = :bunpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByBunpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.bunpospercutaneo48 = :bunpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByBunpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.bunpospercutaneo72 = :bunpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByBunprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.bunprepercutaneo = :bunprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByCreatpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.creatpospercutaneo24 = :creatpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByCreatpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.creatpospercutaneo48 = :creatpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByCreatpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.creatpospercutaneo72 = :creatpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByCreatprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.creatprepercutaneo = :creatprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByDtdrenab", query = "SELECT h FROM HipertensionAbdominal h WHERE h.dtdrenab = :dtdrenab"),
    @NamedQuery(name = "HipertensionAbdominal.findByDtdrento", query = "SELECT h FROM HipertensionAbdominal h WHERE h.dtdrento = :dtdrento"),
    @NamedQuery(name = "HipertensionAbdominal.findByFio2pospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.fio2pospercutaneo24 = :fio2pospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByFio2pospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.fio2pospercutaneo48 = :fio2pospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByFio2pospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.fio2pospercutaneo72 = :fio2pospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByFio2prepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.fio2prepercutaneo = :fio2prepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByGapco2pospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gapco2pospercutaneo24 = :gapco2pospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByGapco2pospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gapco2pospercutaneo48 = :gapco2pospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByGapco2pospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gapco2pospercutaneo72 = :gapco2pospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByGapco2prepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gapco2prepercutaneo = :gapco2prepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByGupos48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gupos48 = :gupos48"),
    @NamedQuery(name = "HipertensionAbdominal.findByGupospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gupospercutaneo24 = :gupospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByGupospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.gupospercutaneo72 = :gupospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByGuprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.guprepercutaneo = :guprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByHco3pospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.hco3pospercutaneo24 = :hco3pospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByHco3pospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.hco3pospercutaneo48 = :hco3pospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByHco3pospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.hco3pospercutaneo72 = :hco3pospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByHco3prepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.hco3prepercutaneo = :hco3prepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByHipotprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.hipotprepercutaneo = :hipotprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByInrpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.inrpospercutaneo24 = :inrpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByInrpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.inrpospercutaneo48 = :inrpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByInrpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.inrpospercutaneo72 = :inrpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByInrprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.inrprepercutaneo = :inrprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByLactatoliqperitoneal", query = "SELECT h FROM HipertensionAbdominal h WHERE h.lactatoliqperitoneal = :lactatoliqperitoneal"),
    @NamedQuery(name = "HipertensionAbdominal.findByLactatopospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.lactatopospercutaneo24 = :lactatopospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByLactatopospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.lactatopospercutaneo48 = :lactatopospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByLactatopospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.lactatopospercutaneo72 = :lactatopospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByLactatoprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.lactatoprepercutaneo = :lactatoprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByOligurprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.oligurprepercutaneo = :oligurprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPaco2pospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.paco2pospercutaneo24 = :paco2pospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPaco2pospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.paco2pospercutaneo48 = :paco2pospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPaco2pospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.paco2pospercutaneo72 = :paco2pospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPaco2prepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.paco2prepercutaneo = :paco2prepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPafiposper24horas", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pafiposper24horas = :pafiposper24horas"),
    @NamedQuery(name = "HipertensionAbdominal.findByPafiposper48horas", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pafiposper48horas = :pafiposper48horas"),
    @NamedQuery(name = "HipertensionAbdominal.findByPafiposper72horas", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pafiposper72horas = :pafiposper72horas"),
    @NamedQuery(name = "HipertensionAbdominal.findByPafiprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pafiprepercutaneo = :pafiprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPao2pospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pao2pospercutaneo24 = :pao2pospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPao2pospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pao2pospercutaneo48 = :pao2pospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPao2pospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pao2pospercutaneo72 = :pao2pospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPao2prepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pao2prepercutaneo = :pao2prepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPapospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.papospercutaneo24 = :papospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPapospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.papospercutaneo48 = :papospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPapospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.papospercutaneo72 = :papospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPaprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.paprepercutaneo = :paprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPeeppospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.peeppospercutaneo24 = :peeppospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPeeppospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.peeppospercutaneo48 = :peeppospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPeeppospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.peeppospercutaneo72 = :peeppospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPeepprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.peepprepercutaneo = :peepprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPhliqperitoneal", query = "SELECT h FROM HipertensionAbdominal h WHERE h.phliqperitoneal = :phliqperitoneal"),
    @NamedQuery(name = "HipertensionAbdominal.findByPhpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.phpospercutaneo24 = :phpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPhpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.phpospercutaneo48 = :phpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPhpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.phpospercutaneo72 = :phpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPhprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.phprepercutaneo = :phprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPlaquetprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.plaquetprepercutaneo = :plaquetprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmedpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmedpospercutaneo24 = :pmedpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmedpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmedpospercutaneo48 = :pmedpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmedpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmedpospercutaneo72 = :pmedpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmedprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmedprepercutaneo = :pmedprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmespospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmespospercutaneo24 = :pmespospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmespospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmespospercutaneo48 = :pmespospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmespospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmespospercutaneo72 = :pmespospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPmesprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pmesprepercutaneo = :pmesprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPpicopospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ppicopospercutaneo24 = :ppicopospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPpicopospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ppicopospercutaneo48 = :ppicopospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPpicopospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ppicopospercutaneo72 = :ppicopospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPpicoprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ppicoprepercutaneo = :ppicoprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPtpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ptpospercutaneo24 = :ptpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPtpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ptpospercutaneo48 = :ptpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPtpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ptpospercutaneo72 = :ptpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPtprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.ptprepercutaneo = :ptprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByPttpospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pttpospercutaneo24 = :pttpospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findByPttpospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pttpospercutaneo48 = :pttpospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findByPttpospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pttpospercutaneo72 = :pttpospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findByPttprepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.pttprepercutaneo = :pttprepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findBySvo2pospercutaneo24", query = "SELECT h FROM HipertensionAbdominal h WHERE h.svo2pospercutaneo24 = :svo2pospercutaneo24"),
    @NamedQuery(name = "HipertensionAbdominal.findBySvo2pospercutaneo48", query = "SELECT h FROM HipertensionAbdominal h WHERE h.svo2pospercutaneo48 = :svo2pospercutaneo48"),
    @NamedQuery(name = "HipertensionAbdominal.findBySvo2pospercutaneo72", query = "SELECT h FROM HipertensionAbdominal h WHERE h.svo2pospercutaneo72 = :svo2pospercutaneo72"),
    @NamedQuery(name = "HipertensionAbdominal.findBySvo2prepercutaneo", query = "SELECT h FROM HipertensionAbdominal h WHERE h.svo2prepercutaneo = :svo2prepercutaneo"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia1", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia1 = :voldrendia1"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia2", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia2 = :voldrendia2"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia3", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia3 = :voldrendia3"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia4", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia4 = :voldrendia4"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia5", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia5 = :voldrendia5"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia6", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia6 = :voldrendia6"),
    @NamedQuery(name = "HipertensionAbdominal.findByVoldrendia7", query = "SELECT h FROM HipertensionAbdominal h WHERE h.voldrendia7 = :voldrendia7"),
    @NamedQuery(name = "HipertensionAbdominal.findByVtdrenab", query = "SELECT h FROM HipertensionAbdominal h WHERE h.vtdrenab = :vtdrenab"),
    @NamedQuery(name = "HipertensionAbdominal.findByVtdrento", query = "SELECT h FROM HipertensionAbdominal h WHERE h.vtdrento = :vtdrento")})
public class HipertensionAbdominal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "albumprepercutaneo", precision = 17, scale = 17)
    private Double albumprepercutaneo;
    @Column(name = "altprepercutaneo", precision = 17, scale = 17)
    private Double altprepercutaneo;
    @Column(name = "astprepercutaneo", precision = 17, scale = 17)
    private Double astprepercutaneo;
    @Column(name = "balpre")
    private Integer balpre;
    @Column(name = "bunpospercutaneo24", precision = 17, scale = 17)
    private Double bunpospercutaneo24;
    @Column(name = "bunpospercutaneo48", precision = 17, scale = 17)
    private Double bunpospercutaneo48;
    @Column(name = "bunpospercutaneo72", precision = 17, scale = 17)
    private Double bunpospercutaneo72;
    @Column(name = "bunprepercutaneo", precision = 17, scale = 17)
    private Double bunprepercutaneo;
    @Column(name = "creatpospercutaneo24", precision = 17, scale = 17)
    private Double creatpospercutaneo24;
    @Column(name = "creatpospercutaneo48", precision = 17, scale = 17)
    private Double creatpospercutaneo48;
    @Column(name = "creatpospercutaneo72", precision = 17, scale = 17)
    private Double creatpospercutaneo72;
    @Column(name = "creatprepercutaneo", precision = 17, scale = 17)
    private Double creatprepercutaneo;
    @Column(name = "dtdrenab", precision = 17, scale = 17)
    private Double dtdrenab;
    @Column(name = "dtdrento", precision = 17, scale = 17)
    private Double dtdrento;
    @Column(name = "fio2pospercutaneo24", precision = 17, scale = 17)
    private Double fio2pospercutaneo24;
    @Column(name = "fio2pospercutaneo48", precision = 17, scale = 17)
    private Double fio2pospercutaneo48;
    @Column(name = "fio2pospercutaneo72", precision = 17, scale = 17)
    private Double fio2pospercutaneo72;
    @Column(name = "fio2prepercutaneo", precision = 17, scale = 17)
    private Double fio2prepercutaneo;
    @Column(name = "gapco2pospercutaneo24", precision = 17, scale = 17)
    private Double gapco2pospercutaneo24;
    @Column(name = "gapco2pospercutaneo48", precision = 17, scale = 17)
    private Double gapco2pospercutaneo48;
    @Column(name = "gapco2pospercutaneo72", precision = 17, scale = 17)
    private Double gapco2pospercutaneo72;
    @Column(name = "gapco2prepercutaneo", precision = 17, scale = 17)
    private Double gapco2prepercutaneo;
    @Column(name = "gupos48", precision = 17, scale = 17)
    private Double gupos48;
    @Column(name = "gupospercutaneo24", precision = 17, scale = 17)
    private Double gupospercutaneo24;
    @Column(name = "gupospercutaneo72", precision = 17, scale = 17)
    private Double gupospercutaneo72;
    @Column(name = "guprepercutaneo", precision = 17, scale = 17)
    private Double guprepercutaneo;
    @Column(name = "hco3pospercutaneo24", precision = 17, scale = 17)
    private Double hco3pospercutaneo24;
    @Column(name = "hco3pospercutaneo48", precision = 17, scale = 17)
    private Double hco3pospercutaneo48;
    @Column(name = "hco3pospercutaneo72", precision = 17, scale = 17)
    private Double hco3pospercutaneo72;
    @Column(name = "hco3prepercutaneo", precision = 17, scale = 17)
    private Double hco3prepercutaneo;
    @Column(name = "hipotprepercutaneo", length = 255)
    private String hipotprepercutaneo;
    @Column(name = "inrpospercutaneo24", precision = 17, scale = 17)
    private Double inrpospercutaneo24;
    @Column(name = "inrpospercutaneo48", precision = 17, scale = 17)
    private Double inrpospercutaneo48;
    @Column(name = "inrpospercutaneo72", precision = 17, scale = 17)
    private Double inrpospercutaneo72;
    @Column(name = "inrprepercutaneo", precision = 17, scale = 17)
    private Double inrprepercutaneo;
    @Column(name = "lactatoliqperitoneal", precision = 17, scale = 17)
    private Double lactatoliqperitoneal;
    @Column(name = "lactatopospercutaneo24", precision = 17, scale = 17)
    private Double lactatopospercutaneo24;
    @Column(name = "lactatopospercutaneo48", precision = 17, scale = 17)
    private Double lactatopospercutaneo48;
    @Column(name = "lactatopospercutaneo72", precision = 17, scale = 17)
    private Double lactatopospercutaneo72;
    @Column(name = "lactatoprepercutaneo", precision = 17, scale = 17)
    private Double lactatoprepercutaneo;
    @Column(name = "oligurprepercutaneo", length = 255)
    private String oligurprepercutaneo;
    @Column(name = "paco2pospercutaneo24", precision = 17, scale = 17)
    private Double paco2pospercutaneo24;
    @Column(name = "paco2pospercutaneo48", precision = 17, scale = 17)
    private Double paco2pospercutaneo48;
    @Column(name = "paco2pospercutaneo72", precision = 17, scale = 17)
    private Double paco2pospercutaneo72;
    @Column(name = "paco2prepercutaneo", precision = 17, scale = 17)
    private Double paco2prepercutaneo;
    @Column(name = "pafiposper24horas", precision = 17, scale = 17)
    private Double pafiposper24horas;
    @Column(name = "pafiposper48horas", precision = 17, scale = 17)
    private Double pafiposper48horas;
    @Column(name = "pafiposper72horas", precision = 17, scale = 17)
    private Double pafiposper72horas;
    @Column(name = "pafiprepercutaneo", precision = 17, scale = 17)
    private Double pafiprepercutaneo;
    @Column(name = "pao2pospercutaneo24", precision = 17, scale = 17)
    private Double pao2pospercutaneo24;
    @Column(name = "pao2pospercutaneo48", precision = 17, scale = 17)
    private Double pao2pospercutaneo48;
    @Column(name = "pao2pospercutaneo72", precision = 17, scale = 17)
    private Double pao2pospercutaneo72;
    @Column(name = "pao2prepercutaneo", precision = 17, scale = 17)
    private Double pao2prepercutaneo;
    @Column(name = "papospercutaneo24", precision = 17, scale = 17)
    private Double papospercutaneo24;
    @Column(name = "papospercutaneo48", precision = 17, scale = 17)
    private Double papospercutaneo48;
    @Column(name = "papospercutaneo72", precision = 17, scale = 17)
    private Double papospercutaneo72;
    @Column(name = "paprepercutaneo", precision = 17, scale = 17)
    private Double paprepercutaneo;
    @Column(name = "peeppospercutaneo24", precision = 17, scale = 17)
    private Double peeppospercutaneo24;
    @Column(name = "peeppospercutaneo48", precision = 17, scale = 17)
    private Double peeppospercutaneo48;
    @Column(name = "peeppospercutaneo72", precision = 17, scale = 17)
    private Double peeppospercutaneo72;
    @Column(name = "peepprepercutaneo", precision = 17, scale = 17)
    private Double peepprepercutaneo;
    @Column(name = "phliqperitoneal", precision = 17, scale = 17)
    private Double phliqperitoneal;
    @Column(name = "phpospercutaneo24", precision = 17, scale = 17)
    private Double phpospercutaneo24;
    @Column(name = "phpospercutaneo48", precision = 17, scale = 17)
    private Double phpospercutaneo48;
    @Column(name = "phpospercutaneo72", precision = 17, scale = 17)
    private Double phpospercutaneo72;
    @Column(name = "phprepercutaneo", precision = 17, scale = 17)
    private Double phprepercutaneo;
    @Column(name = "plaquetprepercutaneo", precision = 17, scale = 17)
    private Double plaquetprepercutaneo;
    @Column(name = "pmedpospercutaneo24", precision = 17, scale = 17)
    private Double pmedpospercutaneo24;
    @Column(name = "pmedpospercutaneo48", precision = 17, scale = 17)
    private Double pmedpospercutaneo48;
    @Column(name = "pmedpospercutaneo72", precision = 17, scale = 17)
    private Double pmedpospercutaneo72;
    @Column(name = "pmedprepercutaneo", precision = 17, scale = 17)
    private Double pmedprepercutaneo;
    @Column(name = "pmespospercutaneo24", precision = 17, scale = 17)
    private Double pmespospercutaneo24;
    @Column(name = "pmespospercutaneo48", precision = 17, scale = 17)
    private Double pmespospercutaneo48;
    @Column(name = "pmespospercutaneo72", precision = 17, scale = 17)
    private Double pmespospercutaneo72;
    @Column(name = "pmesprepercutaneo", precision = 17, scale = 17)
    private Double pmesprepercutaneo;
    @Column(name = "ppicopospercutaneo24", precision = 17, scale = 17)
    private Double ppicopospercutaneo24;
    @Column(name = "ppicopospercutaneo48", precision = 17, scale = 17)
    private Double ppicopospercutaneo48;
    @Column(name = "ppicopospercutaneo72", precision = 17, scale = 17)
    private Double ppicopospercutaneo72;
    @Column(name = "ppicoprepercutaneo", precision = 17, scale = 17)
    private Double ppicoprepercutaneo;
    @Column(name = "ptpospercutaneo24", precision = 17, scale = 17)
    private Double ptpospercutaneo24;
    @Column(name = "ptpospercutaneo48", precision = 17, scale = 17)
    private Double ptpospercutaneo48;
    @Column(name = "ptpospercutaneo72", precision = 17, scale = 17)
    private Double ptpospercutaneo72;
    @Column(name = "ptprepercutaneo", precision = 17, scale = 17)
    private Double ptprepercutaneo;
    @Column(name = "pttpospercutaneo24", precision = 17, scale = 17)
    private Double pttpospercutaneo24;
    @Column(name = "pttpospercutaneo48", precision = 17, scale = 17)
    private Double pttpospercutaneo48;
    @Column(name = "pttpospercutaneo72", precision = 17, scale = 17)
    private Double pttpospercutaneo72;
    @Column(name = "pttprepercutaneo", precision = 17, scale = 17)
    private Double pttprepercutaneo;
    @Column(name = "svo2pospercutaneo24", precision = 17, scale = 17)
    private Double svo2pospercutaneo24;
    @Column(name = "svo2pospercutaneo48", precision = 17, scale = 17)
    private Double svo2pospercutaneo48;
    @Column(name = "svo2pospercutaneo72", precision = 17, scale = 17)
    private Double svo2pospercutaneo72;
    @Column(name = "svo2prepercutaneo", precision = 17, scale = 17)
    private Double svo2prepercutaneo;
    @Column(name = "voldrendia1", precision = 17, scale = 17)
    private Double voldrendia1;
    @Column(name = "voldrendia2", precision = 17, scale = 17)
    private Double voldrendia2;
    @Column(name = "voldrendia3", precision = 17, scale = 17)
    private Double voldrendia3;
    @Column(name = "voldrendia4", precision = 17, scale = 17)
    private Double voldrendia4;
    @Column(name = "voldrendia5", precision = 17, scale = 17)
    private Double voldrendia5;
    @Column(name = "voldrendia6", precision = 17, scale = 17)
    private Double voldrendia6;
    @Column(name = "voldrendia7", precision = 17, scale = 17)
    private Double voldrendia7;
    @Column(name = "vtdrenab", precision = 17, scale = 17)
    private Double vtdrenab;
    @Column(name = "vtdrento", precision = 17, scale = 17)
    private Double vtdrento;
    @JoinColumn(name = "estancia", referencedColumnName = "id")
    @ManyToOne
    private EstanciaUcip estancia;

    public HipertensionAbdominal() {
    }

    public HipertensionAbdominal(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAlbumprepercutaneo() {
        return albumprepercutaneo;
    }

    public void setAlbumprepercutaneo(Double albumprepercutaneo) {
        this.albumprepercutaneo = albumprepercutaneo;
    }

    public Double getAltprepercutaneo() {
        return altprepercutaneo;
    }

    public void setAltprepercutaneo(Double altprepercutaneo) {
        this.altprepercutaneo = altprepercutaneo;
    }

    public Double getAstprepercutaneo() {
        return astprepercutaneo;
    }

    public void setAstprepercutaneo(Double astprepercutaneo) {
        this.astprepercutaneo = astprepercutaneo;
    }

    public Integer getBalpre() {
        return balpre;
    }

    public void setBalpre(Integer balpre) {
        this.balpre = balpre;
    }

    public Double getBunpospercutaneo24() {
        return bunpospercutaneo24;
    }

    public void setBunpospercutaneo24(Double bunpospercutaneo24) {
        this.bunpospercutaneo24 = bunpospercutaneo24;
    }

    public Double getBunpospercutaneo48() {
        return bunpospercutaneo48;
    }

    public void setBunpospercutaneo48(Double bunpospercutaneo48) {
        this.bunpospercutaneo48 = bunpospercutaneo48;
    }

    public Double getBunpospercutaneo72() {
        return bunpospercutaneo72;
    }

    public void setBunpospercutaneo72(Double bunpospercutaneo72) {
        this.bunpospercutaneo72 = bunpospercutaneo72;
    }

    public Double getBunprepercutaneo() {
        return bunprepercutaneo;
    }

    public void setBunprepercutaneo(Double bunprepercutaneo) {
        this.bunprepercutaneo = bunprepercutaneo;
    }

    public Double getCreatpospercutaneo24() {
        return creatpospercutaneo24;
    }

    public void setCreatpospercutaneo24(Double creatpospercutaneo24) {
        this.creatpospercutaneo24 = creatpospercutaneo24;
    }

    public Double getCreatpospercutaneo48() {
        return creatpospercutaneo48;
    }

    public void setCreatpospercutaneo48(Double creatpospercutaneo48) {
        this.creatpospercutaneo48 = creatpospercutaneo48;
    }

    public Double getCreatpospercutaneo72() {
        return creatpospercutaneo72;
    }

    public void setCreatpospercutaneo72(Double creatpospercutaneo72) {
        this.creatpospercutaneo72 = creatpospercutaneo72;
    }

    public Double getCreatprepercutaneo() {
        return creatprepercutaneo;
    }

    public void setCreatprepercutaneo(Double creatprepercutaneo) {
        this.creatprepercutaneo = creatprepercutaneo;
    }

    public Double getDtdrenab() {
        return dtdrenab;
    }

    public void setDtdrenab(Double dtdrenab) {
        this.dtdrenab = dtdrenab;
    }

    public Double getDtdrento() {
        return dtdrento;
    }

    public void setDtdrento(Double dtdrento) {
        this.dtdrento = dtdrento;
    }

    public Double getFio2pospercutaneo24() {
        return fio2pospercutaneo24;
    }

    public void setFio2pospercutaneo24(Double fio2pospercutaneo24) {
        this.fio2pospercutaneo24 = fio2pospercutaneo24;
    }

    public Double getFio2pospercutaneo48() {
        return fio2pospercutaneo48;
    }

    public void setFio2pospercutaneo48(Double fio2pospercutaneo48) {
        this.fio2pospercutaneo48 = fio2pospercutaneo48;
    }

    public Double getFio2pospercutaneo72() {
        return fio2pospercutaneo72;
    }

    public void setFio2pospercutaneo72(Double fio2pospercutaneo72) {
        this.fio2pospercutaneo72 = fio2pospercutaneo72;
    }

    public Double getFio2prepercutaneo() {
        return fio2prepercutaneo;
    }

    public void setFio2prepercutaneo(Double fio2prepercutaneo) {
        this.fio2prepercutaneo = fio2prepercutaneo;
    }

    public Double getGapco2pospercutaneo24() {
        return gapco2pospercutaneo24;
    }

    public void setGapco2pospercutaneo24(Double gapco2pospercutaneo24) {
        this.gapco2pospercutaneo24 = gapco2pospercutaneo24;
    }

    public Double getGapco2pospercutaneo48() {
        return gapco2pospercutaneo48;
    }

    public void setGapco2pospercutaneo48(Double gapco2pospercutaneo48) {
        this.gapco2pospercutaneo48 = gapco2pospercutaneo48;
    }

    public Double getGapco2pospercutaneo72() {
        return gapco2pospercutaneo72;
    }

    public void setGapco2pospercutaneo72(Double gapco2pospercutaneo72) {
        this.gapco2pospercutaneo72 = gapco2pospercutaneo72;
    }

    public Double getGapco2prepercutaneo() {
        return gapco2prepercutaneo;
    }

    public void setGapco2prepercutaneo(Double gapco2prepercutaneo) {
        this.gapco2prepercutaneo = gapco2prepercutaneo;
    }

    public Double getGupos48() {
        return gupos48;
    }

    public void setGupos48(Double gupos48) {
        this.gupos48 = gupos48;
    }

    public Double getGupospercutaneo24() {
        return gupospercutaneo24;
    }

    public void setGupospercutaneo24(Double gupospercutaneo24) {
        this.gupospercutaneo24 = gupospercutaneo24;
    }

    public Double getGupospercutaneo72() {
        return gupospercutaneo72;
    }

    public void setGupospercutaneo72(Double gupospercutaneo72) {
        this.gupospercutaneo72 = gupospercutaneo72;
    }

    public Double getGuprepercutaneo() {
        return guprepercutaneo;
    }

    public void setGuprepercutaneo(Double guprepercutaneo) {
        this.guprepercutaneo = guprepercutaneo;
    }

    public Double getHco3pospercutaneo24() {
        return hco3pospercutaneo24;
    }

    public void setHco3pospercutaneo24(Double hco3pospercutaneo24) {
        this.hco3pospercutaneo24 = hco3pospercutaneo24;
    }

    public Double getHco3pospercutaneo48() {
        return hco3pospercutaneo48;
    }

    public void setHco3pospercutaneo48(Double hco3pospercutaneo48) {
        this.hco3pospercutaneo48 = hco3pospercutaneo48;
    }

    public Double getHco3pospercutaneo72() {
        return hco3pospercutaneo72;
    }

    public void setHco3pospercutaneo72(Double hco3pospercutaneo72) {
        this.hco3pospercutaneo72 = hco3pospercutaneo72;
    }

    public Double getHco3prepercutaneo() {
        return hco3prepercutaneo;
    }

    public void setHco3prepercutaneo(Double hco3prepercutaneo) {
        this.hco3prepercutaneo = hco3prepercutaneo;
    }

    public String getHipotprepercutaneo() {
        return hipotprepercutaneo;
    }

    public void setHipotprepercutaneo(String hipotprepercutaneo) {
        this.hipotprepercutaneo = hipotprepercutaneo;
    }

    public Double getInrpospercutaneo24() {
        return inrpospercutaneo24;
    }

    public void setInrpospercutaneo24(Double inrpospercutaneo24) {
        this.inrpospercutaneo24 = inrpospercutaneo24;
    }

    public Double getInrpospercutaneo48() {
        return inrpospercutaneo48;
    }

    public void setInrpospercutaneo48(Double inrpospercutaneo48) {
        this.inrpospercutaneo48 = inrpospercutaneo48;
    }

    public Double getInrpospercutaneo72() {
        return inrpospercutaneo72;
    }

    public void setInrpospercutaneo72(Double inrpospercutaneo72) {
        this.inrpospercutaneo72 = inrpospercutaneo72;
    }

    public Double getInrprepercutaneo() {
        return inrprepercutaneo;
    }

    public void setInrprepercutaneo(Double inrprepercutaneo) {
        this.inrprepercutaneo = inrprepercutaneo;
    }

    public Double getLactatoliqperitoneal() {
        return lactatoliqperitoneal;
    }

    public void setLactatoliqperitoneal(Double lactatoliqperitoneal) {
        this.lactatoliqperitoneal = lactatoliqperitoneal;
    }

    public Double getLactatopospercutaneo24() {
        return lactatopospercutaneo24;
    }

    public void setLactatopospercutaneo24(Double lactatopospercutaneo24) {
        this.lactatopospercutaneo24 = lactatopospercutaneo24;
    }

    public Double getLactatopospercutaneo48() {
        return lactatopospercutaneo48;
    }

    public void setLactatopospercutaneo48(Double lactatopospercutaneo48) {
        this.lactatopospercutaneo48 = lactatopospercutaneo48;
    }

    public Double getLactatopospercutaneo72() {
        return lactatopospercutaneo72;
    }

    public void setLactatopospercutaneo72(Double lactatopospercutaneo72) {
        this.lactatopospercutaneo72 = lactatopospercutaneo72;
    }

    public Double getLactatoprepercutaneo() {
        return lactatoprepercutaneo;
    }

    public void setLactatoprepercutaneo(Double lactatoprepercutaneo) {
        this.lactatoprepercutaneo = lactatoprepercutaneo;
    }

    public String getOligurprepercutaneo() {
        return oligurprepercutaneo;
    }

    public void setOligurprepercutaneo(String oligurprepercutaneo) {
        this.oligurprepercutaneo = oligurprepercutaneo;
    }

    public Double getPaco2pospercutaneo24() {
        return paco2pospercutaneo24;
    }

    public void setPaco2pospercutaneo24(Double paco2pospercutaneo24) {
        this.paco2pospercutaneo24 = paco2pospercutaneo24;
    }

    public Double getPaco2pospercutaneo48() {
        return paco2pospercutaneo48;
    }

    public void setPaco2pospercutaneo48(Double paco2pospercutaneo48) {
        this.paco2pospercutaneo48 = paco2pospercutaneo48;
    }

    public Double getPaco2pospercutaneo72() {
        return paco2pospercutaneo72;
    }

    public void setPaco2pospercutaneo72(Double paco2pospercutaneo72) {
        this.paco2pospercutaneo72 = paco2pospercutaneo72;
    }

    public Double getPaco2prepercutaneo() {
        return paco2prepercutaneo;
    }

    public void setPaco2prepercutaneo(Double paco2prepercutaneo) {
        this.paco2prepercutaneo = paco2prepercutaneo;
    }

    public Double getPafiposper24horas() {
        return pafiposper24horas;
    }

    public void setPafiposper24horas(Double pafiposper24horas) {
        this.pafiposper24horas = pafiposper24horas;
    }

    public Double getPafiposper48horas() {
        return pafiposper48horas;
    }

    public void setPafiposper48horas(Double pafiposper48horas) {
        this.pafiposper48horas = pafiposper48horas;
    }

    public Double getPafiposper72horas() {
        return pafiposper72horas;
    }

    public void setPafiposper72horas(Double pafiposper72horas) {
        this.pafiposper72horas = pafiposper72horas;
    }

    public Double getPafiprepercutaneo() {
        return pafiprepercutaneo;
    }

    public void setPafiprepercutaneo(Double pafiprepercutaneo) {
        this.pafiprepercutaneo = pafiprepercutaneo;
    }

    public Double getPao2pospercutaneo24() {
        return pao2pospercutaneo24;
    }

    public void setPao2pospercutaneo24(Double pao2pospercutaneo24) {
        this.pao2pospercutaneo24 = pao2pospercutaneo24;
    }

    public Double getPao2pospercutaneo48() {
        return pao2pospercutaneo48;
    }

    public void setPao2pospercutaneo48(Double pao2pospercutaneo48) {
        this.pao2pospercutaneo48 = pao2pospercutaneo48;
    }

    public Double getPao2pospercutaneo72() {
        return pao2pospercutaneo72;
    }

    public void setPao2pospercutaneo72(Double pao2pospercutaneo72) {
        this.pao2pospercutaneo72 = pao2pospercutaneo72;
    }

    public Double getPao2prepercutaneo() {
        return pao2prepercutaneo;
    }

    public void setPao2prepercutaneo(Double pao2prepercutaneo) {
        this.pao2prepercutaneo = pao2prepercutaneo;
    }

    public Double getPapospercutaneo24() {
        return papospercutaneo24;
    }

    public void setPapospercutaneo24(Double papospercutaneo24) {
        this.papospercutaneo24 = papospercutaneo24;
    }

    public Double getPapospercutaneo48() {
        return papospercutaneo48;
    }

    public void setPapospercutaneo48(Double papospercutaneo48) {
        this.papospercutaneo48 = papospercutaneo48;
    }

    public Double getPapospercutaneo72() {
        return papospercutaneo72;
    }

    public void setPapospercutaneo72(Double papospercutaneo72) {
        this.papospercutaneo72 = papospercutaneo72;
    }

    public Double getPaprepercutaneo() {
        return paprepercutaneo;
    }

    public void setPaprepercutaneo(Double paprepercutaneo) {
        this.paprepercutaneo = paprepercutaneo;
    }

    public Double getPeeppospercutaneo24() {
        return peeppospercutaneo24;
    }

    public void setPeeppospercutaneo24(Double peeppospercutaneo24) {
        this.peeppospercutaneo24 = peeppospercutaneo24;
    }

    public Double getPeeppospercutaneo48() {
        return peeppospercutaneo48;
    }

    public void setPeeppospercutaneo48(Double peeppospercutaneo48) {
        this.peeppospercutaneo48 = peeppospercutaneo48;
    }

    public Double getPeeppospercutaneo72() {
        return peeppospercutaneo72;
    }

    public void setPeeppospercutaneo72(Double peeppospercutaneo72) {
        this.peeppospercutaneo72 = peeppospercutaneo72;
    }

    public Double getPeepprepercutaneo() {
        return peepprepercutaneo;
    }

    public void setPeepprepercutaneo(Double peepprepercutaneo) {
        this.peepprepercutaneo = peepprepercutaneo;
    }

    public Double getPhliqperitoneal() {
        return phliqperitoneal;
    }

    public void setPhliqperitoneal(Double phliqperitoneal) {
        this.phliqperitoneal = phliqperitoneal;
    }

    public Double getPhpospercutaneo24() {
        return phpospercutaneo24;
    }

    public void setPhpospercutaneo24(Double phpospercutaneo24) {
        this.phpospercutaneo24 = phpospercutaneo24;
    }

    public Double getPhpospercutaneo48() {
        return phpospercutaneo48;
    }

    public void setPhpospercutaneo48(Double phpospercutaneo48) {
        this.phpospercutaneo48 = phpospercutaneo48;
    }

    public Double getPhpospercutaneo72() {
        return phpospercutaneo72;
    }

    public void setPhpospercutaneo72(Double phpospercutaneo72) {
        this.phpospercutaneo72 = phpospercutaneo72;
    }

    public Double getPhprepercutaneo() {
        return phprepercutaneo;
    }

    public void setPhprepercutaneo(Double phprepercutaneo) {
        this.phprepercutaneo = phprepercutaneo;
    }

    public Double getPlaquetprepercutaneo() {
        return plaquetprepercutaneo;
    }

    public void setPlaquetprepercutaneo(Double plaquetprepercutaneo) {
        this.plaquetprepercutaneo = plaquetprepercutaneo;
    }

    public Double getPmedpospercutaneo24() {
        return pmedpospercutaneo24;
    }

    public void setPmedpospercutaneo24(Double pmedpospercutaneo24) {
        this.pmedpospercutaneo24 = pmedpospercutaneo24;
    }

    public Double getPmedpospercutaneo48() {
        return pmedpospercutaneo48;
    }

    public void setPmedpospercutaneo48(Double pmedpospercutaneo48) {
        this.pmedpospercutaneo48 = pmedpospercutaneo48;
    }

    public Double getPmedpospercutaneo72() {
        return pmedpospercutaneo72;
    }

    public void setPmedpospercutaneo72(Double pmedpospercutaneo72) {
        this.pmedpospercutaneo72 = pmedpospercutaneo72;
    }

    public Double getPmedprepercutaneo() {
        return pmedprepercutaneo;
    }

    public void setPmedprepercutaneo(Double pmedprepercutaneo) {
        this.pmedprepercutaneo = pmedprepercutaneo;
    }

    public Double getPmespospercutaneo24() {
        return pmespospercutaneo24;
    }

    public void setPmespospercutaneo24(Double pmespospercutaneo24) {
        this.pmespospercutaneo24 = pmespospercutaneo24;
    }

    public Double getPmespospercutaneo48() {
        return pmespospercutaneo48;
    }

    public void setPmespospercutaneo48(Double pmespospercutaneo48) {
        this.pmespospercutaneo48 = pmespospercutaneo48;
    }

    public Double getPmespospercutaneo72() {
        return pmespospercutaneo72;
    }

    public void setPmespospercutaneo72(Double pmespospercutaneo72) {
        this.pmespospercutaneo72 = pmespospercutaneo72;
    }

    public Double getPmesprepercutaneo() {
        return pmesprepercutaneo;
    }

    public void setPmesprepercutaneo(Double pmesprepercutaneo) {
        this.pmesprepercutaneo = pmesprepercutaneo;
    }

    public Double getPpicopospercutaneo24() {
        return ppicopospercutaneo24;
    }

    public void setPpicopospercutaneo24(Double ppicopospercutaneo24) {
        this.ppicopospercutaneo24 = ppicopospercutaneo24;
    }

    public Double getPpicopospercutaneo48() {
        return ppicopospercutaneo48;
    }

    public void setPpicopospercutaneo48(Double ppicopospercutaneo48) {
        this.ppicopospercutaneo48 = ppicopospercutaneo48;
    }

    public Double getPpicopospercutaneo72() {
        return ppicopospercutaneo72;
    }

    public void setPpicopospercutaneo72(Double ppicopospercutaneo72) {
        this.ppicopospercutaneo72 = ppicopospercutaneo72;
    }

    public Double getPpicoprepercutaneo() {
        return ppicoprepercutaneo;
    }

    public void setPpicoprepercutaneo(Double ppicoprepercutaneo) {
        this.ppicoprepercutaneo = ppicoprepercutaneo;
    }

    public Double getPtpospercutaneo24() {
        return ptpospercutaneo24;
    }

    public void setPtpospercutaneo24(Double ptpospercutaneo24) {
        this.ptpospercutaneo24 = ptpospercutaneo24;
    }

    public Double getPtpospercutaneo48() {
        return ptpospercutaneo48;
    }

    public void setPtpospercutaneo48(Double ptpospercutaneo48) {
        this.ptpospercutaneo48 = ptpospercutaneo48;
    }

    public Double getPtpospercutaneo72() {
        return ptpospercutaneo72;
    }

    public void setPtpospercutaneo72(Double ptpospercutaneo72) {
        this.ptpospercutaneo72 = ptpospercutaneo72;
    }

    public Double getPtprepercutaneo() {
        return ptprepercutaneo;
    }

    public void setPtprepercutaneo(Double ptprepercutaneo) {
        this.ptprepercutaneo = ptprepercutaneo;
    }

    public Double getPttpospercutaneo24() {
        return pttpospercutaneo24;
    }

    public void setPttpospercutaneo24(Double pttpospercutaneo24) {
        this.pttpospercutaneo24 = pttpospercutaneo24;
    }

    public Double getPttpospercutaneo48() {
        return pttpospercutaneo48;
    }

    public void setPttpospercutaneo48(Double pttpospercutaneo48) {
        this.pttpospercutaneo48 = pttpospercutaneo48;
    }

    public Double getPttpospercutaneo72() {
        return pttpospercutaneo72;
    }

    public void setPttpospercutaneo72(Double pttpospercutaneo72) {
        this.pttpospercutaneo72 = pttpospercutaneo72;
    }

    public Double getPttprepercutaneo() {
        return pttprepercutaneo;
    }

    public void setPttprepercutaneo(Double pttprepercutaneo) {
        this.pttprepercutaneo = pttprepercutaneo;
    }

    public Double getSvo2pospercutaneo24() {
        return svo2pospercutaneo24;
    }

    public void setSvo2pospercutaneo24(Double svo2pospercutaneo24) {
        this.svo2pospercutaneo24 = svo2pospercutaneo24;
    }

    public Double getSvo2pospercutaneo48() {
        return svo2pospercutaneo48;
    }

    public void setSvo2pospercutaneo48(Double svo2pospercutaneo48) {
        this.svo2pospercutaneo48 = svo2pospercutaneo48;
    }

    public Double getSvo2pospercutaneo72() {
        return svo2pospercutaneo72;
    }

    public void setSvo2pospercutaneo72(Double svo2pospercutaneo72) {
        this.svo2pospercutaneo72 = svo2pospercutaneo72;
    }

    public Double getSvo2prepercutaneo() {
        return svo2prepercutaneo;
    }

    public void setSvo2prepercutaneo(Double svo2prepercutaneo) {
        this.svo2prepercutaneo = svo2prepercutaneo;
    }

    public Double getVoldrendia1() {
        return voldrendia1;
    }

    public void setVoldrendia1(Double voldrendia1) {
        this.voldrendia1 = voldrendia1;
    }

    public Double getVoldrendia2() {
        return voldrendia2;
    }

    public void setVoldrendia2(Double voldrendia2) {
        this.voldrendia2 = voldrendia2;
    }

    public Double getVoldrendia3() {
        return voldrendia3;
    }

    public void setVoldrendia3(Double voldrendia3) {
        this.voldrendia3 = voldrendia3;
    }

    public Double getVoldrendia4() {
        return voldrendia4;
    }

    public void setVoldrendia4(Double voldrendia4) {
        this.voldrendia4 = voldrendia4;
    }

    public Double getVoldrendia5() {
        return voldrendia5;
    }

    public void setVoldrendia5(Double voldrendia5) {
        this.voldrendia5 = voldrendia5;
    }

    public Double getVoldrendia6() {
        return voldrendia6;
    }

    public void setVoldrendia6(Double voldrendia6) {
        this.voldrendia6 = voldrendia6;
    }

    public Double getVoldrendia7() {
        return voldrendia7;
    }

    public void setVoldrendia7(Double voldrendia7) {
        this.voldrendia7 = voldrendia7;
    }

    public Double getVtdrenab() {
        return vtdrenab;
    }

    public void setVtdrenab(Double vtdrenab) {
        this.vtdrenab = vtdrenab;
    }

    public Double getVtdrento() {
        return vtdrento;
    }

    public void setVtdrento(Double vtdrento) {
        this.vtdrento = vtdrento;
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
        if (!(object instanceof HipertensionAbdominal)) {
            return false;
        }
        HipertensionAbdominal other = (HipertensionAbdominal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unbosque.entity.HipertensionAbdominal[ id=" + id + " ]";
    }
    
}
