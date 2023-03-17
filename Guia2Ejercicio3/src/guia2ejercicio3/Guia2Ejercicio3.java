/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese su frace : ");
        palabra = leer.nextLine();
        String mayusculaPalabra = palabra.toUpperCase();
        System.out.println(mayusculaPalabra);
    }
    
}
