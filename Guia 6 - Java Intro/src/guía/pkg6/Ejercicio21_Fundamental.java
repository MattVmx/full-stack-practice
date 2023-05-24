package guía.pkg6;

import java.util.Scanner;

public class Ejercicio21_Fundamental {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz10 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz10[i][j] = (int) (Math.random() * 100);
                System.out.print(" [ " + matriz10[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número para la fila " + i + " columna " + j + " : ");
                int num = leer.nextInt();
                matriz3[i][j] = num;
            }
        }
        int verificación = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz3[0][0] == matriz10[i][j]) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matriz3[k][l] == matriz10[k+i][l+j]) {
                                verificación += 1;
                            }
                        }
                    }
                }
            }
        }
        if (verificación == 9) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}
