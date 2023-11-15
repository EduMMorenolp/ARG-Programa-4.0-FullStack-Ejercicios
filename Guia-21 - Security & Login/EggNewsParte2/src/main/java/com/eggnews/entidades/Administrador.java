
package com.eggnews.entidades;

import javax.persistence.*;

import com.eggnews.enumeraciones.Rol;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo) {
        super(nombreUsuario, password, fechaAlta, rol, activo);
    }

}