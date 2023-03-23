/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicioextras;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3EjerEXTRAS_3 {
    /**
     * @param args the command line arguments
     */
    
    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
     * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args){
        
     
    Scanner leer = new Scanner(System.in);    
    
    String cadena;
     
    System.out.println("Ingrese las cadenas");
        cadena = leer.nextLine();
        cadena = cadena.toLowerCase(); // Convertir cadena a minúsculas

        if (cadena.equals("a") || cadena.equals("e") || cadena.equals("i") || cadena.equals("o") || cadena.equals("u") ){
            System.out.println("La letra es una VOCAL");
            
        }else{
            System.out.println("La letra es una NO es VOCAL");
        }
        }
}
