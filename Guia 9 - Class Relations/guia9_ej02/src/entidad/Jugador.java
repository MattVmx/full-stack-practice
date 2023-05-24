
package entidad;

import entidad.Revolver;

public class Jugador {
    
    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    public boolean disparo (Revolver r){
        
        if (r.mojar()) {
            System.out.println(nombre + " esta mojado");
            mojado = true;
            return true;
        } else {
            System.out.println(nombre + " no esta mojado");
            System.out.println("");
            r.siguienteChorro();
            System.out.println("*************");
            System.out.println("");
            r.mostrar();
            System.out.println("");
            System.out.println("Se dispara el revolver");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + "\n" + "Esta mojado? " + mojado;
    }
    
    
    
}
