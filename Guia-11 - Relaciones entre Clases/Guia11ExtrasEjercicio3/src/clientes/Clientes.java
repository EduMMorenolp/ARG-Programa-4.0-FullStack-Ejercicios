/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.ArrayList;
import vehiculos.Vehiculos;

/**
 *
 * @author no_de
 */
public class Clientes {

    /**
     * En este módulo vamos a registrar la información personal de cada cliente
     * que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
     * domicilio, teléfono.
     */
    
    private String nombre;
    private String apellido;
    private String mail;
    private int dni;
    private int domicilio;
    private int telefono;
    private ArrayList<Vehiculos> Autos = new ArrayList<>();

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String mail, int dni, int domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(int domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n Apellido: " + apellido + "\n Mail: " + mail + "\n DNI: " + dni + "\n Domicilio: " + domicilio + "\n Tel: " + telefono + "\n Autos:" + Autos + '}';
    }

    public ArrayList<Vehiculos> getAutos() {
        return Autos;
    }

    public void setAutos(ArrayList<Vehiculos> Autos) {
        this.Autos = Autos;
    }
    
}
