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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "activo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activo.findAll", query = "SELECT a FROM Activo a")
    , @NamedQuery(name = "Activo.findByIdActivo", query = "SELECT a FROM Activo a WHERE a.idActivo = :idActivo")
    , @NamedQuery(name = "Activo.findByIdResponsableu", query = "SELECT a FROM Activo a WHERE a.idResponsableu = :idResponsableu")
    , @NamedQuery(name = "Activo.findByDescripcion", query = "SELECT a FROM Activo a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Activo.modificar", query = "UPDATE Activo a SET a.idActivo = ?2, a.idResponsableu = ?3, a.descripcion = ?4 WHERE a.idActivo = ?1")
    , @NamedQuery(name = "Activo.borrar", query = "DELETE FROM Activo a WHERE a.idActivo = ?1")})
public class Activo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "id_responsableu")
    private String idResponsableu;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinTable(name = "asignado", joinColumns = {
        @JoinColumn(name = "id_activo", referencedColumnName = "id_activo")}, inverseJoinColumns = {
        @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad")})
    @ManyToMany
    private Collection<UnidadOperativa> unidadOperativaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activo")
    private Collection<Iventario> iventarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activo")
    private Collection<Movilizacion> movilizacionCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "activo")
    private ActivoTangible activoTangible;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "activo")
    private ActivoInmueble activoInmueble;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activo")
    private Collection<Distribuido> distribuidoCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "activo")
    private ActivoIntangible activoIntangible;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "activo")
    private ActivoNatural activoNatural;

    public Activo() {
    }

    public Activo(String idActivo) {
        this.idActivo = idActivo;
    }

    public Activo(String idActivo, String idResponsableu, String descripcion) {
        this.idActivo = idActivo;
        this.idResponsableu = idResponsableu;
        this.descripcion = descripcion;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getIdResponsableu() {
        return idResponsableu;
    }

    public void setIdResponsableu(String idResponsableu) {
        this.idResponsableu = idResponsableu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<UnidadOperativa> getUnidadOperativaCollection() {
        return unidadOperativaCollection;
    }

    public void setUnidadOperativaCollection(Collection<UnidadOperativa> unidadOperativaCollection) {
        this.unidadOperativaCollection = unidadOperativaCollection;
    }

    @XmlTransient
    public Collection<Iventario> getIventarioCollection() {
        return iventarioCollection;
    }

    public void setIventarioCollection(Collection<Iventario> iventarioCollection) {
        this.iventarioCollection = iventarioCollection;
    }

    @XmlTransient
    public Collection<Movilizacion> getMovilizacionCollection() {
        return movilizacionCollection;
    }

    public void setMovilizacionCollection(Collection<Movilizacion> movilizacionCollection) {
        this.movilizacionCollection = movilizacionCollection;
    }

    public ActivoTangible getActivoTangible() {
        return activoTangible;
    }

    public void setActivoTangible(ActivoTangible activoTangible) {
        this.activoTangible = activoTangible;
    }

    public ActivoInmueble getActivoInmueble() {
        return activoInmueble;
    }

    public void setActivoInmueble(ActivoInmueble activoInmueble) {
        this.activoInmueble = activoInmueble;
    }

    @XmlTransient
    public Collection<Distribuido> getDistribuidoCollection() {
        return distribuidoCollection;
    }

    public void setDistribuidoCollection(Collection<Distribuido> distribuidoCollection) {
        this.distribuidoCollection = distribuidoCollection;
    }

    public ActivoIntangible getActivoIntangible() {
        return activoIntangible;
    }

    public void setActivoIntangible(ActivoIntangible activoIntangible) {
        this.activoIntangible = activoIntangible;
    }

    public ActivoNatural getActivoNatural() {
        return activoNatural;
    }

    public void setActivoNatural(ActivoNatural activoNatural) {
        this.activoNatural = activoNatural;
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
        if (!(object instanceof Activo)) {
            return false;
        }
        Activo other = (Activo) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Activo[ idActivo=" + idActivo + " ]";
    }
    
}
