
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio_Extra1 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos:");
        int min = leer.nextInt();
        
        int d = 0;
        int h = 0;
        
        do {
            if (min >= 1440) {
                d = d + 1;
                min = min - 1440;
            } else {
                if (min >= 60 && min < 1440) {
                h = h + 1;
                min = min - 60;
                }
            }
//            System.out.println(min);
        } while (min > 60);
        
        
        System.out.println("Los minutos ingresados equivalen a " + d + " dia/s y " + h + " hora/s");
    }
    
}