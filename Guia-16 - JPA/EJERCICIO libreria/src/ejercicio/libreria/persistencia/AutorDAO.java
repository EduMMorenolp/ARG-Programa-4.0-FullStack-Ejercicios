/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Autor;
import java.sql.SQLClientInfoException;

/**
 *
 * @author no_de
 */
public class AutorDAO extends DAO<Autor> {

    public void guardarAutor(Autor autor) throws Exception {
        super.guardar(autor);
    }

    public void editarAutor(Autor autor) throws Exception {
        super.editar(autor);
    }

//    public void EliminarAutor(Autor autor) throws Exception {
//        super.eliminar(autor);
//    }
    
    public void darDeAltaAutor(Integer id) throws Exception {
        
        Autor autor = buscarAutorId(id);
        if (autor != null) {
            autor.setAlta(true);
            super.editar(autor);
        }
    }

    public void darDeBajaAutor(Integer id) throws Exception {
        Autor autor = buscarAutorId(id);
        if (autor != null) {
            autor.setAlta(false);
            super.editar(autor);
        }
    }
    

    public Autor buscarAutorId(Integer id) throws Exception {
        
        System.out.println("[Buscando Autor]");
        
        Autor autor;
        try {
            super.conectar();
            
            autor = em.find(Autor.class, id);
            
            System.out.println(" Encontrado : " + autor);
            
            desconectar();
            return autor;
        } catch (SQLClientInfoException eSQL) {
            System.out.println(" Error al Buscar Autor ");
            System.out.println(eSQL);
            return null;
        }
    }

}
