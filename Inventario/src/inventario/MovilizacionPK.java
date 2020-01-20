/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Alexis Rosas
 */
@Embeddable
public class MovilizacionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_unidadc")
    private String idUnidadc;
    @Basic(optional = false)
    @Column(name = "id_unidadr")
    private String idUnidadr;
    @Basic(optional = false)
    @Column(name = "id_responsableuc")
    private String idResponsableuc;
    @Basic(optional = false)
    @Column(name = "id_responsableur")
    private String idResponsableur;
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;

    public MovilizacionPK() {
    }

    public MovilizacionPK(String idUnidadc, String idUnidadr, String idResponsableuc, String idResponsableur, String idActivo) {
        this.idUnidadc = idUnidadc;
        this.idUnidadr = idUnidadr;
        this.idResponsableuc = idResponsableuc;
        this.idResponsableur = idResponsableur;
        this.idActivo = idActivo;
    }

    public String getIdUnidadc() {
        return idUnidadc;
    }

    public void setIdUnidadc(String idUnidadc) {
        this.idUnidadc = idUnidadc;
    }

    public String getIdUnidadr() {
        return idUnidadr;
    }

    public void setIdUnidadr(String idUnidadr) {
        this.idUnidadr = idUnidadr;
    }

    public String getIdResponsableuc() {
        return idResponsableuc;
    }

    public void setIdResponsableuc(String idResponsableuc) {
        this.idResponsableuc = idResponsableuc;
    }

    public String getIdResponsableur() {
        return idResponsableur;
    }

    public void setIdResponsableur(String idResponsableur) {
        this.idResponsableur = idResponsableur;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadc != null ? idUnidadc.hashCode() : 0);
        hash += (idUnidadr != null ? idUnidadr.hashCode() : 0);
        hash += (idResponsableuc != null ? idResponsableuc.hashCode() : 0);
        hash += (idResponsableur != null ? idResponsableur.hashCode() : 0);
        hash += (idActivo != null ? idActivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovilizacionPK)) {
            return false;
        }
        MovilizacionPK other = (MovilizacionPK) object;
        if ((this.idUnidadc == null && other.idUnidadc != null) || (this.idUnidadc != null && !this.idUnidadc.equals(other.idUnidadc))) {
            return false;
        }
        if ((this.idUnidadr == null && other.idUnidadr != null) || (this.idUnidadr != null && !this.idUnidadr.equals(other.idUnidadr))) {
            return false;
        }
        if ((this.idResponsableuc == null && other.idResponsableuc != null) || (this.idResponsableuc != null && !this.idResponsableuc.equals(other.idResponsableuc))) {
            return false;
        }
        if ((this.idResponsableur == null && other.idResponsableur != null) || (this.idResponsableur != null && !this.idResponsableur.equals(other.idResponsableur))) {
            return false;
        }
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.MovilizacionPK[ idUnidadc=" + idUnidadc + ", idUnidadr=" + idUnidadr + ", idResponsableuc=" + idResponsableuc + ", idResponsableur=" + idResponsableur + ", idActivo=" + idActivo + " ]";
    }
    
}
