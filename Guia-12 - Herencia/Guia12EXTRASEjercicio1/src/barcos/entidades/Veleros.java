/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcos.entidades;

import java.time.LocalDate;

/**
 *
 * @author no_de
 */
public class Veleros extends Barcos{

    private int veleros;
    
    public int modulo(){
        /**
         * por un valor módulo de cada barco 
         * (obtenido simplemente multiplicando por 10 los metros de eslora)
         */
        super.eslora = super.eslora * 10 + veleros;
        return super.eslora;
    }

    public Veleros(int veleros, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.veleros = veleros;
    }

    public Veleros() {
    }

    public int getVeleros() {
        return veleros;
    }

    public void setVeleros(int veleros) {
        this.veleros = veleros;
    }

    @Override
    public String toString() {
        return "Veleros{" + "veleros=" + veleros + '}' + super.toString();
    }
    
    

}
