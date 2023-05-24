
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio3 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        String nombre = leer.nextLine();
        
        System.out.println(nombre.toUpperCase());
        
        System.out.println(nombre.toLowerCase());
    }
    
}