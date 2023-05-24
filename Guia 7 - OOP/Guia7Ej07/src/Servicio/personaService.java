
package Servicio;

import java.util.Scanner;
import Entidad.Persona;

public class personaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
//    public Persona crearPersona(){
//        
//        Persona per = new Persona();
//        
//        System.out.print("Ingrese su nombre: ");
//        per.setNombre(leer.next());
//        
//        System.out.print("Ingrese su edad: ");
//        per.setEdad(leer.nextInt());
//        
//        System.out.println("Seleccione su sexo:");
//        System.out.println("H. Hombre");
//        System.out.println("M. Mujer");
//        System.out.println("O. Otro");
//        per.setSexo(leer.next());
//        
//        while (!(per.getSexo().equalsIgnoreCase("H") || per.getSexo().equalsIgnoreCase("M") || per.getSexo().equalsIgnoreCase("O"))) {
//            System.out.println("Seleccione una de las opciones correspondientes:");
//            System.out.println("H. Hombre");
//            System.out.println("M. Mujer");
//            System.out.println("O. Otro");
//            per.setSexo(leer.next());
//        }
//        
//        System.out.print("Ingrese su peso: ");
//        per.setPeso(leer.nextDouble());
//        
//        System.out.print("Ingrese su altura: ");
//        per.setAltura(leer.nextDouble());
//        
//        return per;
//    }
    
    public Persona crearPersonaNull(){
        
        Persona per = new Persona();
        
        return per;
    }
    
    
    public void calcularIMC(Persona per){
        
        double IMC = per.getPeso() / (per.getAltura() * per.getAltura());
        
        System.out.println("Segun tus datos tu IMC es el siguiente: ");
        System.out.println("IMC: " + IMC);
        if (IMC < 20) {
            System.out.println("Estas por debajo de tu peso ideal");
            per.setIMC(-1);
        } else if (IMC >= 20 && IMC <= 25){
            System.out.println("Estas en tu peso ideal");
            per.setIMC(0);
        } else {
            System.out.println("Tienes sobrepeso");
            per.setIMC(1);
        }
    }
    
    public int esMayorDeEdad(Persona per) throws Exception{
        
        boolean edad = false;
        int valEdad = 0;
        
        if (per.getEdad() == 0) {
            throw new Exception("La persona no tiene una edad definida");
        }
        
        if (per.getEdad() >= 18) {
            valEdad = 1;
            edad = true;
            System.out.println("Es mayor de edad: " + edad);
        } else {
            System.out.println("Es mayor de edad: " + edad);
        }
        return valEdad;
    }
    
}
