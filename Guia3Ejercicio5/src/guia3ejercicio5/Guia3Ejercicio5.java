/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio5;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
    /**
     *Escriba un programa en el cual se ingrese un valor límite positivo,
     * y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    Scanner leer = new Scanner(System.in);
        
        int limit;
        int suma;
        
        System.out.println("Ingrese un numero limte");
        limit = leer.nextInt();
        
        suma = 0;
        while ( suma < limit){
            System.out.println("Ingrese un numero");
            suma += leer.nextInt();
        }
        System.out.println("La suma es de : " + suma);
    }
}
