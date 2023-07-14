/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.servicios;

import ejercicio.libreria.entidades.Cliente;
import ejercicio.libreria.entidades.Prestamo;
import ejercicio.libreria.persistencia.ClienteDAO;
import java.util.List;

/**
 *
 * @author no_de
 */
public class ClienteServicio {
    
    ClienteDAO cDAO = new ClienteDAO();
    
    public void crearCliente(long documento, String nombre, String apellido, String telefono){
        
        Cliente c = new Cliente();
        
        c.setDocumento(documento);
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setTelefono(telefono);
        
        try {
            cDAO.guardarCliente(c);
        } catch (Exception ex) {
            System.out.println("ERROR al guardar cliente");
        }
    }
    
    public void buscarPrestamosPorCliente(Cliente cliente){
        
        try {
            List<Prestamo> prestamos = cDAO.buscarPrestamosPorCliente(cliente);
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo.toString());
            }
        } catch (Exception ex) {
            System.out.println("ERROR al buscar prestamos de clientes");
        }
        
        
        
    }
}
