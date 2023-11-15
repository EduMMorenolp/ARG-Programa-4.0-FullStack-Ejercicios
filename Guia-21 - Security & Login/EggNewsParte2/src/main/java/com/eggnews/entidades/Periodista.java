package com.eggnews.entidades;
import javax.persistence.*;

import com.eggnews.enumeraciones.Rol;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Data
public class Periodista extends Usuario {

    @OneToMany(mappedBy = "creador")
    private ArrayList<Noticia> misNoticias;

    private Integer sueldoMensual;

    // Constructor por defecto (necesario para JPA)
    public Periodista() {
    }

    // Constructor con parámetros
    public Periodista(String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo,
            ArrayList<Noticia> misNoticias, Integer sueldoMensual) {
        super(nombreUsuario, password, fechaAlta, rol, activo);
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
    }
}