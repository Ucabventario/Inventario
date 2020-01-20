/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexis Rosas
 */
@Entity
@Table(name = "activo_tangible")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActivoTangible.findAll", query = "SELECT a FROM ActivoTangible a")
    , @NamedQuery(name = "ActivoTangible.findByIdActivo", query = "SELECT a FROM ActivoTangible a WHERE a.idActivo = :idActivo")
    , @NamedQuery(name = "ActivoTangible.findByProveedor", query = "SELECT a FROM ActivoTangible a WHERE a.proveedor = :proveedor")
    , @NamedQuery(name = "ActivoTangible.findByNumOrden", query = "SELECT a FROM ActivoTangible a WHERE a.numOrden = :numOrden")
    , @NamedQuery(name = "ActivoTangible.findByNumFactura", query = "SELECT a FROM ActivoTangible a WHERE a.numFactura = :numFactura")
    , @NamedQuery(name = "ActivoTangible.findByPlazoGarantia", query = "SELECT a FROM ActivoTangible a WHERE a.plazoGarantia = :plazoGarantia")
    , @NamedQuery(name = "ActivoTangible.findByStatus", query = "SELECT a FROM ActivoTangible a WHERE a.status = :status")
    , @NamedQuery(name = "ActivoTangible.modificar", query = "UPDATE ActivoTangible a SET a.idActivo = ?2, a.proveedor = ?3, a.numOrden = ?4, a.numFactura = ?5, a.plazoGarantia = ?6, a.status = ?7 WHERE a.idActivo = ?1")
    , @NamedQuery(name = "ActivoTangible.borrar", query = "DELETE FROM ActivoTangible a WHERE a.idActivo = ?1")})
public class ActivoTangible implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "proveedor")
    private String proveedor;
    @Basic(optional = false)
    @Column(name = "num_orden")
    private String numOrden;
    @Basic(optional = false)
    @Column(name = "num_factura")
    private String numFactura;
    @Basic(optional = false)
    @Column(name = "plazo_garantia")
    private String plazoGarantia;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Activo activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activoTangible")
    private Collection<Componente> componenteCollection;

    public ActivoTangible() {
    }

    public ActivoTangible(String idActivo) {
        this.idActivo = idActivo;
    }

    public ActivoTangible(String idActivo, String proveedor, String numOrden, String numFactura, String plazoGarantia, String status) {
        this.idActivo = idActivo;
        this.proveedor = proveedor;
        this.numOrden = numOrden;
        this.numFactura = numFactura;
        this.plazoGarantia = plazoGarantia;
        this.status = status;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getPlazoGarantia() {
        return plazoGarantia;
    }

    public void setPlazoGarantia(String plazoGarantia) {
        this.plazoGarantia = plazoGarantia;
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

    @XmlTransient
    public Collection<Componente> getComponenteCollection() {
        return componenteCollection;
    }

    public void setComponenteCollection(Collection<Componente> componenteCollection) {
        this.componenteCollection = componenteCollection;
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
        if (!(object instanceof ActivoTangible)) {
            return false;
        }
        ActivoTangible other = (ActivoTangible) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.ActivoTangible[ idActivo=" + idActivo + " ]";
    }
    
}
