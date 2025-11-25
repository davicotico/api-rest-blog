package com.davidticona.apiblog.application.data.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record AutorCreateDto(
        
        @NotBlank(message = "El código de país es requerido")
        @Size(min = 2, max = 2, message = "El código de país debe contener 2 caracteres")
        String codigoPais,
        
        @NotBlank(message = "El nombre completo es requerido")
        String nombres,
        
        @NotBlank(message = "El apellido paterno es requerido")
        String paterno,
        
        @NotBlank(message = "El apellido materno es requerido")
        String materno,
        
        LocalDate nacimiento,
        
        @Email(message = "No es un correo electrónico válido")
        String correoElectronico
) {
}
