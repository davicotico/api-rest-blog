package com.davidticona.apiblog.application.data.dto;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record BlogPlainDto(
        Integer id,
        String autor,
        String tema,
        String titulo,
        String contenido,
        String periodicidad,
        Boolean permiteComentarios
        ) {

}
