
package entidad;


public class Empleado extends Persona{
   
    private String incorp;
    private String numDespacho;

    public Empleado() {
    }

    public Empleado(String incorp, String numDespacho, String nombre, String apellido, String numID, String estadoCivil) {
        super(nombre, apellido, numID, estadoCivil);
        this.incorp = incorp;
        this.numDespacho = numDespacho;
    }

    public String getIncorp() {
        return incorp;
    }

    public void setIncorp(String incorp) {
        this.incorp = incorp;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    

    @Override
    public String toString() {
        return "Empleado: " + super.toString() + "Anio de incorporacion: " + incorp + ", Numero de despacho: " + numDespacho;
    }
    
    
}
