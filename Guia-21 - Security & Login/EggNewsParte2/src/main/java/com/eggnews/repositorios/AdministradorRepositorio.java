package com.eggnews.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eggnews.entidades.Administrador;

@Repository
public interface AdministradorRepositorio extends JpaRepository<Administrador, Long> {

    
}