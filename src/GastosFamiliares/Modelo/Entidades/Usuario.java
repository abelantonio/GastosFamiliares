package GastosFamiliares.Modelo.Entidades;

import GastosFamiliares.Modelo.Enumeraciones.RolUsuarioEnum;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class Usuario implements Serializable {

    private String codigo;
    private String password;
    private String nombre;
    private String apellido;
    private String correo;
    private RolUsuarioEnum rol; // 'administrador, miembro

    // Constructor por defecto (sin parametros)
    public Usuario() {
    }

    // Constructores con parametros
    public Usuario(String codigo, String nombre, String apellido,
            RolUsuarioEnum rol) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }

    public Usuario(String codigo, String password, String nombre,
            String apellido, String correo, RolUsuarioEnum rol) {
        this.codigo = codigo;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.rol = rol;
    }

    // Metodos get y set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setRol(RolUsuarioEnum rol) {
        this.rol = rol;
    }

    public RolUsuarioEnum getRol() {
        return rol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", password=" + password
                + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
                + correo + ", rol=" + rol + '}';
    }
}
