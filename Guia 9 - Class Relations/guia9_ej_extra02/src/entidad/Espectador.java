
package entidad;


public class Espectador {
    
    private String nombre;
    private int edad;
    private int dinero;

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador: " + nombre + ", Edad: " + edad + ", Dinero: " + dinero;
    }
    
    
    
}
