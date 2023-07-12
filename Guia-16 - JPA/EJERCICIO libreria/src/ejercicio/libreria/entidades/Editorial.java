/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.libreria.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author no_de
 */

@Entity
public class Editorial implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private boolean alta;

    public Editorial() {
    }
    
    public Editorial(Integer id, String nombre, boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
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

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
    }
    
    
    
}
