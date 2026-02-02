package GastosFamiliares.Modelo.Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
@Entity(name = "Fuentes")
public class Fuente implements Serializable {
    // Reconstruiremos el objeto de tipo fuente
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // 'autoincremental
    @Column(length = 40, nullable = false, unique = true)
    private String nombre;
    private String descripcion;
    @Column(nullable = false)
    private LocalDate fechaRegistro;
    @Column(unique = true)
    private String icono;
    // ' relaciones
    @ManyToOne(optional = true)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToMany()
    private List<Ingreso> ingresos;

    public Fuente() {

    }

    public Fuente(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Fuente(int id, String nombre, String descripcion,
            LocalDate fechaRegistro, String icono, Usuario usuario,
            List<Ingreso> ingresos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.icono = icono;
        this.usuario = usuario;
        this.ingresos = ingresos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final Fuente other = (Fuente) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    @Override
    public String toString() {
        return "Fuente{" + "id=" + id + ", nombre=" + nombre
                + ", descripcion=" + descripcion + ", fechaRegistro="
                + fechaRegistro + ", icono=" + icono + ", usuario=" + usuario
                + ", ingresos=" + ingresos + '}';
    }

}
