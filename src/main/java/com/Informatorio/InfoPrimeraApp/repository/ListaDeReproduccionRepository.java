package com.Informatorio.InfoPrimeraApp.repository;


import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ListaDeReproduccionRepository extends JpaRepository<ListaDeReproduccion, UUID> {
}

