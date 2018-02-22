package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(DisfuncionHematologica.class)
public class DisfuncionHematologica_ { 

    public static volatile SingularAttribute<DisfuncionHematologica, Date> fechaHematologica;
    public static volatile SingularAttribute<DisfuncionHematologica, String> hematologica;
    public static volatile SingularAttribute<DisfuncionHematologica, EstanciaUcip> estancia;
    public static volatile SingularAttribute<DisfuncionHematologica, Long> id;
    public static volatile SingularAttribute<DisfuncionHematologica, String> recuentoPlaquetas;
    public static volatile SingularAttribute<DisfuncionHematologica, Double> inr;
    public static volatile SingularAttribute<DisfuncionHematologica, Double> hbdXSep;
    public static volatile SingularAttribute<DisfuncionHematologica, String> descensoPlaquetas;

}