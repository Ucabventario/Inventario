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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "unidad_operativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadOperativa.findAll", query = "SELECT u FROM UnidadOperativa u")
    , @NamedQuery(name = "UnidadOperativa.findByIdUnidad", query = "SELECT u FROM UnidadOperativa u WHERE u.idUnidad = :idUnidad")
    , @NamedQuery(name = "UnidadOperativa.findByIdResponsablep", query = "SELECT u FROM UnidadOperativa u WHERE u.idResponsablep = :idResponsablep")
    , @NamedQuery(name = "UnidadOperativa.findByFechaIni", query = "SELECT u FROM UnidadOperativa u WHERE u.fechaIni = :fechaIni")
    , @NamedQuery(name = "UnidadOperativa.modificar", query = "UPDATE UnidadOperativa u SET u.idUnidad = ?2, u.idResponsablep = ?3, u.fechaIni = ?4 WHERE u.idUnidad = ?1")
    , @NamedQuery(name = "UnidadOperativa.borrar", query = "DELETE FROM UnidadOperativa u WHERE u.idUnidad = ?1")})
public class UnidadOperativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_unidad")
    private String idUnidad;
    @Basic(optional = false)
    @Column(name = "id_responsablep")
    private String idResponsablep;
    @Basic(optional = false)
    @Column(name = "fecha_ini")
    private String fechaIni;
    @ManyToMany(mappedBy = "unidadOperativaCollection")
    private Collection<Activo> activoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadOperativa")
    private Collection<Iventario> iventarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadOperativa")
    private Collection<Movilizacion> movilizacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadOperativa1")
    private Collection<Movilizacion> movilizacionCollection1;
    @JoinColumn(name = "id_sede", referencedColumnName = "id_sede")
    @ManyToOne(optional = false)
    private Sede idSede;

    public UnidadOperativa() {
    }

    public UnidadOperativa(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public UnidadOperativa(String idUnidad, String idResponsablep, String fechaIni) {
        this.idUnidad = idUnidad;
        this.idResponsablep = idResponsablep;
        this.fechaIni = fechaIni;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdResponsablep() {
        return idResponsablep;
    }

    public void setIdResponsablep(String idResponsablep) {
        this.idResponsablep = idResponsablep;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    @XmlTransient
    public Collection<Activo> getActivoCollection() {
        return activoCollection;
    }

    public void setActivoCollection(Collection<Activo> activoCollection) {
        this.activoCollection = activoCollection;
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

    @XmlTransient
    public Collection<Movilizacion> getMovilizacionCollection1() {
        return movilizacionCollection1;
    }

    public void setMovilizacionCollection1(Collection<Movilizacion> movilizacionCollection1) {
        this.movilizacionCollection1 = movilizacionCollection1;
    }

    public Sede getIdSede() {
        return idSede;
    }

    public void setIdSede(Sede idSede) {
        this.idSede = idSede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadOperativa)) {
            return false;
        }
        UnidadOperativa other = (UnidadOperativa) object;
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.UnidadOperativa[ idUnidad=" + idUnidad + " ]";
    }
    
}
