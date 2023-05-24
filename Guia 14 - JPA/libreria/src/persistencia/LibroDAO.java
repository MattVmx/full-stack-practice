
package persistencia;

import entidades.Libro;
import java.util.List;


public class LibroDAO extends DAO<Libro>{

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }
    
    public Libro editarLibro(Libro libro){
        super.editar(libro);
        return libro;
    }
    
    public Libro buscarXisbn(Long isnb){
    
        super.conectar();
       
        Libro libro = em.find(Libro.class, isnb);
                
        super.desconectar();
        
        return libro;
    }
    
    
    public List<Libro> buscarXnombre(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM  Libro l WHERE l.titulo LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        for (Libro autor : libros) {
            System.out.println(autor);
        }
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarXautor(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l, Autor a WHERE l.autor.id = a.id AND a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        desconectar();
        return libros;
    }
    

    public List<Libro> buscarXEditorial(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l, Editorial e WHERE l.editorial.id = e.id AND e.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        desconectar();
        return libros;
    }
    
    
    public void eliminarLibro(Long isbn){
        Libro libro = buscarXisbn(isbn);
        super.eliminar(libro);
    }
    
    
    
}
