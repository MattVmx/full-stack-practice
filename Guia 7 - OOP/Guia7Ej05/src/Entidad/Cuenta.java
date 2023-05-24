
package Entidad;

public class Cuenta {
    
    private int numeroCuenta;
    private String DNI;
    private double saldo;
    private int interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String DNI, int saldo, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }
    
    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public int getInteres() {
        return interes;
    }
    
    

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setInteres(int interes) {
        this.interes = interes;
    }
    
}
