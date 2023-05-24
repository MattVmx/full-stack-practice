
package persistencia;

import entidades.Fabricante;
import servicios.ProductoService;


public final class FabricanteDAO extends DAO{
    
    
    
    
    public Fabricante buscarFabXcod(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante WHERE codigo = " + codigo;
            consultarBase(sql);
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
    
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            
            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + "VALUES ( '" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "' );";
            
            insertModDel(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
