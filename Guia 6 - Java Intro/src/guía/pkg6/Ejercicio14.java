package guía.pkg6;


import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros: ");
        double euros = leer.nextDouble();
        
        double retornoD = convD(euros);
        double retornoL = convL(euros);
        double retornoY = convY(euros);
        
        System.out.println("A que moneda desea convertir:");
        System.out.println("1.Dolar");
        System.out.println("2.Libra");
        System.out.println("3.Yen");
        
        int option = leer.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("La cantidad de euros introducidos equivalen a: " + retornoD + " dolares");
                break;
            case 2:
                System.out.println("La cantidad de euros introducidos equivalen a: " + retornoL + " libras");
                break;
            case 3:
                System.out.println("La cantidad de euros introducidos equivalen a: " + retornoY + " yenes");
                break;    
            default:
                System.out.println("Seleccione una opcion valida");
        }
    }
    
    public static double convD (double e){
        
        double dolar = e * 1.28611;
        
        return dolar;
    }
    
    public static double convL (double e){
        
        double libra = e * 0.86;
        
        return libra;
    }
    
    public static double convY (double e){
        
        double yen = e * 129.852;
        
        return yen;
    }
}