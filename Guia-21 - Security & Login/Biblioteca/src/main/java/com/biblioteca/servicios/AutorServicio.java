package com.biblioteca.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biblioteca.entidades.Autor;
import com.biblioteca.exepciones.MiException;
import com.biblioteca.repositorios.AutorRepositorio;

@Service
public class AutorServicio {

    @Autowired
    AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MiException {

        validar(nombre);

        Autor autor = new Autor();

        autor.setNombre(nombre);

        autorRepositorio.save(autor);
    }

    public List<Autor> listarAutores() {

        List<Autor> autores = new ArrayList<>();

        autores = autorRepositorio.findAll();

        return autores;
    }

    public void modificarAutor(String nombre, Long id) throws MiException {

        validar(nombre);

        Optional<Autor> respuesta = autorRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();

            autor.setNombre(nombre);

            autorRepositorio.save(autor);
        }
    }

    public void modificarAutor(Long id, String nombre) throws MiException {

        validar(nombre);

        Optional<Autor> respuesta = autorRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }
    }

    @Transactional(readOnly = true)
    public Autor getOne(Long id) {
        return autorRepositorio.getById(id);
    }

    private void validar(String nombre) throws MiException {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre no puede ser nulo o estar vacio");
        }
    }
}