    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextras3.Juego;

/**
 *
 * @author no_de
 */

import java.util.Scanner;
import Limpiarpantalla.Clear;
import java.awt.AWTException;

public class Juego {
    private int numero;
    private int intentos;
    private int jugador1Ganadas;
    private int jugador2Ganadas;
    
    public Juego() {
        jugador1Ganadas = 0;
        jugador2Ganadas = 0;
    }
    
    public void iniciar_juego() throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador 1, elige un número:");
        numero = scanner.nextInt();
        intentos = 5; // Se puede modificar el número de intentos
        
        Clear.limpiarpantalla();      
        
        System.out.println("Jugador 2, adivina el número:");
        while (intentos > 0) {
            
            System.out.println("Jugador 2, adivina el número:");
            int adivinanza = scanner.nextInt();
            
            if (adivinanza == numero) {
                System.out.println("¡Correcto! El número era " + numero);
                jugador2Ganadas++;
                break;
            } else {
                intentos--;
                if (adivinanza > numero) {
                    System.out.println("Más bajo");
                } else {
                    System.out.println("Más alto");
                }
            }
        }
        
        if (intentos == 0) {
            System.out.println("¡Se te acabaron los intentos! El número era " + numero);
            jugador1Ganadas++;
        }
    }
    
    public int getJugador1Ganadas() {
        return jugador1Ganadas;
    }
    
    public int getJugador2Ganadas() {
        return jugador2Ganadas;
    }
}
