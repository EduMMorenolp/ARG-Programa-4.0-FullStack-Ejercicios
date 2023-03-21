/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un programa que dado un número determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if (num % 2 != 0)
            System.out.println("Numero Impar");
        else
            System.out.println("Numero Par");
        
    }
        
    
}
