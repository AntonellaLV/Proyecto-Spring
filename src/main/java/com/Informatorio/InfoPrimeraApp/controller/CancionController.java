package com.Informatorio.InfoPrimeraApp.controller;


import com.Informatorio.InfoPrimeraApp.dto.CancionDto;
import com.Informatorio.InfoPrimeraApp.service.cancion.CancionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/canciones", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CancionController {

    private final CancionService cancionService;

    public CancionController(CancionService cancionService) {
        this.cancionService = cancionService;
    }

    // Métodos para manejar las operaciones de Cancion
}

