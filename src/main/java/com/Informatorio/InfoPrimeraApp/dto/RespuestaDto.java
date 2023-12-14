package com.Informatorio.InfoPrimeraApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RespuestaDto {
    private String statusCode;
    private String statusMsg;
}

