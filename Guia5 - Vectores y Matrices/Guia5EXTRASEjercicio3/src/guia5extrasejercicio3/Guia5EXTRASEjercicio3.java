/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extrasejercicio3;

import java.util.Random;

/**
 *
 * @author no_de
 */
public class Guia5EXTRASEjercicio3 {

    /**
     * @param args the command line arguments
     * Crear una función rellene un
     * vector con números aleatorios, pasándole un arreglo por parámetro.
     * Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n = 5;
        int[] vector = new int[n];
        // Llamamos a la función rellenarVector para rellenar el vector con números aleatorios
        rellenarVector(vector);
        // Llamamos a la función imprimirVector para imprimir el vector
        imprimirVector(vector);
    }
    public static void rellenarVector(int vector[]) {
        Random randon = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = randon.nextInt(10);
        }
    }
    public static void imprimirVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

}