/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicio1;

import animal.Animal;
import animales.entidad.Caballo;
import animales.entidad.Gato;
import animales.entidad.Perro;

/**
 *
 * @author no_de
 */
public class Guia12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro,
         * Gato, Caballo. La clase Animal tendrá como atributos el nombre,
         * alimento, edad y raza del Animal. Crear un método en la clase Animal
         * a través del cual cada clase hija deberá mostrar luego un mensaje por
         * pantalla informando de que se alimenta. Generar una clase Main que
         * realice lo siguiente:
         */
        
        // Declaracion Perro1
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.Alimentacion();
        
        // Declaracion Perro2
        Animal perro2 = new Perro("Toddy", "Arroz", 10, "Calleguero");
        perro2.Alimentacion();
        
        // Declracion Gato
        Animal gato = new Gato("Pelusa", "Pescado", 15, "Siames");
        gato.Alimentacion();
        
        // Declaracion Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Grueso");
        caballo.Alimentacion();
        
        
    }

}
