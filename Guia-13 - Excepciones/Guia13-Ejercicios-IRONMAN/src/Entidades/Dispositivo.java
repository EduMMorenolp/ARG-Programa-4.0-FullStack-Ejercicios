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
public class Dispositivo {
    
    protected int consumo = 1;
    // ESTADO :
    // True : reparado
    // False : dañado
    protected boolean estado = true;

    public Dispositivo() {
    }

    public Dispositivo(boolean estado) {
        this.estado = estado;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "consumo=" + consumo + ", estado=" + estado + '}';
    }
    
}
