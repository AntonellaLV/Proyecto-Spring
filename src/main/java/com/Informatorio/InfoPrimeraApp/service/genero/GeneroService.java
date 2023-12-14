package com.Informatorio.InfoPrimeraApp.service.genero;


import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import java.util.UUID;

public interface GeneroService {
    Genero crearGenero(Genero genero);
    Genero obtenerGeneroPorId(UUID id);
    void eliminarGenero(UUID id);
    // Otros métodos necesarios
}

