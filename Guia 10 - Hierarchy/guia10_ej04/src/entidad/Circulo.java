
package entidad;

public final class Circulo extends Formas{
    
    private final double diametro = 50;
    private final double radio = 30;

    public Circulo() {
    }
    
    public Circulo(double perimetro, double area) {
        super(perimetro, area);
    }

    @Override
    public void calcularA() {
        area = pi * (radio*radio);
        System.out.println("Area: " + area);
    }
    
    @Override
    public void calcularP() {
        perimetro = pi * diametro;
        System.out.println("Perimetro: " + perimetro);
    }
    
}
