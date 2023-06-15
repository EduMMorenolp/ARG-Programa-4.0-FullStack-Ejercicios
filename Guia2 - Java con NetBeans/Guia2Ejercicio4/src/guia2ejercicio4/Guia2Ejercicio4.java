/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        //La fórmula correspondiente es: F = 32 + (9 * C / 5)
        Scanner leer = new Scanner(System.in);
        int C,F;
        System.out.println("Ingrese los centigrados : ");
        C = leer.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("Su equivalente a Fahrenheit es: " + F);
    }
    
}
