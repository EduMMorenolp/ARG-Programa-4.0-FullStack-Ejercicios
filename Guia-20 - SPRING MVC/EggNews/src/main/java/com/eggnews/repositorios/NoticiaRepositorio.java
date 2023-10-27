/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.repositorios;

import com.eggnews.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author no_de
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, Long> {

    
}
