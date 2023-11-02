package com.biblioteca.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.biblioteca.entidades.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    public Usuario buscarPorEmail(@Param("email")String email);
}
