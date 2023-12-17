package com.Informatorio.InfoPrimeraApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorRespuestaDto {          // Info para recordar los pasos
    private String apiPath;               // La ruta de la API donde ocurrió el error
    private HttpStatus httpStatus;        // El estado HTTP de la respuesta
    private String errorMessage;          // Mensaje de error amigable para el usuario
    private LocalDateTime errorTime;      // Hora en que ocurrió el error
    private String developerMessage;      // Mensaje detallado del error, útil para desarrolladores
    private String errorCode;             // Un código de error interno, opcional para casos de uso más complejos
}

