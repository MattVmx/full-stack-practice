
package entidad;


public class Polideportivo extends Edificio{
    
    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }
    
    
    @Override
    public void calcularSuperficie() {
        double superficie = ancho * largo;
        System.out.println("Superficie del polideportivo: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = ancho * largo * alto;
        System.out.println("Volumen del polideportivo: " + volumen);
    }
    
}
