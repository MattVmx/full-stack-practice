
package main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ej05 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int random = (int) (Math.random()*500);
        System.out.println(random);
        
        int adv = 0;
        int cont = 0;
        
        try {
         do {            
            System.out.println("Adivine el numero");
            System.out.print("Intento nro " + (cont + 1) + ": ");
            cont ++;
            adv = leer.nextInt();
            if (adv < random) {
                System.out.println("El numero es mayor");
            } else if (adv > random){
                System.out.println("El numero es menor");
            }
            System.out.println("**********");
        } while (adv != random); 
         System.out.println("Ha adivinado el numero");
        } catch (InputMismatchException e) {
            System.out.println("Por favor introduzca un numero");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Intentos: " + cont);
        }
        
       
            
        
        
        
        
    }
    
}
