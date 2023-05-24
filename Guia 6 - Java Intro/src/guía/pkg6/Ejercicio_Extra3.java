
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio_Extra3 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra:");
        String letra = leer.nextLine();
        
        if (letra.substring(0, 1).equalsIgnoreCase("A") || letra.substring(0, 1).equalsIgnoreCase("E") || letra.substring(0, 1).equalsIgnoreCase("I") || letra.substring(0, 1).equalsIgnoreCase("O") || letra.substring(0, 1).equalsIgnoreCase("U") ) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
