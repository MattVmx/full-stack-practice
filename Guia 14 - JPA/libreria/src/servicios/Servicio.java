
package servicios;

import java.util.Scanner;


public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    LibroServicio libroServicio = new LibroServicio();
    AutorServicio autorServicio = new AutorServicio();
    EditorialServicio editorialServicio = new EditorialServicio();
    
    public void menu (){
    
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Menu para libros");
        System.out.println("2. Menu para editoriales");
        System.out.println("3. Menu para autores");
        
        System.out.print("Opcion: ");
        int opt = leer.nextInt();
        
        System.out.println("");
        
        switch (opt) {
            case 1:
                menuLibros();
                break;
                
                case 2:
                menuEditoriales();
                break;
                
                case 3:
                menuAutores();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    public void menuLibros(){
    
        System.out.println("MENU PARA LIBROS:");
        System.out.println("1. Crear libro");
        System.out.println("2. Buscar libro por titulo");
        System.out.println("3. Buscar libro por ISBN");
        System.out.println("4. Buscar libro por nombre de autor");
        System.out.println("5. Buscar libro por nombre de editorial");
        System.out.println("6. Editar libro");
        System.out.println("7. Dar alta/baja libro");
        System.out.print("Opcion: ");
        int optL = leer.nextInt();
        
        switch (optL) {
            case 1:
                try {
                libroServicio.crearLibro();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 2:
                 try {
                libroServicio.buscarXnombre();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 3:
                 try {
                libroServicio.buscarXisbn();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 4:
                 try {
                libroServicio.buscarXautor();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 5:
                 try {
                libroServicio.buscarXEditorial();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 6:
                 try {
                libroServicio.editarLibro();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 7:
                 try {
                libroServicio.altaBaja();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;    
            default:
                throw new AssertionError();
        }
    }
    
    
    public void menuAutores(){
    
        System.out.println("MENU PARA AUTORES:");
        System.out.println("1. Crear autor");
        System.out.println("2. Buscar autor por nombre");
        System.out.println("3. Editar autor");
        
        System.out.print("Opcion: ");
        int optA = leer.nextInt();
        
        switch (optA) {
            case 1:
                try {
                autorServicio.crearAutor();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 2:
                 try {
                autorServicio.buscarXnombre();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
             case 3:
                 try {
                autorServicio.editarAutor();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;    
            default:
                throw new AssertionError();
        }
    }
    
    
    public void menuEditoriales(){
    
        System.out.println("MENU PARA EDITORIALES:");
        System.out.println("1. Crear editorial");
        System.out.println("2. Buscar editorial por nombre");
        System.out.println("3. Editar editorial");
        
        System.out.print("Opcion: ");
        int optE = leer.nextInt();
        
        switch (optE) {
            case 1:
                try {
                editorialServicio.crearEditorial();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 2:
                 try {
                editorialServicio.buscarXnombre();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;
            case 3:
                 try {
                editorialServicio.editarEditorial();
            } catch (Exception e) {
                    System.out.println(e.getMessage());
            }
                break;    
            default:
                throw new AssertionError();
        }
    }
}
