/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria;

import ejercicio.libreria.Enum.entidadesEnum;
import ejercicio.libreria.entidades.Autor;
import ejercicio.libreria.entidades.Editorial;
import ejercicio.libreria.entidades.Libro;
import ejercicio.libreria.servicios.*;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class EJERCICIOLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        /*
         * e) Tareas a realizar
        Al alumno le toca desarrollar, las siguientes funcionalidades: 
        (check) - 1) Crear base de datos Librería
        (check) - 2) Crear unidad de persistencia
        (check) - 3) Crear entidades previamente mencionadas (excepto Préstamo) 
        (check) - 4) Generar las tablas con JPA
        (check) - 5) Crear servicios previamente mencionados.
        (check) - 6) Crear los métodos para persistir entidades en la base de datos librería
        (check) - 7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
        (check) - 8) Búsqueda de un Autor por nombre.
        (check) - 9) Búsqueda de un libro por ISBN.
        (check) - 10) Búsqueda de un libro por Título. 
        (check) - 11) Búsqueda de un libro/s por nombre de Autor.
        (check) - 12) Búsqueda de un libro/s por nombre de Editorial.
        13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación: 
        • Validar campos obligatorios.
        • No ingresar datos duplicados. 
         */

        LibroServicio ls = new LibroServicio();
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        /*
        // ---- CARGANDO BASE DE DATOS AUTOMATICAMENTE ----
        // Ejemplo 1
        ls.crearLibro("El Gran Gatsby", 1925, 10, as.crearAutor("F. Scott Fitzgerald"), es.crearEditorial("Scribners"));

        // Ejemplo 2
        ls.crearLibro("Cien años de soledad", 1967, 20, as.crearAutor("Gabriel García Márquez"), es.crearEditorial("Sudamericana"));

        // Ejemplo 3
        ls.crearLibro("1984", 1949, 15, as.crearAutor("George Orwell"), es.crearEditorial("Secker & Warburg"));

        // Ejemplo 4
        ls.crearLibro("Orgullo y prejuicio", 1813, 12, as.crearAutor("Jane Austen"), es.crearEditorial("Thomas Egerton"));

        // Ejemplo 5
        ls.crearLibro("Don Quijote de la Mancha", 1605, 25, as.crearAutor("Miguel de Cervantes"), es.crearEditorial("Francisco de Robles"));
        */
        
        // ls.buscarLibroPorNombre("1984");
         
        try {
            int opc;
            do {
                mostrarMenu();
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println(" Ingrese el nombre del Autor : ");
                        String nombreAutor = leer.next();
                        as.crearAutor(nombreAutor);
                        break;
                    case 2:
                        System.out.println(" Ingrese el nombre del Editorial : ");
                        String nombreEditorial = leer.next();
                        es.crearEditorial(nombreEditorial);
                        break;
                    case 3:
                        System.out.println(" Ingrese el nombre del Libro : ");
                        String nombreLibro = leer.next();
                        System.out.println(" Ingrese el nombre del Autor : ");
                        String nombreAutor2 = leer.next();
                        System.out.println(" Ingrese el nombre del Editorial : ");
                        String nombreEditorial2 = leer.next();
                        System.out.println(" Ingrese el Año : ");
                        int anio = leer.nextInt();
                        System.out.println(" Ingrese Cantidad Ejemplares : ");
                        int ejm = leer.nextInt();
                        ls.crearLibro(nombreLibro, anio, ejm, as.crearAutor(nombreAutor2), es.crearEditorial(nombreEditorial2));
                        break;
                    case 4:
                        System.out.println(" Ingrese el ID de Autor");
                        Integer id = leer.nextInt();
                        System.out.println(" Ingrese el NUEVO nombre del Autor : ");
                        String nombreAutor3 = leer.next();
                        as.editarAutor(id, nombreAutor3);
                        break;
                    case 5:
                        System.out.println(" Ingrese el ID de Editorial");
                        Integer id2 = leer.nextInt();
                        System.out.println(" Ingrese el NUEVO nombre del Editorial : ");
                        String nombreAutor4 = leer.next();
                        as.editarAutor(id2, nombreAutor4);
                        break;
                    case 6:
                        System.out.println(" Ingrese el ID del Libro");
                        Long id3 = leer.nextLong();
                        System.out.println(" Ingrese el nombre del Libro : ");
                        String nombreLibro2 = leer.next();
                        System.out.println(" Ingrese el nombre del Autor : ");
                        String nombreAutor5 = leer.next();
                        System.out.println(" Ingrese el nombre del Editorial : ");
                        String nombreEditorial5 = leer.next();
                        System.out.println(" Ingrese el Año : ");
                        int anio2 = leer.nextInt();
                        System.out.println(" Ingrese Cantidad Ejemplares : ");
                        int ejm2 = leer.nextInt();
                        ls.editarLibro(id3, nombreLibro2, anio2, ejm2, as.crearAutor(nombreAutor5), es.crearEditorial(nombreEditorial5));
                        break;
                    case 7:
                        System.out.println(" Que desea dar de alta ? LIBRO/EDITORIAL/AUTOR ");
                        String resp2 = leer.next().toUpperCase();
                        System.out.println("Ingrese el ID : ");
                        int idas = leer.nextInt();
                        if (entidadesEnum.AUTOR.equals(resp2)) {

                            as.darDeAltaAutor(idas);
                        }
                        if (entidadesEnum.EDITORIAL.equals(resp2)) {

                            es.darDeAltaEditorial(idas);
                        }
                        if (entidadesEnum.LIBRO.equals(resp2)) {
                            ls.darDeAltaLibro(idas);
                        }
                        break;
                    case 8:
                        System.out.println(" Que desea dar de baja ? LIBRO/EDITORIAL/AUTOR ");
                        String resp = leer.next().toUpperCase();
                        if (entidadesEnum.AUTOR.equals(resp)) {
                            System.out.println("Ingrese el ID : ");
                            int idas2 = leer.nextInt();
                            as.darDeBajaAutor(idas2);
                        }
                        if (entidadesEnum.EDITORIAL.equals(resp)) {
                            System.out.println("Ingrese el ID : ");
                            int idas2 = leer.nextInt();
                            es.darDeBajaEditorial(idas2);
                        }
                        if (entidadesEnum.LIBRO.equals(resp)) {
                            System.out.println("Ingrese el ID : ");
                            int idas2 = leer.nextInt();
                            ls.darDeBajaLibro(idas2);
                        }
                        break;
                    case 9:
                        System.out.println("Ingrese el nombre del Autor : ");
                        String nombreAuto = leer.next();
                        as.buscarAutor(nombreAuto);
                        break;
                    case 10:
                        String var;
                        do {
                            mostrarMenuBuscar();
                            var = leer.next();
                            switch (var) {
                                case "a":
                                    System.out.println("Ingrese el ID : ");
                                    int IdBuscar = leer.nextInt();
                                    ls.buscarLibroPorId(IdBuscar);
                                    break;
                                case "b":
                                    System.out.println("Ingrese el nombre : ");
                                    String nombreBuscar = leer.next();
                                    ls.buscarLibroPorNombre(nombreBuscar);
                                    break;
                                case "c":
                                    System.out.println("Ingrese el nombre : ");
                                    String nombreBuscar1 = leer.next();
                                    ls.buscarLibroPorNombreAutor(nombreBuscar1);
                                    break;
                                case "d":
                                    System.out.println("Ingrese el nombre : ");
                                    String nombreBuscar2 = leer.next();
                                    ls.buscarLibroPorNombreEditorial(nombreBuscar2);
                                    break;
                                case "f":
                                    System.out.println(" Saliendo de Buscar Autor \n");
                                    break;
                                default:
                                    System.out.println("Ingreso mal la opcion");
                                    var = leer.next();
                            }
                        } while (!"f".equals(var));
                    case 0:

                        break;
                    default:
                        System.out.println(" Ingreso mal la OPCION vuelva a ingresar :");
                        opc = leer.nextInt();
                }
            } while (opc != 0);

        } catch (Exception e) {
            System.out.println("ERROR 404");
            System.out.println(e);
        }

    }

    public static void mostrarMenuBuscar() {
        System.out.println("\n Ingrese la OPCION de Busqueda : "
                + "\n a) Por ID "
                + "\n b) Por Nombre "
                + "\n c) Por Nombre de Autor "
                + "\n d) Por Nombre de Editorial"
                + "\n f) Salir ");
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
                + "\n 10 - Buscar Libro "
                // + "\n 11 - Eliminar Autor/Libro/Editorial"
                + "\n 0 - Salir "
                + "\n Ingrese la OPCION : ");
    }
   
}
