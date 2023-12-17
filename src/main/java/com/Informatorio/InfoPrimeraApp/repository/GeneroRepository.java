package com.Informatorio.InfoPrimeraApp.repository;


import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, UUID> {


    List<Genero> findByNombreStartingWith(String nombre);

    List<Genero> findByNombreContaining(String nombre);
}

