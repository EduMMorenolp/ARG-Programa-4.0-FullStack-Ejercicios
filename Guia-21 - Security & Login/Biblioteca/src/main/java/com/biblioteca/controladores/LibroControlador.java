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

import com.biblioteca.entidades.Autor;
import com.biblioteca.entidades.Editorial;
import com.biblioteca.entidades.Libro;
import com.biblioteca.exepciones.MiException;
import com.biblioteca.servicios.AutorServicio;
import com.biblioteca.servicios.EditorialServicio;
import com.biblioteca.servicios.LibroServicio;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar")
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_form.html";
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {
        List<Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);
        return "libro_list.html";
    }

    @PostMapping("/registrar")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam(required = false) Integer ejemplares, @RequestParam Long idAutor,
            @RequestParam Long idEditorial, ModelMap modelo) {
        try {

            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);

            modelo.put("exito", "El Libro fue cargado correctamente!");

        } catch (MiException ex) {
            List<Autor> autores = autorServicio.listarAutores();
            List<Editorial> editoriales = editorialServicio.listarEditoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());

            return "libro_form.html";
        }
        return "libro_list.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificarForm(@PathVariable Long id, ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.put("libro", libroServicio.getOne(id));
        modelo.addAttribute("editoriales", editoriales);
        modelo.addAttribute("autores", autores);
        return "libro_mod.html";
    }

    @PostMapping("/modificar")
    public String modificar(Long idlibro, Long isbn, String titulo, Integer ejemplares, Long idAutor, Long idEditorial,
            ModelMap modelo) {
        try {
            libroServicio.modificarLibro(idlibro, isbn, titulo, ejemplares, idAutor, idEditorial);
            modelo.put("exito", "El Libro fue modificado correctamente.");  
        } catch (MiException ex) {
            System.out.println("Error al modificar el Libro: " + ex);
            System.out.println("Error modificar");
            modelo.put("error", ex.getMessage());
            return "libro_mod.html";
        }
        return "redirect:../libro/lista";
    }

}
