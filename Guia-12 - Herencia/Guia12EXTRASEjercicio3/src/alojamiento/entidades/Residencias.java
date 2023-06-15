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
public class Residencias extends AlojamientosExtrahoteleros {

    /**
     * Para las residencias se indica la cantidad de habitaciones, si se hacen o
     * no descuentos a los gremios y si posee o no campo deportivo
     */
    protected int cantHabitaciones;
    protected boolean desGremios;
    protected boolean campDeportivo;

    public Residencias(int cantHabitaciones, boolean desGremios, boolean campDeportivo, boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.desGremios = desGremios;
        this.campDeportivo = campDeportivo;
    }
    
    
    @Override
    public int precioHabitacion() {
        int precioHabitacion = 50 * cantHabitaciones; 
        if (desGremios) {
            precioHabitacion -= 10;
        }
        if (campDeportivo){
            precioHabitacion += 15;
        }
        return precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDesGremios() {
        return desGremios;
    }

    public void setDesGremios(boolean desGremios) {
        this.desGremios = desGremios;
    }

    public boolean isCampDeportivo() {
        return campDeportivo;
    }

    public void setCampDeportivo(boolean campDeportivo) {
        this.campDeportivo = campDeportivo;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", desGremios=" + desGremios + ", campDeportivo=" + campDeportivo + '}' + super.toString();
    }

}
