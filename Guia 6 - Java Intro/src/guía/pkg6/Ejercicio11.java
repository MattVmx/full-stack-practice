
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio11 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero:");
        int num2 = leer.nextInt();
        
        int option = 0;
        
        String resp = "";
        
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            
            option = leer.nextInt();
            leer.nextLine();
            
            
            
            switch (option) {
                
            case 1:
                int suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;
                
            case 2:
                int resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;
                
            case 3:
                int mul = num1 * num2;
                System.out.println("El resultado es: " + mul);
                break;
                
            case 4:
                int div = num1 / num2;
                System.out.println("El resultado es: " + div);
                System.out.println("Elija una opcion:");
                break;
                
            case 5:
                do {
                    System.out.println("Seguro que desea salir del programa (S/N)?");
                    resp = leer.nextLine();
                    } while (!(resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")));
                break;
            default:
                System.out.println("Seleccione una opcion valida");
            }
        } while (!(option == 5 && resp.equalsIgnoreCase("S")));
        
        System.out.println("FIN");
        
    }
    
}