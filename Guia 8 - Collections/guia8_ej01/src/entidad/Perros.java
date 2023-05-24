
package entidad;

import java.util.ArrayList;


public class Perros {
    
    private ArrayList<String> razas;

    public Perros() {
        razas = new ArrayList();
    }

    public Perros(ArrayList<String> razas) {
        this.razas = razas;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }
    
    
}
