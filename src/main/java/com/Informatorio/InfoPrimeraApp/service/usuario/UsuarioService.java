package com.Informatorio.InfoPrimeraApp.service.usuario;



import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import com.Informatorio.InfoPrimeraApp.dto.UsuarioDto;

import java.util.List;
import java.util.UUID;

public interface UsuarioService {
    Usuario crearUsuario(UsuarioDto usuarioDto);

    boolean eliminarUsuario(UUID idUsuario);

    Usuario actualizarUsuario(UUID idUsuario, UsuarioDto usuarioDto);

    UsuarioDto obtenerUsuarioPorId(UUID idUsuario);

    List<UsuarioDto> obtenerTodosLosUsuarios();
}
