package com.Informatorio.InfoPrimeraApp.repository;

import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ListaDeReproduccionRepository extends JpaRepository<ListaDeReproduccion, UUID> {


    List<ListaDeReproduccion> findByNombreStartingWith(String nombre);


    @Query("SELECT l FROM ListaDeReproduccion l WHERE SIZE(l.canciones) > :count")
    List<ListaDeReproduccion> findByCancionesCountGreaterThan(@Param("count") int count);

    List<ListaDeReproduccion> findByUsuarioId(UUID idUsuario);

    List<ListaDeReproduccion> findByEsPublicaTrueAndNombreContaining(String nombre);

    List<ListaDeReproduccion> findByUsuarioIdOrderByCreadoEnDesc(UUID idUsuario);
}

