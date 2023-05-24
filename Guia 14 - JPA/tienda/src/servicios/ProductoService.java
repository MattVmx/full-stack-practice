
package servicios;

import entidades.Producto;
import java.util.Collection;
import persistencia.ProductoDAO;


public class ProductoService {
    
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }
    
    public Collection<Producto> listarProductos() throws Exception {

        try {

            Collection<Producto> productos = dao.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Collection<Producto> listarProductosXprecio() throws Exception {

        try {

            Collection<Producto> productos = dao.buscarXprecio();

            return productos;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Collection<Producto> listarProductosXportatil() throws Exception {

        try {

            Collection<Producto> productos = dao.buscarXproductoPortatil();

            return productos;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Collection<Producto> listarProductosBarato() throws Exception {

        try {

            Collection<Producto> productos = dao.buscarBarato();

            return productos;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
    public void imprimirProductos() throws Exception {

        try {
            
            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirProductosXnombre() throws Exception {

        try {

            
            Collection<Producto> productos = listarProductos();

           
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirProductosXnombrePrecio() throws Exception {

        try {

            
            Collection<Producto> productos = listarProductos();

           
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " - $" + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirProductosXPrecio() throws Exception {

        try {

            
            Collection<Producto> productos = listarProductosXprecio();

           
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirListaPortatil() throws Exception {

        try {

            
            Collection<Producto> productos = listarProductosXportatil();

           
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void imprimirBarato() throws Exception {

        try {

            
            Collection<Producto> productos = listarProductosBarato();

           
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + " $" + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoXcod(Integer codigo) throws Exception {

        try {

            
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo del producto");
            }

            Producto producto = dao.buscarProductoXcod(codigo);

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public void crearProducto(Integer codigo, String nombre, Double precio, Integer codigo_fabricante) throws Exception {

        try {
            
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (precio == null) {
                throw new Exception("Debe indicar el precio");
            }
            if (codigo_fabricante == null) {
                throw new Exception("Debe indicar el codigo de fabricante");
            }
            if (buscarProductoXcod(codigo) != null) {
                throw new Exception("Ya existe un producto con el codigo " + codigo);
            }
            
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigo_fabricante);
            dao.guardarproducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
