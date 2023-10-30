package com.biblioteca.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.biblioteca.entidades.Editorial;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, Long> {

    @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    Editorial findEditorialPorNombrePersonalizado(@Param("nombre") String nombre);
}
