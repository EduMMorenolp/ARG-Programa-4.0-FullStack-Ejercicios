/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11teoria_jugador;

import equipo.Equipo;
import java.util.ArrayList;
import jugador.Jugador;

/**
 *
 * @author no_de
 */
public class Guia11TEORIA_JUGADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * EJERCICIO JUGADOR Realiza un programa en donde exista una clase
         * Jugador que contenga nombre, apellido, posición y número. Luego otra
         * clase Equipo que contenga una colección de jugadores. Una vez hecho
         * esto, desde el main recorreremos el equipo mostrando la información
         * de cada jugador.
         */
        
        Jugador p1 = new Jugador("Juan", "Lara", "A", 23);
        Jugador p2 = new Jugador("Calos", "Perez", "C", 84);
        Jugador p3 = new Jugador("Cielo", "Dia", "D", 66);
        Jugador p4 = new Jugador("Marta", "Sanchez", "B", 7);
        
        ArrayList<Jugador> listaJugadores = new ArrayList();
        
        listaJugadores.add(p1);
        listaJugadores.add(p2);
        listaJugadores.add(p3);
        listaJugadores.add(p4);
        
        Equipo e1 = new Equipo();
        
        e1.setJugadores(listaJugadores);
        
        System.out.println(e1.toString());
        
    }

}
