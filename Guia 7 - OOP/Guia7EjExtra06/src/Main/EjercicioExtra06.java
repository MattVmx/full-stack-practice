package Main;

import Entidad.Ahorcado;
import Servicio.ahorcadoService;

public class EjercicioExtra06 {
    
    public static void main(String[] args) {
        
        ahorcadoService as = new ahorcadoService();
        Ahorcado juego = as.crearJuego();
        as.juego(juego);
    }
    
}
