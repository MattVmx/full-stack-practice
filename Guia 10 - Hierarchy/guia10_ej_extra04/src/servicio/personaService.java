package servicio;

import entidad.Empleado;
import entidad.Estudiante;
import entidad.Persona;
import entidad.PersonalServ;
import entidad.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class personaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Persona> crearPersonas() {

        ArrayList<Persona> personas = new ArrayList<>();

        Persona p = new Estudiante("Abogacia", "Juan", "Rodriguez", "43215", "Soltero");
        Persona p2 = new Profesor("Traductorado", "Pablo", "Rojas", "35484", "Casado");
        Persona p3 = new Empleado("2017", "56762", "Ricardo", "Milos", "576542", "Viudo");
        Persona p4 = new PersonalServ("Limpieza", "Lucas", "Nulos", "16746", "Casado");

        personas.add(p);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        return personas;

    }

    public void cambioEstadoCivil(ArrayList<Persona> personas) {

        System.out.println("Ingrese el ID de la persona para cambio de estado civil: ");
        String nuevoEC = leer.next();

        for (Persona aux : personas) {
            if (aux.getNumID().equals(nuevoEC)) {
                System.out.println("Nuevo estado civil para " + aux.getNombre() + " " + aux.getApellido() + ": ");
                aux.setEstadoCivil(leer.next());
            }
        }
    }

    public void reasignacionDespacho(ArrayList<Persona> personas) {

        System.out.println("Ingrese el ID del empleado para reasignacion de despacho:");
        String nuevoD = leer.next();

        for (Persona aux : personas) {
            if (aux instanceof Empleado e) {
                if (aux.getNumID().equals(nuevoD)) {
                    System.out.println("Nuevo numero de despacho para el empleado " + aux.getNombre() + " " + aux.getApellido() + ": ");
                    e.setNumDespacho(leer.next());
                }
            }
        }
    }

    public void cambioCurso(ArrayList<Persona> personas) {

        System.out.println("Ingrese el ID del estudiante para nueva matriculacion de curso:");
        String nuevoC = leer.next();

        for (Persona aux : personas) {
            if (aux instanceof Estudiante e) {
                if (aux.getNumID().equals(nuevoC)) {
                    System.out.println("Nuevo curso para el estudiante: " + aux.getNombre() + " " + aux.getApellido() + ": ");
                    e.setCurso(leer.next());
                }
            }
        }
    }

    public void cambioDep(ArrayList<Persona> personas) {

        System.out.println("Ingrese el ID del profesor para asignar a nuevo departamento:");
        String nuevoDep = leer.next();

        for (Persona aux : personas) {
            if (aux instanceof Profesor e) {
                if (aux.getNumID().equals(nuevoDep)) {
                    System.out.println("Nuevo departamento para el profesor " + aux.getNombre() + " " + aux.getApellido() + ": ");
                    e.setDep(leer.next());
                }
            }
        }
    }

    public void trasladoSeccion(ArrayList<Persona> personas) {

        System.out.println("Ingrese el ID del personal para traslado de seccion:");
        String nuevaS = leer.next();

        for (Persona aux : personas) {
            if (aux instanceof PersonalServ e) {
                if (aux.getNumID().equals(nuevaS)) {
                    System.out.println("Nueva seccion para el personal " + aux.getNombre() + " " + aux.getApellido() + ": ");
                    e.setSeccion(leer.next());
                }
            }
        }

        for (Persona aux : personas) {
            System.out.println(aux);
        }
    }

    public void mostrarLista(ArrayList<Persona> personas) {

        for (Persona aux : personas) {
            System.out.println(aux);
        }
    }

    public void mostrarEstudiantes(ArrayList<Persona> personas) {

        for (Persona aux : personas) {
            if (aux instanceof Estudiante) {
                System.out.println(aux);
            }
        }
    }

    public void mostrarProfes(ArrayList<Persona> personas) {

        for (Persona aux : personas) {
            if (aux instanceof Profesor) {
                System.out.println(aux);
            }
        }
    }

    public void mostrarEmpleados(ArrayList<Persona> personas) {

        for (Persona aux : personas) {
            if (aux instanceof Empleado) {
                System.out.println(aux);
            }
        }
    }

    public void mostrarPersonal(ArrayList<Persona> personas) {

        for (Persona aux : personas) {
            if (aux instanceof PersonalServ) {
                System.out.println(aux);
            }
        }
    }

    public void menu(ArrayList<Persona> personas) {

        int opt = 0;

        do {
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("1. Mostrar Lista completa");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Mostrar Profesores");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Mostrar Personal de servicio");
            System.out.println("6. Cambiar Estado Civil");
            System.out.println("7. Reasigar Despacho de Empleado");
            System.out.println("8. Cambiar Matriculacion de Curso de Estudiante");
            System.out.println("9. Cambiar Departamento de Profesor");
            System.out.println("10. Traslado de Seccion de Personal de Servicio");
            System.out.println("11. SALIR");

            opt = leer.nextInt();

            switch (opt) {
                case 1 ->
                    mostrarLista(personas);
                case 2 ->
                    mostrarEstudiantes(personas);
                case 3 ->
                    mostrarProfes(personas);
                case 4 ->
                    mostrarEmpleados(personas);
                case 5 ->
                    mostrarPersonal(personas);
                case 6 ->
                    cambioEstadoCivil(personas);
                case 7 ->
                    reasignacionDespacho(personas);
                case 8 ->
                    cambioCurso(personas);
                case 9 ->
                    cambioDep(personas);
                case 10 ->
                    trasladoSeccion(personas);
                case 11 -> {
                }
                default ->
                    System.out.println("Ingrese una opcion correcta");
            }
        } while (opt != 11);

    }

}
