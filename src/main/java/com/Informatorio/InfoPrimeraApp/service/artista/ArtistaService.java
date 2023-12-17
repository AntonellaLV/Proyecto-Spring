package com.Informatorio.InfoPrimeraApp.service.artista;


import com.Informatorio.InfoPrimeraApp.dominio.Artista;
import com.Informatorio.InfoPrimeraApp.dto.ArtistaDto;

import java.util.List;
import java.util.UUID;

public interface ArtistaService {
    Artista crearArtista(ArtistaDto artistaDto);

    boolean eliminarArtista(UUID idArtista);

    Artista actualizarArtista(UUID idArtista, ArtistaDto artistaDto);

    ArtistaDto obtenerArtistaPorId(UUID idArtista);

    List<ArtistaDto> obtenerArtistasPorNombre(String nombre);

    List<ArtistaDto> obtenerTodosLosArtistas();
}

