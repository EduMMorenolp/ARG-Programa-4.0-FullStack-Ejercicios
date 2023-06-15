/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia5Ejercicio3 {

    /**
     * @param args the command line arguments
     * 
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random Aletorio = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = Aletorio.nextInt(99999);
        }
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        for (int i = 0; i < N; i++) {
            String numero = Integer.toString(vector[i]);
            int digitos = numero.length();
            if (digitos == 1) {
                unDigito++;
            } else if (digitos == 2) {
                dosDigitos++;
            } else if (digitos == 3) {
                tresDigitos++;
            } else if (digitos == 4) {
                cuatroDigitos++;
            } else if (digitos == 5) {
                cincoDigitos++;                
            System.out.println(" - " + vector[i] + " - ");
            }
        }
        System.out.println("Números de 1 dígito: " + unDigito);
        System.out.println("Números de 2 dígitos: " + dosDigitos);
        System.out.println("Números de 3 dígitos: " + tresDigitos);
        System.out.println("Números de 4 dígitos: " + cuatroDigitos);
        System.out.println("Números de 5 dígitos: " + cincoDigitos);
    }

}
