package com.Informatorio.InfoPrimeraApp.dto;


import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
public class ArtistaDto {
    private String id;

    @NotBlank(message = "El nombre del artista no puede estar vacío.")
    @Size(max = 100, message = "El nombre del artista no puede tener más de 100 caracteres.")
    private String nombre;
}