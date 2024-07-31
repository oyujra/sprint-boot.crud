package com.jiska.jiskasoft.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acerca")
public class AcercaController {

    @GetMapping
    public String acerca() {
        return "Nombre Completo: Omar Santos Yujra Huanca";
    }
}
