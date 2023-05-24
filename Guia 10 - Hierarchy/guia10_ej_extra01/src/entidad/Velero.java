
package entidad;


public final class Velero extends Barco{
    
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }
    
    
}
