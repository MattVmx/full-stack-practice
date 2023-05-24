
package Main;

import Servicio.nifService;
import Entidad.NIF;

public class EjercicioExtra04 {

   
    public static void main(String[] args) {
        
        nifService ns = new nifService();
        NIF nif = ns.crearNif();
        ns.mostrar(nif);
    }
    
}
