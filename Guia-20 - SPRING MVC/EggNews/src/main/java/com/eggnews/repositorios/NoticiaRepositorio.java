/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.repositorios;

import com.eggnews.entidades.Noticia;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author no_de
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long> {

    @Query("SELECT n FROM Noticia n ORDER BY n.id ASC")
    List<Noticia> obtenerTodasLasNoticias();

    List<Noticia> findByTitulo(String titulo);

    @Query("SELECT n FROM Noticia n WHERE n.titulo LIKE %:keyword% OR n.cuerpo LIKE %:keyword%")
    List<Noticia> buscarPorPalabraClave(@Param("keyword") String keyword);

    List<Noticia> findByCuerpo(String cuerpo);

    @Override
    Optional<Noticia> findById(Long id);
}
