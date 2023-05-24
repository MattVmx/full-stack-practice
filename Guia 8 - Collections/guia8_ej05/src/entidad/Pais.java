
package entidad;

import java.util.TreeSet;


public class Pais {
    
    private TreeSet<String> paises;

    public Pais() {
        paises = new TreeSet<>();
    }

    public Pais(TreeSet<String> paises) {
        this.paises = paises;
    }

    public TreeSet<String> getPaises() {
        return paises;
    }

    public void setPaises(TreeSet<String> paises) {
        this.paises = paises;
    }
    
}
