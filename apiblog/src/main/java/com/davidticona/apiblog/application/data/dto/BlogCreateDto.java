package com.davidticona.apiblog.application.data.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record BlogCreateDto(
        @NotNull(message = "El ID del autor es requerido")
        Integer idAutor,

        @NotNull(message = "El ID del tema es requerido")
        Integer idTema,

        @NotBlank(message = "El título es requerido")
        @Size(min = 2, max = 255, message = "El título debe tener entre 2 y 255 caracteres")
        String titulo,

        @NotBlank(message = "El contenido es requerido")
        String contenido,

        String periodicidad,

        @NotNull(message = "Se requiere valor booleano para permitir o no los comentarios")
        Boolean permiteComentarios
) {
}
