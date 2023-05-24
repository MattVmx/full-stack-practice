
package servicio;

import entidad.Perros;
import java.util.Iterator;
import java.util.Scanner;


public class perrosService {
    
    Scanner leer = new Scanner(System.in);
    
    public Perros crearPerros(){
        
        Perros p = new Perros();
        
        
        String resp = "";
        
        do {
            System.out.println("Introduzca la raza:");
            p.getRazas().add(leer.nextLine());
            System.out.println("Desea guardar otro perro? (S/N)");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("S"));
        
        if (resp.equalsIgnoreCase("N")) {
            System.out.println("Lista:");
            for (String lista : p.getRazas()) {
                System.out.println("- " + lista);
            }
        }
        
        return p;
    }
    
    public void eliminarPerro(Perros p){
    
        Iterator it = p.getRazas().iterator();
        System.out.println("Ingrese un perro a buscar:");
        String perro2 = leer.nextLine();
        
        while (it.hasNext()) {
            if (it.next().equals(perro2)) {
               it.remove();
            }
        }
        
        System.out.println("Lista:");
        for (Object lista : p.getRazas()) {
            System.out.println("- " + lista);
        }
    
    }
}
