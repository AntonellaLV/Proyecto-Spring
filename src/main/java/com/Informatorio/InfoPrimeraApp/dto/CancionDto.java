package com.Informatorio.InfoPrimeraApp.dto;


import lombok.Data;

@Data
public class CancionDto {
    private String id;
    private String nombre;
    private Double duracion;
    private String artistaId;
    private String generoId;
    // Puedes agregar más campos según los requerimientos
}

