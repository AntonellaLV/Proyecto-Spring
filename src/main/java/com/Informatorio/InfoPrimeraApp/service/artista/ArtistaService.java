package com.Informatorio.InfoPrimeraApp.service.artista;


import com.Informatorio.InfoPrimeraApp.dominio.Artista;
import java.util.UUID;

public interface ArtistaService {
    Artista crearArtista(Artista artista);
    Artista obtenerArtistaPorId(UUID id);
    void eliminarArtista(UUID id);
    // Otros métodos necesarios
}
