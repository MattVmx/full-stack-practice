
package Main;

import Entidad.Puntos;
import Servicio.puntosService;

public class EjercicioExtra02 {

    
    public static void main(String[] args) {
        
        puntosService ps = new puntosService();
        Puntos pts = ps.crearPuntos();
        ps.calcularDist(pts);
    }
    
}
