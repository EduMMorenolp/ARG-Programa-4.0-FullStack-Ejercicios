/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.persistencia;

import ejercicio.libreria.entidades.Prestamo;


/**
 *
 * @author no_de
 */
public class PrestamoDAO extends DAO<Prestamo>{
    
    public void ingresarPrestamo(Prestamo prestamo){
        try {
            super.guardar(prestamo);
        } catch (Exception ex) {
            System.out.println("Error al ingresar Prestamo en BD");
        }
    }

}
