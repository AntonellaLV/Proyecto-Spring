package com.Informatorio.InfoPrimeraApp.mapper;


import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import com.Informatorio.InfoPrimeraApp.dto.GeneroDto;

public class GeneroMapper {

    public static GeneroDto toGeneroDto(Genero genero) {
        GeneroDto generoDto = new GeneroDto();
        generoDto.setId(genero.getId().toString());
        generoDto.setNombre(genero.getNombre());
        return generoDto;
    }

    public static Genero toGenero(GeneroDto generoDto) {
        Genero genero = new Genero();
        genero.setNombre(generoDto.getNombre());
        return genero;
    }
}

