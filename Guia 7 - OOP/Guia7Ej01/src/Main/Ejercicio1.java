
package Main;

import Servicio.libroService;
import Entidad.Libro;

public class Ejercicio1 {

    
    public static void main(String[] args) {
     
        libroService ls = new libroService();
        Libro book = ls.crearLibro();
        ls.cambiarTitulo(book);
        
    }
    
}
