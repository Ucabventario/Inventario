package inventario;

import inventario.Activo;
import inventario.IventarioPK;
import inventario.Responsablep;
import inventario.Responsableu;
import inventario.UnidadOperativa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:45")
@StaticMetamodel(Iventario.class)
public class Iventario_ { 

    public static volatile SingularAttribute<Iventario, Responsableu> responsableu;
    public static volatile SingularAttribute<Iventario, Responsablep> responsablep;
    public static volatile SingularAttribute<Iventario, String> fInicio;
    public static volatile SingularAttribute<Iventario, UnidadOperativa> unidadOperativa;
    public static volatile SingularAttribute<Iventario, String> lapso;
    public static volatile SingularAttribute<Iventario, IventarioPK> iventarioPK;
    public static volatile SingularAttribute<Iventario, String> fFin;
    public static volatile SingularAttribute<Iventario, Integer> cantidad;
    public static volatile SingularAttribute<Iventario, String> status;
    public static volatile SingularAttribute<Iventario, Activo> activo;

}