
package main;

import entidad.Cine;
import entidad.Espectador;
import entidad.Sala;
import java.util.ArrayList;
import servicio.cineService;


public class ej_extra02 {

  
    public static void main(String[] args) {
        
        cineService cs = new cineService();
        Sala s = new Sala();
        Cine c = new Cine();
        ArrayList<Espectador> espectadores = new ArrayList<>();
        
        cs.crearSala();
        cs.crearEspectador(espectadores);
        cs.menu(c);
        
    }
    
}
