package com.biblioteca.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.entidades.Editorial;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, String> {
}
