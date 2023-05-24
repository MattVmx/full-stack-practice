package main;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ej01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String opt = "";
        String buscarperro = "";
        boolean vf = false;
        boolean vf2 = false;

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        do {
            System.out.println("Ingrese los datos del perro:");
            Perro perro = new Perro();
            System.out.print("Nombre: ");
            perro.setNombre(leer.next());
//            System.out.print("Raza: ");
//            perro.setRaza(leer.next());
//            System.out.print("Edad: ");
//            perro.setEdad(leer.nextInt());
//            System.out.print("Tamanio: ");
//            perro.setTamanio(leer.next());
            perros.add(perro);
            System.out.println("Desea guardar otro perro? (S/N)");
            opt = leer.next();
        } while (opt.equalsIgnoreCase("S"));

        System.out.println("******************");

        do {
            System.out.println("Ingrese los datos de la persona:");
            Persona p1 = new Persona();
            Perro aux = new Perro(" ");
            System.out.print("Nombre: ");
            p1.setNombre(leer.next());
//            System.out.print("Apellido: ");
//            p1.setApellido(leer.next());
//            System.out.print("Edad: ");
//            p1.setEdad(leer.nextInt());
//            System.out.print("DNI: ");
//            p1.setDni(leer.next());
              p1.setPerro(aux);
            System.out.println("******************");
            System.out.println("Lista de perros: ");
            for (Perro perro : perros) {
                System.out.println(perro);
            }

            System.out.println("******************");

            do {
                vf2 = false;
                vf = false;
                System.out.print("Ingrese el nombre del perro a adoptar: ");
                buscarperro = leer.next();

                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(buscarperro)) {
                        vf = true;
                        break;
                    } else {
                        vf = false;
                    }
                }

                if (!vf) {
                    System.out.println("El perro no se encuentra en la lista");
                } else {
                    
                    for (Persona persona : personas) {
                        if (persona.getPerro().getNombre().equalsIgnoreCase(buscarperro)) {
                            vf = true;
                        } else {
                            vf = false;
                            break;
                        }
                    }
                    
                    if (personas.isEmpty()) {
                        vf = false;
                    }

                    if (vf) {
                        System.out.println("El perro ya pertenece a otra persona");
                        System.out.println("******************");
                        vf = false;
                    } else {
                        for (Perro perro : perros) {
                            if (perro.getNombre().equalsIgnoreCase(buscarperro)) {
                                vf = true;
                                p1.setPerro(perro);
                                System.out.println("Gracias por adoptar a este perro");
                                System.out.println("******************");
                            }
                        }
                    }

                }

            } while (!vf);

            personas.add(p1);
            System.out.println("Desea guardar otra persona? (S/N)");
            opt = leer.next();
        } while (opt.equalsIgnoreCase("S"));

        for (Persona p : personas) {
            System.out.println(p);
        }

    }

}
