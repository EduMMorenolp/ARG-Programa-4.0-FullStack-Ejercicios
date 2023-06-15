/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento.entidades;

/**
 *
 * @author no_de
 */
public class Camping extends AlojamientosExtrahoteleros {

    /**
     * Para los Camping se indica la capacidad máxima de carpas, la cantidad
     * de baños disponibles y si posee o no un restaurante dentro de las
     * instalaciones
     */
    
    protected int maxCarpas;
    protected int baños;
    protected boolean resto;

    public Camping() {
    }

    public Camping(int maxCarpas, int baños, boolean resto, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.baños = baños;
        this.resto = resto;
    }
    
     @Override
    public int precioHabitacion() {
        int precioHabitacion = 50 * maxCarpas;
        if (resto){
            precioHabitacion += 15;
        }
        
        return precioHabitacion;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Camping{" + "maxCarpas=" + maxCarpas + ", ba\u00f1os=" + baños + ", resto=" + resto + '}' + super.toString();
    }
    
    
}
