/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteles.entidades;

/**
 *
 * @author no_de
 */
public class HotelCinco extends HotelCuatro {

    /**
     * Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
     * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
     * Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
     * de las Habitaciones.
     */
    protected int cantSalonConf;
    protected int cantSuites;
    protected int cantLimosinas;

    public HotelCinco(int cantSalonConf, int cantSuites, int cantLimosinas, boolean gimnasio, String nombreResto, int capacidadResto, double precioHabitacion, int cantHabitaciones, int numCamas, int cantPisos, int precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreResto, capacidadResto, precioHabitacion, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalonConf = cantSalonConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }
    
    @Override
    public int precioHabitacion() {

        /**
         * El precio de una habitación debe calcularse de acuerdo con la
         * siguiente fórmula: PrecioHabitación = $50 + ($1 x capacidad del
         * hotel) + (valor agregado por restaurante) + (valor agregado por
         * gimnasio) + (valor agregado por limosinas).
         */
        /*
        Valor agregado por las limosinas: 
        • $15 por la cantidad de limosinas del hotel.
        */
        int sumaValor = super.precioHabitaciones;
        int precioHabitaciones = sumaValor + (15*cantLimosinas);   
        
        return precioHabitaciones;        
    }

    public int getCantSalonConf() {
        return cantSalonConf;
    }

    public void setCantSalonConf(int cantSalonConf) {
        this.cantSalonConf = cantSalonConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "HotelCinco{" + "cantSalonConf=" + cantSalonConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

}
