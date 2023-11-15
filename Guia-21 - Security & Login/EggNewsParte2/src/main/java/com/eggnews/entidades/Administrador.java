
package com.eggnews.entidades;

import lombok.Data;

import javax.persistence.*;

import com.eggnews.enumeraciones.Rol;

import java.util.Date;

@Entity
@Data
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo) {
        super(nombreUsuario, password, fechaAlta, rol, activo);
    }

}