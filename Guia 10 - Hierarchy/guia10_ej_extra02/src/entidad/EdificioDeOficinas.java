
package entidad;

import java.util.Scanner;


public class EdificioDeOficinas extends Edificio{
    
    private int numOficinas;
    private int cantPers;
    private int numPisos;
    
    Scanner leer  = new Scanner(System.in);

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPers, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPers = cantPers;
        this.numPisos = numPisos;
    }
    
    
    public void datosEdif(){
        
        System.out.print("Indique la cantidad de oficinas: ");
        numOficinas = leer.nextInt();
    
        System.out.print("Ingrese la cantidad de personas en cada oficina: ");
        cantPers = leer.nextInt();
        
        System.out.print("Indique la cantidad de pisos: ");
        numPisos = leer.nextInt();
    }
    
    public void cantPersonas(){
        int personasPiso = cantPers * numOficinas;
        int personasEdif = personasPiso * numPisos;
        
        System.out.println("La cantidad de personas que entran en cada piso es: " + personasPiso);
        System.out.println("La cantidad de personas que entran en el edificio: " + personasEdif);
    }
    
    @Override
    public void calcularSuperficie() {
        
        double superficie = ancho * largo;
        System.out.println("Superficie del edificio: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen = ancho * largo * alto;
        System.out.println("Volumen del edificio: " + volumen);
    }
    
}
