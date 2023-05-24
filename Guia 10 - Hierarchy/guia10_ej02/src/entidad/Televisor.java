
package entidad;

import java.util.Scanner;


public class Televisor extends Electrodomestico{
    
    private int pulgadas;
    private boolean sintonizadorTDT;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizadorTDT, double precio, String color, char letra, Integer peso) {
        super(precio, color, letra, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    public void crearTelevisor(){
    
        crearElectrodomestico();
        
        String resp;
        
        System.out.print("Ingrese las pulgadas: ");
        pulgadas = leer.nextInt();
        
        System.out.println("Tiene sintonizador TDT? (S/N)");
        resp = leer.next();
        
        if (resp.equalsIgnoreCase("S")) {
            sintonizadorTDT = true;
        }
    }

    @Override
    public double precioFinal() {
        double suma = super.precioFinal(); 
        
        if (pulgadas > 40) {
            suma = suma + (suma * 0.3);
        }
        
        if (sintonizadorTDT == true) {
            suma = suma + 500;
        }
        
//        System.out.println("Precio final del televisor: " + suma);
        return suma;
    }
    
     @Override
    public void mostrar() {
        
        double suma = precioFinal();
       
        System.out.println("Precio final del televisor: " + suma);
    }
    
    @Override
    public String toString() {
        return "Televisor: [" + "Pulgadas: " + pulgadas + ", Sintonizador TDT: " + sintonizadorTDT + "," + super.toString() + "]";
    }
    
}
