/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioPais;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author no_de
 */
public class servicioPais {

    Scanner leer = new Scanner(System.in);
    TreeSet<String> listaPaises = new TreeSet<>();

    public void ingresoPais() {
        String pais;
        String resp;

        do {
            System.out.println("Ingrese un pais a la Lista : ");
            pais = leer.nextLine();

            listaPaises.add(pais);

            System.out.println("Desea Agragar otro Pais ? S/N : ");
            resp = leer.nextLine();
        } while ("S".equals(resp.toUpperCase()));
        
        /*
        DADO QUE ES UN TREESET SE ORDENA SOLO.
        */
        
        System.out.println("---LISTA DE PAISES---");
        listaPaises.forEach((listaPaise) -> {
            System.out.println(listaPaise);
        });
        System.out.println("");
    }

    public void eliminarPais() {
        String paiseliminado;
        boolean aux = false;
        String resp;

        do {
            System.out.println("Ingrese un pais para Eliminar de la Lista : ");
            paiseliminado = leer.nextLine();
            for (String listaPaise : listaPaises) {
                if (listaPaise.equals(paiseliminado)) {
                    listaPaises.remove(listaPaise);
                    aux = true;
                    break;
                }
            }
            if (aux == false) {
                System.out.println("El Pais no se encuentra en la Lista");
            }
            System.out.println("Desea eliminar otro Pais ? S/N : ");
            resp = leer.nextLine();
        } while ("S".equals(resp.toUpperCase()));
        // Mostrando la Lista con el Pais Eliminado con un forEach
        System.out.println("---LISTA CON PAIS/ES ELIMINADO/S---");
        listaPaises.forEach((pais) -> {
            System.out.println(pais);
        });

    }
}
