package guía.pkg6;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int[][] matriz2 = new int[3][3];

        //MATRIZ 10x10
        System.out.println("MATRIZ 10x10:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");

        //MATRIZ 3x3
        System.out.println("MATRIZ 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero para la fila n: " + (i + 1) + ", columna n: " + (j + 1));
                int num1 = leer.nextInt();
                matriz2[i][j] = num1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
        //COMPARACIÓN
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cont = 0;
                if (matriz2[0][0] == matriz[i][j]) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matriz2[k][l] == matriz[k + i][l + j]) {
                                cont = cont + 1;
                                System.out.println(cont);
                            }
                        }
                    }
                }
                if (cont == 9) {
                    break;
                }
            }
            if (cont == 9) {
                break;
            }
        }

        if (cont == 9) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }


    }

}
