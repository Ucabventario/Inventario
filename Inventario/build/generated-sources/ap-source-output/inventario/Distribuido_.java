package inventario;

import inventario.Activo;
import inventario.DistribuidoPK;
import inventario.Sede;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:46")
@StaticMetamodel(Distribuido.class)
public class Distribuido_ { 

    public static volatile SingularAttribute<Distribuido, String> fDesincorp;
    public static volatile SingularAttribute<Distribuido, Sede> sede;
    public static volatile SingularAttribute<Distribuido, DistribuidoPK> distribuidoPK;
    public static volatile SingularAttribute<Distribuido, String> fIncorp;
    public static volatile SingularAttribute<Distribuido, Activo> activo;

}