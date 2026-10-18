package GastosFamiliares.Modelo.Entidades;

import GastosFamiliares.Modelo.Enumeraciones.RolUsuarioEnum;
import java.util.Objects;

/**
 *
 * @author ABEL ANTONIO TATIS MATURANA 
 */
/*
 public, se tiene acceso desde cualquier ambito
 protected, se tiene acceso siempre y cuando se este ubicado dentro
 del mismo paquete donde se encuentra la clase
 private, no se tiene acceso desde ningun ambito, a no ser
 que sea desde la misma clase
 
 */        
public class Usuario{

    protected String codigo;
    protected String password;
    protected String nombre;
    protected String apellido;
    protected RolUsuarioEnum rol;
    protected String email;
    
    // Constructor por defecto -- este es el constructor que va a instanciar JPA
    
    protected Usuario(){
    
    }
    
    // Constructor solo con algunos parametros basicos
    
    public Usuario(String codigo, String nombre, String apellido, RolUsuarioEnum rol){
       this.codigo = codigo;
       this.nombre = nombre;
       this.apellido = apellido;
       this.rol = rol;
    }

    // Constructor con todos los parametros completamente inicializado
    public Usuario(String codigo, String password, String nombre, String apellido, RolUsuarioEnum rol, String email) {
        this.codigo = codigo;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.email = email;
    }
    
    public void setCodigo(String codigo){
     this.codigo = codigo;
    }
    
    public String getCodigo(){
       return codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public RolUsuarioEnum getRol() {
        return rol;
    }

    public void setRol(RolUsuarioEnum rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codigo);
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
    
    
}
