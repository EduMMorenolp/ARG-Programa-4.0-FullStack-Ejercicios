/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Libro;

/**
 *
 * @author no_de
 */
public class LibroDAO extends DAO<Libro>{
    
    public void guardarLibro(Libro libro) throws Exception {
        super.guardar(libro);
    }
    
    
}
