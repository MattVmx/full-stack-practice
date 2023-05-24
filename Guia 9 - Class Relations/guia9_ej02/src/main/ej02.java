
package main;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class ej02 {

    
    public static void main(String[] args) {
        Revolver r = new Revolver();
        Juego g = new Juego();
        
        System.out.println("INCIO DEL JUEGO");
        System.out.println("*************");
        System.out.println("");
        r.llenarRevolver();
        g.setRevolver(r);
        g.llenarJuego();
        System.out.println("");
        System.out.println("*************");
        r.mostrar();
        System.out.println("*************");
        System.out.println("");
        g.ronda();
        
        
    }
    
}
