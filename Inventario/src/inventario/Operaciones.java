package inventario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Operaciones {
    @PersistenceContext
    private EntityManager entityManager;
    public void Insercion(Activo mi_activo) {
        entityManager.createNativeQuery("INSERT INTO mi_activo (id_activo, id_responsableu, descripcion) VALUES (?, ?, ?)")
                .setParameter(1, mi_activo.getIdActivo())
                .setParameter(2, mi_activo.getIdResponsableu())
                .setParameter(3, mi_activo.getDescripcion())
                .executeUpdate();
    }
}