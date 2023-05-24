
package Main;

import Entidad.Matematica;
import Servicio.mathService;

public class Ejercicio9 {

   
    public static void main(String[] args) {
      
        
        mathService ms = new mathService();
        System.out.println("Numeros:");
        Matematica nums = ms.crearNums();
        System.out.println("**************");
        ms.devolverMayor(nums);
        System.out.println("**************");
        ms.calcularPotencia(nums);
        System.out.println("**************");
        ms.calcularRaiz(nums);
        
      
        
    }
    
}
