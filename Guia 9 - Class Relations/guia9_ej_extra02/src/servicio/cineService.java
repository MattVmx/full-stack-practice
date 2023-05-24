package servicio;

import entidad.Cine;
import entidad.Espectador;
import entidad.Pelicula;
import entidad.Sala;
import java.util.ArrayList;
import java.util.Scanner;

public class cineService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Sala crearSala() {
        Sala s = new Sala();
        String[] asiento = Sala.letra;
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                s.getSalaCompleta()[i][j] = asiento[j].concat(String.valueOf(i + 1));
                if (Math.random()* 10 < 3) {
                    s.getSalaCompleta()[i][j] = "X"; 
                }
            }
        }
        

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + s.getSalaCompleta()[i][j] + "]\t");
            }
            System.out.println(" ");
        }
        return s;
    }

    public void crearPelis(ArrayList<Pelicula> peliculas) {
        String salir;

        do {
            Pelicula p = new Pelicula();
            System.out.print("Ingrese el titulo: ");
            p.setTitulo(leer.next());
            System.out.print("Director: ");
            p.setDirector(leer.next());
            System.out.print("Duracion: ");
            p.setDuracion(leer.nextInt());
            System.out.print("Edad minima: ");
            p.setEdadMinima(leer.nextInt());
            peliculas.add(p);
            System.out.println("Quiere agregar otra pelicula? SI / NO");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("SI"));
    }

    
    public void crearEspectador(ArrayList<Espectador> espectadores) {
        String salir;

        do {
            Espectador e = new Espectador();
            System.out.print("Nombre: ");
            e.setNombre(leer.next());
            System.out.print("Edad: ");
            e.setEdad(leer.nextInt());
            System.out.print("Dinero: ");
            e.setDinero(leer.nextInt());
            espectadores.add(e);
            System.out.println("Quiere agregar otra espectador? SI / NO");
            salir = leer.next();
        } while (salir.equalsIgnoreCase("SI"));
        
        for (Espectador espectadore : espectadores) {
            System.out.println(espectadore.toString());
        }
    }
    
    public Cine crearCine(Sala s, ArrayList<Pelicula> peliculas, ArrayList<Espectador> espectadores){
    
        Cine c = new Cine();
        
        c.setPrecio(300);
        c.setPeliculas(peliculas);
        s.setEspectadores(espectadores);
        c.setSala(s);
        
        return c;
    }
    
    public void mostrar(Cine c){
        System.out.println("Lista pelis:");
        for (Pelicula pelicula : c.getPeliculas()) {
            System.out.println(pelicula);
        }
        
        System.out.println("Personas:");
//        for (Espectador espectador : c.getSala().getEspectadores()) {
//            System.out.println(espectador);
//        }
    }
    
    public void llenarSala(Cine c){
        
        String resp;
        
        for (Espectador aux : c.getSala().getEspectadores()) {
            System.out.println(aux.getNombre() + "Desea comprar una entrada?");
            if (aux.getDinero() < c.getPrecio()) {
                System.out.println("Lo sentimos, no le alcanza para comprar una entrada");
            } else {
                System.out.println("Que pelicula desea ver?");
                for (Pelicula pelicula : c.getPeliculas()) {
                    System.out.println("Lista:");
                    System.out.println(pelicula);
                }
            }
        }
        
//        for (Espectador aux : espectadores) {
//            System.out.println(aux.);
//        }
        
    }

    public void menu(Cine c) {
        //variables
        Boolean vf = true;
        int opc;

        

        System.out.println("Seleccione que desea hacer:");
        do {
            System.out.println(" ");
            System.out.println("1 - Agregar pelicula");
            System.out.println("2 - Mostrar lista");
            System.out.println("3 - Comprar entrada");
            System.out.println("5 - Salir");
            System.out.println("Ingrese una opcion: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1 -> crearPelis(c.getPeliculas());
                case 2 -> mostrar(c);
//                case 3 -> llenarSala(s, espectadores, peliculas);
//                case 4 -> ordenarPaises();
                case 5 ->
                    vf = false;
                default ->
                    System.out.println("Opcion ingresada incorrecta, intente de nuevo");
            }
        } while (vf);

    }
}
