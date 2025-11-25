package com.davidticona.apiblog.application.service.impl;

import com.davidticona.apiblog.application.data.dto.AutorCreateDto;
import com.davidticona.apiblog.application.data.entity.Autor;
import com.davidticona.apiblog.application.data.entity.Pais;
import com.davidticona.apiblog.exception.NoEncontradoException;
import com.davidticona.apiblog.application.repository.AutorRepository;
import com.davidticona.apiblog.application.repository.PaisRepository;
import com.davidticona.apiblog.application.service.AutorService;
import com.davidticona.apiblog.exception.ObjectValidator;
import org.springframework.stereotype.Service;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Service
public class AutorServiceImpl implements AutorService {

    private final AutorRepository repository;
    private final PaisRepository paisRepository;
    private final ObjectValidator validator;

    public AutorServiceImpl(
            AutorRepository repository,
            PaisRepository paisRepository,
            ObjectValidator validator) {
        this.repository = repository;
        this.paisRepository = paisRepository;
        this.validator = validator;
    }

    @Override
    public Integer crear(AutorCreateDto dto) {
        validator.validate(dto);
        Pais pais = paisRepository.findByCodigo(dto.codigoPais())
                .orElseThrow(() -> new NoEncontradoException("Código de país desconocido"));
        Autor autor = new Autor();
        autor.setPais(pais);
        autor.setNombres(dto.nombres());
        autor.setPaterno(dto.paterno());
        autor.setMaterno(dto.materno());
        autor.setNacimiento(dto.nacimiento());
        autor.setCorreoElectronico(dto.correoElectronico());
        repository.save(autor);
        return autor.getId();
    }
}
