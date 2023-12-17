package com.Informatorio.InfoPrimeraApp.dto;

import lombok.Data;

@Data
public class CancionDto {
    private String id;
    private String nombre;
    private Double duracion;
    private String artistaId;
    private String generoId;
    private Integer ranking;
    private String album;
}