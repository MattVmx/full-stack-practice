
package Servicio;

import java.util.Scanner;
import Entidad.NIF;

public class nifService {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNif(){
        
        NIF nif = new NIF();
        
        System.out.println("Ingrese su DNI:");
        nif.setDNI(leer.nextInt());
        
        int calc = nif.getDNI() % 23;
        System.out.println(calc);
        
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };

        
        for (int i = 0; i < letras.length; i++) {
            if (i == calc) {
                nif.setLetra(letras[i]);
            }
        }
        
        return nif;
    }
    
    public void mostrar(NIF nif){
    
        System.out.println("Su NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }
}
