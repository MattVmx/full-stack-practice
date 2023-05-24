
package persistencia;

import entidades.Editorial;
import java.util.List;


public class EditorialDAO extends DAO<Editorial>{
    
     @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
    public Editorial editarEditorial(Editorial editorial){
        super.editar(editorial);
        return editorial;
    }
    
    public Editorial buscarXid(Integer id) {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }
    
    public List<Editorial> buscarXnombre(String nombre) {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM  Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        for (Editorial editorial : editoriales) {
            System.out.println(editorial);
        }
        desconectar();
        return editoriales;
    }
    
}
