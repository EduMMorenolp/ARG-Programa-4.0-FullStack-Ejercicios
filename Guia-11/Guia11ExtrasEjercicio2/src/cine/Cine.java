/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Arrays;



/**
 *
 * @author no_de
 */
public class Cine {
    /**
     * un Cine, que tiene una sala con un conjunto de asientos (8 filas por 6
     * columnas). De Cine nos interesa conocer la película que se está
     * reproduciendo, la sala con los espectadores y el precio de la entrada
     */
    
    private String peliculaC;
    private String[][] salaC = new String[8][6];
    private int precioC;

    public Cine() {
    }

    public Cine(String peliculaC, int precioC) {
        this.peliculaC = peliculaC;
        this.precioC = precioC;
    }

    public int getPrecioC() {
        return precioC;
    }

    public void setPrecioC(int precioC) {
        this.precioC = precioC;
    }

    public String getPeliculaC() {
        return peliculaC;
    }

    public void setPeliculaC(String peliculaC) {
        this.peliculaC = peliculaC;
    }

    public String[][] getSalaC() {
        return salaC;
    }

    public void setSalaC(String[][] salaC) {
        this.salaC = salaC;
    }

    @Override
    public String toString() {
        return "Cine{" + "peliculaC=" + peliculaC + ", precioC=" + precioC + ", salaC=" + Arrays.toString(salaC) + '}';
    }
    
}
