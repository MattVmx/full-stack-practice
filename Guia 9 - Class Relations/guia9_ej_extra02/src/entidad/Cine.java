
package entidad;

import java.util.ArrayList;


public class Cine {
    
    private Sala sala;
    private ArrayList<Pelicula> peliculas;
    private int precio;

    public Cine() {
        peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
