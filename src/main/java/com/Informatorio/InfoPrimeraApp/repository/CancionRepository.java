package com.Informatorio.InfoPrimeraApp.repository;


import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CancionRepository extends JpaRepository<Cancion, UUID> {
    List<Cancion> findByNombreContaining(String nombre);
    List<Cancion> findByGeneroNombre(String nombreGenero);
    List<Cancion> findByArtistaNombre(String nombreArtista);
    List<Cancion> findByAlbum(String album);
    List<Cancion> findByArtistaNombreOrderByRankingDesc(String nombreArtista);

}



