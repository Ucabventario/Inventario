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
public class IventarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "id_unidad")
    private String idUnidad;
    @Basic(optional = false)
    @Column(name = "id_responsableu")
    private String idResponsableu;
    @Basic(optional = false)
    @Column(name = "id_responsablep")
    private String idResponsablep;

    public IventarioPK() {
    }

    public IventarioPK(String idActivo, String idUnidad, String idResponsableu, String idResponsablep) {
        this.idActivo = idActivo;
        this.idUnidad = idUnidad;
        this.idResponsableu = idResponsableu;
        this.idResponsablep = idResponsablep;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdResponsableu() {
        return idResponsableu;
    }

    public void setIdResponsableu(String idResponsableu) {
        this.idResponsableu = idResponsableu;
    }

    public String getIdResponsablep() {
        return idResponsablep;
    }

    public void setIdResponsablep(String idResponsablep) {
        this.idResponsablep = idResponsablep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivo != null ? idActivo.hashCode() : 0);
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        hash += (idResponsableu != null ? idResponsableu.hashCode() : 0);
        hash += (idResponsablep != null ? idResponsablep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IventarioPK)) {
            return false;
        }
        IventarioPK other = (IventarioPK) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        if ((this.idResponsableu == null && other.idResponsableu != null) || (this.idResponsableu != null && !this.idResponsableu.equals(other.idResponsableu))) {
            return false;
        }
        if ((this.idResponsablep == null && other.idResponsablep != null) || (this.idResponsablep != null && !this.idResponsablep.equals(other.idResponsablep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.IventarioPK[ idActivo=" + idActivo + ", idUnidad=" + idUnidad + ", idResponsableu=" + idResponsableu + ", idResponsablep=" + idResponsablep + " ]";
    }
    
}
