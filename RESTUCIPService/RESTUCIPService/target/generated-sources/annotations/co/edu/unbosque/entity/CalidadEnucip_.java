package co.edu.unbosque.entity;

import co.edu.unbosque.entity.EstanciaUcip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-13T22:54:02")
@StaticMetamodel(CalidadEnucip.class)
public class CalidadEnucip_ { 

    public static volatile SingularAttribute<CalidadEnucip, String> caidaPaciente;
    public static volatile SingularAttribute<CalidadEnucip, String> salidaTuboOrotraquial;
    public static volatile SingularAttribute<CalidadEnucip, String> cateterCentral;
    public static volatile SingularAttribute<CalidadEnucip, String> trombosisDispositivoVenoso;
    public static volatile SingularAttribute<CalidadEnucip, EstanciaUcip> estancia;
    public static volatile SingularAttribute<CalidadEnucip, String> observacionesEnucip;
    public static volatile SingularAttribute<CalidadEnucip, Long> id;
    public static volatile SingularAttribute<CalidadEnucip, String> tuboTorax;
    public static volatile SingularAttribute<CalidadEnucip, String> trombosisDispositivoArterial;

}