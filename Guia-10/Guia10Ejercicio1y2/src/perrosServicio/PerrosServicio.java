/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perrosServicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class PerrosServicio {

    Scanner leer = new Scanner(System.in);

    public void razaPerro() {

        ArrayList<String> perro = new ArrayList<>();

        String raza;
        String razaDelete;
        String resp;

        do {

            System.out.println("Ingrese la Raza del Perro : ");
            raza = leer.nextLine();

            perro.add(raza);

            do {
                System.out.println("Desea Ingresar otra Raza ? S/N : ");
                resp = leer.nextLine().toUpperCase();
                if ("N".equals(resp) || "S".equals(resp)) {
                    System.out.println("Continuando ... ");
                } else {
                    System.out.println("Ingreso mal la Opcion");
                }
            } while (!"N".equals(resp) && !"S".equals(resp));

        } while ("S".equals(resp));

        System.out.println("La Lista de Razas es : " + perro);

        // EJERCICIO 2
        /**
         * Continuando el ejercicio anterior, después de mostrar los perros, al
         * usuario se le pedirá un perro y se recorrerá la lista con un
         * Iterator, se buscará el perro en la lista. Si el perro está en la
         * lista, se eliminará el perro que ingresó el usuario y se mostrará la
         * lista ordenada. Si el perro no se encuentra en la lista, se le
         * informará al usuario y se mostrará la lista ordenada.
         */
        
        System.out.println("Ingrese una Raza para Eliminar : ");
        razaDelete = leer.nextLine();

        Iterator<String> it = perro.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaDelete)) {
                it.remove();
            }else{
                System.out.println("La raza Ingresada No se encontraba en la Lista");
            }
        }
        Collections.sort(perro);
        
        System.out.println("La Nueva Lista de Razas es : " + perro);
    }
}
