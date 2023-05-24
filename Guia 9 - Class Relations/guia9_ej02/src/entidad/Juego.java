package entidad;

import java.util.ArrayList;
import java.util.Scanner;
import entidad.Jugador;

public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList<>();
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    

    public void llenarJuego() {

        System.out.println("Cuantos jugadores participan? (MAX 6)");
        int resp = leer.nextInt();

        while (resp > 6 || resp < 1) {
            System.out.println("Cantidad incorrecta vuelva a ingresar la cantidad");
            resp = leer.nextInt();
        }

        System.out.println("Datos de jugadores:");
        
        for (int i = 0; i < resp; i++) {
            Jugador j = new Jugador();
            System.out.print("Nombre: ");
            j.setNombre(leer.next());
            jugadores.add(j);
        }
        
    }
    
    
    public void ronda(){
    
        boolean finJuego = false;
        System.out.println("Se dispara el revolver");
        System.out.println("");
        do {
            for (Jugador aux : jugadores) {
                finJuego = aux.disparo(revolver);
                
                if (finJuego == true) {
                    System.out.println("FIN DEL JUEGO");
                    break;
                }
            }
        } while (finJuego == false);
        
        
    }

}
