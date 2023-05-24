
package Main;

import Entidad.Raices;
import Servicios.raicesService;

public class EjercicioExtra03 {

   
    public static void main(String[] args) {
        
        raicesService rs = new raicesService();
        Raices rz = rs.crearCoef();
        rs.calcular(rz);
    }
}
