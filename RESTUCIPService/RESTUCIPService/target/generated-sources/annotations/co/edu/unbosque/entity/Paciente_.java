package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import co.edu.unbosque.entity.PacienteAcudiente;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> apellidos;
    public static volatile SingularAttribute<Paciente, Integer> numeroIgreso;
    public static volatile SingularAttribute<Paciente, BigInteger> historiaClinica;
    public static volatile SingularAttribute<Paciente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Paciente, String> fenotipoSexual;
    public static volatile SingularAttribute<Paciente, Integer> meses;
    public static volatile SingularAttribute<Paciente, BigInteger> documento;
    public static volatile SingularAttribute<Paciente, String> apellidosDos;
    public static volatile CollectionAttribute<Paciente, EstanciaUcip> estanciaUcipCollection;
    public static volatile SingularAttribute<Paciente, String> caracteristicaFenotipica;
    public static volatile SingularAttribute<Paciente, Integer> edad;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile SingularAttribute<Paciente, String> tipoDocumento;
    public static volatile CollectionAttribute<Paciente, PacienteAcudiente> pacienteAcudienteCollection;
    public static volatile SingularAttribute<Paciente, Integer> dias;
    public static volatile SingularAttribute<Paciente, Long> id;
    public static volatile SingularAttribute<Paciente, String> nombreDos;

}