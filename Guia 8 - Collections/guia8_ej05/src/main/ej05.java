
package main;

import entidad.Pais;
import servicio.paisService;


public class ej05 {

    
    public static void main(String[] args) {
        
        paisService ps = new paisService();
        Pais p = ps.listaPaises();
        ps.eliminarPais(p);
        
    }
    
}
