
package entidad;

public final class Barco_motor extends Barco{
    
    private int CV;

    public Barco_motor() {
    }

    public Barco_motor(int CV, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
    }
    
    
    
}
