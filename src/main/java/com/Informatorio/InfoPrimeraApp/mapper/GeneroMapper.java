package com.Informatorio.InfoPrimeraApp.mapper;


import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import com.Informatorio.InfoPrimeraApp.dto.GeneroDto;

public class GeneroMapper {

    public static GeneroDto toGeneroDto(Genero genero) {
        GeneroDto generoDto = new GeneroDto();
        generoDto.setId(genero.getId().toString());
        generoDto.setNombre(genero.getNombre());
        // otros mapeos necesarios
        return generoDto;
    }

    public static Genero toGenero(GeneroDto generoDto) {
        Genero genero = new Genero();
        // asume que el ID es manejado automáticamente o no necesario aquí
        genero.setNombre(generoDto.getNombre());
        // otros mapeos necesarios
        return genero;
    }
}

