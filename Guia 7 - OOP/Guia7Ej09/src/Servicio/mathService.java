
package Servicio;

import Entidad.Matematica;

public class mathService {
    
    public Matematica crearNums(){
    
        Matematica numeros = new Matematica();
        
        numeros.setNum1(Math.random()*10);
        numeros.setNum2(Math.random()*10);
        
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        
        return numeros;
    }
    
    public void devolverMayor(Matematica numeros){
          
        System.out.println("El numero mayor es: " + Math.max(numeros.getNum1(), numeros.getNum2()));
    }
    
    public void calcularPotencia(Matematica numeros){
        
        numeros.setNum1(Math.round(numeros.getNum1()));
        numeros.setNum2(Math.round(numeros.getNum2()));
        
        System.out.println("Numeros redondeados:");
        
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());

        double max = Math.max(numeros.getNum1(), numeros.getNum2());
        double min = Math.min(numeros.getNum1(), numeros.getNum2());
        
        double pot = Math.pow(max, min);
        
        System.out.println("El resultado del mayor numero elevado a la potencia del menor es: " + Math.round(pot));
    }
    
    public void calcularRaiz(Matematica numeros){
          
        numeros.setNum1(Math.abs(numeros.getNum1()));
        numeros.setNum2(Math.abs(numeros.getNum2()));
        System.out.println("Valores absolutos:");
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        
        double minR = Math.min(numeros.getNum1(), numeros.getNum2());
        
        double raiz = Math.sqrt(minR);
        
        System.out.println("La raiz cuadrada de " + minR + " es: " + raiz);
        
    }
}
