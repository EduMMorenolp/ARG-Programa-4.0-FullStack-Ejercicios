/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import revolverDeAgua.RevolverDeAgua;

/**
 *
 * @author no_de
 */
public class Jugador {
    
    private final int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador(int id) {
        this.id = id;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void disparo(RevolverDeAgua r){                
        if (r.mojar()){
            mojado = true;
        }else{
            r.siguienteChorro();
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre: " + nombre + " " + id +", mojado=" + mojado + '}';
    } 

    public boolean getMojado() {
        return mojado;
    }
}
