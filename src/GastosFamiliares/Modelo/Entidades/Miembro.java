package GastosFamiliares.Modelo.Entidades;

import GastosFamiliares.Modelo.Enumeraciones.RolFamiliarMiembroEnum;
import GastosFamiliares.Modelo.Enumeraciones.GeneroMiembroEnum;
import GastosFamiliares.Modelo.Enumeraciones.RolUsuarioEnum;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
@Entity
public class Miembro extends Usuario implements Serializable {
    // Reconstruiremos el objeto de tipo miembro
    private static final long serialVersionUID = 0L;
    @Column(length = 30)
    private String segundoNombre;
    @Column(length = 50, nullable = false)
    private String segundoApellido;
    @Column(length = 70)
    private String direccion;
    @Column(length = 10, unique = true)
    private String numTelefonico;
    @Column(length = 25, unique = true)
    private String foto;
    private LocalDate fechaNacimiento;
    @Column(length = 40)
    private String ocupacion;
    @Enumerated(EnumType.STRING)
    @Column(length = 6)
    private RolFamiliarMiembroEnum rolFamiliar;
    @Enumerated(EnumType.STRING)
    @Column(length = 9)
    private GeneroMiembroEnum genero;
// ' relaciones
    @ManyToOne(optional = true)
    @JoinColumn(name = "familia_id")
    private Familia familia;
    @OneToMany(mappedBy = "miembro")
    private List<Ingreso> ingresos;
    @OneToMany(mappedBy = "miembro")
    private List<Gasto> gastos;
    @OneToMany(mappedBy = "miembro")
    private List<BolsaDeAhorro> bolsasDeAhorro;
    @OneToMany(mappedBy = "miembro")
    private List<Aporte> aportes;

    public Miembro() {
    }

    public Miembro(String codigo, String nombre, String apellido,
            RolUsuarioEnum rol) {
        super(codigo, nombre, apellido, rol);
    }

    public Miembro(String codigo, String password, String nombre,
            String apellido, String correo, RolUsuarioEnum rol) {
        super(codigo, password, nombre, apellido, correo, rol);
    }

    public Miembro(String codigo, String password, String nombre,
            String apellido, String correo, RolUsuarioEnum rol,
            String segundoNombre, String segundoApellido, String direccion,
            String numTelefonico, LocalDate fechaNacimiento, String ocupacion) {
        super(codigo, password, nombre, apellido, correo, rol);
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.numTelefonico = numTelefonico;
        this.fechaNacimiento = fechaNacimiento;
        this.ocupacion = ocupacion;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public RolFamiliarMiembroEnum getRolFamiliar() {
        return rolFamiliar;
    }

    public void setRolFamiliar(RolFamiliarMiembroEnum rolFamiliar) {
        this.rolFamiliar = rolFamiliar;
    }

    public GeneroMiembroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroMiembroEnum genero) {
        this.genero = genero;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(List<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    public List<BolsaDeAhorro> getBolsasDeAhorro() {
        return bolsasDeAhorro;
    }

    public void setBolsasDeAhorro(List<BolsaDeAhorro> bolsasDeAhorro) {
        this.bolsasDeAhorro = bolsasDeAhorro;
    }

    public List<Aporte> getAportes() {
        return aportes;
    }

    public void setAportes(List<Aporte> aportes) {
        this.aportes = aportes;
    }

    @Override
    public String toString() {
        return "Miembro{" + "segundoNombre=" + segundoNombre
                + ", segundoApellido=" + segundoApellido + ", direccion="
                + direccion + ", numTelefonico=" + numTelefonico + ", foto="
                + foto + ", fechaNacimiento=" + fechaNacimiento + ", ocupacion="
                + ocupacion + ", rolFamiliar=" + rolFamiliar + ", genero="
                + genero + ", familia=" + familia + ", ingresos=" + ingresos
                + ", gastos=" + gastos + ", bolsasDeAhorro=" + bolsasDeAhorro
                + ", aportes=" + aportes + '}';
    }
}
