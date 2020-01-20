package inventario;

import inventario.Activo;
import inventario.MovilizacionPK;
import inventario.Responsableu;
import inventario.UnidadOperativa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:45")
@StaticMetamodel(Movilizacion.class)
public class Movilizacion_ { 

    public static volatile SingularAttribute<Movilizacion, String> aprobacionr;
    public static volatile SingularAttribute<Movilizacion, String> aprobacionc;
    public static volatile SingularAttribute<Movilizacion, Responsableu> responsableu;
    public static volatile SingularAttribute<Movilizacion, String> motivo;
    public static volatile SingularAttribute<Movilizacion, UnidadOperativa> unidadOperativa;
    public static volatile SingularAttribute<Movilizacion, UnidadOperativa> unidadOperativa1;
    public static volatile SingularAttribute<Movilizacion, MovilizacionPK> movilizacionPK;
    public static volatile SingularAttribute<Movilizacion, String> fMovilizacion;
    public static volatile SingularAttribute<Movilizacion, Responsableu> responsableu1;
    public static volatile SingularAttribute<Movilizacion, Activo> activo;

}