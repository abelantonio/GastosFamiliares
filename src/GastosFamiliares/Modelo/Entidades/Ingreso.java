package GastosFamiliares.Modelo.Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class Ingreso implements Serializable {

    private int id;  // 'autoincremental
    private String nombre;
    private float valor;
    private String descripcion;
    private LocalDateTime fechaHoraRegistro;
    private LocalDate fechaActualRegistro;
//    ' relaciones
    private Fuente fuente;
    private Miembro miembro;
    private List<Aporte> aportes; // ' puede ser null

    public Ingreso() {

    }

    public Ingreso(String nombre, float valor, LocalDate fechaActualRegistro,
            Fuente fuente, Miembro miembro) {
        this.nombre = nombre;
        this.valor = valor;
        this.fechaActualRegistro = fechaActualRegistro;
        this.fuente = fuente;
        this.miembro = miembro;
    }

    public Ingreso(int id, String nombre, float valor, String descripcion,
            LocalDateTime fechaHoraRegistro, LocalDate fechaActualRegistro,
            Fuente fuente, Miembro miembro, List<Aporte> aportes) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
        this.fechaHoraRegistro = fechaHoraRegistro;
        this.fechaActualRegistro = fechaActualRegistro;
        this.fuente = fuente;
        this.miembro = miembro;
        this.aportes = aportes;
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

    public LocalDate getFechaActualRegistro() {
        return fechaActualRegistro;
    }

    public void setFechaActualRegistro(LocalDate fechaActualRegistro) {
        this.fechaActualRegistro = fechaActualRegistro;
    }

    public Fuente getFuente() {
        return fuente;
    }

    public void setFuente(Fuente fuente) {
        this.fuente = fuente;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public List<Aporte> getAportes() {
        return aportes;
    }

    public void setAportes(List<Aporte> aportes) {
        this.aportes = aportes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
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
        final Ingreso other = (Ingreso) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Ingreso{" + "id=" + id + ", nombre=" + nombre + ", valor="
                + valor + ", descripcion=" + descripcion
                + ", fechaHoraRegistro=" + fechaHoraRegistro
                + ", fechaActualRegistro=" + fechaActualRegistro
                + ", fuente=" + fuente + ", miembro=" + miembro + ", aportes="
                + aportes + '}';
    }
}
