
package main;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import servicio.peliculaService;
import utilidades.Comparators;


public class ej04 {

   
    public static void main(String[] args) {
        
        peliculaService ps = new peliculaService();
        ArrayList<Pelicula> p = new ArrayList<>();
        ps.crearPelicula(p);
        System.out.println("**************");
        System.out.println("Peliculas con duracion mayor a 1hr:");
        ps.mayorDuracion(p);
        System.out.println("**************");
        System.out.println("Lista ordenada por mayor duracion:");
        Collections.sort(p, Comparators.ordenarPorDuracion);
        for (Pelicula listaPeliculas : p) {
            System.out.println(listaPeliculas);
        }
        System.out.println("**************");
        System.out.println("Lista ordenada por menor duracion:");
        Collections.sort(p, Comparators.ordenarPorDuracionAsc);
        for (Pelicula listaPeliculas : p) {
            System.out.println(listaPeliculas);
        }
        System.out.println("**************");
        System.out.println("Lista ordenada por titulo:");
        Collections.sort(p, Comparators.ordenarPorTitulo);
        for (Pelicula listaPeliculas : p) {
            System.out.println(listaPeliculas);
        }
        System.out.println("**************");
        System.out.println("Lista ordenada por director:");
        Collections.sort(p, Comparators.ordenarPorDirector);
        for (Pelicula listaPeliculas : p) {
            System.out.println(listaPeliculas);
        }
        
    }
    
}
