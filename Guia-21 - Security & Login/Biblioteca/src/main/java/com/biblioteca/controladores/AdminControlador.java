package com.biblioteca.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.entidades.Autor;
import com.biblioteca.entidades.Editorial;
import com.biblioteca.entidades.Libro;
import com.biblioteca.entidades.Usuario;
import com.biblioteca.servicios.AutorServicio;
import com.biblioteca.servicios.EditorialServicio;
import com.biblioteca.servicios.LibroServicio;
import com.biblioteca.servicios.UsuarioServicio;

@Controller
@RequestMapping("/admin")
public class AdminControlador {

    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/dashboard")
    public String panelAdministrativo(ModelMap modelo) {
        List<Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);

        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);

        List<Autor> autores = autorServicio.listarAutores();
        modelo.addAttribute("autores", autores);

        List<Usuario> usuarios = usuarioServicio.obtenerTodosLosUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "panel";
    }
}