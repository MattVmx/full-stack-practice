
package entidad;


public final class Yate extends Barco{
    
    private int CV;
    private int camarotes;

    public Yate() {
    }

    public Yate(int CV, int camarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
        this.camarotes = camarotes;
    }

    
}
