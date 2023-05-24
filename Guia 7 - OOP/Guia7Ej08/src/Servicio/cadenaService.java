package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class cadenaService {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Cadena longitudFrase(Cadena frase){
        
        frase.setLongitud(frase.getFrase().length());
        
        return frase;
    }
    
    public void mostrarVocales(Cadena frase) {
        
        int contVocales = 0;
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i +1).equalsIgnoreCase("a") || frase.getFrase().substring(i, i +1).equalsIgnoreCase("e") || frase.getFrase().substring(i, i +1).equalsIgnoreCase("i") || frase.getFrase().substring(i, i +1).equalsIgnoreCase("o") || frase.getFrase().substring(i, i +1).equalsIgnoreCase("u")) 
                contVocales = contVocales + 1;
        }
        
        System.out.println("La frase ingresada tiene: " + contVocales + " vocales");
    }
    
    
    public void invertirFrase(Cadena frase){
        
        char[] invertir = frase.getFrase().toCharArray();
        
        for (int i = frase.getLongitud() - 1; i > -1; i--) {
            System.out.print(invertir[i]);
        }
        System.out.println("\n");
    }
    
    public void vecesRepetido(Cadena frase){
        
        System.out.println("Ingrese un caracter a buscar: ");
        
        String letra = leer.next();
        int contL = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                contL = contL + 1;
            }
        }
        
        if (contL == 0) {
            System.out.println("El caracter ingresado no encontro ninguna vez");
        } else if (contL == 1){
            System.out.println("El caracter ingresado se encontro " + contL + " vez");
        } else {
            System.out.println("El caracter ingresado se encontro" + contL + " veces");
        }
    }
    
    public void compararLongitud(Cadena frase){
        leer.nextLine();
        System.out.println("Ingrese otra frase para comparar:");
        String frase2 = leer.nextLine();
        
        if (frase.getLongitud() == frase2.length()) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Ambas frases NO tienen la misma longitud");
        }
    }
    
    public void unirFrases(Cadena frase){
        
        System.out.println("Ingrese otra frase para unir:");
        String frase3 = frase.getFrase() + leer.nextLine();
        
        System.out.println(frase3);
//        frase.setFrase(frase.getFrase() + frase3);
//        System.out.println(frase.getFrase());
    }
    
    public void reemplazar(Cadena frase){
        
        System.out.println("Ingrese un caracter que reemplazara las letras A");
        String letra2 = leer.next();
        String fraseR = frase.getFrase().replace("a", letra2);
        System.out.println(fraseR);
        
//        for (int i = 0; i < frase.getLongitud(); i++) {
            
//            if (frase.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
//                fraseR = frase.getFrase().replace(frase.getFrase().substring(i, i+1), letra2);
//            } else {
//               fraseR = frase.getFrase();
//            }
            
//        }
        
//        System.out.println(fraseR);
    }
    
    public void contiene(Cadena frase) {
        
        boolean contL = false;
        System.out.println("Ingrese una letra a buscar:");
        String buscL = leer.next();
//        int cont = 0;
        
        if (frase.getFrase().contains(buscL)) {
            contL = true;
            System.out.println("Contiene Letra?: " + contL);
        } else {
            System.out.println("Contiene Letra?: " + contL);
        }
//        for (int i = 0; i < frase.getLongitud(); i++) {
//            if (frase.getFrase().substring(i, i +1).equalsIgnoreCase(buscL)) {
//                cont = cont + 1;
//            } 
//        }
        
//        if (cont >= 1) {
//                contL = true;
//                System.out.println("Contiene Letra?: " + contL);
//            } else {
//                System.out.println("Contiene Letra?: " + contL);
//            }
        
    }
}
