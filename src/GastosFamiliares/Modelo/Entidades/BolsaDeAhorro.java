package GastosFamiliares.Modelo.Entidades;
import GastosFamiliares.Modelo.Enumeraciones.EstadoBolsaAhorroEnum;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Entity(name = "BolsaDeAhorro")
public class BolsaDeAhorro implements Serializable{
   // Reconstruiremos el objeto de tipo BolsaDeAhorro
   private static final long serialVersionUID = 0L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id; // 'autoincremental
   @Column(length = 40, nullable = false)
   private String nombre;
   private String descripcion;
   @Column(nullable = false)
   private LocalDateTime fechaRegistro;
   @Column(nullable = false)
   private LocalDate fechaInicio;
   @Column(nullable = false)
   private LocalDate fechaFin;
   @Column(unique = true)
   private String foto;
   @Column(nullable = false)
   private float objetivo;
   @Enumerated(EnumType.STRING)
   @Column(length = 7)
   private EstadoBolsaAhorroEnum estado;
//   ' relaciones
   @ManyToOne(optional = true)
   @JoinColumn(name = "miembro_id")
   private Miembro miembro;
   @ManyToOne(optional = true)
   @JoinColumn(name = "familia_id")
   private Familia familia;
   @OneToMany(mappedBy = "bolsaAhorro")
   private List<Aporte> aportes;

    public BolsaDeAhorro() {
    }

    public BolsaDeAhorro(String nombre, LocalDate fechaInicio, 
            LocalDate fechaFin, float objetivo, Miembro miembro, 
            Familia familia) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetivo;
        this.miembro = miembro;
        this.familia = familia;
    }

    public BolsaDeAhorro(int id, String nombre, String descripcion, 
            LocalDateTime fechaRegistro, LocalDate fechaInicio, 
            LocalDate fechaFin, String foto, float objetivo, 
            EstadoBolsaAhorroEnum estado, Miembro miembro, Familia familia, 
            List<Aporte> aportes) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.foto = foto;
        this.objetivo = objetivo;
        this.estado = estado;
        this.miembro = miembro;
        this.familia = familia;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(float objetivo) {
        this.objetivo = objetivo;
    }

    public EstadoBolsaAhorroEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoBolsaAhorroEnum estado) {
        this.estado = estado;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public List<Aporte> getAportes() {
        return aportes;
    }

    public void setAportes(List<Aporte> aportes) {
        this.aportes = aportes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final BolsaDeAhorro other = (BolsaDeAhorro) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "BolsaDeAhorro{" + "id=" + id + ", nombre=" + nombre + 
                ", descripcion=" + descripcion + ", fechaRegistro=" + 
                fechaRegistro + ", fechaInicio=" + fechaInicio + 
                ", fechaFin=" + fechaFin + ", foto=" + foto + ", objetivo=" + 
                objetivo + ", estado=" + estado + ", miembro=" + miembro + 
                ", familia=" + familia + ", aportes=" + (aportes != null ? aportes.size() : 0) + '}';
    }
}
