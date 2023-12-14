package com.Informatorio.InfoPrimeraApp.service.listadereproduccion;


import com.Informatorio.InfoPrimeraApp.dominio.ListaDeReproduccion;
import java.util.UUID;

public interface ListaDeReproduccionService {
    ListaDeReproduccion crearListaDeReproduccion(ListaDeReproduccion lista);
    ListaDeReproduccion obtenerListaDeReproduccionPorId(UUID id);
    void eliminarListaDeReproduccion(UUID id);
    // Otros métodos necesarios
}
