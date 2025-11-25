package com.davidticona.apiblog.exception;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
