package tienda;

import java.util.Scanner;
import servicios.ProductoService;

public class Tienda {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductoService ps = new ProductoService();

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Mostrar nombre de los productos");
        System.out.println("2. Mostrar nombre y precio de los productos");
        System.out.println("3. Mostrar productos entre $120 y $202");
        System.out.println("4. Mostrar todos los portatiles");
        System.out.println("5. Mostrar el producto mas barato");
        System.out.println("6. Guardar un nuevo producto");

        int opt = 0;
        
        opt = leer.nextInt();
        
        switch (opt) {
            case 1:
                try {
                ps.imprimirProductosXnombre();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 2:
                    try {
                ps.imprimirProductosXnombrePrecio();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 3:
                    try {
                ps.imprimirProductosXPrecio();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 4:
                    try {
                ps.imprimirListaPortatil();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 5:
                    try {
                ps.imprimirBarato();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 6:
                System.out.println("Ingrese los datos del nuevo producto: ");
                System.out.print("Codigo: ");
                int cod = leer.nextInt();
                System.out.print("Nombre: ");
                String name = leer.next();
                System.out.print("Precio: $");
                double price = leer.nextDouble();
                System.out.print("Codigo del fabricante: ");
                int codFab = leer.nextInt();
                try {
                ps.crearProducto(cod, name, price, codFab);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            default:
                throw new AssertionError();
        }


    }

}
