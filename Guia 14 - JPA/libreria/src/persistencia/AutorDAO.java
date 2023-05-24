
package persistencia;

import entidades.Autor;
import java.util.List;


public class AutorDAO extends DAO<Autor>{
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    public Autor editarAutor(Autor autor){
        super.editar(autor);
        return autor;
    }
    
    
    public List<Autor> listarTodos() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public List<Autor> imprimirTodos() {
        conectar();
        List<Autor> autores = listarTodos();
                for (Autor autor : autores) {
                    System.out.println(autor);
        }
        desconectar();
        return autores;
    }
    
    
    public List<Autor> buscarXnombre(String nombre) {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM  Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        for (Autor autor : autores) {
            System.out.println(autor);
        }
        desconectar();
        return autores;
    }
    
    
    public Autor buscarXid(Integer id) {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }
    
    

}
