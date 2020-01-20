package inventario;

import inventario.Iventario;
import inventario.Movilizacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:46")
@StaticMetamodel(Responsableu.class)
public class Responsableu_ { 

    public static volatile CollectionAttribute<Responsableu, Movilizacion> movilizacionCollection1;
    public static volatile SingularAttribute<Responsableu, String> idResponsableu;
    public static volatile SingularAttribute<Responsableu, String> nombre;
    public static volatile CollectionAttribute<Responsableu, Iventario> iventarioCollection;
    public static volatile CollectionAttribute<Responsableu, Movilizacion> movilizacionCollection;

}