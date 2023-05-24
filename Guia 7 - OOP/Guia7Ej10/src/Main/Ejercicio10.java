
package Main;

import Entidad.Arreglos;
import Servicio.arreglosService;
public class Ejercicio10 {

  
    public static void main(String[] args) {
       
        arreglosService ca = new arreglosService();
        Arreglos na = ca.crearArreglos();
        ca.ordenarArreglos(na);
        ca.llenarArreglo2(na);
    }
    
}
