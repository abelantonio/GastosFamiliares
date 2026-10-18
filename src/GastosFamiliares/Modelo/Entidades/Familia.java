package GastosFamiliares.Modelo.Entidades;
/**
 *
 * @author ABEL ANTONIO TATIS MATURANA
 */
public class Familia {
    /*CUERPO DE LA CLASE
      - ATRIBUTOS - ¿que tiene?
      - METODOS - ¿que hace?
      - CONSTRUCTORS - ¿como se crea?
      
      las instrucciones solo se pasan dentro de los metodos,
      constructores o bloques de inicializacion. Nunca dentro de la
      clase como tal, ya que la toma como una instruccion y estas
      ultima no son permitidas en una clase solo los primeros 3
      parametros que mencione previamente.
    */
    
    Usuario u = new Usuario();
    public void m(){
        u.nombre = "juan";
        u.apellido = "ramirez";
        System.out.println("Nombre: " + u.nombre);
        System.out.println("Apellido: " + u.apellido);
    }
}
