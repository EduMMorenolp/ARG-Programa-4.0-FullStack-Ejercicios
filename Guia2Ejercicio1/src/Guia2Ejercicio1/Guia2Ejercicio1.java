/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        // El programa deberá después mostrar el resultado de la suma
        
        // Variable Scanner que se usa para leer datos
        Scanner leer = new Scanner(System.in);
        // Creacion de variables a calcular
        System.out.println("Ingrese dos numeros enteros: ");
        int num1;
        int num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: " + suma);
                  
        
        
        
        
              
        
        
        

    }
    
}
