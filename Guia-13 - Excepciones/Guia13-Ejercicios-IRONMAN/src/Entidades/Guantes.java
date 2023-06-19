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
public class Guantes extends Dispositivo{
    
    private int danio; 

    public Guantes() {
    }

    public Guantes(int danio, boolean estado) {
        super(estado);
        this.danio = danio;
    }
  
    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
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
