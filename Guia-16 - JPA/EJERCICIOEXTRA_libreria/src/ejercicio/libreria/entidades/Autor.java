/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author no_de
 */

@Entity
public class Autor implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String nombre;
    private boolean alta;

    public Autor() {
        this.alta = true;
    }

    public Autor(Integer id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        String aux;
        if (alta){
            aux = "De Alta";
        } else {
            aux = "De Baja";
        }
        return "\n---- Autor ----: " + "\n ID : " + id + "\n Nombre : " + nombre + "\n Alta : " + aux;
    }
    
    
    
}
