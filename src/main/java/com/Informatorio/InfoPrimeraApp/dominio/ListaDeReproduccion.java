package com.Informatorio.InfoPrimeraApp.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class ListaDeReproduccion extends Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Boolean repetirAlFinalizar;
    private Boolean reproduccionAleatoria;
    private Boolean esPublica;

    @ManyToOne
    private Usuario usuario;

    @ManyToMany
    private List<Cancion> canciones;
}