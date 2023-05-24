
package Main;

import Entidad.Cuenta;
import Servicio.cuentaService;
import java.util.Scanner;

public class Ejercicio5 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        cuentaService cs = new cuentaService();
        Cuenta acc = cs.crearCuenta();
        
        int opt = 0;
        
        do {
        System.out.println("Seleccione que tipo de operacion desea realizar:");
        System.out.println("1.Ingreso");
        System.out.println("2.Retiro");
        System.out.println("3.Extraccion Rapida");
        System.out.println("4.Consultar Saldo");
        System.out.println("5.Consultar Datos");
        System.out.println("6.Salir");
        
        opt = leer.nextInt();
        
        System.out.println("**********");
        
        
           switch (opt) {
            case 1:
                cs.ingreso(acc);
                break;
            case 2:
                cs.retiro(acc);
                break;
            case 3:
                cs.extraccionRapida(acc);
                break;
            case 4:
                cs.consultarSaldo(acc);
                break;
            case 5:
                cs.consultarDatos(acc);
                break;
            case 6:
                System.out.println("SALIR");
                break;
            default:
                System.out.println("Ingrese una opcion correcta");
        } 
        } while (opt != 6);
        
    }
    
}
