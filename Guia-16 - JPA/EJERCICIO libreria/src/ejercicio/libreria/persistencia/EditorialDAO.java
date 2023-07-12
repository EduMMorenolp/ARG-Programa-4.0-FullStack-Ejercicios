/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Editorial;

/**
 *
 * @author no_de
 */
public class EditorialDAO extends DAO<Editorial>{
    
    public void guardarEditorial(Editorial Editorial) throws Exception{
        super.guardar(Editorial);
    }
    
    
    public void editarEditorial(Editorial Editorial) throws Exception{
        super.editar(Editorial);     
    }
    
    
}
