
package entidad;

import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    
    private Integer carga;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
    }
    
    public Lavadora(Integer carga, double precio, String color, char letra, Integer peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
    
        crearElectrodomestico();
        System.out.print("Ingrese la carga: ");
        carga = leer.nextInt();
    }

    @Override
    public double precioFinal() {
        
        double suma = super.precioFinal();
        
        if (carga > 30) {
            suma = suma + 500;
        }
//        System.out.println("Precio final de la lavadora: " + suma);
        return suma;
    }
    
    @Override
    public void mostrar() {
        
        double suma = precioFinal();
       
        System.out.println("Precio final de la lavadora: " + suma);
    }

    @Override
    public String toString() {
        return "Lavadora: [" + "Carga: " + carga + "," + super.toString() + "]";
    }

    

    
    
    
    
}
