package GastosFamiliares.Modelo.Entidades;

import java.io.Serializable;
import java.util.List;
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
@Entity(name = "Familias")
public class Familia implements Serializable {
    // Reconstruiremos el obejto de tipo familia
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // autoincremental
    @Column(length = 150, nullable = false)
    private String nombre;
    private String direccion;
    @Column(length = 70, unique = true)
    private String correo;
    @Column(length = 10, unique = true)
    private String numTelefonico;
    @Column(unique = true)
    private String foto;
    // relaciones
    @ManyToOne(optional = true)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToMany(mappedBy = "familia")
    private List<Miembro> miembros;
    @OneToMany(mappedBy = "familia")
    private List<BolsaDeAhorro> bolsasDeAhorro;

    // Constructores
    public Familia() {
    }

    public Familia(String nombre, Usuario creador) {
        this.nombre = nombre;
        this.usuario = creador;
    }

    public Familia(int id, String nombre, String direccion, String correo, String numTelefonico, String foto, Usuario usuario, List<Miembro> miembros, List<BolsaDeAhorro> bolsasDeAhorro) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.numTelefonico = numTelefonico;
        this.foto = foto;
        this.usuario = usuario;
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

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
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
                + numTelefonico + ", foto=" + foto + ", usuario=" + usuario 
                + ", miembros=" + miembros + ", bolsasDeAhorro=" + bolsasDeAhorro + '}';
    }

    
}
