package main;

import entidad.Producto;
import java.util.Scanner;
import servicio.productoService;

public class ej06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        productoService ps = new productoService();
        Producto p = ps.listaProductos();

        int opt = 0;

        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Modificar precio");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            opt = leer.nextInt();

            switch (opt) {
                case 1:
                    ps.modificarPrecio(p);
                    break;
                case 2:
                    ps.eliminarProducto(p);
                    break;
                case 3:
                    ps.mostrarLista(p);
                    break;
                case 4:
                    System.out.println("SALIR");
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opt != 4);

    }

}
