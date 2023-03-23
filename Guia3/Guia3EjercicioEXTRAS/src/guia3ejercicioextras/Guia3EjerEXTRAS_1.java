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
public class Guia3EjerEXTRAS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**
        * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
     Scanner leer = new Scanner(System.in);
     
        System.out.println("");
     
        System.out.println("Ingrese los minutos : ");
        int minutos = leer.nextInt();
        
        // Calculo 
        int dias = minutos / 1440;
        int horas = (minutos % 1440) / 60;
        
        System.out.println(minutos + " minutos son equivalentes a " + dias + " día(s) y " + horas + " hora(s).");
        
    }
    
}
