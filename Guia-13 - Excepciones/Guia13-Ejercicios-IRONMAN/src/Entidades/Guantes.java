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
public class Guantes {
    
    protected int consumo;
    protected int danio;
    // ESTADO :
    // True : reparado
    // False : dañado
    public boolean estado;

    public Guantes() {
    }

    public Guantes(int consumo, int danio, boolean estado) {
        this.danio = danio;
        this.estado = estado;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int usarGuantes() {
        /**
         * Al utilizar un dispositivo existe un 30% de posibilidades de que se
         * dañe
         */
        if (Math.random() <= 0.3) {
            estado = false;
            return consumo;
        } else {
            return consumo;
        }
    }
    
    public int Atacar(){
        return danio;
    }

    @Override
    public String toString() {
        return "Guantes{" + "consumo=" + consumo + ", danio=" + danio + ", estado=" + estado + '}';
    } 
}
