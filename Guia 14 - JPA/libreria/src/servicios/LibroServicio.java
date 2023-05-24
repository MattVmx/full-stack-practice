
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;
import persistencia.LibroDAO;


public class LibroServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private AutorServicio autorServicio = new AutorServicio();
    private EditorialServicio editorialServicio = new EditorialServicio();
    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }
    
    public void setServicios(AutorServicio autorServicio, EditorialServicio editorialServicio) {
        this.autorServicio = autorServicio;
        this.editorialServicio = editorialServicio;
    }
    
    
    public Libro crearLibro(){
        
        Libro libro = new Libro();
        
        try {
            System.out.print("Ingrese el isbn: ");
            Long isbn = leer.nextLong();
            libro.setIsbn(isbn);
            
            System.out.print("Ingrese el titulo: ");
            String titulo = leer.next();
            libro.setTitulo(titulo);
            
            System.out.print("Ingrese el anio: ");
            Integer anio = leer.nextInt();
            libro.setAnio(anio);
            
            System.out.print("Ingrese la cantidad de ejemplares: ");
            Integer ejemplares = leer.nextInt();
            libro.setEjemplares(ejemplares);
            
            System.out.print("Ingrese el ID del autor: ");
            Integer idAutor = leer.nextInt();
            libro.setAutor(autorServicio.buscarXid(idAutor));
            
            System.out.print("Ingrese el ID de la editorial: ");
            Integer idEdit = leer.nextInt();
            libro.setEditorial(editorialServicio.buscarXid(idEdit));
            
            libro.setAlta(true);
            
            DAO.guardar(libro);
            
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public Libro editarLibro(){
        
        System.out.print("Ingrese el ISBN del libro a modificar: ");
        Long idlibro = leer.nextLong();
        Libro libro = DAO.buscarXisbn(idlibro);
        
        System.out.println("Desea modificar el libro " + libro.getTitulo() + "? S/N");
        String resp = leer.next();
        
        
        
        if (resp.equalsIgnoreCase("S")) {
            
            String respuesta;
            
            do {
                System.out.println("Que desea modificar?");
            System.out.println("1. Titulo");
            System.out.println("2. Anio");
            System.out.println("3. Ejemplres");
            System.out.println("4. Ejemplres prestados");
            System.out.println("5. Ejemplres restantes");
            System.out.print("Opcion: ");
            int opt = leer.nextInt();
            
            switch (opt) {
                case 1:
                    System.out.print("Nuevo titulo: ");
                    String titulo = leer.next();
                    libro.setTitulo(titulo);
                    break;
                case 2:
                    System.out.print("Nuevo anio: ");
                    Integer anio = leer.nextInt();
                    libro.setAnio(anio);
                    break;
                case 3:
                    System.out.print("Ejemplares: ");
                    Integer ejemplares = leer.nextInt();
                    libro.setEjemplares(ejemplares);
                    break;
                case 4:
                    System.out.print("Ejemplares prestados: ");
                    Integer ejemplaresP = leer.nextInt();
                    libro.setEjemplaresPrestados(ejemplaresP);
                    break;
                case 5:
                    System.out.print("Ejemplares restantes: ");
                    Integer ejemplaresR = leer.nextInt();
                    libro.setEjemplaresRestantes(ejemplaresR);
                    break;    
                default:
                    throw new AssertionError();
            }
            
            
            DAO.editarLibro(libro);
            
            System.out.println("Desea editar otro dato? S/N");
            respuesta = leer.next();
            
             
            } while (respuesta.equalsIgnoreCase("S"));
            
            return libro;
            
        } else {
            return libro;
        }
    }
    
    
    public Libro altaBaja(){
        
        Libro libro = buscarXisbn();
        
        System.out.println("Seleccione una opcion para el libro " + libro.getTitulo() + ":");
        System.out.println("1. Dar de alta");
        System.out.println("2. Dar de baja");
        System.out.print("Opcion: ");
        int opt = leer.nextInt();
        
        switch (opt) {
            case 1:
                libro.setAlta(true);
                break;
            case 2:
                libro.setAlta(false);
                break;    
            default:
                throw new AssertionError();
        }
        
        DAO.editarLibro(libro);
        return libro;
    }
    
    
    public List<Libro> buscarXnombre() {
        try {
            System.out.print("Ingrese el nombre a buscar: ");
            String nombre = leer.next();
            return DAO.buscarXnombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public Libro buscarXisbn() {
        try {
            
            Long isbn;
            
            do {
                System.out.print("Ingrese el isbn del libro a buscar: ");
                isbn = leer.nextLong();
                if (DAO.buscarXisbn(isbn) == null) {
                System.out.println("No existe");
            }
            } while (DAO.buscarXisbn(isbn) == null);
            
            
            return DAO.buscarXisbn(isbn);  
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public List<Libro> buscarXautor() {
        try {
            System.out.print("Ingrese el nombre del autor: ");
            String nombre = leer.next();
            return DAO.buscarXautor(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public List<Libro> buscarXEditorial() {
        try {
            System.out.print("Ingrese el nombre de la editorial: ");
            String nombre = leer.next();
            return DAO.buscarXEditorial(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
