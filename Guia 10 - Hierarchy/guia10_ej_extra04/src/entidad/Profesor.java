
package entidad;


public class Profesor extends Persona{
    
    private String dep;

    public Profesor() {
    }

    public Profesor(String dep, String nombre, String apellido, String numID, String estadoCivil) {
        super(nombre, apellido, numID, estadoCivil);
        this.dep = dep;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
    

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + "Departamento: " + dep;
    }
    
    
}
