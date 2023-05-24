package servicio;

import entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;

public class paisService {

    Scanner leer = new Scanner(System.in);

    public Pais listaPaises() {

        String resp = "";

        Pais pais = new Pais();

        do {
            System.out.print("Ingrese un pais: ");
            pais.getPaises().add(leer.nextLine());
            System.out.println("Desea guardar otro pais?(S/N)");
            resp = leer.nextLine();
        } while (resp.equalsIgnoreCase("s"));

        if (resp.equalsIgnoreCase("n")) {
            System.out.println("Lista:");
            for (String lista : pais.getPaises()) {
                System.out.println("- " + lista);
            }
        }

        return pais;

    }

    public void eliminarPais(Pais pais) {

        Iterator it = pais.getPaises().iterator();

        System.out.println("Ingrese un pais a buscar:");
        String pais2 = leer.nextLine();

        while (!pais.getPaises().contains(pais2)) {
            System.out.println("El pais no se encuentra en la lista, ingrese nuevamente:");
            pais2 = leer.nextLine();
        }

        while (it.hasNext()) {
            if (it.next().equals(pais2)) {
                it.remove();
            }
        }

        System.out.println("Lista:");
        for (Object lista : pais.getPaises()) {
            System.out.println("- " + lista);
        }

    }

}
