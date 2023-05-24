
package main;

import entidad.Persona;
import java.util.ArrayList;
import servicio.personaService;


public class Ej_extra04 {

   
    public static void main(String[] args) {
       
        personaService ps = new personaService();
        ArrayList<Persona> personas = new ArrayList<>(ps.crearPersonas());
        
        ps.menu(personas);
        
        
    }
    
}
