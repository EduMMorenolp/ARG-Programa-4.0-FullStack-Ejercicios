/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio6;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una
     * matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
     * sus columnas y sus diagonales son idénticas. Crear un programa que
     * permita introducir un cuadrado por teclado y determine si este cuadrado
     * es mágico o no. El programa deberá comprobar que los números introducidos
     * son correctos, es decir, están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        int sumaMagica;

        // Pedimos los números del cuadrado por teclado y los almacenamos en la matriz cuadrado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el número de la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                int num = input.nextInt();
                // Verificamos que el número esté entre 1 y 9
                while (num < 1 || num > 9) {
                    System.out.println("El número introducido no es válido. Introduce un número entre 1 y 9.");
                    num = input.nextInt();
                }
                cuadrado[i][j] = num;
            }
        }

        // Calculamos la suma mágica
        sumaMagica = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

        // Comprobamos que la suma de cada fila, columna y diagonal sea igual a la suma mágica
        boolean esMagico = true;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            if (sumaFila != sumaMagica || sumaColumna != sumaMagica) {
                esMagico = false;
                break;
            }
        }
        if (esMagico && cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2] == sumaMagica
                && cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0] == sumaMagica) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }

        input.close();
    }

}