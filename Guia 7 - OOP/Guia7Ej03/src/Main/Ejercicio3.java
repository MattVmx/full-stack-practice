
package Main;

import Entidad.Operacion;
import Servicio.operacionService;

public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        
        operacionService crearOp = new operacionService();
        Operacion op = crearOp.crearOperacion();
        crearOp.sumar(op);
        crearOp.restar(op);
        crearOp.multiplicar(op);
        crearOp.dividir(op);
    }
    
}
