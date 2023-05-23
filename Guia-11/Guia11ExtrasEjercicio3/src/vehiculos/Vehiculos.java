/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import polizas.Polizas;

/**
 *
 * @author no_de
 */
public class Vehiculos {

    /**
     * Se registra la información de cada vehículo asegurado. Marca, modelo,
     * año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
     */
    
    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private String chasis;
    private int anio;
    private int numMotor;
    private Polizas Poliza;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, String color, String tipo, String chasis, int anio, int numMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.chasis = chasis;
        this.anio = anio;
        this.numMotor = numMotor;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo:" + "\n Marca=" + marca + "\n Modelo=" + modelo + "\n Color=" + color + "\n Tipo=" + tipo + "\n Chasis=" + chasis + "\n Año=" + anio + "\n Numero de Motor=" + numMotor + "\n Poliza:" + Poliza;
    }

    public Polizas getPoliza() {
        return Poliza;
    }

    public void setPoliza(Polizas Poliza) {
        this.Poliza = Poliza;
    }

 
    
}
