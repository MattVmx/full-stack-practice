
package Main;

import Servicio.personaService;
import Entidad.Persona;

public class Ejercicio7 {


    public static void main(String[] args) {
        
        personaService ps = new personaService();
        
        int contMayor = 0;
        int contMenor = 0;
        int contBajo = 0, contAlto  = 0;
        int contPromedio = 0;
                
//        for (int i = 0; i < 4; i++) {
//        Persona person = ps.crearPersona();
//        System.out.println("***************");
//        ps.calcularIMC(person);
//        System.out.println("***************");
//            if (ps.esMayorDeEdad(person) == 1) {
//               contMayor = contMayor + 1; 
//            } else {
//               contMenor = contMenor + 1; 
//            }
//            if (person.getIMC() == 1) {
//                contAlto = contAlto +1;
//            } else if (person.getIMC() == 0) {
//                contPromedio = contPromedio + 1; 
//            } else {
//                contBajo = contBajo + 1; 
//            }
//        }



        Persona person = ps.crearPersonaNull();
        
        try {
            if (ps.esMayorDeEdad(person) == 1) {
               contMayor = contMayor + 1; 
            } else {
               contMenor = contMenor + 1; 
            }
            if (person.getIMC() == 1) {
                contAlto = contAlto +1;
            } else if (person.getIMC() == 0) {
                contPromedio = contPromedio + 1; 
            } else {
                contBajo = contBajo + 1; 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
        
        
        System.out.println("El porcentaje de personas mayores de edad son: " + (contMayor * 100) / 4 + "%");
        System.out.println("El porcentaje de personas menores de edad son: " + (contMenor * 100) / 4 + "%");
        System.out.println("El porcentaje de personas con IMC = 1 son: " + (contAlto * 100) / 4 + "%");
        System.out.println("El porcentaje de personas con IMC = 0 son: " + (contPromedio * 100) / 4 + "%");
        System.out.println("El porcentaje de personas con IMC = -1 son: " + (contBajo * 100) / 4 + "%");
        
    }
    
}
