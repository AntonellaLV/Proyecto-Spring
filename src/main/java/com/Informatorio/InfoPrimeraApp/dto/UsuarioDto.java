package com.Informatorio.InfoPrimeraApp.dto;

import lombok.Data;

import java.util.List;

@Data
public class UsuarioDto {
    private String id;
    private String nombreUsuario;
    private String nombre;
    private List<ListaDeReproduccionResumenDto> listasDeReproduccion;
}
