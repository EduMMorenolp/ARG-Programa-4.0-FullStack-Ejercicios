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
public enum EnumUso {
    
    NORMAL(1),
    MEDIO(2),
    INTENSO(3);

    private final int nivel;

    private EnumUso(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
