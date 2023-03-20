/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3teoriaejer10;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3TEORIAEjer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /**
     * Ejercicio 10
     Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
     * Por ejemplo:
     * 5 *****
     * 3 ***
     * 11 ***********
     * 2 **
     */    
        
     Scanner leer = new Scanner(System.in);
     
     int num1,num2,num3,num4;
     
    System.out.println("Ingrese 4 numeros : ");
      num1 = leer.nextInt();      
      num2 = leer.nextInt(); 
      num3 = leer.nextInt(); 
      num4 = leer.nextInt(); 
      
     for (int i = 0; i < 1; i++) {
        System.out.print(num1);   
      for (int j = 0; j < num1; j++) {
        System.out.print("*");
     }
     }
     System.out.println("");
     for (int i = 0; i < 1; i++) {
        System.out.print(num2);   
      for (int j = 0; j < num2; j++) {
        System.out.print("*"); 
     }
     }
     System.out.println("");
      for (int i = 0; i < 1; i++) {
        System.out.print(num3);   
      for (int j = 0; j < num3; j++) {
        System.out.print("*"); 
     }
     }
      System.out.println("");
      for (int i = 0; i < 1; i++) {
        System.out.print(num4);   
      for (int j = 0; j < num4; j++) {
        System.out.print("*");  
     }
    }
    System.out.println("");
    }
}
