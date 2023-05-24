
package Main;

import java.util.Scanner;
import Servicio.cafeteraService;
import Entidad.Cafetera;
public class Ejercicio6 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        cafeteraService cs = new cafeteraService();
        Cafetera caf = cs.crearCafetera();
        int opt = 0;
        
        do {
            System.out.println("Seleccione una opcion:");
        System.out.println("1.LLenar Cafetera");
        System.out.println("2.Servir Taza");
        System.out.println("3.Agregar Cafe");
        System.out.println("4.Vaciar Cafetera");
        System.out.println("5.Salir");
        
        opt = leer.nextInt();
        
        
        switch (opt) {
            case 1:
                cs.llenarCafetera(caf);
                break;
            case 2:
                 cs.servirTaza(caf);
                break;
            case 3:
                cs.agregarCafe(caf);
                break;
            case 4:
                cs.vaciarCafetera(caf);
                break;
            case 5:
                System.out.println("SALIR");
                break;
            default:
                throw new AssertionError();
        }
        } while (opt != 5);
        
        
       
        
        
        
    }
    
}
