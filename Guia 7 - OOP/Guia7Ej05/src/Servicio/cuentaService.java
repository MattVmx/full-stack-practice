
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class cuentaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        Cuenta account = new Cuenta();
        
        System.out.println("Ingrese su numero de cuenta:");
        account.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese su DNI:");
        account.setDNI(leer.next());
        
        account.setSaldo(100);
        System.out.println("Su saldo actual es: " + account.getSaldo());
        
        System.out.println("*****************");
        
        return account;
    }
    
    public void ingreso(Cuenta account){
        System.out.println("Ingrese el monto a ingresar:");
        double monto = leer.nextDouble();
        account.setSaldo(account.getSaldo() + monto);
        
        System.out.println("Su sueldo actual es: " + account.getSaldo());
    }
    
    public void retiro(Cuenta account){
        System.out.println("Ingrese el monto a retirar:");
        double monto = leer.nextDouble();
        
        if (account.getSaldo() < monto) {
            System.out.println("El monto a retirar es mayor al saldo");
            account.setSaldo(0);
             System.out.println("Su sueldo actual es: " + account.getSaldo());
        } else {
            account.setSaldo(account.getSaldo() - monto);
            System.out.println("Su sueldo actual es: " + account.getSaldo());
        }
    }
    
    public void extraccionRapida(Cuenta account){
        System.out.println("Ingrese monto para extraccion rapida:");
        
        double monto = leer.nextDouble();
        
        if (account.getSaldo()*0.2 < monto) {
            System.out.println("No se puede retirar mas del 20% del saldo");
            System.out.println("Su sueldo actual es: " + account.getSaldo());
        } else {
            account.setSaldo(account.getSaldo() - monto);
            System.out.println("Su sueldo actual es: " + account.getSaldo());
        }
    }
    
    public void consultarSaldo(Cuenta account){
       System.out.println("Su sueldo actual es: " + account.getSaldo());
    }
    
    public void consultarDatos(Cuenta account){
       System.out.println("Los datos actuales de su cuenta son: ");
       System.out.println("Su numero de cuenta es: " + account.getNumeroCuenta());
       System.out.println("DNI: " + account.getDNI());
       System.out.println("Saldo actual: " + account.getSaldo());
    }
}
