
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

public class operacionService {
    
    
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion op = new Operacion();
        
        System.out.println("Ingrese un numero:");
        op.setNumero1(leer.nextInt());
        
        System.out.println("Ingrese otro numero:");
        op.setNumero2(leer.nextInt());
        
        return op;
}
    
    public void sumar(Operacion op){
        
        int suma = (op.getNumero1() + op.getNumero2());
        
        System.out.println("El resultado de la suma es:" + suma);
    }
    
    public void restar(Operacion op){
        
        int resta = (op.getNumero1() - op.getNumero2());
        
        System.out.println("El resultado de la resta es:" + resta);
    }
    
    public void multiplicar(Operacion op){
        
        int mul = (op.getNumero1() * op.getNumero2());
        
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Error, se ha multiplicado por 0");
            mul = 0;
        }
        
        System.out.println("El resultado de la multiplicacion es:" + mul);
    }
    
    public void dividir(Operacion op){
        
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Error, se ha dividido por 0");
        } else {
            int div = (op.getNumero1() / op.getNumero2());
            System.out.println("El resultado de la division es:" + div);
        }
    }
}
