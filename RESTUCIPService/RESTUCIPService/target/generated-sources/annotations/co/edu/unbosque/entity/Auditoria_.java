package co.edu.unbosque.entity;

import co.edu.unbosque.entity.Evidencia;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(Auditoria.class)
public class Auditoria_ { 

    public static volatile SingularAttribute<Auditoria, String> accion;
    public static volatile SingularAttribute<Auditoria, String> fecha;
    public static volatile SingularAttribute<Auditoria, BigInteger> idEvidencia;
    public static volatile SingularAttribute<Auditoria, String> hora;
    public static volatile SingularAttribute<Auditoria, Evidencia> evidencia;
    public static volatile SingularAttribute<Auditoria, String> tabla;
    public static volatile SingularAttribute<Auditoria, String> usuario;
    public static volatile SingularAttribute<Auditoria, Long> id;
    public static volatile SingularAttribute<Auditoria, BigInteger> idTabla;

}