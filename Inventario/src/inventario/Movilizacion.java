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
@Table(name = "movilizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movilizacion.findAll", query = "SELECT m FROM Movilizacion m")
    , @NamedQuery(name = "Movilizacion.findByIdUnidadc", query = "SELECT m FROM Movilizacion m WHERE m.movilizacionPK.idUnidadc = :idUnidadc")
    , @NamedQuery(name = "Movilizacion.findByIdUnidadr", query = "SELECT m FROM Movilizacion m WHERE m.movilizacionPK.idUnidadr = :idUnidadr")
    , @NamedQuery(name = "Movilizacion.findByIdResponsableuc", query = "SELECT m FROM Movilizacion m WHERE m.movilizacionPK.idResponsableuc = :idResponsableuc")
    , @NamedQuery(name = "Movilizacion.findByIdResponsableur", query = "SELECT m FROM Movilizacion m WHERE m.movilizacionPK.idResponsableur = :idResponsableur")
    , @NamedQuery(name = "Movilizacion.findByIdActivo", query = "SELECT m FROM Movilizacion m WHERE m.movilizacionPK.idActivo = :idActivo")
    , @NamedQuery(name = "Movilizacion.findByFMovilizacion", query = "SELECT m FROM Movilizacion m WHERE m.fMovilizacion = :fMovilizacion")
    , @NamedQuery(name = "Movilizacion.findByAprobacionc", query = "SELECT m FROM Movilizacion m WHERE m.aprobacionc = :aprobacionc")
    , @NamedQuery(name = "Movilizacion.findByAprobacionr", query = "SELECT m FROM Movilizacion m WHERE m.aprobacionr = :aprobacionr")
    , @NamedQuery(name = "Movilizacion.findByMotivo", query = "SELECT m FROM Movilizacion m WHERE m.motivo = :motivo")})
public class Movilizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovilizacionPK movilizacionPK;
    @Basic(optional = false)
    @Column(name = "f_movilizacion")
    private String fMovilizacion;
    @Basic(optional = false)
    @Column(name = "aprobacionc")
    private String aprobacionc;
    @Basic(optional = false)
    @Column(name = "aprobacionr")
    private String aprobacionr;
    @Basic(optional = false)
    @Column(name = "motivo")
    private String motivo;
    @JoinColumn(name = "id_activo", referencedColumnName = "id_activo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Activo activo;
    @JoinColumn(name = "id_responsableuc", referencedColumnName = "id_responsableu", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Responsableu responsableu;
    @JoinColumn(name = "id_responsableur", referencedColumnName = "id_responsableu", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Responsableu responsableu1;
    @JoinColumn(name = "id_unidadc", referencedColumnName = "id_unidad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UnidadOperativa unidadOperativa;
    @JoinColumn(name = "id_unidadr", referencedColumnName = "id_unidad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UnidadOperativa unidadOperativa1;

    public Movilizacion() {
    }

    public Movilizacion(MovilizacionPK movilizacionPK) {
        this.movilizacionPK = movilizacionPK;
    }

    public Movilizacion(MovilizacionPK movilizacionPK, String fMovilizacion, String aprobacionc, String aprobacionr, String motivo) {
        this.movilizacionPK = movilizacionPK;
        this.fMovilizacion = fMovilizacion;
        this.aprobacionc = aprobacionc;
        this.aprobacionr = aprobacionr;
        this.motivo = motivo;
    }

    public Movilizacion(String idUnidadc, String idUnidadr, String idResponsableuc, String idResponsableur, String idActivo) {
        this.movilizacionPK = new MovilizacionPK(idUnidadc, idUnidadr, idResponsableuc, idResponsableur, idActivo);
    }

    public MovilizacionPK getMovilizacionPK() {
        return movilizacionPK;
    }

    public void setMovilizacionPK(MovilizacionPK movilizacionPK) {
        this.movilizacionPK = movilizacionPK;
    }

    public String getFMovilizacion() {
        return fMovilizacion;
    }

    public void setFMovilizacion(String fMovilizacion) {
        this.fMovilizacion = fMovilizacion;
    }

    public String getAprobacionc() {
        return aprobacionc;
    }

    public void setAprobacionc(String aprobacionc) {
        this.aprobacionc = aprobacionc;
    }

    public String getAprobacionr() {
        return aprobacionr;
    }

    public void setAprobacionr(String aprobacionr) {
        this.aprobacionr = aprobacionr;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public Responsableu getResponsableu() {
        return responsableu;
    }

    public void setResponsableu(Responsableu responsableu) {
        this.responsableu = responsableu;
    }

    public Responsableu getResponsableu1() {
        return responsableu1;
    }

    public void setResponsableu1(Responsableu responsableu1) {
        this.responsableu1 = responsableu1;
    }

    public UnidadOperativa getUnidadOperativa() {
        return unidadOperativa;
    }

    public void setUnidadOperativa(UnidadOperativa unidadOperativa) {
        this.unidadOperativa = unidadOperativa;
    }

    public UnidadOperativa getUnidadOperativa1() {
        return unidadOperativa1;
    }

    public void setUnidadOperativa1(UnidadOperativa unidadOperativa1) {
        this.unidadOperativa1 = unidadOperativa1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movilizacionPK != null ? movilizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movilizacion)) {
            return false;
        }
        Movilizacion other = (Movilizacion) object;
        if ((this.movilizacionPK == null && other.movilizacionPK != null) || (this.movilizacionPK != null && !this.movilizacionPK.equals(other.movilizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.Movilizacion[ movilizacionPK=" + movilizacionPK + " ]";
    }
    
}
