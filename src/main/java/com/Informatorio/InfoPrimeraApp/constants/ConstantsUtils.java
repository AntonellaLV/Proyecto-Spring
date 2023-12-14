package com.Informatorio.InfoPrimeraApp.constants;


public class ConstantsUtils {

    // Constructor privado para prevenir instanciación
    private ConstantsUtils() {}

    // Códigos de Estado Comunes
    public static final String STATUS_OK = "200";
    public static final String STATUS_CREATED = "201";
    public static final String STATUS_ERROR = "500";

    // Mensajes de Éxito
    public static final String MESSAGE_OK = "Operación realizada con éxito.";
    public static final String MESSAGE_CREATED = "Recurso creado satisfactoriamente.";
    public static final String MESSAGE_UPDATED = "Recurso actualizado satisfactoriamente.";
    public static final String MESSAGE_DELETED = "Recurso eliminado satisfactoriamente.";

    // Mensajes de Error
    public static final String MESSAGE_ERROR = "Error al procesar la solicitud.";
    public static final String MESSAGE_NOT_FOUND = "Recurso no encontrado.";
    public static final String MESSAGE_BAD_REQUEST = "Datos proporcionados no son válidos.";

    // Mensajes Específicos para Usuarios
    public static final String USER_CREATED_SUCCESS = "Usuario creado satisfactoriamente.";
    public static final String USER_UPDATED_SUCCESS = "Usuario actualizado satisfactoriamente.";
    public static final String USER_DELETED_SUCCESS = "Usuario eliminado satisfactoriamente.";

    // Mensajes Específicos para Canciones
    public static final String SONG_ADDED_SUCCESS = "Canción añadida satisfactoriamente.";
    public static final String SONG_UPDATED_SUCCESS = "Canción actualizada satisfactoriamente.";
    public static final String SONG_DELETED_SUCCESS = "Canción eliminada satisfactoriamente.";

    // Mensajes Específicos para Listas de Reproducción
    public static final String PLAYLIST_CREATED_SUCCESS = "Lista de reproducción creada satisfactoriamente.";
    public static final String PLAYLIST_UPDATED_SUCCESS = "Lista de reproducción actualizada satisfactoriamente.";
    public static final String PLAYLIST_DELETED_SUCCESS = "Lista de reproducción eliminada satisfactoriamente.";

    // Mensajes Específicos para Artistas y Géneros
    public static final String ARTIST_UPDATED_SUCCESS = "Información del artista actualizada satisfactoriamente.";
    public static final String GENRE_ADDED_SUCCESS = "Género musical añadido satisfactoriamente.";
}
