package com.Informatorio.InfoPrimeraApp.service.listadereproduccion;


import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import com.Informatorio.InfoPrimeraApp.dto.ListaDeReproduccionDto;

import java.util.List;
import java.util.UUID;

public interface ListaDeReproduccionService {
    ListaDeReproduccion crearListaDeReproduccion(ListaDeReproduccionDto listaDto);

    void eliminarListaDeReproduccion(UUID idLista);

    ListaDeReproduccion actualizarListaDeReproduccion(UUID idLista, ListaDeReproduccionDto listaDto);

    List<ListaDeReproduccionDto> obtenerListasDeReproduccionPorUsuario(UUID idUsuario);

    List<ListaDeReproduccionDto> obtenerTodasLasListasDeReproduccion();

    ListaDeReproduccionDto obtenerListaDeReproduccionPorId(UUID idLista);

    void agregarCancionALista(UUID idLista, UUID idCancion, UUID idUsuario);
    void eliminarCancionDeLista(UUID idLista, UUID idCancion, UUID idUsuario);
}
