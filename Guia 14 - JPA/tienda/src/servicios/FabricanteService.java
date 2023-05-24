
package servicios;

import persistencia.FabricanteDAO;


public class FabricanteService {
    
    private FabricanteDAO dao;  

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
//    public void crearFabricante(Integer codigo, String nombre) throws Exception {
//        
//        try {
//            
//            if (codigo == null) {
//                throw new Exception("Debe indicar el codigo");
//            }
//            if (nombre == null || nombre.trim().isEmpty()) {
//                throw new Exception("Debe indicar el nombre");
//            }
//            if (buscarProductoXcod(codigo) != null) {
//                throw new Exception("Ya existe un producto con el codigo " + codigo);
//            }
//            
//            Producto producto = new Producto();
//            producto.setCodigo(codigo);
//            producto.setNombre(nombre);
//            producto.setPrecio(precio);
//            producto.setCodigoFabricante(codigo_fabricante);
//            dao.guardarproducto(producto);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
}
