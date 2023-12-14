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
public class Genero extends Auditoria {

    private String nombre;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cancion> canciones = new ArrayList<>();
}
