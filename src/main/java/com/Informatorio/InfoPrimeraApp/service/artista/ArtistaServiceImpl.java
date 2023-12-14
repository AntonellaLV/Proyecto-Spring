package com.Informatorio.InfoPrimeraApp.service.artista;


import com.Informatorio.InfoPrimeraApp.dominio.Artista;
import com.Informatorio.InfoPrimeraApp.repository.ArtistaRepository;
import com.Informatorio.InfoPrimeraApp.service.artista.ArtistaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ArtistaServiceImpl implements ArtistaService {

    private final ArtistaRepository artistaRepository;

    @Override
    public Artista crearArtista(Artista artista) {
        return artistaRepository.save(artista);
    }

    @Override
    public Artista obtenerArtistaPorId(UUID id) {
        return artistaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artista no encontrado con id: " + id));
    }

    @Override
    public void eliminarArtista(UUID id) {
        artistaRepository.deleteById(id);
    }

    // Implementación de otros métodos necesarios
}

