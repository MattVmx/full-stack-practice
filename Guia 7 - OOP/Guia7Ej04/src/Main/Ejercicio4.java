
package Main;

import Entidad.Rectangulo;
import Servicio.rectanguloService;

public class Ejercicio4 {

 
    public static void main(String[] args) {
      
       
        rectanguloService recS = new rectanguloService();
        Rectangulo rec =  recS.crearRectangulo();
        recS.superficie(rec);
        recS.perimetro(rec);
        recS.dibRec(rec);
    }
    
}
