package com.Informatorio.InfoPrimeraApp.mapper;

import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import com.Informatorio.InfoPrimeraApp.dto.CancionDto;

public class CancionMapper {

    public static CancionDto toCancionDto(Cancion cancion) {
        CancionDto cancionDto = new CancionDto();
        cancionDto.setId(cancion.getId().toString());
        cancionDto.setNombre(cancion.getNombre());
        cancionDto.setDuracion(cancion.getDuracion());
        // otros mapeos necesarios
        return cancionDto;
    }

    public static Cancion toCancion(CancionDto cancionDto) {
        Cancion cancion = new Cancion();
        // asume que el ID es manejado automáticamente o no necesario aquí
        cancion.setNombre(cancionDto.getNombre());
        cancion.setDuracion(cancionDto.getDuracion());
        // otros mapeos necesarios
        return cancion;
    }
}
