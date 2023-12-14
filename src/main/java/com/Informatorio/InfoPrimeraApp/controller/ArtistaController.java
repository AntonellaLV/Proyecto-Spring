package com.Informatorio.InfoPrimeraApp.controller;


import com.Informatorio.InfoPrimeraApp.service.artista.ArtistaService;
import com.Informatorio.InfoPrimeraApp.dto.ArtistaDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/artistas", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ArtistaController {

    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    // Métodos para manejar las operaciones de Artista
}
