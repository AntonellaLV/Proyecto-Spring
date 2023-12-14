package com.Informatorio.InfoPrimeraApp.service.usuario;


import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import java.util.UUID;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(UUID id);
    void eliminarUsuario(UUID id);
    // Otros métodos necesarios
}
