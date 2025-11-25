package com.davidticona.apiblog.application.data.dto;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record ComentarioDto(
        Integer id,
        Integer idBlog,
        String pais,
        String nombreCompleto,
        String correoElectronico,
        String comentario,
        Integer puntuacion
) {
}
