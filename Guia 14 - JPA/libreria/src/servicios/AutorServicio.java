
package servicios;

import entidades.Autor;
import java.util.List;
import java.util.Scanner;
import persistencia.AutorDAO;


public class AutorServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
//    private LibroServicio libroServicio;
//    private EditorialServicio editorialServicio;
    
    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

//    public void setServicios(LibroServicio libroServicio, EditorialServicio editorialServicio) {
//        this.libroServicio = libroServicio;
//        this.editorialServicio = editorialServicio;
//    }
    
    public Autor crearAutor(){
        
        Autor autor = new Autor();
        
        try {
            System.out.print("Ingrese el ID: ");
            int id = leer.nextInt();
            autor.setId(id);
            
            System.out.print("Ingrese el nombre: ");
            String nombre = leer.next();
            autor.setNombre(nombre);
            
            DAO.guardar(autor);
            
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } 
        
    }
    
    public Autor editarAutor(){
        
        System.out.print("Ingrese el ID del autor a modificar: ");
        int idautor = leer.nextInt();
        Autor autor = DAO.buscarXid(idautor);
        
        System.out.println("Desea modificar al autor " + autor.getNombre() + "? S/N");
        String resp = leer.next();
        
        if (resp.equalsIgnoreCase("S")) {
            System.out.print("Nuevo nombre: ");
            String nombre = leer.next();
            autor.setNombre(nombre);
            DAO.editarAutor(autor);
            return autor;
        } else {
            return autor;
        }
    }
    
    
    public List<Autor> listarAutores() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public List<Autor> imprimirAutores() {
        try {
            return DAO.imprimirTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public List<Autor> buscarXnombre() {
        try {
            
            String nombre;
            
            do {
                System.out.print("Ingrese el nombre a buscar: ");
                nombre = leer.next();
                if (DAO.buscarXnombre(nombre).isEmpty()) {
                System.out.println("El nombre existe");  
                }
            } while (DAO.buscarXnombre(nombre).isEmpty());
            
            return DAO.buscarXnombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public Autor buscarXid(Integer id) {
        try {
            
            do {
                System.out.print("Ingrese el id del autor a buscar: ");
                id = leer.nextInt();
                if (DAO.buscarXid(id) == null) {
                System.out.println("No existe");
            }
            } while (DAO.buscarXid(id) == null);
            
            
            return DAO.buscarXid(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
