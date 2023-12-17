package com.Informatorio.InfoPrimeraApp.repository;


import com.Informatorio.InfoPrimeraApp.dominio.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, UUID> {

    // Búsqueda de artistas por nombre
    List<Artista> findByNombreContaining(String nombre);
}

