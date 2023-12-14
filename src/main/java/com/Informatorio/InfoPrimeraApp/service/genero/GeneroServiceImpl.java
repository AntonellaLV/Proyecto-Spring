package com.Informatorio.InfoPrimeraApp.service.genero;


import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import com.Informatorio.InfoPrimeraApp.repository.GeneroRepository;
import com.Informatorio.InfoPrimeraApp.service.genero.GeneroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class GeneroServiceImpl implements GeneroService {

    private final GeneroRepository generoRepository;

    @Override
    public Genero crearGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public Genero obtenerGeneroPorId(UUID id) {
        return generoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Género no encontrado con id: " + id));
    }

    @Override
    public void eliminarGenero(UUID id) {
        generoRepository.deleteById(id);
    }

    // Implementación de otros métodos necesarios
}

