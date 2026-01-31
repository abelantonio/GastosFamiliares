package GastosFamiliares.Modelo.Entidades;

import GastosFamiliares.Modelo.Enumeraciones.RolUsuarioEnum;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
@Entity(name="Usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 0L;
    @Id
    @Column(name = "ID", length = 20)
    private String codigo;
    @Column(name = "PASSWORD", nullable = false, length = 30)
    private String password;
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Column(name = "APELLIDO", nullable = false, length = 50)
    private String apellido;
    @Column (name = "CORREO", nullable = false, unique = true, length = 70)
    private String correo;
    @Enumerated(EnumType.STRING)
    @Column(name = "ROL")
    private RolUsuarioEnum rol; // 'administrador, miembro
//  relaciones
   @OneToMany(mappedBy = "usuario")
   private List<Fuente> fuentes;
   @OneToMany(mappedBy = "usuario")
   private List<Categoria> categorias;
   @OneToMany(mappedBy = "creador")
   private List<Familia> familias;

    // Constructor por defecto (sin parametros)
    public Usuario() {
    }

    // Constructor personalizado
    public Usuario(String codigo, String nombre, String apellido,
            RolUsuarioEnum rol) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
    }
    
    // Constructor con todos los parametros
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
