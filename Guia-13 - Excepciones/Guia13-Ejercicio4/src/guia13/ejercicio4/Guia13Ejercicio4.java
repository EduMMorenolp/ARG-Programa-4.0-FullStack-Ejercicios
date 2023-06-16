/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio4;

import java.util.InputMismatchException;

/**
 *
 * @author no_de
 */
public class Guia13Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Todas estas operaciones puede tirar excepciones a manejar, el ingreso
         * por teclado puede causar una excepción de tipo
         * InputMismatchException, el método Integer.parseInt() si la cadena no
         * puede convertirse a entero, arroja una NumberFormatException y
         * además, al dividir un número por cero surge una ArithmeticException.
         * Manipule todas las posibles excepciones utilizando bloques try/catch
         * para las distintas excepciones
         */

        // InputMismatchException
        // NumberFormatException
        // ArithmeticException
        
        try {
            int resultado = realizarOperacion();
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no puede convertirse a un entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }

    public static int realizarOperacion() {
        int resultado = 0;
        try {
            System.out.print("Ingrese un número: ");
            int num1 = obtenerNumero();
            System.out.print("Ingrese otro número: ");
            int num2 = obtenerNumero();
            resultado = num1 / num2;
        } catch (InputMismatchException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        } catch (ArithmeticException e) {
            throw e;
        }
        return resultado;
    }

    public static int obtenerNumero() {
        int numero = 0;
        try {
            numero = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            throw e;
        }
        return numero;
    }
}
