/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Libro;
import java.sql.SQLClientInfoException;

/**
 *
 * @author no_de
 */
public class LibroDAO extends DAO<Libro>{
    
    public void guardarLibro(Libro libro) throws Exception {
        super.guardar(libro);
    }
    
    public void editarLibro(Libro libro) throws Exception {
        super.editar(libro);
    }
    
    public void darDeAltaLibro(Integer id) throws Exception {
        
        Libro libro = buscarLibroId(id);
        if (libro != null) {
            libro.setAlta(true);
            super.editar(libro);
        }
    }

    public void darDeBajaLibro(Integer id) throws Exception {
        Libro libro = buscarLibroId(id);
        if (libro != null) {
            libro.setAlta(false);
            super.editar(libro);
        }
    }
    
    public Libro buscarLibroId(Integer id) throws Exception {
        
        System.out.println("[Buscando Editorial]");
        
        Libro Libro;
        try {
            super.conectar();
            
            Libro = em.find(Libro.class, id);
            
            System.out.println(" Encontrado : " + Libro);
            
            desconectar();
            return Libro;
        } catch (SQLClientInfoException eSQL) {
            System.out.println(" Error al Buscar Editorial ");
            System.out.println(eSQL);
            return null;
        }
    }
}