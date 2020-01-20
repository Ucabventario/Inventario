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
public class ComponentePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_activo")
    private String idActivo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    public ComponentePK() {
    }

    public ComponentePK(String idActivo, String nombre) {
        this.idActivo = idActivo;
        this.nombre = nombre;
    }

    public String getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(String idActivo) {
        this.idActivo = idActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivo != null ? idActivo.hashCode() : 0);
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComponentePK)) {
            return false;
        }
        ComponentePK other = (ComponentePK) object;
        if ((this.idActivo == null && other.idActivo != null) || (this.idActivo != null && !this.idActivo.equals(other.idActivo))) {
            return false;
        }
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.ComponentePK[ idActivo=" + idActivo + ", nombre=" + nombre + " ]";
    }
    
}
