/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3teoriaejercicio12;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3TEORIAEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Ejercicio 12 Crea un procedimiento EsMultiplo que reciba los dos
         * números pasados por el usuario, validando que el primer número
         * múltiplo del segundo e imprima si el primer número es múltiplo del
         * segundo, sino informe que no lo son.
         */
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese 2 numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        EsMultiplo(num1,num2);
    }
public static void EsMultiplo(int num1, int num2){

            if (num1 % num2 == 0) {
            System.out.println("El " + num1 + " es multiplo de " + num2);
        } else {
            System.out.println("Los numeros no son multiplos");
        }
}
}
