
package persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DAO<T> {
    
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaPU");
    protected EntityManager em = emf.createEntityManager();
    
    protected void conectar(){
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }
    
    protected void desconectar(){
        if (em.isOpen()) {
            em.close();
        }
    }
    
    protected void guardar(T object){
        conectar();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        desconectar();
    }
    
    protected void editar(T object){
        conectar();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        desconectar();
    }
    
    protected void eliminar(T object){
        conectar();
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();
        desconectar();
    }
}
