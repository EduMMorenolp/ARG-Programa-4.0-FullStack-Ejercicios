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
    
    
}
