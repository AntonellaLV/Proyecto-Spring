package com.Informatorio.InfoPrimeraApp.dominio;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ListaDeReproduccion extends Auditoria {

    private String nombre;

    @ManyToOne
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name = "lista_canciones", joinColumns = @JoinColumn(name = "lista_id"), inverseJoinColumns = @JoinColumn(name = "cancion_id"))
    private List<Cancion> canciones = new ArrayList<>();

    private boolean esPublica;
    private boolean repetir;
    private boolean aleatoria;
}
