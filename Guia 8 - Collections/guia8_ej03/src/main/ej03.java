
package main;

import entidad.Alumno;
import java.util.ArrayList;
import servicio.alumnoService;


public class ej03 {

   
    public static void main(String[] args) {
       
        alumnoService as = new alumnoService();
        ArrayList<Alumno> a = new ArrayList<>();
        as.crearAlumno(a);
        as.notaFinal(a);
    }
    
}
