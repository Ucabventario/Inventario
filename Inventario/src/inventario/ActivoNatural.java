/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexis Rosas
 */
@Entity
@Table(name = "activo_natural")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActivoNatural.findAll", query = "SELECT a FROM ActivoNatural a")
    , @NamedQuery(name = "ActivoNatural.findByIdActivo", query = "SELECT a FROM ActivoNatural a WHERE a.idActivo = :idActivo")
    , @NamedQuery(name = "ActivoNatural.findByNombreC", query = "SELECT a FROM ActivoNatural a WHERE a.nombreC = :nombreC")
    , @NamedQuery(name = "ActivoNatural.findByNombreV", query = "SELECT a FROM ActivoNatural a WHERE a.nombreV = :nombreV")
    , @NamedQuery(name = "ActivoNatural.findByFrutal", query = "SELECT a FROM ActivoNatural a WHERE a.frutal = :frutal")
    , @NamedQuery(name = "ActivoNatural.findByFloracion", query = "SELECT a FROM ActivoNatural a WHERE a.floracion = :floracion")
    , @NamedQuery(name = "ActivoNatural.findByFPlantacion", query = "SELECT a FROM ActivoNatural a WHERE a.fPlantacion = :fPlantacion")
    , @NamedQuery(name = "ActivoNatural.findByOrigen", query = "SELECT a FROM ActivoNatural a WHERE a.origen = :origen")
    , @NamedQuery(name = "ActivoNatural.findByStatus", query = "SELECT a FROM ActivoNatural a WHERE a.status = :status")
    , @NamedQuery(name = "ActivoNatural.findByUbicacion", query = "SELECT a FROM ActivoNatural a WHERE a.ubicacion = :ubicacion")
    , @NamedQuery(name = "ActivoNatural.modificar", query = "UPDATE ActivoNatural a SET a.idActivo = ?2, a.nombreC = ?3, a.nombreV = ?4, a.frutal = ?5, a.floracion = ?6, a.fPlantacion = ?7, a.origen = ?8, a.status = ?9, a.ubicacion = ?10 WHERE a.idActivo = ?1")
    , @NamedQuery(name = "ActivoNatural.borrar", query = "DELETE FROM ActivoNatural a WHERE a.idActivo = ?1")})
public class ActivoNatural implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "nombre_c")
    private String nombreC;
    @Basic(optional = false)
    @Column(name = "nombre_v")
    private String nombreV;
    @Basic(optional = false)
    @Column(name = "frutal")
    private String frutal;
    @Basic(optional = false)
    @Column(name = "floracion")
    private String floracion;
    @Basic(optional = false)
    @Column(name = "f_plantacion")
    private String fPlantacion;
    @Basic(optional = false)
    @Column(name = "origen")
    private String origen;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "ubicacion")
    private String ubicacion;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Activo activo;

    public ActivoNatural() {
    }

    public ActivoNatural(String idActivo) {
        this.idActivo = idActivo;
    }

    public ActivoNatural(String idActivo, String nombreC, String nombreV, String frutal, String floracion, String fPlantacion, String origen, String status, String ubicacion) {
        this.idActivo = idActivo;
        this.nombreC = nombreC;
        this.nombreV = nombreV;
        this.frutal = frutal;
        this.floracion = floracion;
        this.fPlantacion = fPlantacion;
        this.origen = origen;
        this.status = status;
        this.ubicacion = ubicacion;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getFrutal() {
        return frutal;
    }

    public void setFrutal(String frutal) {
        this.frutal = frutal;
    }

    public String getFloracion() {
        return floracion;
    }

    public void setFloracion(String floracion) {
        this.floracion = floracion;
    }

    public String getFPlantacion() {
        return fPlantacion;
    }

    public void setFPlantacion(String fPlantacion) {
        this.fPlantacion = fPlantacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivo != null ? idActivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivoNatural)) {
            return false;
        }
        ActivoNatural other = (ActivoNatural) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.ActivoNatural[ idActivo=" + idActivo + " ]";
    }
    
}
