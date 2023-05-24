
package Servicio;

import java.util.Scanner;
import Entidad.Libro;

public class libroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        
        Libro book = new Libro();
        
        System.out.println("Ingrese el ISBN: ");
        book.setISBN(leer.next());
        System.out.println("Ingrese el titulo: ");
        book.setTitulo(leer.next());
        System.out.println("Ingrese el autor: ");
        book.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas: ");
        book.setPaginas(leer.nextInt());
        
        System.out.println("***********************");
        
        System.out.println("El ISBN es: " + book.getISBN());
        System.out.println("Titulo: " + book.getTitulo());
        System.out.println("Autor: " + book.getAutor());
        System.out.println("Numero de paginas: " + book.getPaginas());
        
        return book;
    }
    
    public void cambiarTitulo(Libro book){
    
        System.out.println("Ingrese el nuevo titulo:");
        book.setTitulo(leer.next());
        System.out.println(book.getTitulo());
    }
}
