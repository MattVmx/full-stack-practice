package guía.pkg6;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese el tamaño de las filas");
        int f = leer.nextInt();

        System.out.println("Ingrese el tamaño de las columnas");
        int c = leer.nextInt();

        int[][] matriz = new int[f][c];
//        int[][] matriz2 = new int[c][f];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

//        for (int i = 0; i < f; i++) {
//            for (int j = 0; j < c; j++) {
//                matriz2[j][i] = matriz[i][j];
//            }
//        }
        
        System.out.println("************");
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
