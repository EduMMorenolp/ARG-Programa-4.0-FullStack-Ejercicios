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
public class Barcos {

    protected int eslora;

    protected int matricula;

    protected LocalDate anioFabricacion;
    
    
    public int modulo(){
        /**
         * por un valor módulo de cada barco 
         * (obtenido simplemente multiplicando por 10 los metros de eslora)
         */
        this.eslora = this.eslora * 10;
        return this.eslora;
    }
    
    public Barcos() {
    }

    public Barcos(int eslora, int matricula, LocalDate anioFabricacion) {
        this.eslora = eslora;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barcos{" + "eslora=" + eslora + ", matricula=" + matricula + ", anioFabricacion=" + anioFabricacion + '}';
    }

    
    
}
