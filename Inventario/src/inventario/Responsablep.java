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
@Table(name = "responsablep")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsablep.findAll", query = "SELECT r FROM Responsablep r")
    , @NamedQuery(name = "Responsablep.findByIdResponsablep", query = "SELECT r FROM Responsablep r WHERE r.idResponsablep = :idResponsablep")
    , @NamedQuery(name = "Responsablep.findByNombre", query = "SELECT r FROM Responsablep r WHERE r.nombre = :nombre")})
public class Responsablep implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_responsablep")
    private String idResponsablep;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsablep")
    private Collection<Iventario> iventarioCollection;

    public Responsablep() {
    }

    public Responsablep(String idResponsablep) {
        this.idResponsablep = idResponsablep;
    }

    public Responsablep(String idResponsablep, String nombre) {
        this.idResponsablep = idResponsablep;
        this.nombre = nombre;
    }

    public String getIdResponsablep() {
        return idResponsablep;
    }

    public void setIdResponsablep(String idResponsablep) {
        this.idResponsablep = idResponsablep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Iventario> getIventarioCollection() {
        return iventarioCollection;
    }

    public void setIventarioCollection(Collection<Iventario> iventarioCollection) {
        this.iventarioCollection = iventarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResponsablep != null ? idResponsablep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsablep)) {
            return false;
        }
        Responsablep other = (Responsablep) object;
        if ((this.idResponsablep == null && other.idResponsablep != null) || (this.idResponsablep != null && !this.idResponsablep.equals(other.idResponsablep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Responsablep[ idResponsablep=" + idResponsablep + " ]";
    }
    
}
