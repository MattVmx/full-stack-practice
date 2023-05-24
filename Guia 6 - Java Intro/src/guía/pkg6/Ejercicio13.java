
package guía.pkg6;


import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cant de elementos: ");
        int elem = leer.nextInt();
        for (int i = 0; i < elem; i++) {
            for (int j = 0; j < elem; j++) {
                if (i == 0 || i == (elem - 1)) {
                    System.out.print("*");
                } else if (j == 0 || j == (elem - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
