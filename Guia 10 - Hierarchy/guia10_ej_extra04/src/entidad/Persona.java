
package entidad;


public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String numID;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numID, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numID = numID;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    

    @Override
    public String toString() {
        return nombre + " " + apellido + ", Numero de ID: " + numID + ", Estado Civil: " + estadoCivil + ", ";
    }
    
    
}
