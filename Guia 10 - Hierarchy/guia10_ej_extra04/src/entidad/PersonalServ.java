
package entidad;


public class PersonalServ extends Persona{
    
    private String seccion;

    public PersonalServ() {
    }

    public PersonalServ(String seccion, String nombre, String apellido, String numID, String estadoCivil) {
        super(nombre, apellido, numID, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    

    @Override
    public String toString() {
        return "Personal de servicio: " + super.toString() + "Seccion: " + seccion;
    }
    
    
}
