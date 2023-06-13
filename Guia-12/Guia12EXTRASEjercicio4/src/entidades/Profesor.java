/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public class Profesor extends Empleados {
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, estadoCivil, numIdentificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "departamento = " + departamento + ".";
    }

    
    
    
}
