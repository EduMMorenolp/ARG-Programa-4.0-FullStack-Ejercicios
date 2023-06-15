/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas.geometrica;

/**
 *
 * @author no_de
 */
public class Circulo implements calculosFormas{
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        double diametro = radio * 2;
        return PI * diametro;
    }  
}
