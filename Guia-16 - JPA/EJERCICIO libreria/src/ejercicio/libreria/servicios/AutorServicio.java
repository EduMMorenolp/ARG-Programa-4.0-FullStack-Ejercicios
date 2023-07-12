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
    
    public Autor crearAutor(String nombre) throws Exception {
        
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
    
}
