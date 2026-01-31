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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
@Entity(name = "Categorias")
public class Categoria implements Serializable {
    // Reconstruiremos el obejto de tipo categoria
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // 'autoincremental
    @Column(length = 150, nullable = false)
    private String nombre;
    private String descripcion;
    @Column(nullable = false)
    private LocalDate fechaRegistro;
    private String foto;
//   ' relaciones
    @OneToOne(optional = true)
    @JoinColumn(name = "categorias")
    private Usuario usuario;
    @OneToMany(mappedBy = "categorias")
    private List<Gasto> gastos;

    public Categoria() {
    }

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Categoria(int id, String nombre, String descripcion,
            LocalDate fechaRegistro, String foto, Usuario usuario,
            List<Gasto> gastos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.foto = foto;
        this.usuario = usuario;
        this.gastos = gastos;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.id;
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
        final Categoria other = (Categoria) obj;
        return Objects.equals(this.nombre.toLowerCase(),
                other.nombre.toLowerCase());
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombre=" + nombre
                + ", descripcion=" + descripcion + ", fechaRegistro="
                + fechaRegistro + ", foto=" + foto + ", usuario=" + usuario
                + ", gastos=" + gastos + '}';
    }
}
