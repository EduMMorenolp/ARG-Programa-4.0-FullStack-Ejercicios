/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5extrasejercicio6;

import java.util.Scanner;

/**
 *
 * @author no_de
 */
public class Guia5EXTRASEjercicio6 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese 5 palabras de 3 a 5 caracteres.
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + " de 3 a 5 caracteres: ");
            palabras[i] = leer.nextLine();
            // Verificar que la palabra tenga la longitud correcta.
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Error: la palabra debe tener entre 3 y 5 caracteres. Ingrese de nuevo: ");
                palabras[i] = leer.nextLine();
            }
        }
        
        // Construir la sopa de letras.
        char[][] sopa = new char[20][20];      
         // Seleccionar una fila aleatoria.
        int columnaActual = 0;
        for (String palabra : palabras) {
            // Insertar la palabra en la fila seleccionada, si es posible.
            int longitud = palabra.length();
            if (columnaActual + longitud <= 20) {
                int filaSeleccionada = (int) (Math.random() * 20 );
                for (int i = 0; i < longitud; i++) {
                    sopa[filaSeleccionada][columnaActual + i] = palabra.charAt(i);
                }
                columnaActual += longitud + 1; // Dejar un espacio entre las palabras.
            }
        }

        // Rellenar los espacios no utilizados con números aleatorios del 0 al 9.
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) ('0' + (int) (Math.random() * 10));
                }
            }
        }

        // Imprimir la sopa de letras.
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        
    
    

