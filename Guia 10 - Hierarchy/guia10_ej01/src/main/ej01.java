
package main;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;


public class ej01 {

    
    public static void main(String[] args) {
        
        
        Animal p1 = new Perro("Coco", "Carne", 4, "Doberman");
        p1.alimentarse();
        
        Animal p2 = new Perro("Luna", "Croquetas", 7, "Husky");
        p2.alimentarse();
        
        Animal g = new Gato("Limon", "Atun", 6, "Siames");
        g.alimentarse();
        
        Animal c = new Caballo("Spark", "Pasto", 15, "Fino");
        c.alimentarse();
        
    }
    
}
