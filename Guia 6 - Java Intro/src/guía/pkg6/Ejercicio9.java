
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio9 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase que empiece con A:");
        String frase = leer.nextLine();
        if (frase.substring(0,0).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}