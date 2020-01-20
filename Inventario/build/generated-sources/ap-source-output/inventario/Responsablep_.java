package inventario;

import inventario.Iventario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-19T17:30:45")
@StaticMetamodel(Responsablep.class)
public class Responsablep_ { 

    public static volatile SingularAttribute<Responsablep, String> idResponsablep;
    public static volatile SingularAttribute<Responsablep, String> nombre;
    public static volatile CollectionAttribute<Responsablep, Iventario> iventarioCollection;

}