
package Main;

import Entidad.Cadena;
import Servicio.cadenaService;
import java.util.Scanner;
        
public class Ejercicio8 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        cadenaService cs = new cadenaService();
        Cadena frase = new Cadena();
        
        System.out.println("Ingrese una frase o palabra:");
        frase.setFrase(leer.nextLine());
        cs.longitudFrase(frase);
        cs.mostrarVocales(frase);
        System.out.print("La palabra invertida es: ");
        cs.invertirFrase(frase);
        cs.vecesRepetido(frase);
        cs.compararLongitud(frase);
        cs.unirFrases(frase);
        cs.reemplazar(frase);
        cs.contiene(frase);
        
    }
    
}
