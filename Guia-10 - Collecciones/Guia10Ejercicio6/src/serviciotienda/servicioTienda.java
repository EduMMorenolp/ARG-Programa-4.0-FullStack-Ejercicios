/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciotienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author EDUARDO MORENO
 */
public class servicioTienda {

    /**
     * introducir un elemento, modificar su precio, eliminar un producto y
     * mostrar los productos que tenemos con su precio
     */
    HashMap<String, Integer> mapaProductos = new HashMap<>();
    Scanner leer = new Scanner(System.in);

    public void ingresarProducto() {
        String nombre;
        int precio;
        String resp;
        leer.nextLine();
        do {
            System.out.println("Ingrese el nombre del producto : ");
            nombre = leer.nextLine().toLowerCase();
            System.out.println("Ingrese el precio de " + nombre + " : ");
            precio = leer.nextInt();
            mapaProductos.put(nombre, precio);
            leer.nextLine();
            System.out.println("Desea Agregar otro Producto ? S/N : ");
            resp = leer.nextLine();
        } while ("S".equals(resp.toUpperCase()));
    }

    public void modificarPrecio() {
        leer.nextLine();
        System.out.println("Desea modificar algun precio de un producto ? S/N : ");
        String resp = leer.nextLine();
        if ("S".equals(resp.toUpperCase())) {
            System.out.println("Indique que Producto desea modificar : ");
            String respMod = leer.nextLine().toLowerCase();
            System.out.println("Indique el NUEVO precio de " + respMod + " : ");
            int precioNuevo = leer.nextInt();
            mapaProductos.replace(respMod, precioNuevo);
        }
    }

    public void eliminarProducto() {
        leer.nextLine();
        System.out.println("Desea Eliminar algun Producto ? S/N : ");
        String resp = leer.nextLine();
        if ("S".equals(resp.toUpperCase())) {
            System.out.println("Indique que Producto desea ELIMINAR : ");
            String respMod = leer.nextLine().toLowerCase();
            mapaProductos.remove(respMod);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n ---LISTA DE PRODUCTOS---");
        for (Map.Entry<String, Integer> entry : mapaProductos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println("----------------------- \n");
    }

    public void menu() {
        int var;
        System.out.println("MENU");
        do {
            System.out.println("OPCION 1 : Agregar productos \n"
                    + "OPCION 2 : Modificar precio de productos \n"
                    + "OPCION 3 : Eliminar productos \n"
                    + "OPCION 4 : Ver lista Productos \n"
                    + "OPCION 5 : Salir");
            System.out.println("Ingrese la Opcion : ");
            var = leer.nextInt();
            switch (var) {
                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Adios...");
                    break;
                default:
                    System.out.println("Ingreso mal la Opcion");
                    throw new AssertionError();
            }
        } while (var != 5);

    }
}
