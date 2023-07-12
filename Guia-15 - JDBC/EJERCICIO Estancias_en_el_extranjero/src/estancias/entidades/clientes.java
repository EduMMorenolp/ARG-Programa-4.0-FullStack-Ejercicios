/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.entidades;

/**
 *
 * @author no_de
 */
public class clientes {

    private String nombre;
    private String calle;
    private int numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private String email;

    public clientes() {
    }

    public clientes(String nombre, String calle, int numero, String codigo_postal, String ciudad, String pais, String email) {
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

   @Override
    public String toString() {
        return "Cliente: " + "\nNombre: " + nombre + "\nCalle: " + calle + "\nNúmero: " + numero + "\nCódigo Postal: " + codigo_postal + "\nCiudad: " + ciudad + "\nPaís: " + pais + "\nEmail: " + email;
    }
}
