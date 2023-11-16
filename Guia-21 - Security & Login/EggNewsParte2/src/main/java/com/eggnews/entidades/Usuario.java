package com.eggnews.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.eggnews.enumeraciones.Rol;

import lombok.Data;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreUsuario;
    private String password;
    private Date fechaAlta;
    private boolean activo;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String nombreUsuario, String password, Date fechaAlta, Rol rol, Boolean activo) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.fechaAlta = fechaAlta;
        this.rol = rol;
        this.activo = activo;
    }

        
}
