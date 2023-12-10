package com.Informatorio.InfoPrimeraApp.bootstrap;

import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import com.Informatorio.InfoPrimeraApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        // Crear algunos usuarios de prueba
        Usuario usuario1 = new Usuario("Nombre1", "Username1");
        Usuario usuario2 = new Usuario("Nombre2", "Username2");
        Usuario usuario3 = new Usuario("Nombre3", "Username3");

        // Guardar usuarios en la base de datos
        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));

        // Mensaje de confirmación
        System.out.println("Usuarios cargados: " + usuarioRepository.count());
    }
}
