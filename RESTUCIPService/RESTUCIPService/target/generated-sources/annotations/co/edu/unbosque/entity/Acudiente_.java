package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import co.edu.unbosque.entity.PacienteAcudiente;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(Acudiente.class)
public class Acudiente_ { 

    public static volatile SingularAttribute<Acudiente, String> apellidoDos;
    public static volatile SingularAttribute<Acudiente, String> tipoDocumento;
    public static volatile SingularAttribute<Acudiente, String> apellidoUno;
    public static volatile CollectionAttribute<Acudiente, PacienteAcudiente> pacienteAcudienteCollection;
    public static volatile SingularAttribute<Acudiente, BigInteger> documento;
    public static volatile SingularAttribute<Acudiente, Long> id;
    public static volatile SingularAttribute<Acudiente, String> nombreUno;
    public static volatile CollectionAttribute<Acudiente, EstanciaUcip> estanciaUcipCollection;
    public static volatile SingularAttribute<Acudiente, String> nombreDos;

}