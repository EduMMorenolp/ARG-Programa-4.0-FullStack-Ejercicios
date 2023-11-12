package com.biblioteca.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.entidades.Usuario;
import com.biblioteca.servicios.UsuarioServicio;

@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @GetMapping("/perfil/{id}")
    public ResponseEntity<byte[]> imagenUsuario (@PathVariable Long id){
        Usuario usuario = usuarioServicio.getOne(id);
        
       byte[] imagen= usuario.getImagen().getContenido();
       
       HttpHeaders headers = new HttpHeaders();
       
       headers.setContentType(MediaType.IMAGE_JPEG);
        
       return new ResponseEntity<>(imagen,headers, HttpStatus.OK); 
    }
}
