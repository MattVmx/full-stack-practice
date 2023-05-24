
package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;

public class arreglosService {
   
    public Arreglos crearArreglos(){
    
        Arreglos as = new Arreglos();
        
        System.out.println("Arreglo 1:");
        
        for (int i = 0; i < 50; i++) {
            as.getA1()[i] = Math.random() * 10;
            System.out.print("[" + as.getA1()[i] + "]");
        }
        
        System.out.println("");
        
        System.out.println("Arreglo 2:");
        
        for (int i = 0; i < 20; i++) {
            as.getA2()[i] = Math.random() * 10;
            System.out.print("[" + as.getA2()[i] + "]");
        }
        
        System.out.println("");
        
        return as;
    }
    
    public void ordenarArreglos(Arreglos as){
        System.out.println("Arreglo 1 ordenado:");
        Arrays.sort(as.getA1());
        
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + as.getA1()[i] + "]");
        }
        
        System.out.println("");
    }
    
    public void llenarArreglo2(Arreglos as){
        
        System.out.println("Nuevo arreglo 2:");
        for (int i = 0; i < 20; i++) {
            as.getA2()[i] = as.getA1()[i];
            Arrays.fill(as.getA2(), 10, 20, 0.5);
            System.out.print("[" + as.getA2()[i] + "]");
        }
        
       System.out.println("");
        
    }
}
