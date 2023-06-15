/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extrasejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia5EXTRASEjercicio2 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe
     * si dos vectores de N enteros son iguales (la comparación deberá detenerse
     * en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         Random randon = new Random();

        int n;

        System.out.print("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = randon.nextInt(10);
        }
        for (int i = 0; i < n; i++) {
            vector2[i] = randon.nextInt(10);
        }
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vector1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vector2[i] + " ");
        }    
        System.out.println("");
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
}
