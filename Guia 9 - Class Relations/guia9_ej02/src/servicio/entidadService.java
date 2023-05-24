
package servicio;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class entidadService {
    
//    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    
//    public Revolver llenarRevolver(){
//    
//        Revolver r = new Revolver();
//        
//        int aleatorio = (int)(Math.random()*((6-1)+1))+1;
//        
//        r.setPosicionActual(aleatorio);
//        r.setPosicionAgua(aleatorio);
//        
//        return r;
//    }
//    
//    public boolean mojar(Revolver r){
//        
//        boolean mojar = false;
//    
//        if (r.getPosicionAgua().equals(r.getPosicionActual())) {
//            mojar = true;
//        }
//        
//        return mojar;
//    }
//    
//    public void siguienteChorro(Revolver r){
//    
//        r.setPosicionActual(r.getPosicionActual()+1);
//    }
//    
//    public void mostrar(Revolver r){
//    
//        System.out.println("Posicion actual: " + r.getPosicionActual());
//        System.out.println("Posicion del agua: " + r.getPosicionAgua());
//    }
//    
//    public void disparo (Revolver r, Jugador j){
//        
//        System.out.println("Se dispara el revolver:");
//        siguienteChorro(r);
//        System.out.println("Se mojo?");
//        System.out.println(mojar(r));
//        
//        j.setMojado(false);
//        
//        
//        
//    }
//    
//    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
//        
//        System.out.println("Cuantos jugadores participan? (MAX 6)");
//        int resp = leer.nextInt();
//        
//        while (resp > 6 || resp < 1) {
//            System.out.println("Cantidad incorrecta vuelva a ingresar la cantidad");
//            resp = leer.nextInt();
//        }
//         Jugador j = new Jugador();
//        System.out.println("Datos de jugadores:");
//        
//        for (int i = 0; i < resp; i++) {
//            System.out.print("Nombre: ");
//            j.setNombre(leer.next());
//            System.out.print("ID: ");
//            j.setId(i+1);
//            System.out.println(i+1);
//            jugadores.add(j);
//        }
//        
//        for (Jugador aux : jugadores) {
//            System.out.println(aux.toString());
//        }
//    }
    
}
