/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Gui3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Crea una aplicación que nos pida un número por teclado y con una
         * función se lo pasamos por parámetro para que nos indique si es o no
         * un número primo, debe devolver true si es primo, sino false. Un
         * número primo es aquel que solo puede dividirse entre 1 y sí mismo.
         * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin
         * embargo, 17 si es primo.
         */
    Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();

        if (esPrimo(num)) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
    
    
    

