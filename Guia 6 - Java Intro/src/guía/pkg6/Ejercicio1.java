
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio1 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero:");
        
        int num2 = leer.nextInt();
        
        int suma;
        
        suma = num1 + num2;
        
        System.out.println("El resultado es: " + suma);

    }
    
}
