package inventario;

import inventario.Activo;
import inventario.Componente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:45")
@StaticMetamodel(ActivoTangible.class)
public class ActivoTangible_ { 

    public static volatile SingularAttribute<ActivoTangible, String> idActivo;
    public static volatile SingularAttribute<ActivoTangible, String> proveedor;
    public static volatile SingularAttribute<ActivoTangible, String> plazoGarantia;
    public static volatile SingularAttribute<ActivoTangible, String> numFactura;
    public static volatile SingularAttribute<ActivoTangible, String> numOrden;
    public static volatile SingularAttribute<ActivoTangible, String> status;
    public static volatile SingularAttribute<ActivoTangible, Activo> activo;
    public static volatile CollectionAttribute<ActivoTangible, Componente> componenteCollection;

}