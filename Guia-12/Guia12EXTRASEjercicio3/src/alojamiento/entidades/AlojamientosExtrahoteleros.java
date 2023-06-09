/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alojamiento.entidades;

import entidad.padre.Alojamiento;

/**
 *
 * @author no_de
 */
public class AlojamientosExtrahoteleros extends Alojamiento{

    /**
     * En contraste, los Alojamientos Extra hoteleros proveen servicios
     * diferentes a los de los hoteles, estando más orientados a la vida al aire
     * libre y al turista de bajos recursos. Por cada Alojamiento Extrahotelero
     * se indica si es privado o no, así como la cantidad de metros cuadrados
     * que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping
     * y las Residencias. Para los Camping se indica la capacidad máxima de
     * carpas, la cantidad de baños disponibles y si posee o no un restaurante
     * dentro de las instalaciones. Para las residencias se indica la cantidad
     * de habitaciones, si se hacen o no descuentos a los gremios y si posee o
     * no campo deportivo. Realizar un programa en el que se representen todas
     * las relaciones descriptas.
     */
    
    protected boolean privado;
    protected int metrosCuadrados;

    public AlojamientosExtrahoteleros(boolean privado, int metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public AlojamientosExtrahoteleros() {
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "AlojamientosExtrahoteleros{" + "privado=" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
}
