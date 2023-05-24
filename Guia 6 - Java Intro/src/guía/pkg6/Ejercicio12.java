
package guía.pkg6;


import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args){
   Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema RS232");
        String cad1;
        int cont1= 0;
        int cont2= -1;
        do {
            System.out.println("Ingrese una cadena de no más de 5 caracteres: ");
            cad1 = leer.nextLine();
        if (cad1.substring(0,1).equalsIgnoreCase("X") && cad1.substring(cad1.length()-1,cad1.length()).equalsIgnoreCase("O") && cad1.length()<=5){
            cont1 +=1;
        } else {
            cont2 +=1;
        }
        } while ((!(cad1.equals("&&&&&"))));
      
        System.out.println("Las cadenas ingresadas correctamente son: " + cont1);
        System.out.println("Las cadenas ingresadas incorrectamente son: " + cont2);
        
    }
}

