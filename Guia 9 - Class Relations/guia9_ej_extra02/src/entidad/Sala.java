
package entidad;

import java.util.ArrayList;


public class Sala {
    
//    private String letra;
//    private int fila;
    private String[][] salaCompleta = new String[8][6];
    private ArrayList<Espectador> espectadores;
    private Pelicula peliculaReproducida;
    
    public static final String letra[] = {"A", "B", "C", "D", "E", "F"};

    public Sala() {
        espectadores = new ArrayList<>();
    }

    public Pelicula getPeliculaReproducida() {
        return peliculaReproducida;
    }

    public void setPeliculaReproducida(Pelicula peliculaReproducida) {
        this.peliculaReproducida = peliculaReproducida;
    }
    

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public String[][] getSalaCompleta() {
        return salaCompleta;
    }

    public void setSalaCompleta(String[][] salaCompleta) {
        this.salaCompleta = salaCompleta;
    }
    
    
    
    
}
