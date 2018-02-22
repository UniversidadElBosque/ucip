package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(DisfuncionRenal.class)
public class DisfuncionRenal_ { 

    public static volatile SingularAttribute<DisfuncionRenal, String> renal;
    public static volatile SingularAttribute<DisfuncionRenal, Date> fechaRenal;
    public static volatile SingularAttribute<DisfuncionRenal, Double> porcenGananciaPeso;
    public static volatile SingularAttribute<DisfuncionRenal, EstanciaUcip> estancia;
    public static volatile SingularAttribute<DisfuncionRenal, Long> id;
    public static volatile SingularAttribute<DisfuncionRenal, Double> diamasPeso;

}