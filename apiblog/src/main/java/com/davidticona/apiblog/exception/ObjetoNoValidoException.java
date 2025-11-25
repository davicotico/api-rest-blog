package com.davidticona.apiblog.exception;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Getter
@Setter
@RequiredArgsConstructor
public class ObjetoNoValidoException extends RuntimeException {

    private final List<String> errorMessages;
}
