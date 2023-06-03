/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

/**
 *
 * @author no_de
 */
public class Electrodomestico {

    /**
     * Electrodoméstico con los siguientes atributos: precio, color, consumo
     * energético (letras entre A y F) y peso.
     */
    
    protected double precio;
    protected String color;
    protected char consumoEnergia;
    protected int peso;

    public Electrodomestico(double precio, String color, char consumoEnergia, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }

    public Electrodomestico() {
    }
    
    public void comprobarConsumoEnergetico(char cE){
        if ( cE != "A" ){
            
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
