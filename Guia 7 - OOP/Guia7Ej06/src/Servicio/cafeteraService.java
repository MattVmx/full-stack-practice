
package Servicio;

import java.util.Scanner;
import Entidad.Cafetera;

public class cafeteraService {
   
    Scanner leer = new Scanner(System.in);
    
    
    public Cafetera crearCafetera(){
        
        Cafetera caf = new Cafetera();
        
        caf.setCapacidadMaxima(1000);
        
        return caf;
    }
    
    public void llenarCafetera(Cafetera caf){
        
        caf.setCantidadActual(caf.getCapacidadMaxima());
        
        System.out.println("Cantidad actual de la cafetera: " + caf.getCantidadActual());
    }
    
    public void servirTaza(Cafetera caf){
        
        System.out.println("Ingrese el tamano de la taza: ");
        int taza = leer.nextInt();
        
        if (taza > caf.getCantidadActual()) {
            System.out.println("La taza no se llenara por completo");
            System.out.println("Se llenara como maxixmo: " + caf.getCantidadActual());
            caf.setCantidadActual(0);
            System.out.println("Cantidad actual de la cafetera: " + caf.getCantidadActual());
        } else {
            System.out.println("La taza se lleno al maximo");
            caf.setCantidadActual(caf.getCantidadActual() - taza);
            System.out.println("Cantidad actual de la cafetera: " + caf.getCantidadActual());
        }
       
        
        System.out.println(caf.getCantidadActual());
    }
    
    public void vaciarCafetera(Cafetera caf){
        
        caf.setCantidadActual(0);
        
        System.out.println("Cantidad actual de la cafetera: " + caf.getCantidadActual());
    }
    
    public void agregarCafe(Cafetera caf){
        
        System.out.println("Ingrese la cantidad a agregar:");
        int cant = leer.nextInt();
        
        if (cant + caf.getCantidadActual() > caf.getCapacidadMaxima() || cant > caf.getCapacidadMaxima()) {
            System.out.println("La cantidad a agregar supera la capacidad maxima");
        } else {
            caf.setCantidadActual(caf.getCantidadActual() + cant);
        }
        
        System.out.println("Cantidad actual de la cafetera: " + caf.getCantidadActual());
    }
}
