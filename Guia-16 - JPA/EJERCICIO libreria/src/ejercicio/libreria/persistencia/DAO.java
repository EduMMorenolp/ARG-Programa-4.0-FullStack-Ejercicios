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

    protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("EJERCICIO_libreriaPU");
    protected EntityManager em = EMF.createEntityManager();

    
    protected void conectar() {
        if (!em.isOpen()) {
            em = EMF.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void guardar(t objeto) {
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    protected void editar(t objeto) {
        conectar();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    protected void eliminar(t objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
}
