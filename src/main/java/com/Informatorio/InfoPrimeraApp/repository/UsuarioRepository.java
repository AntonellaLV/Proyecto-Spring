package com.Informatorio.InfoPrimeraApp.repository;


import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    // Búsqueda de usuarios por nombre o parte del nombre
    List<Usuario> findByNombreStartingWith(String nombre);
}


