package inventario;

import inventario.Activo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:46")
@StaticMetamodel(ActivoInmueble.class)
public class ActivoInmueble_ { 

    public static volatile SingularAttribute<ActivoInmueble, String> ubicacion;
    public static volatile SingularAttribute<ActivoInmueble, String> idActivo;
    public static volatile SingularAttribute<ActivoInmueble, String> superficie;
    public static volatile SingularAttribute<ActivoInmueble, String> propiedad;
    public static volatile SingularAttribute<ActivoInmueble, String> status;
    public static volatile SingularAttribute<ActivoInmueble, Activo> activo;

}