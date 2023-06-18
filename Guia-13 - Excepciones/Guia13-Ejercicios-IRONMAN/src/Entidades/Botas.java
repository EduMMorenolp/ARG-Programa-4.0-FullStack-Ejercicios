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
public final class Botas {

    protected int consumo = 1;
    // ESTADO :
    // True : reparado
    // False : dañado
    public boolean estado;

    public Botas() {
    }

    public Botas(boolean estado) {
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

    public int usarBotas() {
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

    @Override
    public String toString() {
        return "Botas{" + "consumo=" + consumo + ", estado=" + estado + '}';
    }
}
