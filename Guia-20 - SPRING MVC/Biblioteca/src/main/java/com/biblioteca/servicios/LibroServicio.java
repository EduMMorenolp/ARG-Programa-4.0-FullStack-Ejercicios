package com.biblioteca.servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biblioteca.entidades.Autor;
import com.biblioteca.entidades.Editorial;
import com.biblioteca.entidades.Libro;
import com.biblioteca.exepciones.MiException;
import com.biblioteca.repositorios.AutorRepositorio;
import com.biblioteca.repositorios.EditorialRepositorio;
import com.biblioteca.repositorios.LibroRepositorio;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer Ejemplares, String idAutor, String isbnEditorial) throws MiException {


        validar(isbn, titulo, Ejemplares, idAutor, isbnEditorial);

        Libro libro = new Libro();
        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(isbnEditorial).get();

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(Ejemplares);

        libro.setAltas(LocalDate.now());

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        libroRepositorio.save(libro);
    }

    public List<Libro> listarLibros() {

        List<Libro> libros = new ArrayList<>();

        libros = libroRepositorio.findAll();

        return libros;

    }

    public void modificarLibro(Long isbn, String titulo, Integer Ejemplares, String idAutor, String isbnEditorial) throws MiException {

        validar(isbn, titulo, Ejemplares, idAutor, isbnEditorial);

        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(isbnEditorial);

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }
        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }

        if (respuestaLibro.isPresent()) {

            Libro libro = respuestaLibro.get();

            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(Ejemplares);

            libroRepositorio.save(libro);
        }
    }

    private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial)
            throws MiException {

        if (isbn == null) {
            throw new MiException("El ISBN no puede ser nulo"); //
        }
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede ser nulo o estar vacio");
        }
        if (ejemplares == null) {
            throw new MiException("Ejemplares no puede ser nulo");
        }
        if (idAutor.isEmpty() || idAutor == null) {
            throw new MiException("El Autor no puede ser nulo o estar vacio");
        }

        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new MiException("La Editorial no puede ser nula o estar vacia");
        }
    }
}
