/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3teoriaejer8;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3TEORIAEjer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**
    *Ejercicio 8
     Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
    */    
    
    Scanner leer = new Scanner(System.in);
  	 
   	int respuesta = 11;
  	 
   	while (respuesta < 0 || respuesta > 10)  {
      	 
    	System.out.println("Ingrese la Nota entre 0 y 10");
    	respuesta = leer.nextInt();
   	   }
        System.out.println("La nota ingresada es: " + respuesta);

    }
    
}
