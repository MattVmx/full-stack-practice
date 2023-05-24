
package entidad;

import java.util.HashMap;


public class Producto {
    
    private HashMap<String, Integer> productos;

    public Producto() {
        productos = new HashMap<>();
    }

    public Producto(HashMap<String, Integer> productos) {
        this.productos = productos;
    }

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Integer> productos) {
        this.productos = productos;
    }
    
    
    
}
