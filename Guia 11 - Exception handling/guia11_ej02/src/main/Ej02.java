
package main;


public class Ej02 {

    
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4};
        
        try {
          for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]);
        }  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El valor se encuentra fuera de rango");
        }
        
        
        
    }
    
}
