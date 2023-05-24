
package Servicio;

import java.util.Scanner;
import Entidad.Puntos;

public class puntosService {
   
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
    
        Puntos pts = new Puntos();
        
        System.out.println("Ingrese las coordenadas del 1er punto:");
        System.out.print("X: ");
        pts.setX1(leer.nextInt());
        System.out.print("Y: ");
        pts.setY1(leer.nextInt());
        
        System.out.println("*************");
        
        System.out.println("Ingrese las coordenadas del 2do punto:");
        System.out.print("X: ");
        pts.setX2(leer.nextInt());
        System.out.print("Y: ");
        pts.setY2(leer.nextInt());
        return pts;
    }
    
    public void calcularDist(Puntos pts){
    
        double dist = Math.sqrt((Math.pow(pts.getX2() - pts.getX1(), 2)) + Math.pow(pts.getY2() - pts.getY1(), 2));
        
        System.out.println("La distancia entre los dos puntos es: " + dist);
    }
    
}
