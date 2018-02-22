package co.edu.unbosque.entity;

import co.edu.unbosque.entity.Diagnostico;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(CieDiez.class)
public class CieDiez_ { 

    public static volatile SingularAttribute<CieDiez, String> codigoCie;
    public static volatile CollectionAttribute<CieDiez, Diagnostico> diagnosticoCollection;
    public static volatile SingularAttribute<CieDiez, String> nombreCie;
    public static volatile SingularAttribute<CieDiez, Long> id;

}