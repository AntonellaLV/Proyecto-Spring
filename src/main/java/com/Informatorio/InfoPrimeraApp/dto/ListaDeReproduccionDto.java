package com.Informatorio.InfoPrimeraApp.dto;


import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

@Data
public class ListaDeReproduccionDto {
    private String id;

    @NotBlank(message = "El nombre de la lista de reproducción no puede estar vacío.")
    @Size(max = 100, message = "El nombre de la lista de reproducción no puede tener más de 100 caracteres.")
    private String nombre;

    private String usuarioId;
    private List<String> cancionesIds;
    private boolean esPublica;
    private boolean repetir;
    private boolean aleatoria;
}

