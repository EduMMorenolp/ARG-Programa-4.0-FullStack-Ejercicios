/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.controladores;

import com.eggnews.entidades.Noticia;
import com.eggnews.servicios.NoticiaService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author no_de
 */
@Controller
public class NoticiaControlador {

    private final NoticiaService noticiaService;

    public NoticiaControlador(NoticiaService noticiaService) {
        this.noticiaService = noticiaService;
    }

    @PostMapping("/crearNoticia")
    public String crearNoticia(@RequestParam String titulo, @RequestParam String cuerpo) {
        // Lógica para crear una nueva noticia y guardarla en la base de datos
        Noticia nuevaNoticia = new Noticia();
        nuevaNoticia.setTitulo(titulo);
        nuevaNoticia.setCuerpo(cuerpo);
        nuevaNoticia.setCreador(null);
        noticiaService.guardarNoticia(nuevaNoticia);

        return "index.html";
    }

    @GetMapping("/listNoticias")
    public String mostrarNoticias(Model model) {
        List<Noticia> noticias = noticiaService.obtenerTodasLasNoticias();
        model.addAttribute("noticias", noticias);
        return "listNoticias";
    }

    @GetMapping("/eliminarNoticia/{id}")
    public String eliminarNoticia(@PathVariable Long id) {
        noticiaService.eliminarNoticia(id);
        return "redirect:/listNoticias";
    }

    @GetMapping("/editarNoticia")
    public String editarNoticia(@RequestParam Long id, ModelMap model) {
        Noticia noticia = noticiaService.obtenerNoticia(id);
        if (noticia == null) {
            model.put("error", "La noticia con el ID proporcionado no existe.");
            return "index.html";
        } else {
            model.put("noticia", noticia);
            return "editarNoticia";
        }
    }

    @PostMapping("/actualizarNoticia")
    public String actualizarNoticia(@RequestParam Long noticiaId, @ModelAttribute Noticia noticia) {
        Noticia noticiaExistente = noticiaService.obtenerNoticia(noticiaId);
        noticiaExistente.setTitulo(noticia.getTitulo());
        noticiaExistente.setCuerpo(noticia.getCuerpo());
        noticiaService.guardarNoticia(noticiaExistente);
        return "redirect:/listNoticias";
    }
}
