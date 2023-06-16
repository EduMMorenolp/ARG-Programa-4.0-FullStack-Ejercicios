/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejercicio2;

/**
 *
 * @author no_de
 */
public class Hangar {
    
    private int numHangar;
    private String nombreHangar;
    private String[] nombresAviones = new String[4];

    public Hangar(int numHangar, String nombreHangar) {
        this.numHangar = numHangar;
        this.nombreHangar = nombreHangar;
        this.nombresAviones[0] = "HALO027XZ";
        this.nombresAviones[1] = "ALFA02XZ";
        this.nombresAviones[2] = "HALO023";
        this.nombresAviones[3] = "MESA7XZ";
    }
    
    
    public int getNumHangar() {
        return numHangar;
    }

    public String getNombreHangar() {
        return nombreHangar;
    }

    public String[] getNombresAviones() {
        return nombresAviones;
    }

    @Override
    public String toString() {
        return "Hangar{" + "numHangar=" + numHangar + ", nombreHangar=" + nombreHangar + ", capAviones=" + nombresAviones + '}';
    }

    public void setNumHangar(int numHangar) {
        this.numHangar = numHangar;
    }

    public void setNombreHangar(String nombreHangar) {
        this.nombreHangar = nombreHangar;
    }

    public void setNombresAviones(String[] nombresAviones) {
        this.nombresAviones = nombresAviones;
    }
    
    
}
