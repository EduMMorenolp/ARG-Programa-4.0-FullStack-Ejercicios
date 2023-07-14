/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria;

/**
 *
 * @author no_de
 */
public class mostrarMenus {
    
     public static void mostrarMenuBuscar() {
        System.out.println("\n Ingrese la OPCION de Busqueda : "
                + "\n a) Por ID "
                + "\n b) Por Nombre "
                + "\n c) Por Nombre de Autor "
                + "\n d) Por Nombre de Editorial"
                + "\n f) Salir "
                + "\n Ingrese la OPCION : ");
    }

    public static void mostrarMenu() {

        System.out.println("\n ---- MENU ----");
        System.out.println("\n 1 - Crear Autor "
                + "\n 2 - Crear Editorial "
                + "\n 3 - Crear Libro "
                + "\n 4 - Editar Autor "
                + "\n 5 - Editar Editorial "
                + "\n 6 - Editar Libro "
                + "\n 7 - Dar de Baja "
                + "\n 8 - Dar de Alta "
                + "\n 9 - Buscar Autor "
                + "\n 10 - Buscar Libro --> "
                + "\n 99 - Menu Clientes --> "
                // + "\n 11 - Eliminar Autor/Libro/Editorial"
                + "\n 0 - Salir "
                + "\n Ingrese la OPCION : ");
    } 
    
    public static void mostrarMenuClientes(){
        
        System.out.println("\n ---- MENU CLIENTES ----");
        System.out.println("\n 1 - Crear Cliente "
                + "\n 2 - Registrar prestamo Libro "
                + "\n 3 - Devolucion de Libro "
                + "\n 4 - Busqueda de Prestamos por Cliente "
                + "\n 5 - Lista de Libros Disponibles "
                + "\n 0 - Salir "
                + "\n Ingrese la OPCION : ");
    }
}
