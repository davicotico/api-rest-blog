package com.davidticona.apiblog.exception;

import java.time.LocalDateTime;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public record ErrorResponseDto(String mensaje, int codigo, LocalDateTime fechaHora) {

}
