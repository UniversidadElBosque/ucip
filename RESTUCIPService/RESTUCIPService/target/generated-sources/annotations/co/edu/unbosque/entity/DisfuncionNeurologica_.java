package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(DisfuncionNeurologica.class)
public class DisfuncionNeurologica_ { 

    public static volatile SingularAttribute<DisfuncionNeurologica, Integer> glasgow;
    public static volatile SingularAttribute<DisfuncionNeurologica, String> disminucionGlasgow;
    public static volatile SingularAttribute<DisfuncionNeurologica, EstanciaUcip> estancia;
    public static volatile SingularAttribute<DisfuncionNeurologica, String> neurologica;
    public static volatile SingularAttribute<DisfuncionNeurologica, Long> id;
    public static volatile SingularAttribute<DisfuncionNeurologica, Date> fechaDiag;

}