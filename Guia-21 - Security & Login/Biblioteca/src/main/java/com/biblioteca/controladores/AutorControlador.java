package com.biblioteca.controladores;

import com.biblioteca.entidades.Autor;
import com.biblioteca.exepciones.MiException;
import com.biblioteca.servicios.AutorServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "autor_form.html";
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        modelo.addAttribute("autores", autores);
        return "autor_list.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {

        try {
            autorServicio.crearAutor(nombre);
            modelo.put("exito", "El Autor fue cargado correctamente!");
        } catch (MiException ex) {
            System.out.println("Error al Registrar Autor :" + ex);
            modelo.put("error", ex.getMessage());
            return "autor_form.html";
        }
        return "autor_form.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificarAutor(@PathVariable Long id, ModelMap modelo) {
        modelo.put("autor", autorServicio.getOne(id));
        return "autor_mod.html";
    }

    @PostMapping("/modificar")
    public String modificadoAutor(@RequestParam Long id, @RequestParam String nombre, ModelMap modelo) {
        try {
            autorServicio.modificarAutor(id, nombre);
            modelo.put("exito", "El Autor fue Editado correctamente!");
            List<Autor> autores = autorServicio.listarAutores();
            modelo.addAttribute("autores", autores);
        } catch (MiException ex) {
            System.out.println("Error al Editar Autor: " + ex);
            modelo.put("error", ex.getMessage());
            return "autor_mod.html";
        }
        return "panel";
    }

}
