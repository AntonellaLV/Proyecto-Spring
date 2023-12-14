package com.Informatorio.InfoPrimeraApp.mapper;


import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import com.Informatorio.InfoPrimeraApp.dto.UsuarioDto;

public class UsuarioMapper {

    public static UsuarioDto toUsuarioDto(Usuario usuario) {
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(usuario.getId().toString());
        usuarioDto.setNombreUsuario(usuario.getNombreUsuario());
        usuarioDto.setNombre(usuario.getNombre());
        // otros mapeos necesarios
        return usuarioDto;
    }

    public static Usuario toUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        // asume que el ID es manejado automáticamente o no necesario aquí
        usuario.setNombreUsuario(usuarioDto.getNombreUsuario());
        usuario.setNombre(usuarioDto.getNombre());
        // otros mapeos necesarios
        return usuario;
    }
}

