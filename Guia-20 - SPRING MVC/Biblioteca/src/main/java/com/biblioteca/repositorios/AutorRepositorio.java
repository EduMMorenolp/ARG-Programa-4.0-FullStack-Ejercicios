package com.biblioteca.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entidades.Autor;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String> {
}
