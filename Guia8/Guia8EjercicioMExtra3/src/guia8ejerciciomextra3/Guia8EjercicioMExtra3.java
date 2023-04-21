/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejerciciomextra3;

import pass.Pass;
import passservicio.PassServicio;

/**
 *
 * @author no_de
 */
public class Guia8EjercicioMExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** EJERCICIO 3
         * Crear una clase Pass, donde declaremos los siguientes atributos: ●
         * pass : Del tipo String ● nombre: Del tipo String ● dni: Del tipo int.
         * Métodos para desarrollar: ● Ingresar datos de usuarios (usando el
         * constructor. HACER INGRESO DE DATOS FIJOS (no por teclado) ● Crear un
         * método para ingresar una contraseña (crearPass). En este método,
         * debemos validar que la longitud sea correcta. (10). En caso de ser
         * correcto, almaceno la contraseña. Si ingreso a esta opción del menú,
         * indefectiblemente deberá dejar su contraseña asignada. ● Crear un
         * método para analizar la contraseña(analizarPass). Donde: o SI Existe
         * al menos una letra z : Es nivel MEDIO o Si Existe al menos una letra
         * z y al menos 2 letras a: Es nivel ALTO o Si ninguna condición se
         * cumple es nivel BAJO ● Crear los métodos correspondientes para
         * modificar el nombre o DNI. Atención! Primero debe ingresar el pass
         * para poder realizar dicha gestión. Caso contrario se impedirá el
         * acceso a modificar los datos. ● A través de un menú de opciones: o A)
         * ingresar la contraseña, recordar que antes de guardarla debe ser
         * ingresada una contraseña valida). o B) Mensaje al usuario que tipo de
         * NIVEL es su contraseña o C) Modificar contraseña, donde primero debe
         * poner su contraseña anterior para dar permiso o C) Modificar nombre,
         * donde primero debe poner su contraseña para dar permiso, SINO impedir
         * cambios o D) Modificar DNI, donde primero debe poner su contraseña
         * para dar permiso, SINO impedir cambios
         */
        
        PassServicio per1 = new PassServicio();
        Pass p1 = new Pass();
        
        per1.menu(p1);
        
        
        
      
        

    }

}
