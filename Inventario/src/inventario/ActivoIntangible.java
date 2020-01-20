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
@Table(name = "activo_intangible")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActivoIntangible.findAll", query = "SELECT a FROM ActivoIntangible a")
    , @NamedQuery(name = "ActivoIntangible.findByIdActivo", query = "SELECT a FROM ActivoIntangible a WHERE a.idActivo = :idActivo")
    , @NamedQuery(name = "ActivoIntangible.findByFechaCad", query = "SELECT a FROM ActivoIntangible a WHERE a.fechaCad = :fechaCad")
    , @NamedQuery(name = "ActivoIntangible.findByCompartida", query = "SELECT a FROM ActivoIntangible a WHERE a.compartida = :compartida")
    , @NamedQuery(name = "ActivoIntangible.findByStatus", query = "SELECT a FROM ActivoIntangible a WHERE a.status = :status")
    , @NamedQuery(name = "ActivoIntangible.modificar", query = "UPDATE ActivoIntangible a SET a.idActivo = ?2, a.fechaCad = ?3, a.compartida = ?4, a.status = ?5 WHERE a.idActivo = ?1")
    , @NamedQuery(name = "ActivoIntangible.borrar", query = "DELETE FROM ActivoIntangible a WHERE a.idActivo = ?1")})
public class ActivoIntangible implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "fecha_cad")
    private String fechaCad;
    @Basic(optional = false)
    @Column(name = "compartida")
    private String compartida;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Activo activo;

    public ActivoIntangible() {
    }

    public ActivoIntangible(String idActivo) {
        this.idActivo = idActivo;
    }

    public ActivoIntangible(String idActivo, String fechaCad, String compartida, String status) {
        this.idActivo = idActivo;
        this.fechaCad = fechaCad;
        this.compartida = compartida;
        this.status = status;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public String getCompartida() {
        return compartida;
    }

    public void setCompartida(String compartida) {
        this.compartida = compartida;
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
        if (!(object instanceof ActivoIntangible)) {
            return false;
        }
        ActivoIntangible other = (ActivoIntangible) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.ActivoIntangible[ idActivo=" + idActivo + " ]";
    }
    
}
