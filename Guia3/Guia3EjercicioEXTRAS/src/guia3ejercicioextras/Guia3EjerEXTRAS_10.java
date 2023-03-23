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
public class Guia3EjerEXTRAS_10 {
    
    public static void main(String[] args) {
    /**
     * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta.
     * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
     * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */   
    
    Scanner leer = new Scanner(System.in);  
    
    int respuesta = 0;
    
    int num1 = (int) (Math.random() * 11);
    int num2 = (int) (Math.random() * 11);
    
    
    
    System.out.println("Numero aleatorio 1 " + num1);
    System.out.println("Numero aleatorio 2 " + num2);
 
    while ( respuesta != ( num1 * num2) ){
        System.out.println("Ingrese un nuemero entre 1 y 10 : ");
        respuesta = leer.nextInt();
        
        if ( respuesta == ( num1 * num2) ){
            System.out.println("Su respuesta es CORRECTA !");
        }else{
          System.out.println("Su respuesta es INCORRECTA");  
        }  
    } 
    
    }    
}
