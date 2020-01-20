/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexis Rosas
 */
@Entity
@Table(name = "componente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Componente.findAll", query = "SELECT c FROM Componente c")
    , @NamedQuery(name = "Componente.findByIdActivo", query = "SELECT c FROM Componente c WHERE c.componentePK.idActivo = :idActivo")
    , @NamedQuery(name = "Componente.findByNombre", query = "SELECT c FROM Componente c WHERE c.componentePK.nombre = :nombre")
    , @NamedQuery(name = "Componente.findByIdComponente", query = "SELECT c FROM Componente c WHERE c.idComponente = :idComponente")
    , @NamedQuery(name = "Componente.modificar", query = "UPDATE Componente c SET c.componentePK.idActivo = ?3, c.componentePK.nombre = ?4, c.idComponente = ?5 WHERE (c.componentePK.idActivo = ?1 AND c.componentePK.nombre = ?2)")
    , @NamedQuery(name = "Componente.borrar", query = "DELETE FROM Componente c WHERE (c.componentePK.idActivo = ?1 AND c.componentePK.nombre = ?2)")})
public class Componente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComponentePK componentePK;
    @Column(name = "id_componente")
    private String idComponente;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ActivoTangible activoTangible;

    public Componente() {
    }

    public Componente(ComponentePK componentePK) {
        this.componentePK = componentePK;
    }

    public Componente(String idActivo, String nombre) {
        this.componentePK = new ComponentePK(idActivo, nombre);
    }

    public ComponentePK getComponentePK() {
        return componentePK;
    }

    public void setComponentePK(ComponentePK componentePK) {
        this.componentePK = componentePK;
    }

    public String getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(String idComponente) {
        this.idComponente = idComponente;
    }

    public ActivoTangible getActivoTangible() {
        return activoTangible;
    }

    public void setActivoTangible(ActivoTangible activoTangible) {
        this.activoTangible = activoTangible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (componentePK != null ? componentePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componente)) {
            return false;
        }
        Componente other = (Componente) object;
        if ((this.componentePK == null && other.componentePK != null) || (this.componentePK != null && !this.componentePK.equals(other.componentePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Componente[ componentePK=" + componentePK + " ]";
    }
    
}
