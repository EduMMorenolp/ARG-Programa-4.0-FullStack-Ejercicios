/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3teoriaejer9;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3TEORIAEjer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /**
     * Ejercicio 9
     Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
     El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
     */   
      
     Scanner leer = new Scanner(System.in);
     
     int num, sum ;
    	 
      sum = 0;
    for (int i = 0; i < 20; i++) {
      System.out.print("Ingrese un número: ");
      num = leer.nextInt();
      if (num == 0) {
        System.out.println("Se capturó el número cero");
        break;
      }
      if (num > 0) {
        sum += num;
      }
    }
    System.out.println("La suma de los números positivos es: " + sum);
    }
}