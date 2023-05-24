package servicio;

import entidad.Producto;
import java.util.Map;
import java.util.Scanner;

public class productoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto listaProductos() {

        Producto producto = new Producto();

        String resp = "";

        do {
            System.out.print("Ingrese el producto: ");
            String p = leer.next();
            System.out.print("Precio: ");
            int precio = leer.nextInt();

            producto.getProductos().put(p, precio);

            System.out.println("Desea agregar otro producto?(S/N)");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));

        if (resp.equalsIgnoreCase("n")) {
            for (Map.Entry<String, Integer> en : producto.getProductos().entrySet()) {
                System.out.println("Producto: " + en.getKey() + "\n" + "Precio: $" + en.getValue());
            }
        }

        return producto;
    }

    public void modificarPrecio(Producto producto) {

        System.out.println("Que producto desea modificar el precio?");
        String buscar = leer.next();

        System.out.print("Nuevo precio: ");

        for (Map.Entry<String, Integer> en : producto.getProductos().entrySet()) {
            if (en.getKey().equalsIgnoreCase(buscar)) {
                en.setValue(leer.nextInt());
            }
        }

        for (Map.Entry<String, Integer> en : producto.getProductos().entrySet()) {
            System.out.println("Producto: " + en.getKey() + "\n" + "Precio: $" + en.getValue());
        }
    }

    public void eliminarProducto(Producto producto) {

        System.out.println("Que producto desea eliminar?");
        String eliminar = leer.next();
        String claveE = "";
        for (Map.Entry<String, Integer> en : producto.getProductos().entrySet()) {
            if (en.getKey().equalsIgnoreCase(eliminar)) {
               claveE = en.getKey();
            }
        }
         producto.getProductos().remove(claveE);


        for (Map.Entry<String, Integer> en : producto.getProductos().entrySet()) {
            System.out.println("Producto: " + en.getKey() + "\n" + "Precio: $" + en.getValue());
        }
    }

    public void mostrarLista(Producto producto) {

        for (Map.Entry<String, Integer> en : producto.getProductos().entrySet()) {
            System.out.println("Producto: " + en.getKey() + "\n" + "Precio: $" + en.getValue());
        }
    }
}
