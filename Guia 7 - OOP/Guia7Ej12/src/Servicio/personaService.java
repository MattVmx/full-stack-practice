
package Servicio;

import Entidad.Persona;
import java.util.Scanner;
import java.util.Date;


public class personaService {
   
    Scanner leer = new Scanner(System.in);
    Date fechaActual = new Date();
    public Persona crearPersona(){
        
        Persona per = new Persona();
        
        System.out.print("Ingrese su nombre: ");
        per.setNombre(leer.next());
        
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Anio: ");
        int anio = leer.nextInt();
        
        Date datos = new Date(anio-1900, mes - 1, dia);
        
        per.setFechaN(datos);

        System.out.println(per.getFechaN());
        
        return per;
    }
    
    public void calcularEdad(Persona per){
        
        System.out.println("La persona tiene: " + (fechaActual.getYear() - per.getFechaN().getYear()) + " anios");
    }
    
    public void menorQue(int edad, Persona per){
        
        boolean ver = false;
        
        if ((fechaActual.getYear() - per.getFechaN().getYear() < edad) ) {
            ver = true;
        } 
        
        System.out.println("La persona es menor que la edad por parametro?: " + ver);
    }
    
    public void mostrarPersona(Persona per){
        
        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Edad: " + (fechaActual.getYear() - per.getFechaN().getYear()) + " anios" );
    }
}
