package com.Informatorio.InfoPrimeraApp.dto;


import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
public class GeneroDto {
    private String id;

    @NotBlank(message = "El nombre del género no puede estar vacío.")
    @Size(max = 50, message = "El nombre del género no puede tener más de 50 caracteres.")
    private String nombre;
}
