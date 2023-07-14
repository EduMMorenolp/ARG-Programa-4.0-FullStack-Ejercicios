/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Cliente;
import ejercicio.libreria.entidades.Prestamo;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author no_de
 */
public class ClienteDAO extends DAO<Cliente> {

    public void guardarCliente(Cliente cliente) throws Exception {

        Cliente clienteExistente = buscarClienteDNI(cliente.getDocumento());
        if (clienteExistente != null) {
            System.out.println("Ya existe un Cliente con el mismo DNI");
        }
        super.guardar(cliente);
    }

    public Cliente buscarClienteDNI(long dni) throws Exception {

        System.out.println("[Buscando Cliente]");
        try {
            conectar();
            Cliente cliente = em.createQuery("SELECT a FROM Cliente a WHERE a.dni LIKE :dni", Cliente.class)
                    .setParameter("dni", dni)
                    .getSingleResult();
            desconectar();
            return cliente;
        } catch (NoResultException e) {
            System.out.println("No se encontró ningún autor con el nombre proporcionado: " + dni);
            return null; // o lanzar una excepción personalizada aquí
        } catch (Exception e) {
            System.out.println("Error al buscar autor por nombre: " + e.getMessage());
            throw e;
        }
    }

    public List<Prestamo> buscarPrestamosPorCliente(Cliente cliente) throws Exception {
        System.out.println("[Buscando Préstamos por Cliente]");
        try {
            conectar();
            List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente = :cliente", Prestamo.class)
                    .setParameter("cliente", cliente)
                    .getResultList();
            desconectar();
            return prestamos;
        } catch (Exception e) {
            System.out.println("Error al buscar préstamos por cliente: " + e.getMessage());
            throw e;
        }
    }

}
