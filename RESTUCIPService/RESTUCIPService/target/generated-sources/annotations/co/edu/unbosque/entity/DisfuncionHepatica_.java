package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(DisfuncionHepatica.class)
public class DisfuncionHepatica_ { 

    public static volatile SingularAttribute<DisfuncionHepatica, EstanciaUcip> estancia;
    public static volatile SingularAttribute<DisfuncionHepatica, Double> bilirrubina;
    public static volatile SingularAttribute<DisfuncionHepatica, String> hepatica;
    public static volatile SingularAttribute<DisfuncionHepatica, Long> id;
    public static volatile SingularAttribute<DisfuncionHepatica, Date> fechaHepatica;
    public static volatile SingularAttribute<DisfuncionHepatica, Double> tgp;
    public static volatile SingularAttribute<DisfuncionHepatica, Double> tgo;

}