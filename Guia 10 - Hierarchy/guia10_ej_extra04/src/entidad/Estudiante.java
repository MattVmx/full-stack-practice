
package entidad;


public class Estudiante extends Persona{
    
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String numID, String estadoCivil) {
        super(nombre, apellido, numID, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + "Curso: " + curso;
    }
    
    
}
