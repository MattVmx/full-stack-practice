package guía.pkg6;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int cont = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();

        int[] vector = new int[tam];
        
        System.out.println("Que numero desea buscar en el vector?");
        int num = leer.nextInt();

        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        
         System.out.println(" ");
         
        for (int i = 0; i < tam; i++) {
            if (vector[i] == num) {
                cont = cont + 1;
                System.out.println("El numero ingresado se encuentra en la posicion: " + (i + 1));
            }
        }
        
        System.out.println("El numero ingresado se encuentra repetido: " + cont + " veces");
    }
}
