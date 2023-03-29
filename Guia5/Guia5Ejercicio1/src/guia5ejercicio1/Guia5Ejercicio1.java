/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio1;

/**
 *
 * @author no_de
 */
public class Guia5Ejercicio1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un
     * vector con los 100 primeros números enteros y los muestre por pantalla en
     * orden descendente.

     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Vector = new int[100];
        
        for ( int i = 0 ; i < 100 ; i++){            
            Vector[i] = i;           
        }
       for (int i = Vector.length - 1; i >= 0; i--) {
          System.out.println(Vector[i]);
        }
    }
    
}
