/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Autor;
import java.sql.SQLClientInfoException;
import javax.persistence.NoResultException;

/**
 *
 * @author no_de
 */
public class AutorDAO extends DAO<Autor> {

    public void guardarAutor(Autor autor) throws Exception {
        
        Autor autorExistente = buscarAutorNombre(autor.getNombre());
        if (autorExistente != null) {
            System.out.println("Ya existe un Autor con el mismo nombre");
        }
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

    public Autor buscarAutorNombre(String nombre) throws Exception {
        System.out.println("[Buscando Autor]");
        try {
            conectar();
            Autor autor = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class)
                    .setParameter("nombre", nombre)
                    .getSingleResult();
            desconectar();
            return autor;
        } catch (NoResultException e) {
            System.out.println("No se encontró ningún autor con el nombre proporcionado: " + nombre);
            return null; // o lanzar una excepción personalizada aquí
        } catch (Exception e) {
            System.out.println("Error al buscar autor por nombre: " + e.getMessage());
            throw e;
        }
    }

}
