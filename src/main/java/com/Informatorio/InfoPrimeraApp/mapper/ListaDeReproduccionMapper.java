package com.Informatorio.InfoPrimeraApp.mapper;


import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import com.Informatorio.InfoPrimeraApp.dto.ListaDeReproduccionDto;

import java.util.stream.Collectors;

public class ListaDeReproduccionMapper {

    public static ListaDeReproduccionDto toListaDeReproduccionDto(ListaDeReproduccion lista) {
        ListaDeReproduccionDto listaDto = new ListaDeReproduccionDto();
        listaDto.setId(lista.getId().toString());
        listaDto.setNombre(lista.getNombre());
        listaDto.setUsuarioId(lista.getUsuario().getId().toString());
        listaDto.setCancionesIds(lista.getCanciones().stream()
                .map(cancion -> cancion.getId().toString())
                .collect(Collectors.toList()));
        listaDto.setEsPublica(lista.isEsPublica());
        listaDto.setRepetir(lista.isRepetir());
        listaDto.setAleatoria(lista.isAleatoria());
        // otros mapeos necesarios
        return listaDto;
    }

    public static ListaDeReproduccion toListaDeReproduccion(ListaDeReproduccionDto listaDto) {
        ListaDeReproduccion lista = new ListaDeReproduccion();
        // asume que el ID es manejado automáticamente o no necesario aquí
        lista.setNombre(listaDto.getNombre());
        // El mapeo de canciones y usuario se manejaría aquí si es necesario
        // otros mapeos necesarios
        return lista;
    }
}

