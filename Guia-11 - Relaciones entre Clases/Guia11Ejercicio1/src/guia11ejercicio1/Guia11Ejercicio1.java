/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio1;

import perro.Perro;
import persona.Persona;

/**
 *
 * @author no_de
 */
public class Guia11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases. Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño; y la clase Persona con atributos:
         * nombre, apellido, edad, documento y Perro. Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        
        Perro p1 = new Perro( "Jokina","Galgo", 4 ,"Mediano");
        Perro p2 = new Perro( "Chiquito","Beagle", 1 ,"Chico");
        
        Persona per1 = new Persona("Carlos", "Pelado", 32777999, 43 , p2);
        Persona per2 = new Persona("Diana", "Cortina", 17555666, 14 , p1);
        
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        
    }

}
