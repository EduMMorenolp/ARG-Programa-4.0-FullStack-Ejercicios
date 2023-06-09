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
public class HotelCuatro extends Hoteles {

    /**
     * Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
     * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de
     * las Habitaciones.
     */
    private boolean gimnasio;
    private String nombreResto;
    private int capacidadResto;

    public HotelCuatro(boolean gimnasio, String nombreResto, int capacidadResto, double precioHabitacion, int cantHabitaciones, int numCamas, int cantPisos, int precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
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
        Valor agregado por el restaurante: 
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas. 
        • $50 si es mayor de 50. 
        Valor agregado por el gimnasio: 
        • $50 si el tipo del gimnasio es A(true). 
        • $30 si el tipo del gimnasio es B(false).
         */
        
        int sumaValor = super.precioHabitaciones;
        if (gimnasio){
            sumaValor += 50;
        }else{
            sumaValor += 30;
        }
        if (capacidadResto < 30){
            sumaValor += 10;
        }else if (capacidadResto >= 30 && capacidadResto < 50){
            sumaValor += 30;
        }else{
            sumaValor += 50;
        }
        
        int precioHabitacion = sumaValor;

        return precioHabitacion;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }


    @Override
    public String toString() {
        return "HotelCuatro{" + "gimnasio=" + gimnasio + ", nombreResto=" + nombreResto + ", capacidadResto=" + capacidadResto + '}';
    }

}
