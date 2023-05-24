
package Entidad;

import java.util.Scanner;

public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    //ATRIBUTOS
    private double radio;
    private double area;
    private double perimetro;
    
    //CONSTRUCTOR VACIO
    public Circunferencia() {
    }
    
    //CONSTRUCTOR 
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //SETTERS
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //GETTERS
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }
    
    public double getPerimetro() {
        return perimetro;
    }
    
    //PEDIR RADIO
    public Circunferencia crearCircunferencia(){
       
        System.out.println("Ingrese el radio:");
        
        radio = leer.nextDouble();
        
        return new Circunferencia();
    }
    
    //CALCULO AREA
    public Circunferencia area(){
        
        area = Math.PI * (Math.pow(radio, 2));

        return new Circunferencia();
    }
    
    //CALCULO PERIMETRO
     public Circunferencia perimetro(){
        
        perimetro = 2 * Math.PI * radio;

        return new Circunferencia();
    }
    
}
