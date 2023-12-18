package com.Informatorio.InfoPrimeraApp.dto;

import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class CancionDto {
    private String id;

    @NotBlank(message = "El nombre de la canción no puede estar vacío.")
    private String nombre;

    @NotNull(message = "La duración de la canción no puede ser nula.")
    @Positive(message = "La duración de la canción debe ser un número positivo.")
    private Double duracion;

    @NotBlank(message = "El ID del artista no puede estar vacío.")
    private String artistaId;

    @NotBlank(message = "El ID del género no puede estar vacío.")
    private String generoId;

    private Integer ranking;
    private String album;
}