/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments 
     * Realizar un algoritmo que llene un
     * vector de tamaño N con valores aleatorios y le pida al usuario un número
     * a buscar en el vector. El programa mostrará dónde se encuentra el numero
     * y si se encuentra repetido
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Random Aletorio = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i] = Aletorio.nextInt(10);
        }
        
        System.out.print("Ingrese el número a buscar: ");
        int numero = leer.nextInt();
        int aux = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i] == numero && aux == 1) {      
                System.out.println("El número está repetido en el índice " + i);                   
                }           
            if (vector[i] == numero && aux == 0) {
                    System.out.println("El número se encuentra en el índice " + i);
                    aux = 1;
                } 
        for ( i = 0; i < N; i++) {
            System.out.println(" - " + vector[i] + " - ");
        }                 
            }
        }
    }


