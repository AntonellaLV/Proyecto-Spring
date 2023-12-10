package com.Informatorio.InfoPrimeraApp.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Usuario extends Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String nombreUsuario;

    @OneToMany(mappedBy = "usuario")
    private List<ListaDeReproduccion> listasDeReproduccion;


    public Usuario(String nombre, String nombreUsuario) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
    }
}
