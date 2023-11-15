package com.eggnews.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eggnews.entidades.Periodista;
import com.eggnews.repositorios.PeriodistaRepositorio;

@Service
public class PeriodistaService {


    private final PeriodistaRepositorio periodistaRepositorio;


    public List<Periodista> obtenerTodasLosPeriodistas() {
        return periodistaRepositorio.findAll();
    }
    
}
