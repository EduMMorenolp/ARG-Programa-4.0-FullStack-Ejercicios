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
public class Guia3EjerEXTRAS_2 {
   /**
    * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
    * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
    * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    */
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    
    int A = 1;
    int B = 2;
    int C = 3;
    int D = 4;
    int Bandera;
    
    System.out.println("Las Variables son A : " + A + "| B : " + B + "| C : " + C + "| D : " + D);
    
    Bandera = A;
    A = D;
    D = B;
    B = C;
    C = Bandera;
    
    System.out.println("Nuevas Variables son A : " + A + "| B : " + B + "| C : " + C + "| D : " + D);
    }   
}
