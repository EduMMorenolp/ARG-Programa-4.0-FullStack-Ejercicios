/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia13Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escribir un programa en Java que juegue con el usuario a adivinar un
         * número. La computadora debe generar un número aleatorio entre 1 y
         * 500, y el usuario tiene que intentar adivinarlo. Para ello, cada vez
         * que el usuario introduce un valor, la computadora debe decirle al
         * usuario si el número que tiene que adivinar es mayor o menor que el
         * que ha introducido el usuario. Cuando consiga adivinarlo, debe
         * indicárselo e imprimir en pantalla el número de veces que el usuario
         * ha intentado adivinar el número. Si el usuario introduce algo que no
         * es un número, se debe controlar esa excepción e indicarlo por
         * pantalla. En este último caso también se debe contar el carácter
         * fallido como un intento
         */

        int numeroAdivinar = generarNumeroAleatorio();
        int intentos = 0;

        System.out.println("¡Adivina el número entre 1 y 500!");

        while (true) {
            try {
                int numeroUsuario = obtenerNumero();
                intentos++;

                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intento(s).");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor que " + numeroUsuario + ".");
                } else {
                    System.out.println("El número a adivinar es menor que " + numeroUsuario + ".");
                }
            } catch (InputMismatchException e) {
                intentos++;
                System.out.println("Error: Debes ingresar un número válido.");
                // Limpiar el búfer de entrada
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
            }
        }
    }

    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(500) + 1;
    }

    public static int obtenerNumero() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        return leer.nextInt();
    }
}


