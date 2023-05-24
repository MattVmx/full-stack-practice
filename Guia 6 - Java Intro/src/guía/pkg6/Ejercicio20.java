package guía.pkg6;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int sumaF = 0;
        int sumaC = 0;
        int sumaD = 0;
        int sumaDI = 0;
        int aux = 0;
        int valF = 0;
        int valC = 0;

        //Dimension MATRIZ
        System.out.println("Ingrese la dimension de la matriz");
        int tam = leer.nextInt();
        int[][] matriz = new int[tam][tam];

        //Llenar MATRIZ
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Ingrese un numero para la fila n: " + (i + 1) + ", columna n: " + (j + 1));
                int num1 = leer.nextInt();
                matriz[i][j] = num1;
                while (num1 < 1 || num1 > 9) {
                    System.out.println("Por favor ingrese un numero que se encuentre entre 1 y 9");
                    num1 = leer.nextInt();
                    matriz[i][j] = num1;
                }
            }
        }

        //Mostrar MATRIZ
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        //Suma FILAS MATRIZ
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                sumaF = sumaF + matriz[i][j];
            }
            if (i == 0) {
                aux = sumaF;
                valF = valF + 1;
            } else if (aux == sumaF) {
                valF = valF + 1;
            }
            
            sumaF = 0;
        }

        if (valF == tam) {
            sumaF = aux;
        }
        
        System.out.println("La suma de las filas es: " + sumaF);

        //Suma COLUMNAS MATRIZ
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                sumaC = sumaC + matriz[j][i];
            }
            if (i == 0) {
                aux = sumaC;
                valC = valC + 1;
            } else if (aux == sumaC) {
                valC = valC + 1;
            }
            sumaC = 0;
        }

        if (valC == tam) {
            sumaC = aux;
        }
        
        System.out.println("La suma de las columnas es: " + sumaC);

        //Suma DIAGONAL MATRIZ
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    sumaD = sumaD + matriz[i][j];
                }
            }
        }
        
        System.out.println("La suma de la diagonal es: " + sumaD);

        //Suma DIAGONAL INVERSA MATRIZ
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    sumaDI = sumaDI + matriz[tam - 1 - i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal inversa es: " + sumaDI);
        
        //COMPARACIÓN
        if (sumaC==sumaD && sumaF==sumaD && sumaDI==sumaD ) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz NO es magica");
        }

    }
}


