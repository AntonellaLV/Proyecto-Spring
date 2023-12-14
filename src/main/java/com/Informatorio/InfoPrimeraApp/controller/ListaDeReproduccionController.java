package com.Informatorio.InfoPrimeraApp.controller;


import com.Informatorio.InfoPrimeraApp.dto.ListaDeReproduccionDto;
import com.Informatorio.InfoPrimeraApp.service.listadereproduccion.ListaDeReproduccionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/listasreproduccion", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ListaDeReproduccionController {

    private final ListaDeReproduccionService listaDeReproduccionService;

    public ListaDeReproduccionController(ListaDeReproduccionService listaDeReproduccionService) {
        this.listaDeReproduccionService = listaDeReproduccionService;
    }

    // Métodos para manejar las operaciones de ListaDeReproduccion
}
