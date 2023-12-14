package com.Informatorio.InfoPrimeraApp.service.cancion;


import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import com.Informatorio.InfoPrimeraApp.repository.CancionRepository;
import com.Informatorio.InfoPrimeraApp.service.cancion.CancionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CancionServiceImpl implements CancionService {

    private final CancionRepository cancionRepository;

    @Override
    public Cancion crearCancion(Cancion cancion) {
        return cancionRepository.save(cancion);
    }

    @Override
    public Cancion obtenerCancionPorId(UUID id) {
        return cancionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Canción no encontrada con id: " + id));
    }

    @Override
    public void eliminarCancion(UUID id) {
        cancionRepository.deleteById(id);
    }

    // Implementación de otros métodos necesarios
}
