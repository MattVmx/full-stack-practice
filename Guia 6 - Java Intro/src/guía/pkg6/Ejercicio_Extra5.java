
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio_Extra5 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de socio:");
        System.out.println("A. Socio A");
        System.out.println("B. Socio B");
        System.out.println("C. Socio C");
        String opt = leer.nextLine();
        
        
        while (!(opt.equalsIgnoreCase("A") || opt.equalsIgnoreCase("B") || opt.equalsIgnoreCase("C"))) {
           System.out.println("Ingrese una opcion valida");
            opt = leer.nextLine(); 
        }
        
        
        System.out.println("Ingrese el costo del tratamiento:");
        double cost = leer.nextInt();
        
        switch (opt.toUpperCase()) {
            case "A":
                cost = cost - (cost * 0.5);
                System.out.println("El costo final es de: $" + cost);
                break;
                
            case "B":
                cost = cost - (cost * 0.35);
                System.out.println("El costo final es de: $" + cost);
                break;
                
            case "C":
                System.out.println("El costo final es de: $" + cost);
                break;    
        }
    }
}