
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio5 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        
        int mul = num * 2;
        int trip = num * 3;
        double rz = Math.sqrt(num);
        
        System.out.println("El doble del numero ingresado es: " + mul);
        System.out.println("El triple del numero ingresado es: " + trip);
        System.out.println("La raiz cuadrada del numero ingresado es: " + rz);
    }
    
}