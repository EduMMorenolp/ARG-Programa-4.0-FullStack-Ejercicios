/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.servicios;

import ejercicio.libreria.entidades.Autor;
import ejercicio.libreria.entidades.Editorial;
import ejercicio.libreria.entidades.Libro;
import ejercicio.libreria.persistencia.LibroDAO;
import java.util.List;



/**
 *
 * @author no_de
 */
public class LibroServicio {
    
    LibroDAO lDAO = new LibroDAO();
    
    public Libro crearLibro(String titulo,int anio,int ejemplares, Autor autor, Editorial editorial) throws Exception{
        
        System.out.println("[Creando Libro]");
        
        Libro libro = new Libro();
        
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        try{
        lDAO.guardarLibro(libro);
        } catch ( Exception e){
            System.out.println(" Error al ingresar Libro ");
        }
        return libro;   
    }
    
    public Libro editarLibro (Long Id,String titulo,int anio,int ejemplares, Autor autor, Editorial editorial) throws Exception{
        
        System.out.println("[Editando Libro]");
        
        Libro libro = new Libro();
        
        libro.setIsbn(Id);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        try{
        lDAO.guardarLibro(libro);
        } catch ( Exception e){
            System.out.println(" Error al editar Libro ");
        }
        return libro;   
    }
    
    
    public void darDeAltaLibro(Integer id) throws Exception {
        
        System.out.println("[Dando de Alta Libro]");
        
        lDAO.darDeAltaLibro(id);
        
    }

    public void darDeBajaLibro(Integer id) throws Exception {
        
        System.out.println("[Dando de Baja Libro]");
        
        lDAO.darDeAltaLibro(id);
    }
    
    
    public void buscarLibroPorId(long id) throws Exception {
        
        Libro libro;
        try{
        libro = lDAO.buscarLibroId(id);
        System.out.println(libro.toString());
        } catch ( Exception e){
            System.out.println(e.toString());
            System.out.println("No se encontro el ID");
        }
        
    }
    
    public void buscarLibroPorNombre(String nombre) throws Exception {
        try{
        Libro libro;
        
        libro = lDAO.buscarLibroNombre(nombre);
        
        System.out.println(libro.toString());
        } catch ( Exception e){
            System.out.println(e);
            System.out.println("No se encontro el nombre");
        }
    }
    
    public void buscarLibroPorNombreAutor(String nombre) throws Exception {
        
        List<Libro> libro;
        try{
        libro = lDAO.buscarLibrosPorNombreAutor(nombre);
        libro.forEach((libro1) -> {
            System.out.println(libro1.toString());
            });
        } catch ( Exception e){
            System.out.println("No se encontro el nombre");
        }
        
       
    }
    
    public void buscarLibroPorNombreEditorial(String nombre) throws Exception {
        
        List<Libro> libro;
        try{
        libro = lDAO.buscarLibrosPorNombreEditorial(nombre);
        libro.forEach((libro1) -> {
            System.out.println(libro1.toString());
            });
        } catch ( Exception e){
            System.out.println("No se encontro el nombre");
        }
        
    }
}
