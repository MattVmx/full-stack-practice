package main;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Primer valor: ");
        String num = leer.next();
        System.out.print("Segundo valor: ");
        String num2 = leer.next();

        try {
            Integer numConv = Integer.parseInt(num);
            Integer numConv2 = Integer.parseInt(num2);

            int div = numConv / numConv2;
            
            System.out.println(div);
            
        } catch (NumberFormatException e) {
            System.out.println("No se introdujeron numeros");
        } catch (ArithmeticException e){
            System.out.println("Error: division por 0");
        } finally{
            System.out.println("Hola");
        }

        System.out.println("asd");

    }

}
