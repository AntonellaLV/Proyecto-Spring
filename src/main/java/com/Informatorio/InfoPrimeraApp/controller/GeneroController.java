package com.Informatorio.InfoPrimeraApp.controller;

import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import com.Informatorio.InfoPrimeraApp.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    private final GeneroRepository generoRepository;

    @Autowired
    public GeneroController(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    @GetMapping
    public List<Genero> getAllGeneros() {
        return generoRepository.findAll();
    }

    @PostMapping
    public Genero createGenero(@RequestBody Genero genero) {
        return generoRepository.save(genero);
    }

    // Otros endpoints como PUT, DELETE, etc.
}
