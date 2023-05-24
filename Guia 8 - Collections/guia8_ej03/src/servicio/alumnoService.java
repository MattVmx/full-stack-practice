package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class alumnoService {

    Scanner leer = new Scanner(System.in);

    public void crearAlumno(ArrayList<Alumno> alumnos) {

        String resp = "";
        do {
            Alumno alumno = new Alumno();
            System.out.print("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.nextLine());
            System.out.println("Ingrese las tres notas:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota nro " + (i + 1) + ": ");
                alumno.getNotas().add(leer.nextInt());
            }
            alumnos.add(alumno);
            System.out.println("Desea guardar otro alumno? (S/N)");
            leer.nextLine();
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("S"));

        if (resp.equalsIgnoreCase("n")) {
            for (Alumno elemento : alumnos) {
                System.out.println(elemento.toString());
            }
        }
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {

        System.out.print("Ingrese el nombre a buscar: ");
        String nombre = leer.nextLine();
        int suma = 0;

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Se encuentra");
                for (Integer notas : alumno.getNotas()) {
                    suma = suma + notas;
                }
                System.out.println("El promedio de notas del alumno es: " + (suma / alumno.getNotas().size()));
            }
        }
    }
}
