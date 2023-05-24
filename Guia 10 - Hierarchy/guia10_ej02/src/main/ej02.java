
package main;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;


public class ej02 {

    
    public static void main(String[] args) {
        
//        Lavadora l = new Lavadora();
//        Televisor t = new Televisor();
//        
//        l.crearLavadora();                   /* ---------------> EJERCICIO 2*/
//        l.precioFinal();
//        
//        t.crearTelevisor();
//        t.precioFinal();
        
        
//         ******************************************   


          ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
          
          Electrodomestico l = new Lavadora(20, 1000, "Blanco", 'C', 40);
          Electrodomestico l2 = new Lavadora(50, 1000, "Negro", 'E', 60);
          Electrodomestico t = new Televisor(20, false, 1000, "Negro", 'B', 10);
          Electrodomestico t2 = new Televisor(48, true, 1000, "Azul", 'D', 25);
          
          electrodomesticos.add(l);
          electrodomesticos.add(l2);
          electrodomesticos.add(t);
          electrodomesticos.add(t2);
          
          for (Electrodomestico aux : electrodomesticos) {
              aux.mostrar();
        }
          
          System.out.println("************************************");
         
          double sumaLavadoras = 0;
          double sumaTelevisores = 0;
          double sumaElectrodomesticos = 0;
          
          for (Electrodomestico aux : electrodomesticos) {
              if (aux instanceof Electrodomestico) {
                  sumaElectrodomesticos = sumaElectrodomesticos + aux.precioFinal();
              }
              if (aux instanceof Lavadora) {
                  sumaLavadoras = sumaLavadoras + aux.precioFinal();
              }
              if (aux instanceof Televisor) {
                  sumaTelevisores = sumaTelevisores + aux.precioFinal();
              }
        }
          
          System.out.println("La suma de todas las lavadoras es: " + sumaLavadoras);
          System.out.println("La suma de todos los televisores es: " + sumaTelevisores);
          System.out.println("La suma de todos los electrodomesticos es: " + sumaElectrodomesticos);
        
    }
    
}
