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
public class Guia3EjerEXTRAS_8 {
     /**
     * Escriba un programa que lea números enteros.
     * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
     * la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior 
     * los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */   
     public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);  
      
      int num ;
      int contpar = 0; int contimpar = 0; 

        while (true) {
            System.out.print(" Ingrese un numero : ");

            num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                if (num % 2 != 0) {
                contpar += 1;
            } else;
            contimpar += 1;
            }
        }
        System.out.println("Cantidad de pares : " + contpar);
        System.out.println("Cantidad de Impares : " + contimpar);
        System.out.println("Cantidad de Total : " + (contpar + contimpar));
    }
}
