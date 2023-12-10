package com.Informatorio.InfoPrimeraApp.repository;

import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Agregar métodos de consulta personalizados
}

