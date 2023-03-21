/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.
     */    
    
    Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese un numero");
        frase = leer.next();
        
     if (frase.equals("eureka")) 
      System.out.println("Correcto");
     else 
      System.out.println("Incorrecto");
    
   }
}
