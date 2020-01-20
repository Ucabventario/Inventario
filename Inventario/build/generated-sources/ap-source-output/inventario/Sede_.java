package inventario;

import inventario.Distribuido;
import inventario.UnidadOperativa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:46")
@StaticMetamodel(Sede.class)
public class Sede_ { 

    public static volatile SingularAttribute<Sede, String> descripcion;
    public static volatile SingularAttribute<Sede, String> ubicacion;
    public static volatile CollectionAttribute<Sede, UnidadOperativa> unidadOperativaCollection;
    public static volatile SingularAttribute<Sede, String> idSede;
    public static volatile CollectionAttribute<Sede, Distribuido> distribuidoCollection;

}