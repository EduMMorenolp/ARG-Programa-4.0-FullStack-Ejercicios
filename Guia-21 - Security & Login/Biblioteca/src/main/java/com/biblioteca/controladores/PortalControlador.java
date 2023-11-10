package com.biblioteca.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biblioteca.entidades.Usuario;
import com.biblioteca.exepciones.MiException;
import com.biblioteca.servicios.UsuarioServicio;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/")
    public String index(HttpSession session) {

        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }
        return "index";
    }

    

    @GetMapping("/registrarU")
    public String registrar() {
        return "registro";
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) Long error, ModelMap modelo) {
        if (error != null) {
            modelo.put("error", "Usuario o Contraseña invalidos");
        }
        return "login";
    }

    @PostMapping("/registroU")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password,
            @RequestParam String password2, ModelMap modelo) {

        try {
            usuarioServicio.registrar(nombre, email, password, password2);

            modelo.put("exito", "Usuario registrado correctamente");

            return "index";
        } catch (MiException ex) {

            modelo.put("error", "Error al cargar");
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            return "registro";
        }
    }

}
