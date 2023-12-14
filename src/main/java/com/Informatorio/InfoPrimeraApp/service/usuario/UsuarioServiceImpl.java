package com.Informatorio.InfoPrimeraApp.service.usuario;


import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import com.Informatorio.InfoPrimeraApp.repository.UsuarioRepository;
import com.Informatorio.InfoPrimeraApp.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorId(UUID id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
    }

    @Override
    public void eliminarUsuario(UUID id) {
        usuarioRepository.deleteById(id);
    }

    // Implementación de otros métodos necesarios
}
