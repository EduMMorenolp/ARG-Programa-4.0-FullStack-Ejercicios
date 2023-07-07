/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.fabricante;
import tienda.entidades.producto;
import tienda.persistencia.tiendaDAO;

/**
 *
 * @author no_de
 */
public class tiendaServicio {

    /*
    a) Lista el nombre de todos los productos que hay en la tabla producto. 
    b) Lista los nombres y los precios de todos los productos de la tabla producto. 
    c) Listar aquellos productos que su precio esté entre 120 y 202. 
    d) Buscar y listar todos los Portátiles de la tabla producto. 
    e) Listar el nombre y el precio del producto más barato. 
    f) Ingresar un producto a la base de datos.
    g) Ingresar un fabricante a la base de datos
    h) Editar un producto con datos a elección.
     */
    public void listar(int op) throws Exception {
        try {
            tiendaDAO tDAO = new tiendaDAO();
            ArrayList<producto> p;

            if (op == 1) {
                // a) Lista el nombre de todos los productos que hay en la tabla producto. 
                p = tDAO.listaProductos();
                for (producto aux : p) {
                    System.out.println("Nombres: " + aux.getNombre());
                }
            }
            if (op == 2) {
                // b) Lista los nombres y los precios de todos los productos de la tabla producto.
                p = tDAO.listaProductos();
                for (producto aux : p) {
                    System.out.println("Nombres: " + aux.getNombre() + "\n Precios: " + aux.getPrecio());
                }
            }
            if (op == 3) {
                // c) Listar aquellos productos que su precio esté entre 120 y 202.
                p = tDAO.listaProductos();
                for (producto aux : p) {
                    if (aux.getPrecio() > 120 && aux.getPrecio() < 202) {
                        System.out.println("Nombres: " + aux.getNombre() + "\n Precios: " + aux.getPrecio());
                    }
                }
            }
            if (op == 4) {
                // d) Buscar y listar todos los Portátiles de la tabla producto. 
                p = tDAO.buscarProductos("Portatil");
                for (producto aux : p) {
                    System.out.println("Nombres: " + aux.getNombre() + "\n Precios: " + aux.getPrecio());
                }
            }
            if (op == 5) {
                // e) Listar el nombre y el precio del producto más barato. }
                p = tDAO.buscarProductosMasBaratos();
                for (producto aux : p) {
                    System.out.println("Nombres: " + aux.getNombre() + "\n Precios: " + aux.getPrecio());
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void ingresarProducto() {

        // f) Ingresar un producto a la base de datos.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            tiendaDAO tDAO = new tiendaDAO();
            producto p = new producto();
            System.out.println("Ingrese el nombre del producto : ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese precio del producto : ");
            double precio = leer.nextDouble();
            System.out.println("Ingrese codigo Fabricante : ");
            int codigofabri = leer.nextInt();

            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(codigofabri);

            tDAO.ingresarProducto(p);
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void ingresarFabricante() {

        // g) Ingresar un fabricante a la base de datos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            tiendaDAO tDAO = new tiendaDAO();
            fabricante p = new fabricante();
            System.out.println("Ingrese el nombre del Fabricante : ");
            String nombre = leer.nextLine();
            p.setNombre(nombre);
            tDAO.ingresarFabricante(p);
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void modificarProducto() {

        // h) Editar un producto con datos a elección.
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            tiendaDAO tDAO = new tiendaDAO();
            producto p = new producto();

            System.out.println("Ingrese el codigo del producto para EDITAR : ");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el nombre del producto : ");
            String nombre = leer.next();
            System.out.println("Ingrese precio del producto : ");
            double precio = leer.nextDouble();
            System.out.println("Ingrese codigo Fabricante : ");
            int codigofabri = leer.nextInt();

            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(codigofabri);
            p.setCodigo(codigo);

            tDAO.editarProducto(p);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void Menu() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        try {
            do {
                mostrarMenu();
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        listar(opc);
                        break;
                    case 6:
                        ingresarProducto();
                        break;
                    case 7:
                        ingresarFabricante();
                        break;
                    case 8:
                        modificarProducto();
                        break;
                    case 9:
                        System.out.println("Nos vemos...");
                        break;
                    default:
                        throw new AssertionError();
                }
            } while (opc != 9);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR Menu");
        }
    }

    private static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Listar el nombre de todos los productos");
        System.out.println("2. Listar los nombres y precios de todos los productos");
        System.out.println("3. Listar productos cuyo precio esté entre 120 y 202");
        System.out.println("4. Buscar y listar todos los Portátiles");
        System.out.println("5. Listar el nombre y precio del producto más barato");
        System.out.println("6. Ingresar un producto a la base de datos");
        System.out.println("7. Ingresar un fabricante a la base de datos");
        System.out.println("8. Editar un producto con datos a elección.");
        System.out.println("9. Salir");
        System.out.println("Ingrese el número de la opción deseada:");
    }

}
