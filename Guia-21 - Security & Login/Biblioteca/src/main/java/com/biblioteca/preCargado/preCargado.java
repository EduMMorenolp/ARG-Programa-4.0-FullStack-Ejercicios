package com.biblioteca.preCargado;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biblioteca.entidades.Autor;
import com.biblioteca.entidades.Editorial;
import com.biblioteca.repositorios.AutorRepositorio;
import com.biblioteca.repositorios.EditorialRepositorio;

@Component
public class preCargado {

    // ACA HAGO EL PRE CARGADO EN LA BASE DE DATOS AL INICAR.

    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @PostConstruct
    public void cargarDatosIniciales() {
        // Verificar si el autor "Sin Autor" ya existe en la base de datos
        if (autorRepositorio.findAutorPorNombrePersonalizado("Sin Autor") == null) {
            Autor autor1 = new Autor();
            autor1.setNombre("Sin Autor");
            autorRepositorio.save(autor1);
        }

        // Verificar si la editorial "Sin Editorial" ya existe en la base de datos
        if (editorialRepositorio.findEditorialPorNombrePersonalizado("Sin Editorial") == null) {
            Editorial editorial1 = new Editorial();
            editorial1.setNombre("Sin Editorial");
            editorialRepositorio.save(editorial1);
        }
    }
}
