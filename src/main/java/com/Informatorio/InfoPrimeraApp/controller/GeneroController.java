package com.Informatorio.InfoPrimeraApp.controller;

import com.Informatorio.InfoPrimeraApp.dto.GeneroDto;
import com.Informatorio.InfoPrimeraApp.service.genero.GeneroService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/generos", produces = {MediaType.APPLICATION_JSON_VALUE})
public class GeneroController {

    private final GeneroService generoService;

    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    // Métodos para manejar las operaciones de Genero
}

