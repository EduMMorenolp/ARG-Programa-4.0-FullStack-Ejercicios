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
public class Guia3EjerEXTRAS_9 {
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        int cociente = 0; // variable para almacenar el cociente
        int residuo = dividendo; // variable para almacenar el residuo

        // Restar el divisor del dividendo hasta que el resultado sea menor que el divisor
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}

