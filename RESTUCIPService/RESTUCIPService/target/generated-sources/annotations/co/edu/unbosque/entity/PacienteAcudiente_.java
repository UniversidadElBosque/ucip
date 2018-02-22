package co.edu.unbosque.entity;

import co.edu.unbosque.entity.Acudiente;
import co.edu.unbosque.entity.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(PacienteAcudiente.class)
public class PacienteAcudiente_ { 

    public static volatile SingularAttribute<PacienteAcudiente, Acudiente> acudiente;
    public static volatile SingularAttribute<PacienteAcudiente, String> parentesco;
    public static volatile SingularAttribute<PacienteAcudiente, Paciente> paciente;
    public static volatile SingularAttribute<PacienteAcudiente, Long> id;

}