
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio4 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados Celsius:");
        int grados = leer.nextInt();
        
        int farenheit = 32 + (9 * grados / 5);
        
        System.out.println("La conversion de Celsius a Farenheit es: " + farenheit);
    }
    
}