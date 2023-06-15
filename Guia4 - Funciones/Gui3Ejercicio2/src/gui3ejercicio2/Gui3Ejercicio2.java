/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Gui3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Diseñe una función que pida el nombre y la edad de N personas e
         * imprima los datos de las personas ingresadas por teclado e indique si
         * son mayores o menores de edad. Después de cada persona, el programa
         * debe preguntarle al usuario si quiere seguir mostrando personas y
         * frenar cuando el usuario ingrese la palabra “No”.
         */
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        boolean seguir = true;
        
        while(seguir) {
            System.out.println("Ingrese el nombre de la persona:");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad de " + nombre + ":");
            edad = leer.nextInt();
            leer.nextLine(); 
            
            Mayordeedad(nombre,edad);
            
            System.out.println("¿Quiere seguir ingresando personas? (Si/No)");
            String respuesta = leer.nextLine();
            seguir = respuesta.equalsIgnoreCase("Si");
   
    }
    }       
public static void Mayordeedad(String nombre, int edad){
    if (edad >= 18) {
        System.out.println(nombre + " es mayor de edad.");
    } else {
        System.out.println(nombre + " es menor de edad.");
    }
} 
}
