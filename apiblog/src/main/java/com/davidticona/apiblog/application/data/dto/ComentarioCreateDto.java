package com.davidticona.apiblog.application.data.dto;

import jakarta.validation.constraints.*;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record ComentarioCreateDto(

        @NotBlank(message = "El código de país es requerido")
        @Size(min = 2, max = 2, message = "El código de país debe contener 2 caracteres")
        String codigoPais,

        @NotBlank(message = "Debe ingresar su nombre para comentar")
        @Size(min = 2, message = "El nombre debe contener por lo menos 2 caracteres")
        String nombreCompleto,

        @NotBlank(message = "El correo electrónico es requerido")
        @Email(message = "No es un correo electrónico válido")
        String correoElectronico,

        @NotBlank(message = "El comentario es requerido")
        @Size(min = 2, message = "El comentario debe contener por lo menos 2 caracteres")
        String comentario,

        @NotNull(message = "La puntuación es requerida")
        @Min(value = 0, message = "La puntuación mínima es 0")
        @Max(value = 10, message = "La puntuación máxima es 10")
        Integer puntuacion
) {
}
