/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio3;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**
     *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
     * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
     * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingresa una frase:");
    String frase = leer.nextLine();
    
    if (frase.length() == 8) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }        
  }         
}
