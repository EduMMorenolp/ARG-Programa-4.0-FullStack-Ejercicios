/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplospring.EjemploGuia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author no_de
 */
@Controller
public class ControladorHola {

    @GetMapping("/")
    public String home() {
        return "holaMundo";
    }
}
