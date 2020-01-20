package inventario;

import inventario.Activo;
import inventario.Iventario;
import inventario.Movilizacion;
import inventario.Sede;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:46")
@StaticMetamodel(UnidadOperativa.class)
public class UnidadOperativa_ { 

    public static volatile CollectionAttribute<UnidadOperativa, Activo> activoCollection;
    public static volatile SingularAttribute<UnidadOperativa, String> fechaIni;
    public static volatile SingularAttribute<UnidadOperativa, String> idResponsablep;
    public static volatile SingularAttribute<UnidadOperativa, String> idUnidad;
    public static volatile CollectionAttribute<UnidadOperativa, Movilizacion> movilizacionCollection1;
    public static volatile SingularAttribute<UnidadOperativa, Sede> idSede;
    public static volatile CollectionAttribute<UnidadOperativa, Iventario> iventarioCollection;
    public static volatile CollectionAttribute<UnidadOperativa, Movilizacion> movilizacionCollection;

}