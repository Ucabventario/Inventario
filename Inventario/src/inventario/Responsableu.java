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
@Table(name = "responsableu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsableu.findAll", query = "SELECT r FROM Responsableu r")
    , @NamedQuery(name = "Responsableu.findByIdResponsableu", query = "SELECT r FROM Responsableu r WHERE r.idResponsableu = :idResponsableu")
    , @NamedQuery(name = "Responsableu.findByNombre", query = "SELECT r FROM Responsableu r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Responsableu.modificar", query = "UPDATE Responsableu r SET r.idResponsableu = ?2, r.nombre = ?3 WHERE r.idResponsableu = ?1")
    , @NamedQuery(name = "Responsableu.borrar", query = "DELETE FROM Responsableu r WHERE r.idResponsableu = ?1")})
public class Responsableu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_responsableu")
    private String idResponsableu;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsableu")
    private Collection<Iventario> iventarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsableu")
    private Collection<Movilizacion> movilizacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsableu1")
    private Collection<Movilizacion> movilizacionCollection1;

    public Responsableu() {
    }

    public Responsableu(String idResponsableu) {
        this.idResponsableu = idResponsableu;
    }

    public Responsableu(String idResponsableu, String nombre) {
        this.idResponsableu = idResponsableu;
        this.nombre = nombre;
    }

    public String getIdResponsableu() {
        return idResponsableu;
    }

    public void setIdResponsableu(String idResponsableu) {
        this.idResponsableu = idResponsableu;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResponsableu != null ? idResponsableu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsableu)) {
            return false;
        }
        Responsableu other = (Responsableu) object;
        if ((this.idResponsableu == null && other.idResponsableu != null) || (this.idResponsableu != null && !this.idResponsableu.equals(other.idResponsableu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Responsableu[ idResponsableu=" + idResponsableu + " ]";
    }
    
}
