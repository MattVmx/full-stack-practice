
package entidad;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;


public class Alquiler {
    
    private String nombre;
    private String DNI;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer posAmarre;
    private Barco barco;
    
    Scanner leer  = new Scanner(System.in).useDelimiter("\n");

    public Alquiler() {
    }

    public Alquiler(String nombre, String DNI, Date fechaAlquiler, Date fechaDevolucion, Integer posAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(Integer posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void alquilar(){
    
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        
        System.out.print("Ingrese su DNI: ");
        DNI = leer.next();
        
        System.out.print("Ingrese su fecha de alquiler: ");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Anio: ");
        int anio = leer.nextInt();
        fechaAlquiler = new Date(dia, mes - 1, anio - 1900);
        
        System.out.print("Ingrese su fecha de devolucion: ");
        System.out.print("Dia: ");
        int diaD = leer.nextInt();
        System.out.print("Mes: ");
        int mesD = leer.nextInt();
        System.out.print("Anio: ");
        int anioD = leer.nextInt();
        fechaDevolucion = new Date(diaD, mesD - 1, anioD - 1900);
        
        
        
    }
    
}
