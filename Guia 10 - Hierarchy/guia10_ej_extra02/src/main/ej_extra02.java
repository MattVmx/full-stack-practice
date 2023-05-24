
package main;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;


public class ej_extra02 {

    
    public static void main(String[] args) {
        
        ArrayList<Edificio> edificios = new ArrayList<>();
        Edificio p1 = new Polideportivo("Quilmes", "Abierto", 500, 15, 300);
        Edificio p2 = new Polideportivo("Libertad", "Techado", 300, 18, 200);
        Edificio e1 = new EdificioDeOficinas(5, 20, 3, 25, 10, 50);
        Edificio e2 = new EdificioDeOficinas(8, 30, 5, 40, 15, 60);
        
        edificios.add(p1);
        edificios.add(p2);
        edificios.add(e1);
        edificios.add(e2);
        
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            System.out.println("****************");
        }
        
        
        int abierto = 0;
        int techado = 0;
        
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo polideportivo) {
                if (polideportivo.getInstalacion().equalsIgnoreCase("Abierto")) {
                    abierto = abierto + 1;
                } else {
                    techado = techado + 1;
                }
            }
            if (edificio instanceof EdificioDeOficinas edificioDeOficinas) {
                edificioDeOficinas.cantPersonas();
                System.out.println("****************");
            }
        }
        
        
        System.out.println("Cantidad de polideportivos techados: " + techado);
        System.out.println("Cantidad de polideportivos abiertos: " + abierto);
        
    }
    
}
