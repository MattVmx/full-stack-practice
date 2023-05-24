
package servicios;

import entidades.Editorial;
import java.util.List;
import java.util.Scanner;
import persistencia.EditorialDAO;


public class EditorialServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
//    private LibroServicio libroServicio;
//    private AutorServicio autorServicio;
    private final EditorialDAO DAO;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }
    
//    public void setServicios(LibroServicio libroServicio, AutorServicio autorServicio) {
//        this.libroServicio = libroServicio;
//        this.autorServicio = autorServicio;
//    }
    
    public Editorial crearEditorial(){
        
        Editorial editorial = new Editorial();
        
        try {
            System.out.print("Ingrese el ID: ");
            Integer id = leer.nextInt();
            editorial.setId(id);
            
            System.out.print("Ingrese el nombre: ");
            String nombre = leer.next();
            editorial.setNombre(nombre);
            
            DAO.guardar(editorial);
            
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } 
        
    }
    
    
    public Editorial editarEditorial(){
        
        System.out.print("Ingrese el ID de la editorial a modificar: ");
        int ided = leer.nextInt();
        Editorial editorial = DAO.buscarXid(ided);
        
        System.out.println("Desea modificar a la editorial " + editorial.getNombre() + "? S/N");
        String resp = leer.next();
        
        if (resp.equalsIgnoreCase("S")) {
            System.out.print("Nuevo nombre: ");
            String nombre = leer.next();
            editorial.setNombre(nombre);
            DAO.editarEditorial(editorial);
            return editorial;
        } else {
            return editorial;
        }
    }
    
    
    public Editorial buscarXid(Integer id) {
        try {
            return DAO.buscarXid(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Editorial> buscarXnombre() {
        try {
            System.out.print("Ingrese el nombre a buscar: ");
            String nombre = leer.next();
            return DAO.buscarXnombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
