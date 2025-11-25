package com.davidticona.apiblog.application.data.dto;

import java.util.List;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record BlogDto(
        Integer id,
        AutorDto autor,
        TemaDto tema,
        String titulo,
        String contenido,
        String periodicidad,
        Boolean permiteComentarios,
        ResumenPuntuacionDto resumenPuntuacion,
        List<ComentarioDto> comentarios
) {
}
