/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;
import Entidad.juegoMeses;

public class mesesService {
    Scanner leer = new Scanner(System.in);
    public juegoMeses adivinarMes(){
        
        juegoMeses jm = new juegoMeses();
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minusculas:");
        String mes = leer.nextLine();
        
        while (!mes.equals(jm.getMesSecreto())) {
            System.out.println("Incorrecto, vuelva a introducir otro mes:");
            mes = leer.nextLine();
        }
        
        System.out.println("Correcto!");
        return jm;
    }
}
