/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8teoria;

/**
 *
 * @author no_de
 */
public class Guia8TEORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Ejercicio void Crea un método void que reciba un objeto tipo persona
         * como parámetro y utilice el get para mostrar sus atributos.Llama ese
         * método desde el main.
         */
         Persona persona = new Persona("Juan", 25);
         mostrarPersona(persona);
         
  }

    public static void mostrarPersona(Persona persona) {
      System.out.println("Nombre: " + persona.getNombre());
      System.out.println("Edad: " + persona.getEdad());
    }
}
