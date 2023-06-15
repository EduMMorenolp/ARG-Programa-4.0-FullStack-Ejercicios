/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public class PersonalServicios extends Empleados {
    private String seccion;

    public PersonalServicios() {
    }

    public PersonalServicios(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, estadoCivil, numIdentificacion);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "seccion = " + seccion + ".";
    }

    
}
