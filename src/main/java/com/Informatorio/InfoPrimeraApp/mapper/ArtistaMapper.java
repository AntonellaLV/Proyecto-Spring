package com.Informatorio.InfoPrimeraApp.mapper;


import com.Informatorio.InfoPrimeraApp.dominio.Artista;
import com.Informatorio.InfoPrimeraApp.dto.ArtistaDto;

public class ArtistaMapper {

    public static ArtistaDto toArtistaDto(Artista artista) {
        ArtistaDto artistaDto = new ArtistaDto();
        artistaDto.setId(artista.getId().toString());
        artistaDto.setNombre(artista.getNombre());
        // otros mapeos necesarios
        return artistaDto;
    }

    public static Artista toArtista(ArtistaDto artistaDto) {
        Artista artista = new Artista();
        // asume que el ID es manejado automáticamente o no necesario aquí
        artista.setNombre(artistaDto.getNombre());
        // otros mapeos necesarios
        return artista;
    }
}
