/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author no_de
 */
public class Generador {
    
    protected float energiaTotal;
    // ESTADO :
    // True : reparado
    // False : dañado
    public boolean estado;

    public Generador() {
    }

    public Generador(float energiaTotal, boolean estado) {
        this.energiaTotal = energiaTotal;
        this.estado = estado;
    }

    public float getEnergiaTotal() {
        return energiaTotal;
    }

    public void setEnergiaTotal(float energiaTotal) {
        this.energiaTotal = energiaTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Generador{" + "energiaTotal=" + energiaTotal + ", estado=" + estado + '}';
    }   
}
