/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.ArrayList;
import java.util.Scanner;
import jugador.Jugador;
import revolverDeAgua.RevolverDeAgua;

/**
 *
 * @author no_de
 */
public class Juego {
    
    ArrayList<Jugador> jugadores = new ArrayList();
    RevolverDeAgua r = new RevolverDeAgua();
    
    public void llenarJuego(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---BIENVENIDO A PISTOLA LOCA---");
        System.out.println("Ingrese la cantidad de Jugadores MAX=6");
        int cantJugadores = leer.nextInt();    
       
        
        for (int i = 1; i <= cantJugadores ; i++) {
            Jugador n = new Jugador(i);
            System.out.println("Ingrese el nombre del Jugador :");
            n.setNombre(leer.next());
            jugadores.add(n);
        }
        r.llenarRevolver();
    }
    
    public void ronda(){
        boolean alguienMojado = false;
        System.out.println("---NUEVA DE RONDA---");
        for (Jugador jugador : jugadores) {
           jugador.disparo(r);
           System.out.println(jugador);
           if (jugador.getMojado()){
               alguienMojado = true;
               break;
           }     
        }
        if (!alguienMojado) {
            System.out.println("¡Nadie se ha mojado! Siguiente ronda...");
            ronda();
        } else {
            System.out.println("¡Alguien se ha mojado!");
            
        }
    }

}
