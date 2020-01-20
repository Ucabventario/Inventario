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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexis Rosas
 */
@Entity
@Table(name = "sede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s")
    , @NamedQuery(name = "Sede.findByIdSede", query = "SELECT s FROM Sede s WHERE s.idSede = :idSede")
    , @NamedQuery(name = "Sede.findByDescripcion", query = "SELECT s FROM Sede s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Sede.findByUbicacion", query = "SELECT s FROM Sede s WHERE s.ubicacion = :ubicacion")
    , @NamedQuery(name = "Sede.ingresar", query = "SELECT s.idSede"
            + " FROM Sede s, Activo a, Distribuido d, Responsableu r"
            + " WHERE r.idResponsableu = ?1"
            + " AND a.idResponsableu = r.idResponsableu"
            + " AND d.distribuidoPK.idActivo = a.idActivo"
            + " AND s.idSede = d.distribuidoPK.idSede")})
public class Sede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_sede")
    private String idSede;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ubicacion")
    private String ubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
    private Collection<Distribuido> distribuidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSede")
    private Collection<UnidadOperativa> unidadOperativaCollection;

    public Sede() {
    }

    public Sede(String idSede) {
        this.idSede = idSede;
    }

    public Sede(String idSede, String descripcion, String ubicacion) {
        this.idSede = idSede;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @XmlTransient
    public Collection<Distribuido> getDistribuidoCollection() {
        return distribuidoCollection;
    }

    public void setDistribuidoCollection(Collection<Distribuido> distribuidoCollection) {
        this.distribuidoCollection = distribuidoCollection;
    }

    @XmlTransient
    public Collection<UnidadOperativa> getUnidadOperativaCollection() {
        return unidadOperativaCollection;
    }

    public void setUnidadOperativaCollection(Collection<UnidadOperativa> unidadOperativaCollection) {
        this.unidadOperativaCollection = unidadOperativaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSede != null ? idSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.idSede == null && other.idSede != null) || (this.idSede != null && !this.idSede.equals(other.idSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Sede[ idSede=" + idSede + " ]";
    }
    
}
