
package Main;

import java.util.Scanner;
import java.util.Date;

public class Ejercicio11 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
       
        Date fechaActual = new Date();
        
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio:");
        int anio = leer.nextInt();
        
            
         Date fecha = new Date(anio-1900, mes-1, dia);
         
         System.out.println(fecha);
         
         System.out.println("La diferencia es: " + (fechaActual.getYear() - fecha.getYear()));
        
    }
    
}
