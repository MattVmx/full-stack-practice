
package main;

import entidad.Circulo;
import entidad.Formas;
import entidad.Rectangulo;


public class ej04 {

    
    public static void main(String[] args) {
        
        Formas c = new Circulo();
        System.out.println("CIRCULO:");
        c.calcularA();
        c.calcularP();
        
        System.out.println("****************");
        
        Formas r = new Rectangulo();
        System.out.println("RECTANGULO:");
        r.calcularA();
        r.calcularP();
        
    }
    
}
