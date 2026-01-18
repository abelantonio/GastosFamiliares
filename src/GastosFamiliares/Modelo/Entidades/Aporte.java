package GastosFamiliares.Modelo.Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class Aporte implements Serializable{

    private int id; // 'autoincremental
    private String nombre;
    private float valor;
    private String descripcion;
    private LocalDateTime fechaRegistro;
//   ' relaciones
    private Miembro miembro;
    private BolsaDeAhorro bolsaAhorro;
    private Ingreso ingreso;
    private Gasto gasto;

    public Aporte() {
    }

    public Aporte(String nombre, float valor, Miembro miembro, BolsaDeAhorro bolsaAhorro, Ingreso ingreso) {
        this.nombre = nombre;
        this.valor = valor;
        this.miembro = miembro;
        this.bolsaAhorro = bolsaAhorro;
        this.ingreso = ingreso;
    }
    
    public Aporte(int id, String nombre, float valor, String descripcion, 
            LocalDateTime fechaRegistro, Miembro miembro, 
            BolsaDeAhorro bolsaAhorro, Ingreso ingreso, Gasto gasto) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.miembro = miembro;
        this.bolsaAhorro = bolsaAhorro;
        this.ingreso = ingreso;
        this.gasto = gasto;
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

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public BolsaDeAhorro getBolsaAhorro() {
        return bolsaAhorro;
    }

    public void setBolsaAhorro(BolsaDeAhorro bolsaAhorro) {
        this.bolsaAhorro = bolsaAhorro;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Gasto getGasto() {
        return gasto;
    }

    public void setGasto(Gasto gasto) {
        this.gasto = gasto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Aporte other = (Aporte) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Aporte{" + "id=" + id + ", nombre=" + nombre + ", valor=" + 
                valor + ", descripcion=" + descripcion + ", fechaRegistro=" + 
                fechaRegistro + ", miembro=" + miembro + ", bolsaAhorro=" + 
                bolsaAhorro + ", ingreso=" + ingreso + ", gasto=" + gasto + '}';
    }
}
