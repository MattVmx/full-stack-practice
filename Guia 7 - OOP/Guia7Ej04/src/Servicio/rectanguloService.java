
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class rectanguloService {
    
    
    public Rectangulo crearRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese la altura del rectangulo:");
        rec.setAltura(leer.nextInt());
        
        System.out.println("Ingrese la base del rectangulo:");
        rec.setBase(leer.nextInt());
        
        return rec;
    }
    
    public void superficie(Rectangulo rec){
        
        int superficie = rec.getBase() * rec.getAltura();
        
        System.out.println("La superficie es:" + superficie);
        
    }
    
    public void perimetro(Rectangulo rec){
        
        int perimetro = (rec.getBase() + rec.getAltura()) * 2;
        
        System.out.println("El perimetro es:" + perimetro);
        
    }
    
     public void dibRec(Rectangulo rec){
        
         for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if (i == 0 || i == (rec.getAltura() - 1)) {
                    System.out.print("*");
                } else if (j == 0 || j == (rec.getBase() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
    }
  }
}
