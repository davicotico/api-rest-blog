package com.davidticona.apiblog.application.data.dto;

import java.time.LocalDate;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record AutorDto(
        Integer id,
        String codigoPais,
        String nombres,
        String paterno,
        String materno,
        LocalDate nacimiento,
        String correoElectronico
) {}
