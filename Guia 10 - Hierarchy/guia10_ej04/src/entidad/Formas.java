
package entidad;

import interfaces.calculosFormas;


public class Formas implements calculosFormas{
    
    protected double perimetro;
    protected double area;

    public Formas() {
    }

    public Formas(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }
    
    @Override
    public void calcularA() {
    }

    @Override
    public void calcularP() {
    }
    
    
}
