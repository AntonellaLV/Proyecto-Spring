package com.Informatorio.InfoPrimeraApp.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

@Data
public class UsuarioDto {
    private String id;

    @NotBlank(message = "El nombre de usuario no puede estar vacío.")
    @Size(max = 50, message = "El nombre de usuario no puede tener más de 50 caracteres.")
    private String nombreUsuario;

    @NotBlank(message = "El nombre no puede estar vacío.")
    private String nombre;

    private List<ListaDeReproduccionResumenDto> listasDeReproduccion;
}
