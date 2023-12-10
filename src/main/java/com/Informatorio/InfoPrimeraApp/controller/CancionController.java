package com.Informatorio.InfoPrimeraApp.controller;

import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import com.Informatorio.InfoPrimeraApp.repository.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canciones")
public class CancionController {

    private final CancionRepository cancionRepository;

    @Autowired
    public CancionController(CancionRepository cancionRepository) {
        this.cancionRepository = cancionRepository;
    }

    @GetMapping
    public List<Cancion> getAllCanciones() {
        return cancionRepository.findAll();
    }

    @PostMapping
    public Cancion createCancion(@RequestBody Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    // Otros endpoints como PUT, DELETE, etc.
}
