/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.servicios;

import ejercicio.libreria.entidades.Autor;
import ejercicio.libreria.persistencia.AutorDAO;
/**
 *
 * @author no_de
 */
public class AutorServicio {
    
    AutorDAO aDAO; 

    public AutorServicio() {
        this.aDAO = new AutorDAO(); 
    }
    
    public Autor crearAutor(String nombre){
        
        System.out.println("[Creando Autor]");
        
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        
        try{
        aDAO.guardarAutor(autor);
        } catch ( Exception e){
            System.out.println(" Error al crear Autor ");
        }
        
        return autor;
    }
    
    public Autor editarAutor(Integer id, String nombreNuevo){
        
        System.out.println("[Editando Autor]");
        
        Autor autor = new Autor();
        
        autor.setId(id);
        autor.setNombre(nombreNuevo);
        
        try{
           aDAO.editarAutor(autor);
        } catch ( Exception e){
            System.out.println(" Error al Editar autor ");
        }
        return autor;
    }
    
    public void darDeAltaAutor(Integer id) throws Exception {
        
        System.out.println("[Dando de Alta Autor]");
        
        aDAO.darDeAltaAutor(id);
        
    }

    public void darDeBajaAutor(Integer id) throws Exception {
        
        System.out.println("[Dando de Baja Autor]");

        
        aDAO.darDeAltaAutor(id);
        
        
    }
    
    public void buscarAutor(String nombre) throws Exception {
        
        Autor autor;
        try{
        autor = aDAO.buscarAutorNombre(nombre);
        
        System.out.println(autor.toString());
        } catch ( Exception e){
            System.out.println(" No se encontro el Autor ");
        }
    }
    
    
    
    
    
//    public void eliminarAutor(Integer id) {
//        
//        System.out.println("[Eliminando Autor]");
//        Autor autor;
//        try{
//           autor = aDAO.buscarAutorId(id);
//            System.out.println("Desde Servicio : " + autor);
//           aDAO.EliminarAutor(autor);
//        } catch ( Exception e){
//            System.out.println(" Error al Eliminar autor ");
//        }
//    }
    
    
    
    
    

}
