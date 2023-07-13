/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.servicios;

import ejercicio.libreria.entidades.Editorial;
import ejercicio.libreria.persistencia.EditorialDAO;

/**
 *
 * @author no_de
 */
public class EditorialServicio {
    
    EditorialDAO eDAO = new EditorialDAO();
    
    public Editorial crearEditorial(String nombre) throws Exception {
 
        
        System.out.println("[Creando Editorial]");
        
        Editorial editorial = new Editorial();
        
        editorial.setNombre(nombre);
        
        try{
        eDAO.guardarEditorial(editorial);
        } catch ( Exception e){
            System.out.println(" Error al crear Editorial ");
         
        }
        return editorial;
    }
    
    public Editorial editarEditorial(Integer id, String nombre) throws Exception {
        
        System.out.println("[Editando Editorial]");
        
        Editorial editorial = new Editorial();
        
        editorial.setId(id);
        editorial.setNombre(nombre);
        try{
        eDAO.editarEditorial(editorial);
        } catch ( Exception e){
            System.out.println(" Error al editar Editorial ");
        }
        return editorial;
        
    }
    
    
    public void darDeAltaEditorial(Integer id) throws Exception {
        
        System.out.println("[Dando de Alta Editorial]");
        
        eDAO.darDeAltaEditorial(id);
        
    }

    public void darDeBajaEditorial(Integer id) throws Exception {
        
        System.out.println("[Dando de Baja Editorial]");
        
        eDAO.darDeAltaEditorial(id);
    }
    
}
