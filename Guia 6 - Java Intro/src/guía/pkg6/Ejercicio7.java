
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio7 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String pass = "eureka";
        
        System.out.println("Ingrese la contrasena:");
        String pw = leer.nextLine();
        
        if (pw.equals(pass)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        
    }
    
}