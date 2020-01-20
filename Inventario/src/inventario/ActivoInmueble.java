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
@Table(name = "activo_inmueble")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActivoInmueble.findAll", query = "SELECT a FROM ActivoInmueble a")
    , @NamedQuery(name = "ActivoInmueble.findByIdActivo", query = "SELECT a FROM ActivoInmueble a WHERE a.idActivo = :idActivo")
    , @NamedQuery(name = "ActivoInmueble.findByUbicacion", query = "SELECT a FROM ActivoInmueble a WHERE a.ubicacion = :ubicacion")
    , @NamedQuery(name = "ActivoInmueble.findBySuperficie", query = "SELECT a FROM ActivoInmueble a WHERE a.superficie = :superficie")
    , @NamedQuery(name = "ActivoInmueble.findByPropiedad", query = "SELECT a FROM ActivoInmueble a WHERE a.propiedad = :propiedad")
    , @NamedQuery(name = "ActivoInmueble.findByStatus", query = "SELECT a FROM ActivoInmueble a WHERE a.status = :status")
    , @NamedQuery(name = "ActivoInmueble.modificar", query = "UPDATE ActivoInmueble a SET a.idActivo = ?2, a.ubicacion = ?3, a.superficie = ?4, a.propiedad = ?5, a.status = ?6 WHERE a.idActivo = ?1")
    , @NamedQuery(name = "ActivoInmueble.borrar", query = "DELETE FROM ActivoInmueble a WHERE a.idActivo = ?1")})
public class ActivoInmueble implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Basic(optional = false)
    @Column(name = "superficie")
    private String superficie;
    @Basic(optional = false)
    @Column(name = "propiedad")
    private String propiedad;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Activo activo;

    public ActivoInmueble() {
    }

    public ActivoInmueble(String idActivo) {
        this.idActivo = idActivo;
    }

    public ActivoInmueble(String idActivo, String ubicacion, String superficie, String propiedad, String status) {
        this.idActivo = idActivo;
        this.ubicacion = ubicacion;
        this.superficie = superficie;
        this.propiedad = propiedad;
        this.status = status;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof ActivoInmueble)) {
            return false;
        }
        ActivoInmueble other = (ActivoInmueble) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.ActivoInmueble[ idActivo=" + idActivo + " ]";
    }
    
}
