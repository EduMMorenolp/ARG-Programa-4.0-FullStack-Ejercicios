package com.biblioteca.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biblioteca.exepciones.MiException;
import com.biblioteca.servicios.PortalServicio;

@Controller
@RequestMapping("/")
public class UsuarioControlador {

    @Autowired
    private PortalServicio usuarioServicio;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/registrarU")
    public String registrar() {
        return "registro";
    }

    @PostMapping("/registroU")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password,
            @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.registrar(nombre, email, password, password2);

            modelo.put("exito", "Usuario registrado correctamente");

            return "registro";
        } catch (MiException ex) {

            modelo.put("error", "Error al cargar");
            modelo.put("nombre",nombre);
            modelo.put("email", email);
            return "registro";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
