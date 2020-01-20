package inventario;

import inventario.ActivoInmueble;
import inventario.ActivoIntangible;
import inventario.ActivoNatural;
import inventario.ActivoTangible;
import inventario.Distribuido;
import inventario.Iventario;
import inventario.Movilizacion;
import inventario.UnidadOperativa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:46")
@StaticMetamodel(Activo.class)
public class Activo_ { 

    public static volatile SingularAttribute<Activo, String> descripcion;
    public static volatile SingularAttribute<Activo, ActivoTangible> activoTangible;
    public static volatile SingularAttribute<Activo, String> idActivo;
    public static volatile SingularAttribute<Activo, ActivoNatural> activoNatural;
    public static volatile CollectionAttribute<Activo, UnidadOperativa> unidadOperativaCollection;
    public static volatile SingularAttribute<Activo, ActivoInmueble> activoInmueble;
    public static volatile SingularAttribute<Activo, String> idResponsableu;
    public static volatile SingularAttribute<Activo, ActivoIntangible> activoIntangible;
    public static volatile CollectionAttribute<Activo, Iventario> iventarioCollection;
    public static volatile CollectionAttribute<Activo, Movilizacion> movilizacionCollection;
    public static volatile CollectionAttribute<Activo, Distribuido> distribuidoCollection;

}