package GastosFamiliares.Modelo.Entidades;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class Familia implements Serializable {

    private int id; // autoincremental
    private String nombre;
    private String direccion;
    private String correo;
    private String numTelefonico;
    private String foto;
    // relaciones
    private Usuario creador;
    private List<Miembro> miembros;
    private List<BolsaDeAhorro> bolsasDeAhorro;

    // Constructores
    public Familia() {
    }

    public Familia(String nombre, Usuario creador) {
        this.nombre = nombre;
        this.creador = creador;
    }

    public Familia(int id, String nombre, String direccion, String correo,
            String numTelefonico, String foto, Usuario creador,
            List<Miembro> miembros, List<BolsaDeAhorro> bolsasDeAhorro) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.numTelefonico = numTelefonico;
        this.foto = foto;
        this.creador = creador;
        this.miembros = miembros;
        this.bolsasDeAhorro = bolsasDeAhorro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getd() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String correo() {
        return correo;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setMiembros(List<Miembro> miembros) {
        this.miembros = miembros;
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void setBolsasDeAhorro(List<BolsaDeAhorro> bolsasDeAhorro) {
        this.bolsasDeAhorro = bolsasDeAhorro;
    }

    public List<BolsaDeAhorro> getBolsasDeAhorro() {
        return bolsasDeAhorro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
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
        final Familia other = (Familia) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Familia{" + "id=" + id + ", nombre=" + nombre + ", direccion="
                + direccion + ", correo=" + correo + ", numTelefonico="
                + numTelefonico + ", foto=" + foto + ", creador=" + creador
                + ", miembros=" + miembros + ", bolsasDeAhorro="
                + bolsasDeAhorro + '}';
    }
}
