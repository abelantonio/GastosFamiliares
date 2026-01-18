package GastosFamiliares.Modelo.Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class Gasto implements Serializable {

    private int id; // 'autoincremental
    private String nombre;
    private float valor;
    private String descripcion;
    private LocalDateTime fechaHoraRegistro;
    private LocalDate fechaRegistro;
    // ' relaciones
    private List<Categoria> categorias;
    private Miembro miembro;
    private Aporte aporte; // ' puede ser null

    public Gasto() {

    }

    public Gasto(String nombre, float valor, LocalDate fechaRegistro,
            Miembro miembro) {
        this.nombre = nombre;
        this.valor = valor;
        this.fechaRegistro = fechaRegistro;
        this.miembro = miembro;
    }

    public Gasto(int id, String nombre, float valor, String descripcion,
            LocalDateTime fechaHoraRegistro, LocalDate fechaRegistro,
            List<Categoria> categorias, Miembro miembro, Aporte aporte) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
        this.fechaHoraRegistro = fechaHoraRegistro;
        this.fechaRegistro = fechaRegistro;
        this.categorias = categorias;
        this.miembro = miembro;
        this.aporte = aporte;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Aporte getAporte() {
        return aporte;
    }

    public void setAporte(Aporte aporte) {
        this.aporte = aporte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
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
        final Gasto other = (Gasto) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Gasto{" + "id=" + id + ", nombre=" + nombre + ", valor="
                + valor + ", descripcion=" + descripcion
                + ", fechaHoraRegistro=" + fechaHoraRegistro
                + ", fechaRegistro=" + fechaRegistro + ", categorias="
                + (categorias != null ? categorias.size() : 0) + ", miembro=" + miembro + ", aporte="
                + aporte + '}';
    }
}
