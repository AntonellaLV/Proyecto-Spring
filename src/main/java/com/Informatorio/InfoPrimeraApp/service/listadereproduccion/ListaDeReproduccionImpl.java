package com.Informatorio.InfoPrimeraApp.service.listadereproduccion;


import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import com.Informatorio.InfoPrimeraApp.repository.ListaDeReproduccionRepository;
import com.Informatorio.InfoPrimeraApp.service.listadereproduccion.ListaDeReproduccionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ListaDeReproduccionServiceImpl implements ListaDeReproduccionService {

    private final ListaDeReproduccionRepository listaDeReproduccionRepository;

    @Override
    public ListaDeReproduccion crearListaDeReproduccion(ListaDeReproduccion lista) {
        return listaDeReproduccionRepository.save(lista);
    }

    @Override
    public ListaDeReproduccion obtenerListaDeReproduccionPorId(UUID id) {
        return listaDeReproduccionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista de reproducción no encontrada con id: " + id));
    }

    @Override
    public void eliminarListaDeReproduccion(UUID id) {
        listaDeReproduccionRepository.deleteById(id);
    }

    // Implementación de otros métodos necesarios
}

