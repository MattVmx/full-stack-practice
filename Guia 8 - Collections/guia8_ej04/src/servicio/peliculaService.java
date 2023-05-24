package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class peliculaService {

    Scanner leer = new Scanner(System.in);

    public void crearPelicula(ArrayList<Pelicula> peliculas) {

        String resp = "";

        do {
            Pelicula pelicula = new Pelicula();
            System.out.print("Ingrese el titulo de la pelicula: ");
            pelicula.setTitulo(leer.nextLine());

            System.out.print("Ingrese el director: ");
            pelicula.setDirector(leer.nextLine());

            System.out.print("Ingrese la duracion: ");
            pelicula.setDuracion(leer.nextInt());

            peliculas.add(pelicula);

            System.out.println("Desea guardar otra pelicula? (S/N)");
            leer.nextLine();
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("s"));
        
        System.out.println("**************");

        if (resp.equalsIgnoreCase("n")) {
            System.out.println("Lista de peliculas:");
            System.out.println("");
            for (Pelicula elementos : peliculas) {
                System.out.println(elementos.toString());
            }
        }

    }
    
    public void mayorDuracion(ArrayList<Pelicula> peliculas){
    
        for (Pelicula aux : peliculas) {
            if (aux.getDuracion()>1) {
                System.out.println(aux);
            }
        }
    }

}
