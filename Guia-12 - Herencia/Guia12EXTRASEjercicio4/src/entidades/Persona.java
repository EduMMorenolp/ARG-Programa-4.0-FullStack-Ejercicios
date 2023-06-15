/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 */
public class Persona {
    
    /**
     * CLASE PADRE 
     */
    
    
   protected String nombre, apellidos, estadoCivil;
   protected int numIdentificacion;

    public Persona() {
    }
    
    public Persona(String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    @Override
    public String toString() {
        return "---- Ficha personal ----" + "\nNombre = " + nombre + ", apellido = " + apellidos + ", estado civil = " + estadoCivil + ", numero de identificacion = " + numIdentificacion + ", ";
    }
   
   
}
