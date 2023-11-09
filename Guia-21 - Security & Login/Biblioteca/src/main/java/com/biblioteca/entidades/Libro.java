package com.biblioteca.entidades;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data // Autogenerador de Getters y Setters (Dependencias en pom Lombok)
@Table(name = "Libros") // Puedes personalizar el nombre de la tabla si es necesario
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idlibro;
    private Long isbn; // No lo uso como ID, no me parece practico.
    private String titulo;
    private Integer ejemplares;

    @Column(name = "alta")
    private LocalDate altas;

    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;
}