package GastosFamiliares;
import GastosFamiliares.Modelo.Entidades.Usuario;
import GastosFamiliares.Modelo.Enumeraciones.RolUsuarioEnum;
/**
 *
 * @author Abel Antonio Tatis Maturana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u1 = new Usuario("123", "juan", "garcia", RolUsuarioEnum.MIEMBRO);
        Usuario u3 = new Usuario("456", "cristian", "basso", RolUsuarioEnum.MIEMBRO);
        System.out.println(!u1.equals(u3));
        System.out.println(!u1.getClass().equals(u3.getClass()));
        System.out.println("numero entero del objeto u1: "+u1.hashCode());
        System.out.println("numero entero del objeto u3: "+u3.hashCode());
    }

}
