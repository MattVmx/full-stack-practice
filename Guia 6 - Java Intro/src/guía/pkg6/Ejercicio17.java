package guía.pkg6;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
System.out.print("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        for (int i = 0; i < tam; i++) {
            if (vector[i] > 0 && vector[i] < 10) {
                cont1 += 1;
            } else if (vector[i] > 10 && vector[i] < 100) {
                cont2 += 1;
            } else if (vector[i] > 100 && vector[i] < 1000) {
                cont3 += 1;
            } else if (vector[i] > 1000 && vector[i] < 10000) {
                cont4 += 1;
            } else if (vector[i] > 10000 && vector[i] < 100000) {
                cont5 += 1;
            }
        }
        System.out.println("La cantidad de números encontrados de 1 digito son: " + cont1);
        System.out.println("***********************");
        System.out.println("La cantidad de números encontrados de 2 digitos son: " + cont2);
        System.out.println("***********************");
        System.out.println("La cantidad de números encontrados de 3 digitos son: " + cont3);
        System.out.println("***********************");
        System.out.println("La cantidad de números encontrados de 4 digitos son: " + cont4);
        System.out.println("***********************");
        System.out.println("La cantidad de números encontrados de 5 digitos son: " + cont5);
        
    }    
}

