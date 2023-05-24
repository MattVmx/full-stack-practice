
package Entidad;


public class Operacion {
    
    private int numero1;
    private int numero2;
    
    
    
    
    //CONSTRUCTOR VACIO
    public Operacion() {
    }
    
    
    //CONSTRUCTOR
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    //SETTER
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    //GETTER
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

}
