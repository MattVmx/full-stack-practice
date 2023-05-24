
package guía.pkg6;



import java.util.Scanner;


public class Ejercicio_Extra2 {

     
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);

        aux = B;
        B = C;
        
        C = A;
        
        A = D;
        
        D = aux;
        
        
        System.out.println("*******************");
        
        System.out.println("El valor de A final es: " + A);
        System.out.println("El valor de B final es: " + B);
        System.out.println("El valor de C final es: " + C);
        System.out.println("El valor de D final es: " + D);
    }
    
}