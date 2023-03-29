/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio6;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una
     * matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado
     * es mágico o no. El programa deberá comprobar que los números introducidos
     * son correctos, es decir, están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int[][] cuadrado = new int[3][3];
        
        System.out.println("Introduce los números para el cuadrado (del 1 al 9):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int aux = leer.nextInt();
                if ( aux > 0 && aux < 10){
                    cuadrado[i][j] = aux;
                    else
            }
                
            }
        }
        
    }
    
}
