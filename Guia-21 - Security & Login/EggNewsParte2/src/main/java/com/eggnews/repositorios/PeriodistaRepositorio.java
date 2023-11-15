package com.eggnews.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eggnews.entidades.Periodista;

@Repository
public interface PeriodistaRepositorio extends JpaRepository<Periodista, Long> {

    
}