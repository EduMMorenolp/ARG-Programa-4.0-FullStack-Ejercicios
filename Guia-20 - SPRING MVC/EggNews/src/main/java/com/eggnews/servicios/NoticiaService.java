/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.servicios;

import com.eggnews.entidades.Noticia;
import com.eggnews.repositorios.NoticiaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author no_de
 */
@Service
public class NoticiaService {

    private final NoticiaRepositorio noticiaRepository;

    @Autowired
    public NoticiaService(NoticiaRepositorio noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }

    public void guardarNoticia(Noticia noticia) {
        noticiaRepository.save(noticia);
    }

    public List<Noticia> obtenerTodasLasNoticias() {
        return noticiaRepository.findAll();
    }
}
