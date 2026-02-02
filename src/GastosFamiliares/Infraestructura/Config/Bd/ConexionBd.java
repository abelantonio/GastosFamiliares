package GastosFamiliares.Infraestructura.Config.Bd;

//import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import GastosFamiliares.Modelo.Entidades.Usuario;

/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class ConexionBd {
   private static EntityManagerFactory conexion;
   public static EntityManagerFactory conectar(){
       if(conexion == null){
           conexion = Persistence.createEntityManagerFactory("GastosFamiliaresPU");
       }
       return conexion;
   }
   
   public static void desconectar(){
      if(conexion != null && conexion.isOpen()){
         conexion.close();
      }
      conexion = null;
   }
}
