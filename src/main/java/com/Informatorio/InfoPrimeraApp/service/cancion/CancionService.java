package com.Informatorio.InfoPrimeraApp.service.cancion;



import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import com.Informatorio.InfoPrimeraApp.dto.CancionDto;

import java.util.List;
import java.util.UUID;

public interface CancionService {

    Cancion crearCancion(CancionDto cancionDto);

    void eliminarCancion(UUID id);

    CancionDto obtenerCancionPorId(UUID id);

    Cancion actualizarCancion(UUID idCancion, CancionDto cancionDto);

    List<CancionDto> obtenerCancionesPorFiltro(String nombre, String genero, String artista);

    List<CancionDto> obtenerTodasLasCanciones();

    List<CancionDto> obtenerCancionesAleatorias();

    List<CancionDto> buscarCanciones(String titulo, String genero, String artista, String album);
}

