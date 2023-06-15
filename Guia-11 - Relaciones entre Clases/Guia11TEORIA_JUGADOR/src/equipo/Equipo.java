/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.util.ArrayList;
import java.util.List;
import jugador.Jugador;

/**
 *
 * @author no_de
 */
public class Equipo {
    
    private List<Jugador> Jugadores = new ArrayList();

    public Equipo() {
    }

    public List<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(List<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return "Equipo \n{" + Jugadores + '}';
    }
    
}
