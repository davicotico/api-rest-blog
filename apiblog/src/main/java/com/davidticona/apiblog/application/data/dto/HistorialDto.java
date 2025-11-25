package com.davidticona.apiblog.application.data.dto;

import java.time.LocalDateTime;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record HistorialDto(
        Integer id,
        Integer idBlog,
        TemaDto tema,
        String titulo,
        String contenido,
        String periodicidad,
        Boolean permiteComentarios,
        LocalDateTime fechaActualizacion
) {
}
