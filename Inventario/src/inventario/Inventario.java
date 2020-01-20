package inventario;

import Interface.login;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Inventario {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction datosTransaccion = em.getTransaction();
        em.getTransaction().begin();
        
        login log = new login();
        log.setVisible(true);
        
        //CRUD de Todas las Tablas----------------------------------------------
        
        //Activo----------------------------------------------------------------
        
        /*Activo nuevo_activo = new Activo("ID001", "IDR01", "Descrip");
        em.createNativeQuery("INSERT INTO activo (id_activo, id_responsableu, descripcion) VALUES (?, ?, ?)")
                .setParameter(1, nuevo_activo.getIdActivo())
                .setParameter(2, nuevo_activo.getIdResponsableu())
                .setParameter(3, nuevo_activo.getDescripcion())
                .executeUpdate();
        
        em.createNamedQuery("Activo.modificar", Activo.class)
                .setParameter(1, nuevo_activo.getIdActivo()) //ID del activo a modificar
                .setParameter(2, "ID002") //ID nuevo
                .setParameter(3, "IDR02") //ID responsableu nuevo
                .setParameter(4, "Nueva descrip") //Descrip. nueva
                .executeUpdate();
        
        em.createNamedQuery("Activo.borrar", Activo.class)
                .setParameter(1, nuevo_activo.getIdActivo()) //ID del activo a borrar
                .executeUpdate();
        
        //Activo inmueble-------------------------------------------------------
        
        ActivoInmueble nuevo_inmueble = new ActivoInmueble("ID001", "Ubic1", "25000", "Comodato", "Habitada");
        em.createNativeQuery("INSERT INTO activo_inmueble (id_activo, ubicacion, superficie, propiedad, status) VALUES (?, ?, ?, ?, ?)")
                .setParameter(1, nuevo_inmueble.getIdActivo())
                .setParameter(2, nuevo_inmueble.getUbicacion())
                .setParameter(3, nuevo_inmueble.getSuperficie())
                .setParameter(4, nuevo_inmueble.getPropiedad())
                .setParameter(5, nuevo_inmueble.getStatus())
                .executeUpdate();
        
        em.createNamedQuery("ActivoInmueble.modificar", ActivoInmueble.class)
                .setParameter(1, nuevo_inmueble.getIdActivo()) //ID del inmueble a modificar
                .setParameter(2, "ID002") //ID nuevo
                .setParameter(3, "Ubic2") //Ubicacion nueva
                .setParameter(4, "32000") //Superficie nueva
                .setParameter(5, "Propia") //Propiedad nueva
                .setParameter(6, "En Construccion") //Status nuevo
                .executeUpdate();
        
        em.createNamedQuery("ActivoInmueble.borrar", ActivoInmueble.class)
                .setParameter(1, nuevo_inmueble.getIdActivo()) //ID del inmueble a borrar
                .executeUpdate();
        
        //Activo intangible-----------------------------------------------------
        
        ActivoIntangible nuevo_intangible = new ActivoIntangible("ID001", "01/06/20", "SI", "Vigente");
        em.createNativeQuery("INSERT INTO activo_intangible (id_activo, fecha_cad, compartida, status) VALUES (?, ?, ?, ?)")
                .setParameter(1, nuevo_intangible.getIdActivo())
                .setParameter(2, nuevo_intangible.getFechaCad())
                .setParameter(3, nuevo_intangible.getCompartida())
                .setParameter(4, nuevo_intangible.getStatus())
                .executeUpdate();
        
        em.createNamedQuery("ActivoIntangible.modificar", ActivoIntangible.class)
                .setParameter(1, nuevo_intangible.getIdActivo()) //ID del intangible a modificar
                .setParameter(2, "ID002") //ID nuevo
                .setParameter(3, "02/11/20") //Fecha de caducidad nueva
                .setParameter(4, "NO") //No compartida
                .setParameter(5, "Vencidas") //Status nuevo
                .executeUpdate();
        
        em.createNamedQuery("ActivoIntangible.borrar", ActivoIntangible.class)
                .setParameter(1, nuevo_intangible.getIdActivo()) //ID del intangible a borrar
                .executeUpdate();
        
        //Activo natural--------------------------------------------------------
        
        ActivoNatural nuevo_natural = new ActivoNatural("ID001", "NomC1", "NomV1", "SI", "Florac1", "15/08/2020", "Orig1", "Enfermo", "Ubic1");
        em.createNativeQuery("INSERT INTO activo_natural (id_activo, nombre_c, nombre_v, frutal, floracion, fplantacion, origen, status, ubicacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
                .setParameter(1, nuevo_natural.getIdActivo())
                .setParameter(2, nuevo_natural.getNombreC())
                .setParameter(3, nuevo_natural.getNombreV())
                .setParameter(4, nuevo_natural.getFrutal())
                .setParameter(5, nuevo_natural.getFloracion())
                .setParameter(6, nuevo_natural.getFPlantacion())
                .setParameter(7, nuevo_natural.getOrigen())
                .setParameter(8, nuevo_natural.getStatus())
                .setParameter(9, nuevo_natural.getUbicacion())
                .executeUpdate();
        
        em.createNamedQuery("ActivoNatural.modificar", ActivoNatural.class)
                .setParameter(1, nuevo_natural.getIdActivo()) //ID del activo natural a modificar
                .setParameter(2, "ID002") //ID nuevo
                .setParameter(3, "NomC2") //Nombre científico nuevo
                .setParameter(4, "NomV2") //Nombre vulgar nuevo
                .setParameter(5, "NO") //Frutal
                .setParameter(6, "Florac2") //Floración nueva
                .setParameter(7, "15/12/2020") //Fecha de plantación nueva
                .setParameter(8, "Orig5") //Origen nuevo
                .setParameter(9, "Extinto") //Status nuevo
                .setParameter(10, "Ubic9") //Ubicación nuevo
                .executeUpdate();
        
        em.createNamedQuery("ActivoNatural.borrar", ActivoNatural.class)
                .setParameter(1, nuevo_natural.getIdActivo()) //ID del activo natural a borrar
                .executeUpdate();
        
        //Activo tangible-------------------------------------------------------
        
        ActivoTangible nuevo_tangible = new ActivoTangible("ID001", "Prov1", "8", "001", "Plazo1", "Obsoleto");
        em.createNativeQuery("INSERT INTO activo_tangible (id_activo, proveedor, num_orden, num_factura, plazo_garantia, status) VALUES (?, ?, ?, ?, ?, ?)")
                .setParameter(1, nuevo_tangible.getIdActivo())
                .setParameter(2, nuevo_tangible.getProveedor())
                .setParameter(3, nuevo_tangible.getNumOrden())
                .setParameter(4, nuevo_tangible.getNumFactura())
                .setParameter(5, nuevo_tangible.getPlazoGarantia())
                .setParameter(6, nuevo_tangible.getStatus())
                .executeUpdate();
        
        em.createNamedQuery("ActivoTangible.modificar", ActivoTangible.class)
                .setParameter(1, nuevo_tangible.getIdActivo()) //ID del tangible a modificar
                .setParameter(2, "ID002") //ID nuevo
                .setParameter(3, "Prov2") //Proveedor nuevo
                .setParameter(4, "13") //Número de orden nuevo
                .setParameter(5, "008") //Número de factura nuevo
                .setParameter(6, "Plazo2") //Plazo nuevo
                .setParameter(7, "En Reperacion") //Status nuevo
                .executeUpdate();
        
        em.createNamedQuery("ActivoTangible.borrar", ActivoTangible.class)
                .setParameter(1, nuevo_tangible.getIdActivo()) //ID del tangible a borrar
                .executeUpdate();
        
        //Componente------------------------------------------------------------
        
        ComponentePK nuevo_comclave = new ComponentePK("ID001", "Un nombre");
        Componente nuevo_com = new Componente(nuevo_comclave);
        nuevo_com.setIdComponente("IDC05");
        em.createNativeQuery("INSERT INTO componente (id_activo, nombre, id_componente) VALUES (?, ?, ?)")
                .setParameter(1, nuevo_com.getComponentePK().getIdActivo())
                .setParameter(2, nuevo_com.getComponentePK().getNombre())
                .setParameter(3, nuevo_com.getIdComponente())
                .executeUpdate();
        
        em.createNamedQuery("Componente.modificar", Componente.class)
                .setParameter(1, nuevo_com.getComponentePK().getIdActivo()) //ID del activo del componente a modificar
                .setParameter(2, nuevo_com.getComponentePK().getNombre()) //Nombre del componente a modificar
                .setParameter(3, "ID002") //Nuevo ID de activo
                .setParameter(4, "Otro nombre") //Nombre nuevo
                .setParameter(5, "IDC08") //Nuevo ID del componente
                .executeUpdate();
        
        em.createNamedQuery("Componente.borrar", Componente.class)
                .setParameter(1, nuevo_com.getComponentePK().getIdActivo()) //ID del activo del componente a borrar
                .setParameter(2, nuevo_com.getComponentePK().getNombre()) //Nombre del componente a borrar
                .executeUpdate();
        
        //Distribuido-----------------------------------------------------------
        
        DistribuidoPK nuevo_distclave = new DistribuidoPK("S1", "ID001");
        Distribuido nuevo_dist = new Distribuido(nuevo_distclave, "01/01/20", "02/01/20");
        em.createNativeQuery("INSERT INTO distribuido (id_sede, id_activo, f_incorp, f_desincorp) VALUES (?, ?, ?, ?)")
                .setParameter(1, nuevo_dist.getDistribuidoPK().getIdSede())
                .setParameter(2, nuevo_dist.getDistribuidoPK().getIdActivo())
                .setParameter(3, nuevo_dist.getFIncorp())
                .setParameter(4, nuevo_dist.getFDesincorp())
                .executeUpdate();
        
        //Iventario-------------------------------------------------------------
        
        IventarioPK nuevo_inventclave = new IventarioPK("ID001", "Uni1", "RespU1", "RespP1");
        Iventario nuevo_invent = new Iventario(nuevo_inventclave, "01/01/20", "05/01/20", "Laps1", "Cerrado", 2);
        em.createNativeQuery("INSERT INTO iventario (id_activo, id_unidad, id_responsableu, id_responsablep, f_inicio, f_fin, lapso, status, cantidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
                .setParameter(1, nuevo_invent.getIventarioPK().getIdActivo())
                .setParameter(2, nuevo_invent.getIventarioPK().getIdUnidad())
                .setParameter(3, nuevo_invent.getIventarioPK().getIdResponsableu())
                .setParameter(4, nuevo_invent.getIventarioPK().getIdResponsablep())
                .setParameter(5, nuevo_invent.getFInicio())
                .setParameter(6, nuevo_invent.getFFin())
                .setParameter(7, nuevo_invent.getLapso())
                .setParameter(8, nuevo_invent.getStatus())
                .setParameter(9, nuevo_invent.getCantidad())
                .executeUpdate();
        
        em.createNamedQuery("Iventario.modificar", Iventario.class)
                .setParameter(1, nuevo_invent.getIventarioPK().getIdActivo()) //ID de activo del inventario a modificar
                .setParameter(2, nuevo_invent.getIventarioPK().getIdUnidad()) //ID de unidad del inventario a modificar
                .setParameter(3, nuevo_invent.getIventarioPK().getIdResponsableu()) //ID de responsable de uso del inventario a modificar
                .setParameter(4, nuevo_invent.getIventarioPK().getIdResponsablep()) //ID de responsable primario del inventario a modificar
                .setParameter(5, "ID002") //Nuevo Id de activo
                .setParameter(6, "Uni2") //Nuevo ID de unidad
                .setParameter(7, "RespU2") //Nuevo ID de responsable de uso
                .setParameter(8, "RespP2") //Nuevo ID de responsable primario
                .setParameter(9, "01/08/20") //Nueva fecha de inicio
                .setParameter(10, "09/08/20") //Nueva fecha de fin
                .setParameter(11, "Laps2") //Nuevo lapso
                .setParameter(12, "En Ejecucion") //Nuevo status
                .setParameter(13, 6) //Nueva cantidad
                .executeUpdate();
        
        em.createNamedQuery("Iventario.borrar", Iventario.class)
                .setParameter(1, nuevo_invent.getIventarioPK().getIdActivo()) //ID de activo del inventario a borrar
                .setParameter(2, nuevo_invent.getIventarioPK().getIdUnidad()) //ID de unidad del inventario a borrar
                .setParameter(3, nuevo_invent.getIventarioPK().getIdResponsableu()) //ID de responsable de uso a borrar
                .setParameter(4, nuevo_invent.getIventarioPK().getIdResponsablep()) //ID de responsable primario a borrar
                .executeUpdate();
        
        //Movilización----------------------------------------------------------
        
        MovilizacionPK nueva_movclave = new MovilizacionPK("Uni1", "Uni2", "RespU1", "RespC2", "IDR09");
        Movilizacion nueva_mov = new Movilizacion(nueva_movclave, "02/01/20", "SI", "NO", "Un motivo");
        em.createNativeQuery("INSERT INTO movilizacion (id_unidadc, id_unidadr, id_responsableuc, id_responsableur, id_activo, f_movilizacion, aprobacionc, aprobacionr, motivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
                .setParameter(1, nueva_mov.getMovilizacionPK().getIdUnidadc())
                .setParameter(2, nueva_mov.getMovilizacionPK().getIdUnidadr())
                .setParameter(3, nueva_mov.getMovilizacionPK().getIdResponsableuc())
                .setParameter(4, nueva_mov.getMovilizacionPK().getIdResponsableur())
                .setParameter(5, nueva_mov.getMovilizacionPK().getIdActivo())
                .setParameter(6, nueva_mov.getFMovilizacion())
                .setParameter(7, nueva_mov.getAprobacionc())
                .setParameter(8, nueva_mov.getAprobacionr())
                .setParameter(9, nueva_mov.getMotivo())
                .executeUpdate();
        
        //Responsable de Uso----------------------------------------------------
        
        Responsableu nuevo_responsableu = new Responsableu("ID002", "Responsableu8");
        em.createNativeQuery("INSERT INTO responsableu (id_responsableu, nombre) VALUES (?, ?)")
                .setParameter(1, nuevo_responsableu.getIdResponsableu())
                .setParameter(2, nuevo_responsableu.getNombre())
                .executeUpdate();
        
        em.createNamedQuery("Responsableu.modificar", Responsableu.class)
                .setParameter(1, nuevo_responsableu.getIdResponsableu()) //ID del responsable a modificar
                .setParameter(2, "ID002") //ID nuevo
                .setParameter(3, "Responsableu5") //Nombre nuevo
                .executeUpdate();
        
        em.createNamedQuery("Responsableu.borrar", Responsableu.class)
                .setParameter(1, nuevo_responsableu.getIdResponsableu()) //ID del responsable a borrar
                .executeUpdate();
        
        //Unidad Operativa------------------------------------------------------
        
        UnidadOperativa nuevo_unidad = new UnidadOperativa("Uni6", "Resp8", "11/12/20");
        em.createNativeQuery("INSERT INTO unidad_operativa (id_unidad, id_responsableu, fecha_ini) VALUES (?, ?, ?)")
                .setParameter(1, nuevo_unidad.getIdUnidad())
                .setParameter(2, nuevo_unidad.getIdResponsablep())
                .setParameter(3, nuevo_unidad.getFechaIni())
                .executeUpdate();
        
        em.createNamedQuery("UnidadOperativa.modificar", UnidadOperativa.class)
                .setParameter(1, nuevo_unidad.getIdUnidad()) //ID de la unidad a modificar
                .setParameter(2, "Uni2") //ID de unidad nuevo
                .setParameter(3, "Resp5") //Id de responsable nuevo
                .setParameter(4, "05/05/20") //Fecha de inicio nueva
                .executeUpdate();
        
        em.createNamedQuery("UnidadOperativa.borrar", UnidadOperativa.class)
                .setParameter(1, nuevo_unidad.getIdUnidad()) //ID de la unidad a borrar
                .executeUpdate();*/
        
        /*Responsableu nuevo_responsableu = new Responsableu("ID008", "Responsableu12");
        em.createNativeQuery("INSERT INTO responsableu (id_responsableu, nombre) VALUES (?, ?)")
                .setParameter(1, nuevo_responsableu.getIdResponsableu())
                .setParameter(2, nuevo_responsableu.getNombre())
                .executeUpdate();*/
        
        /*TypedQuery<Responsableu> query_resp = em.createNamedQuery("Responsableu.findAll", Responsableu.class);
        List<Responsableu> lista = query_resp.getResultList();
        for (int i=0; i<lista.size(); i++)
        {
            System.out.println(lista.get(i).getIdResponsableu() + " " + lista.get(i).getNombre());
        }*/
        
        em.flush();
        datosTransaccion.commit();
        em.close();
    }
}