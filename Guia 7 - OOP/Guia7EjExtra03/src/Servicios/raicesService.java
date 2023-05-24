package Servicios;

import java.util.Scanner;
import Entidad.Raices;

public class raicesService {

    Scanner leer = new Scanner(System.in);

    public Raices crearCoef() {

        Raices rz = new Raices();

        System.out.print("Ingrese el 1er coeficiente: ");
        rz.setA(leer.nextInt());
        System.out.print("Ingrese el 2do coeficiente: ");
        rz.setB(leer.nextInt());
        System.out.print("Ingrese el 3er coeficiente: ");
        rz.setC(leer.nextInt());

        return rz;
    }

    public double getDiscriminante(Raices rz) {

        double disc = Math.pow(rz.getB(), 2) - 4 * rz.getA() * rz.getC();
        System.out.println("El discriminante es: " + disc);

        return disc;
    }

    public boolean tieneRaices(Raices rz) {

        boolean ver = getDiscriminante(rz) > 0;

        if (ver) {
            ver = true;
            System.out.println("Tiene dos soluciones?: " + ver);
        }

        return ver;
    }

    public boolean tieneRaiz(Raices rz) {

        boolean ver = getDiscriminante(rz) == 0;

        if (ver) {
            ver = true;
            System.out.println("Tiene una solucion?: " + ver);
        }
        return ver;
    }

    public void obtenerRaices(Raices rz) {

        double fe = (-rz.getB() + Math.sqrt((Math.pow(rz.getB(), 2)) - (4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
        double fe2 = (-rz.getB() - Math.sqrt((Math.pow(rz.getB(), 2)) - (4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
        System.out.println("Las dos posibles soluciones son:");
        System.out.println("1. " + fe);
        System.out.println("2. " + fe2);

    }

    public void obtenerRaiz(Raices rz) {

        double fe = (-rz.getB() + Math.sqrt((Math.pow(rz.getB(), 2)) - (4 * rz.getA() * rz.getC()))) / (2 * rz.getA());
        System.out.println("La unica solucion es:");
        System.out.println("1. " + fe);

    }

    public void calcular(Raices rz) {

        if (tieneRaices(rz)) {
            obtenerRaices(rz);
        } else if (tieneRaiz(rz)) {
            obtenerRaiz(rz);
        } 

    }

}
