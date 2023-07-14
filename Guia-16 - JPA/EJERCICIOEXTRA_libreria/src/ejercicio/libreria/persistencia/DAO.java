/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import javax.persistence.*;

/**
 *
 * @author no_de
 * @param <t> Objeto
 */
public class DAO<t> {

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("EJERCICIOEXTRA_libreriaPU");
    protected EntityManager em = EMF.createEntityManager();

    
    protected void conectar() throws Exception {
        try{
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
        } catch ( Exception e ){
            System.out.println("Error al conectar a BD");
        }
    }

    protected void desconectar() throws Exception {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void guardar(t objeto) throws Exception {
        try{
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
        } catch ( Exception e ){
            System.out.println(" Error al guardar en BD");
        }
    }

    protected void editar(t objeto) throws Exception {
        try{
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        } catch ( Exception e){
            System.out.println(" Error al editar en BD");
        }
    }

    protected void eliminar(t objeto) throws Exception {
        try{
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
        } catch ( Exception e){
            System.out.println(" Error al eliminar en BD : " + e.getMessage());
            
        }
    }
}
