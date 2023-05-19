/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11teoria_persona;

import dni.Dni;
import persona.Persona;

/**
 *
 * @author no_de
 */
public class Guia11TEORIA_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * EJERCICIO PERSONA Realiza un programa en donde una clase Persona
         * tenga como atributo nombre, apellido y un objeto de clase Dni. La
         * clase Dni tendrá como atributos la serie (carácter) y número. Prueba
         * acceder luego a los atributos del dni de la persona creando objetos y
         * jugando desde el main.
         */
        
        Dni d = new Dni("A", 32777999);
        
        Persona p = new Persona("Juan","Perez", d);
        
        System.out.println(p);
        
        
        
    }

}
