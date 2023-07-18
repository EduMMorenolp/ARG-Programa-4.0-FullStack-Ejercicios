/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.servicios;

import ejercicio.libreria.entidades.Cliente;
import ejercicio.libreria.entidades.Libro;
import ejercicio.libreria.entidades.Prestamo;
import ejercicio.libreria.persistencia.PrestamoDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author no_de
 */
public class PrestamoServicio {
    
    PrestamoDAO pDAO = new PrestamoDAO();
    
    public void hacerPrestamo(Cliente cliente, String fechaDevolucion, Libro libro) throws Exception{
        
        System.out.println("[Ingresando Prestamo]");
        
        String formatoString = "dd/MM/yyyy";
        SimpleDateFormat formatoFecha = new SimpleDateFormat(formatoString);
        Calendar calendar = Calendar.getInstance(); // Obtener instancia de Calendar
        Date fechaPrestamo = calendar.getTime(); // Obtener fecha actual
        
        try {
        Date fechaDev = formatoFecha.parse(fechaDevolucion); // Convertir el String a Date
        
        Prestamo p = new Prestamo();
        
        p.setCliente(cliente);
        p.setFechaPrestamo(fechaPrestamo);
        p.setFechaDevolucion(fechaDev);
        p.setLibro(libro);
        
        pDAO.ingresarPrestamo(p);
        } catch ( Exception e){
            System.out.println(" Error al hacer Prestamo ");
        }
    }
    
    public void hacerDevolucion(Libro libro){
        
        
        
    }
    
}
