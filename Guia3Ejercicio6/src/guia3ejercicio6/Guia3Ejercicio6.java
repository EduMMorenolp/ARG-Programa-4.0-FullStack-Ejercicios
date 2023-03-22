/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio6;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
     * si el usuario selecciona la opción 5, en vez de salir del programa directamente,
     * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     */    
    
    Scanner leer = new Scanner(System.in);
    Scanner sali = new Scanner(System.in);
    
    int num1;
    int num2;
    int opcion;
    int bandera;
    String salir;
    
    System.out.println("Ingrese dos numeros");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    System.out.println("MENU");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        
        opcion = 0;
    while (opcion != 6){
        System.out.println("Ingrese una opción");
        opcion = leer.nextInt();
    	switch (opcion) {
           case 1:
               bandera = (num1 + num2);
               System.out.println("La Suma es " + bandera);
               continue;
           case 2:
               bandera = (num1 - num2);
               System.out.println("La Resta es " + bandera);
               continue;
           case 3:
               bandera = (num1 * num2);
               System.out.println("La Multiplicacion es " + bandera);
               continue;
           case 4:             
               bandera = (num1 / num2);
               System.out.println("La Divicion es " + bandera);
               continue;
           case 5:
               System.out.println("¿Está seguro que desea salir del programa (S/N)?");
               salir = sali.nextLine();
               
               if (salir.equals("S")){
                   opcion = 6;
                   break;
               }else{
                   System.out.println("Vuelva a ingresar dos numeros");
                     num1 = leer.nextInt();
                     num2 = leer.nextInt(); 
               }
               
        }
    }
    System.out.println("Saliendo...");
    }  
}
