/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.controladores;

import com.eggnews.entidades.Noticia;
import com.eggnews.servicios.NoticiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    public NoticiaControlador(NoticiaService noticiaService) {
        this.noticiaService = noticiaService;
    }

    @PostMapping("/crearNoticia")
    public String crearNoticia(@RequestParam String titulo, @RequestParam String cuerpo) {
        // Lógica para crear una nueva noticia y guardarla en la base de datos
        Noticia nuevaNoticia = new Noticia();
        nuevaNoticia.setTitulo(titulo);
        nuevaNoticia.setCuerpo(cuerpo);
        noticiaService.guardarNoticia(nuevaNoticia);

        return "index.html";
    }

    @GetMapping("/inicio")
    public String mostrarNoticias(Model model) {
        List<Noticia> noticias = noticiaService.obtenerTodasLasNoticias();
        model.addAttribute("noticias", noticias);
        return "inicio";
    }

    @PostMapping("/actualizarNoticia")
    public String actualizarNoticia(@ModelAttribute("noticia") Noticia noticia) {
        noticiaService.modificarNoticia(noticia);
        return "redirect:/inicio";
    }

    @GetMapping("/eliminarNoticia/{id}")
    public String eliminarNoticia(@PathVariable Long id) {
        noticiaService.eliminarNoticia(id);
        return "redirect:/inicio";
    }
    
    @GetMapping("/editarNoticia")
    public String editarNoticia(@PathVariable Long id, Model model) {
        Noticia noticia = noticiaService.obtenerNoticia(id);
        model.addAttribute("noticia", noticia);
        return "editarNoticia";
    }
    
    
}
