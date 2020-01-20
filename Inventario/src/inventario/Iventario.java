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
@Table(name = "iventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Iventario.findAll", query = "SELECT i FROM Iventario i")
    , @NamedQuery(name = "Iventario.findByIdActivo", query = "SELECT i FROM Iventario i WHERE i.iventarioPK.idActivo = :idActivo")
    , @NamedQuery(name = "Iventario.findByIdUnidad", query = "SELECT i FROM Iventario i WHERE i.iventarioPK.idUnidad = :idUnidad")
    , @NamedQuery(name = "Iventario.findByIdResponsableu", query = "SELECT i FROM Iventario i WHERE i.iventarioPK.idResponsableu = :idResponsableu")
    , @NamedQuery(name = "Iventario.findByIdResponsablep", query = "SELECT i FROM Iventario i WHERE i.iventarioPK.idResponsablep = :idResponsablep")
    , @NamedQuery(name = "Iventario.findByFInicio", query = "SELECT i FROM Iventario i WHERE i.fInicio = :fInicio")
    , @NamedQuery(name = "Iventario.findByFFin", query = "SELECT i FROM Iventario i WHERE i.fFin = :fFin")
    , @NamedQuery(name = "Iventario.findByLapso", query = "SELECT i FROM Iventario i WHERE i.lapso = :lapso")
    , @NamedQuery(name = "Iventario.findByStatus", query = "SELECT i FROM Iventario i WHERE i.status = :status")
    , @NamedQuery(name = "Iventario.findByCantidad", query = "SELECT i FROM Iventario i WHERE i.cantidad = :cantidad")
    , @NamedQuery(name = "Iventario.modificar", query = "UPDATE Iventario i SET i.iventarioPK.idActivo = ?5, i.iventarioPK.idUnidad = ?6, i.iventarioPK.idResponsableu = ?7, i.iventarioPK.idResponsablep = ?8, i.fInicio = ?9, i.fFin = ?10, i.lapso = ?11, i.status = ?12, i.cantidad = ?13 WHERE (i.iventarioPK.idActivo = ?1 AND i.iventarioPK.idUnidad = ?2 AND i.iventarioPK.idResponsableu = ?3 AND i.iventarioPK.idResponsablep = ?4)")
    , @NamedQuery(name = "Iventario.borrar", query = "DELETE FROM Iventario i WHERE (i.iventarioPK.idActivo = ?1 AND i.iventarioPK.idUnidad = ?2 AND i.iventarioPK.idResponsableu = ?3 AND i.iventarioPK.idResponsablep = ?4)")})
public class Iventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IventarioPK iventarioPK;
    @Basic(optional = false)
    @Column(name = "f_inicio")
    private String fInicio;
    @Basic(optional = false)
    @Column(name = "f_fin")
    private String fFin;
    @Basic(optional = false)
    @Column(name = "lapso")
    private String lapso;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Activo activo;
    @JoinColumn(name = "id_responsablep", referencedColumnName = "id_responsablep", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Responsablep responsablep;
    @JoinColumn(name = "id_responsableu", referencedColumnName = "id_responsableu", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Responsableu responsableu;
    @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UnidadOperativa unidadOperativa;

    public Iventario() {
    }

    public Iventario(IventarioPK iventarioPK) {
        this.iventarioPK = iventarioPK;
    }

    public Iventario(IventarioPK iventarioPK, String fInicio, String fFin, String lapso, String status, int cantidad) {
        this.iventarioPK = iventarioPK;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.lapso = lapso;
        this.status = status;
        this.cantidad = cantidad;
    }

    public Iventario(String idActivo, String idUnidad, String idResponsableu, String idResponsablep) {
        this.iventarioPK = new IventarioPK(idActivo, idUnidad, idResponsableu, idResponsablep);
    }

    public IventarioPK getIventarioPK() {
        return iventarioPK;
    }

    public void setIventarioPK(IventarioPK iventarioPK) {
        this.iventarioPK = iventarioPK;
    }

    public String getFInicio() {
        return fInicio;
    }

    public void setFInicio(String fInicio) {
        this.fInicio = fInicio;
    }

    public String getFFin() {
        return fFin;
    }

    public void setFFin(String fFin) {
        this.fFin = fFin;
    }

    public String getLapso() {
        return lapso;
    }

    public void setLapso(String lapso) {
        this.lapso = lapso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public Responsablep getResponsablep() {
        return responsablep;
    }

    public void setResponsablep(Responsablep responsablep) {
        this.responsablep = responsablep;
    }

    public Responsableu getResponsableu() {
        return responsableu;
    }

    public void setResponsableu(Responsableu responsableu) {
        this.responsableu = responsableu;
    }

    public UnidadOperativa getUnidadOperativa() {
        return unidadOperativa;
    }

    public void setUnidadOperativa(UnidadOperativa unidadOperativa) {
        this.unidadOperativa = unidadOperativa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iventarioPK != null ? iventarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Iventario)) {
            return false;
        }
        Iventario other = (Iventario) object;
        if ((this.iventarioPK == null && other.iventarioPK != null) || (this.iventarioPK != null && !this.iventarioPK.equals(other.iventarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Iventario[ iventarioPK=" + iventarioPK + " ]";
    }
    
}
