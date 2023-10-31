package com.biblioteca.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biblioteca.entidades.Editorial;
import com.biblioteca.exepciones.MiException;
import com.biblioteca.servicios.EditorialServicio;

@Controller
@RequestMapping("/editorial")
public class EditorialControlador {

    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar")
    public String registrar() {
        return "editorial_form.html";
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {

        List<Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.addAttribute("editoriales", editoriales);

        return "editorial_list.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {

        try {
            editorialServicio.crearEditorial(nombre);
            modelo.put("exito", "El Editorial fue cargado correctamente!");
        } catch (MiException ex) {
            System.out.println("Error al Registrar Autor :" + ex);
            modelo.put("error", ex.getMessage());
            return "editorial_form.html";
        }
        return "editorial_form.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable Long id, ModelMap modelo) {
        modelo.put("editorial", editorialServicio.getOne(id));
        return "editorial_mod.html";
    }

    @PostMapping("/modificar")
    public String modificado(@RequestParam Long id, @RequestParam String nombre, ModelMap modelo) {
        try {

            editorialServicio.modificarEditorial(id, nombre);
            modelo.put("exito", "El Editorial fue Editado correctamente!");
            List<Editorial> editoriales = editorialServicio.listarEditoriales();

            modelo.addAttribute("editoriales", editoriales);
        } catch (MiException ex) {
            System.out.println("Error al Registrar Autor :" + ex);
            modelo.put("error", ex.getMessage());
            return "editorial_mod.html";
        }
        return "editorial_list.html";
    }
}
