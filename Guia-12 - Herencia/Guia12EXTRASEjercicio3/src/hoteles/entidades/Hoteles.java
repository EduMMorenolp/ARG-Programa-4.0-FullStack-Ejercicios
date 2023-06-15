/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles.entidades;

import entidad.padre.Alojamiento;

/**
 *
 * @author no_de
 */
public class Hoteles extends Alojamiento{
    
    /**
     * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de
     * Camas, Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de
     * cuatro o cinco estrellas.
     */
    
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected int precioHabitaciones = 50;

    public Hoteles(int cantHabitaciones, int numCamas, int cantPisos, int precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }
    
    public int precioHabitacion() {

        /**
         * El precio de una habitación debe calcularse de acuerdo con la
         * siguiente fórmula: PrecioHabitación = $50 + ($1 x capacidad del
         * hotel) + (valor agregado por restaurante) + (valor agregado por
         * gimnasio) + (valor agregado por limosinas).
         */
        int sumaValor = numCamas * cantHabitaciones * cantPisos;
        int precioHabitacion = precioHabitaciones + sumaValor;
        
        return precioHabitacion;
     }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
}
