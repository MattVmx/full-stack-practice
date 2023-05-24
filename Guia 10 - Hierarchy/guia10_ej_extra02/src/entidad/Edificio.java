
package entidad;


public abstract class Edificio {
    
    protected double ancho = 50;
    protected double alto = 100;
    protected double largo = 50;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
}
