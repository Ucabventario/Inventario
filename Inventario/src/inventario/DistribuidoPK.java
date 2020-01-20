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
public class DistribuidoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_sede")
    private String idSede;
    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;

    public DistribuidoPK() {
    }

    public DistribuidoPK(String idSede, String idActivo) {
        this.idSede = idSede;
        this.idActivo = idActivo;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
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
        hash += (idSede != null ? idSede.hashCode() : 0);
        hash += (idActivo != null ? idActivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistribuidoPK)) {
            return false;
        }
        DistribuidoPK other = (DistribuidoPK) object;
        if ((this.idSede == null && other.idSede != null) || (this.idSede != null && !this.idSede.equals(other.idSede))) {
            return false;
        }
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.DistribuidoPK[ idSede=" + idSede + ", idActivo=" + idActivo + " ]";
    }
    
}
