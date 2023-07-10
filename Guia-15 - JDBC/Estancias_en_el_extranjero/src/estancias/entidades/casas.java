/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.entidades;

import java.sql.Date;

/**
 *
 * @author no_de
 */
public class casas {

    private String calle;
    private int numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private Date fecha_desde;
    private Date fecha_hasta;
    private int tiempo_minimo;
    private int tiempo_maximo;
    private double precio_habitacion;
    private String tipo_vivienda;

    public casas() {
    }

    public casas(String calle, int numero, String codigo_postal, String ciudad, String pais, Date fecha_desde, Date fecha_hasta, int tiempo_minimo, int tiempo_maximo, double precio_habitacion, String tipo_vivienda) {
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
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

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(int tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public String toString() {
        return "Casas : " + "\nCalle: " + calle + "\nNúmero: " + numero + "\nCódigo Postal: " + codigo_postal + "\nCiudad: " + ciudad + "\nPaís: " + pais + "\nDisponible Desde: " + fecha_desde + "\nDisponible Hasta: " + fecha_hasta + "\nEstadia Minimo: " + tiempo_minimo + "\nEstadia Maximo=" + tiempo_maximo + "\nPrecio Habitación: $" + precio_habitacion + "\nTipo de Vivienda: " + tipo_vivienda;
    } 
}
