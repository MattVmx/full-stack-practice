
package Main;

import Entidad.Circunferencia;

public class Ejercicio2 {


    public static void main(String[] args) {
        
        Circunferencia circ1 = new Circunferencia();
        
        circ1.crearCircunferencia();
        circ1.area();
        circ1.perimetro();
        
        System.out.println("El area es: " + circ1.getArea());
        System.out.println("El perimetro es: " + circ1.getPerimetro());
       
    }
    
}
