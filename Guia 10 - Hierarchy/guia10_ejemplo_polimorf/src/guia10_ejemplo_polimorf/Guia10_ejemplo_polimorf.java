
package guia10_ejemplo_polimorf;

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;


public class Guia10_ejemplo_polimorf {


    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal a = new Animal();
        Animal p = new Perro();
        Animal g = new Gato();
        
        animales.add(a);
        animales.add(p);
        animales.add(g);
        
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
        
    }
    
}
