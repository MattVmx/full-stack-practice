
package Servicio;

import java.util.Scanner;
import Entidad.Ahorcado;

public class ahorcadoService {
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
    
        Ahorcado juego = new Ahorcado();
        
        
//        System.out.println("Ingrese la palabra:");
//        String adivina = leer.next();
//        juego.setPalabra(new String[adivina.length()]);
//        int lg = juego.getPalabra().length;
//        
//        for (int i = 0; i < lg; i++) {
//           juego.getPalabra()[i] = adivina.substring(i, i + 1);
//           System.out.print("[" + juego.getPalabra()[i] + "]");
//        }
//        
//        System.out.println("");
       
//        System.out.println("Ingrese la cantidad de jugadas:");
//        juego.setJugadas(leer.nextInt());
        
        
        return juego;
    }
    
    public void longitud(Ahorcado juego){
        
        System.out.println("La palabra tiene " + juego.getPalabra().length + " letras");
        System.out.println("");
    }
    
    public void buscar(Ahorcado juego){
        
        System.out.print("Ingrese una letra a buscar: ");
        String letra = leer.next();
        
        int aux = juego.getLetrasE();
        
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (juego.getPalabra()[i].equalsIgnoreCase(letra)) {
                juego.setLetrasE(juego.getLetrasE()+1);
            } 
        }
        
        if (aux == juego.getLetrasE()) {
            System.out.println("La letra no se encuentra");
            juego.setJugadas(juego.getJugadas() - 1);
        } else {
            System.out.println("La letra se encuentra " + (juego.getLetrasE() - aux) + " veces");
            System.out.println("Faltan adivinar " + (juego.getPalabra().length - juego.getLetrasE()) + " letras");
        }
        System.out.println("Quedan " + juego.getJugadas() + " intentos");

        
        System.out.println("");
    }
    
    public void juego(Ahorcado juego){
        
        
        longitud(juego);
        
        while (juego.getJugadas() != 0 && juego.getPalabra().length != juego.getLetrasE()) {
            buscar(juego);
        }
        
    }
}
