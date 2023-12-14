package com.Informatorio.InfoPrimeraApp.controller;


import com.Informatorio.InfoPrimeraApp.dto.UsuarioDto;
import com.Informatorio.InfoPrimeraApp.service.usuario.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/usuarios", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Métodos para manejar las operaciones de Usuario (crear, obtener por ID, etc.)
}

