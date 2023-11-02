package com.biblioteca.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data 
public class Editorial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideditorial; // Uso Long por el metodo de generacion de Value
    
    private String nombre;
}
