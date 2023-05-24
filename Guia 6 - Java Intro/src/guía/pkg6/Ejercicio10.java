package guía.pkg6;



import java.util.Scanner;


public class Ejercicio10 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite");
        int valor = leer.nextInt();
        int suma = 0;
        
        while (suma <= valor) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
        }
        
        System.out.println("Se ha superado el valor limite");
    }
    
}
