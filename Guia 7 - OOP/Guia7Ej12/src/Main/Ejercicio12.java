
package Main;

import Entidad.Persona;
import Servicio.personaService;

public class Ejercicio12 {

    
    public static void main(String[] args) {
        
        personaService ps = new personaService();
        Persona person = ps.crearPersona();
        ps.calcularEdad(person);
        ps.menorQue(30, person);
        ps.mostrarPersona(person);
    }
    
}
