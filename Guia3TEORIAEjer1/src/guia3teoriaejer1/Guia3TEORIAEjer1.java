/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3teoriaejer1;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3TEORIAEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejercicio 6
        // Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

        
        Scanner leer = new Scanner(System.in);
        int num1 , num2;
                        
        System.out.println("Ingrese Dos numeros ; ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25) {
            System.out.println("El primer numero es mayor a 25");
        }else{
            System.out.println("El primer numero es menor a 25");
        }
        if (num2 > 25) {
            System.out.println("El segundo numero es mayor a 25");   
        }else{
            System.out.println("El segundo numero es menor a 25");
        }
    }
    
}
