/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "distribuido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distribuido.findAll", query = "SELECT d FROM Distribuido d")
    , @NamedQuery(name = "Distribuido.findByIdSede", query = "SELECT d FROM Distribuido d WHERE d.distribuidoPK.idSede = :idSede")
    , @NamedQuery(name = "Distribuido.findByIdActivo", query = "SELECT d FROM Distribuido d WHERE d.distribuidoPK.idActivo = :idActivo")
    , @NamedQuery(name = "Distribuido.findByFIncorp", query = "SELECT d FROM Distribuido d WHERE d.fIncorp = :fIncorp")
    , @NamedQuery(name = "Distribuido.findByFDesincorp", query = "SELECT d FROM Distribuido d WHERE d.fDesincorp = :fDesincorp")})
public class Distribuido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DistribuidoPK distribuidoPK;
    @Basic(optional = false)
    @Column(name = "f_incorp")
    private String fIncorp;
    @Basic(optional = false)
    @Column(name = "f_desincorp")
    private String fDesincorp;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Activo activo;
    @JoinColumn(name = "id_sede", referencedColumnName = "id_sede", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sede sede;

    public Distribuido() {
    }

    public Distribuido(DistribuidoPK distribuidoPK) {
        this.distribuidoPK = distribuidoPK;
    }

    public Distribuido(DistribuidoPK distribuidoPK, String fIncorp, String fDesincorp) {
        this.distribuidoPK = distribuidoPK;
        this.fIncorp = fIncorp;
        this.fDesincorp = fDesincorp;
    }

    public Distribuido(String idSede, String idActivo) {
        this.distribuidoPK = new DistribuidoPK(idSede, idActivo);
    }

    public DistribuidoPK getDistribuidoPK() {
        return distribuidoPK;
    }

    public void setDistribuidoPK(DistribuidoPK distribuidoPK) {
        this.distribuidoPK = distribuidoPK;
    }

    public String getFIncorp() {
        return fIncorp;
    }

    public void setFIncorp(String fIncorp) {
        this.fIncorp = fIncorp;
    }

    public String getFDesincorp() {
        return fDesincorp;
    }

    public void setFDesincorp(String fDesincorp) {
        this.fDesincorp = fDesincorp;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (distribuidoPK != null ? distribuidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distribuido)) {
            return false;
        }
        Distribuido other = (Distribuido) object;
        if ((this.distribuidoPK == null && other.distribuidoPK != null) || (this.distribuidoPK != null && !this.distribuidoPK.equals(other.distribuidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Distribuido[ distribuidoPK=" + distribuidoPK + " ]";
    }
    
}
