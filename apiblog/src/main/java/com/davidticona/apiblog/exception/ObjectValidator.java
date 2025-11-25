package com.davidticona.apiblog.exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Component
public class ObjectValidator {
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = factory.getValidator();

    public <T> void validate(T objectDto) {
        Set<ConstraintViolation<T>> errors = validator.validate(objectDto);
        if (!errors.isEmpty()) {
            var errorMessages = errors.stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toList());
            throw new ObjetoNoValidoException(errorMessages);
        }
    }
}
