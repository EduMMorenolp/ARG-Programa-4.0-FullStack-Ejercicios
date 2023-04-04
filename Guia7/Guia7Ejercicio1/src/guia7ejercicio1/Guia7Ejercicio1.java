/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

/**
 *
 * @author no_de
 */
public class Guia7Ejercicio1 {

    /**
     * @param args the command line arguments Crear una clase llamada Libro que
     * contenga los siguientes atributos: ISBN, Título, Autor, Número de
     * páginas, y un constructor con todos los atributos pasados por parámetro y
     * un constructor vacío. Crear un método para cargar un libro pidiendo los
     * datos al usuario y luego informar mediante otro método el número de ISBN,
     * el título, el autor del libro y el número de páginas.
     */
    public static void main(String[] args) {
        // TODO code application logic here

 
        libro1 libro1 = new libro1();
      
        libro1.cargarLibro();
        libro1.mostrarInformacion();
        
    }
}
