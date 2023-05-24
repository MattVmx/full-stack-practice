
package entidad;


public class Rectangulo extends Formas{
    
    private final double base = 50;
    private final double altura = 30;

    public Rectangulo() {
    }
    

    public Rectangulo(double perimetro, double area) {
        super(perimetro, area);
    }

    @Override
    public void calcularA() {
        area = base * altura;
        System.out.println("Area: " + area);
    }

    @Override
    public void calcularP() {
        perimetro = (base + altura) * 2;
        System.out.println("Perimetro: " + perimetro);
    }
}
