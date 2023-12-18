package com.Informatorio.InfoPrimeraApp.bootstrap;

import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import com.Informatorio.InfoPrimeraApp.dominio.Artista;
import com.Informatorio.InfoPrimeraApp.dominio.Cancion;
import com.Informatorio.InfoPrimeraApp.dominio.Genero;
import com.Informatorio.InfoPrimeraApp.dominio.Usuario;
import com.Informatorio.InfoPrimeraApp.repository.ArtistaRepository;
import com.Informatorio.InfoPrimeraApp.repository.CancionRepository;
import com.Informatorio.InfoPrimeraApp.repository.GeneroRepository;
import com.Informatorio.InfoPrimeraApp.repository.UsuarioRepository;
import com.Informatorio.InfoPrimeraApp.repository.ListaDeReproduccionRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    private final CancionRepository cancionRepository;
    private final ArtistaRepository artistaRepository;
    private final GeneroRepository generoRepository;
    private final ListaDeReproduccionRepository listaDeReproduccionRepository;

    @Override
    public void run(String... args) throws Exception {
        cargarUsuarios();
        cargarArtistasYGeneros();
        cargarCanciones();
        cargarListasDeReproduccion();
        cargarDatosMasivos();
    }

    private void cargarUsuarios() {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("usuario_prueba");
        usuario.setNombre("Usuario de Prueba");
        usuario.setCreadoEn(LocalDateTime.now());
        usuarioRepository.save(usuario);
    }

    private void cargarArtistasYGeneros() {
        Artista artista = new Artista();
        artista.setNombre("Artista de Prueba");
        artista.setCreadoEn(LocalDateTime.now());
        artistaRepository.save(artista);

        Genero genero = new Genero();
        genero.setNombre("Genero de Prueba");
        genero.setCreadoEn(LocalDateTime.now());
        generoRepository.save(genero);
    }

    private void cargarCanciones() {
        Artista artista = artistaRepository.findAll().get(0);
        Genero genero = generoRepository.findAll().get(0);

        Cancion cancion = new Cancion();
        cancion.setNombre("Cancion de Prueba");
        cancion.setDuracion(3.5);
        cancion.setArtista(artista);
        cancion.setGenero(genero);
        cancion.setAlbum("Album de Prueba");
        cancion.setRanking(1);
        cancion.setCreadoEn(LocalDateTime.now());
        cancionRepository.save(cancion);
    }

    private void cargarListasDeReproduccion() {
        Usuario usuario = usuarioRepository.findAll().get(0);
        Cancion cancion = cancionRepository.findAll().get(0);

        ListaDeReproduccion lista = new ListaDeReproduccion();
        lista.setNombre("Lista de Prueba");
        lista.setCanciones(Collections.singletonList(cancion));
        lista.setUsuario(usuario);
        lista.setEsPublica(true);
        lista.setRepetir(false);
        lista.setAleatoria(false);
        lista.setCreadoEn(LocalDateTime.now());
        listaDeReproduccionRepository.save(lista);
    }

    private void cargarDatosMasivos() {
        // Creación masiva de artistas
        for (int i = 1; i <= 10; i++) {
            Artista artista = new Artista();
            artista.setNombre("Artista " + i);
            artista.setCreadoEn(LocalDateTime.now());
            artistaRepository.save(artista);
        }

        // Creación masiva de géneros
        for (int i = 1; i <= 5; i++) {
            Genero genero = new Genero();
            genero.setNombre("Género " + i);
            genero.setCreadoEn(LocalDateTime.now());
            generoRepository.save(genero);
        }

        // Obteniendo artistas y géneros aleatorios
        List<Artista> artistas = artistaRepository.findAll();
        List<Genero> generos = generoRepository.findAll();

        // Creación masiva de canciones
        for (int i = 1; i <= 20; i++) {
            Cancion cancion = new Cancion();
            cancion.setNombre("Canción " + i);
            cancion.setDuracion(Math.random() * 5); // Duración aleatoria entre 0 y 5 minutos
            cancion.setArtista(artistas.get((int)(Math.random() * artistas.size()))); // Artista aleatorio
            cancion.setGenero(generos.get((int)(Math.random() * generos.size()))); // Género aleatorio
            cancion.setAlbum("Álbum " + (i % 5 + 1)); // Álbum aleatorio
            cancion.setRanking((int)(Math.random() * 10 + 1)); // Ranking aleatorio entre 1 y 10
            cancion.setCreadoEn(LocalDateTime.now());
            cancionRepository.save(cancion);
        }
    }
}