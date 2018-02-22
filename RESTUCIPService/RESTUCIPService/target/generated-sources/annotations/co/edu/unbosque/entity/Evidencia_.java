package co.edu.unbosque.entity;

import co.edu.unbosque.entity.Auditoria;
import co.edu.unbosque.entity.EstanciaUcip;
import co.edu.unbosque.entity.NombreEvidenciaModulo;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(Evidencia.class)
public class Evidencia_ { 

    public static volatile CollectionAttribute<Evidencia, Auditoria> auditoriaCollection;
    public static volatile SingularAttribute<Evidencia, BigInteger> codigoModulo;
    public static volatile SingularAttribute<Evidencia, BigInteger> idEspecificoEvidencia;
    public static volatile SingularAttribute<Evidencia, EstanciaUcip> estancia;
    public static volatile SingularAttribute<Evidencia, Long> id;
    public static volatile CollectionAttribute<Evidencia, NombreEvidenciaModulo> nombreEvidenciaModuloCollection;

}