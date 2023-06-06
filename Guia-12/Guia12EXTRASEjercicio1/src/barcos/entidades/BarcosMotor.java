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
public class BarcosMotor extends Barcos {

    private int PontCV;

    @Override
    public int modulo() {
        /**
         * por un valor módulo de cada barco (obtenido simplemente multiplicando
         * por 10 los metros de eslora)
         */
        super.eslora = super.eslora * 10 + PontCV;
        return super.eslora;
    }

    public BarcosMotor() {
    }

    public BarcosMotor(int PontCV, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.PontCV = PontCV;
    }

    public int getPontCV() {
        return PontCV;
    }

    public void setPontCV(int PontCV) {
        this.PontCV = PontCV;
    }

    @Override
    public String toString() {
        return  "BarcosMotor{" + "PontCV=" + PontCV + '}' + super.toString();
    }

}
