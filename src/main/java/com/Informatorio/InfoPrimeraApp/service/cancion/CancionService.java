package com.Informatorio.InfoPrimeraApp.service.cancion;


import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import java.util.UUID;

public interface CancionService {
    Cancion crearCancion(Cancion cancion);
    Cancion obtenerCancionPorId(UUID id);
    void eliminarCancion(UUID id);
    // Otros métodos necesarios
}

