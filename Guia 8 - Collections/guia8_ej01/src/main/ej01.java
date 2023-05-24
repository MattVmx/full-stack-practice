
package main;

import entidad.Perros;
import servicio.perrosService;

public class ej01 {


    public static void main(String[] args) {
        
        perrosService ps = new perrosService();
        Perros p = ps.crearPerros();
        ps.eliminarPerro(p);
    }
    
}
