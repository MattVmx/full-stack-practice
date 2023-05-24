package guía.pkg6;

import java.util.Scanner;

public class Ejercicio14_alt {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros: ");
        double euros = leer.nextDouble();

        System.out.println("A que moneda desea convertir:");
        System.out.println("1.Dolar");
        System.out.println("2.Libra");
        System.out.println("3.Yen");

        int option = leer.nextInt();

        Conversion(euros, option);

    }

    public static void Conversion(double e, int opt) {

        double dolar = e * 1.28611;
        double libra = e * 0.86;
        double yen = e * 129.852;

        switch (opt) {
            case 1:
                System.out.println("La cantidad de euros introducidos equivalen a: " + dolar + " dolares");
                break;
            case 2:
                System.out.println("La cantidad de euros introducidos equivalen a: " + libra + " libras");
                break;
            case 3:
                System.out.println("La cantidad de euros introducidos equivalen a: " + yen + " yenes");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }

}
