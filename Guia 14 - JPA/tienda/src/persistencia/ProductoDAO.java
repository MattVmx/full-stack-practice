
package persistencia;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;


public final class ProductoDAO extends DAO{
    
    public void guardarproducto(Producto producto) throws Exception{
    
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un prodcuto");
            }
            
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "' );";
            
            insertModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto buscarProductoXcod(Integer codigo) throws Exception {
        try {

            String sql = "SELECT * FROM producto "
                    + " WHERE codigo = " + codigo;

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public Collection<Producto> buscarXprecio() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN " + 120 + " AND " + 202;
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
        
    }
    
    
    public Collection<Producto> buscarXproductoPortatil() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
        
    }
    
    public Collection<Producto> buscarBarato() throws Exception{
        
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1;";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
        
    }
}
