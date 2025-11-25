package com.davidticona.apiblog.exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ObjetoNoValidoException.class)
    public ResponseEntity<?> handleException(ObjetoNoValidoException exception) {
        return ResponseEntity
                .badRequest()
                .body(exception.getErrorMessages());
    }

    @ExceptionHandler(NoEncontradoException.class)
    public ResponseEntity<?> handleException(NoEncontradoException exception) {
        ErrorResponseDto error = new ErrorResponseDto(
                exception.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                LocalDateTime.now()
        );
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }

    @ExceptionHandler(ConflictoException.class)
    public ResponseEntity<?> handleException(ConflictoException exception) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(exception.getErrorMessages());
    }
    
    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> handleException(IllegalStateException exception) {
        ErrorResponseDto error = new ErrorResponseDto(
                exception.getMessage(),
                HttpStatus.BAD_REQUEST.value(),
                LocalDateTime.now()
        );
        return ResponseEntity
                .badRequest()
                .body(error);
    }
}
