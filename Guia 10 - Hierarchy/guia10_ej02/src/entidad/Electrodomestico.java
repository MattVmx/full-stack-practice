package entidad;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio = 1000;
    protected String color;
    protected char letra;
    protected Integer peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letra, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarConsumoE(char letra) {

        
        char consumoE[] = {'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < consumoE.length; i++) {
            if (consumoE[i] == letra) {
                this.letra = letra;
                break;
            } else {
                this.letra = 'F';
            }
        }
    }

    public void comprobarColor(String color) {
        String colorD[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

        for (int i = 0; i < colorD.length; i++) {
            if (colorD[i].equalsIgnoreCase(color)) {
                this.color = color;
                break;
            } else {
                this.color = "Blanco";
            }
        }

    }

    public void crearElectrodomestico() {

        System.out.print("Ingrese el color: ");
        color = leer.next();
        comprobarColor(color);
        System.out.println(color);
        System.out.print("Ingrese el tipo de consumo: ");
        letra = leer.next().charAt(0);
        comprobarConsumoE(letra);
        System.out.println(letra);
        System.out.print("Ingrese el peso: ");
        peso = leer.nextInt();
    }
    
    
    public double precioFinal(){
        
        double suma = 0;
        
        switch (letra) {
            case 'A' -> suma = suma + 1000;
            case 'B' -> suma = suma + 800;
            case 'C' -> suma = suma + 600;
            case 'D' -> suma = suma + 500;
            case 'E' -> suma = suma + 300;
            case 'F' -> suma = suma + 100;    
        }
        
        if (peso >= 1 && peso <= 19) {
           suma = suma + 100; 
        } else if (peso >= 20 && peso <= 49) {
           suma = suma + 500; 
        } else if (peso >= 50 && peso <= 79) {
           suma = suma + 800; 
        } else if (peso >= 80) {
           suma = suma + 1000;
        }
        
        
        return precio+suma;
    }
    
    public void mostrar() {
    }

    @Override
    public String toString() {
        return " Precio: " + precio + ", Color: " + color + ", Consumo energetico: " + letra + ", Peso: " + peso;
    }
    
    
}
