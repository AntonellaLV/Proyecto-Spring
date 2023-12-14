package com.Informatorio.InfoPrimeraApp.dominio;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cancion extends Auditoria {

    private String nombre;
    private Double duracion;

    @ManyToOne
    private Artista artista;

    @ManyToOne
    private Genero genero;
}
