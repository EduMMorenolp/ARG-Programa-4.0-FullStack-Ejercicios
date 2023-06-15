/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
        // Nota: investigar la función Math.sqrt().
        Scanner leer = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un numero ; ");
        num = leer.nextInt();
        System.out.println("El Doble es : " + Math.scalb(num, 1));        
        System.out.println("El Triple es : " + Math.scalb(num, 2));
        System.out.println("La Raiz Cuadrada es : " + Math.scalb(num, num));
    }
    
}
