package com.Informatorio.InfoPrimeraApp.dto;


import lombok.Data;

import java.util.List;

@Data
public class ListaDeReproduccionDto {
    private String id;
    private String nombre;
    private String usuarioId;
    private List<String> cancionesIds;
    private boolean esPublica;
    private boolean repetir;
    private boolean aleatoria;

}

