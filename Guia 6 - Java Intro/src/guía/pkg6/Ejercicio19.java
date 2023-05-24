package guía.pkg6;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        int[][] matrizN = new int[3][3];
        matrizN[0][0] = 0;
        matrizN[0][1] = -2;
        matrizN[0][2] = 4;
        
        matrizN[1][0] = 2;
        matrizN[1][1] = 0;
        matrizN[1][2] = 2;
        
        matrizN[2][0] = -4;
        matrizN[2][1] = -2;
        matrizN[2][2] = 0;

        int[][] matrizT = new int[3][3];
        int[][] matrizNeg = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //matrizN[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matrizN[i][j] + "]");
            }
            System.out.println("");
        }
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = matrizN[i][j];
            }
        }
        
        System.out.println("************");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("************");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizNeg[i][j] = -matrizT[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizNeg[i][j] + "]");
            }
            System.out.println("");
            
        }
        
        if (Arrays.deepEquals(matrizN, matrizNeg)) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
    }
}
