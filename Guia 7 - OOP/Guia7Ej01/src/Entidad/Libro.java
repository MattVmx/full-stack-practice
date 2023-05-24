
package Entidad;

import java.util.Scanner;

public class Libro {
    
   Scanner leer = new Scanner(System.in);
    
   private String ISBN;
   private String titulo;
   private String autor;
   private int paginas;
   
   public Libro(){
   }

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    

    public void setISBN(String ISBN) {
        
        while (ISBN.length() > 5) {
            System.out.println("Longitud de ISBN Incorrecta, ingrese nuevamente");
            ISBN = leer.next();
        }
//        if (ISBN.length() > 5) {
//            System.out.println("Longitud Incorrecta");
//        } else {
//            System.out.println("Correcto");
//        }
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
    

}


