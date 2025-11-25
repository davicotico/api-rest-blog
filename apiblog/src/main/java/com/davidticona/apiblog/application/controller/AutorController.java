package com.davidticona.apiblog.application.controller;

import com.davidticona.apiblog.application.data.dto.AutorCreateDto;
import com.davidticona.apiblog.application.service.AutorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@RestController
@RequestMapping("autor")
@Tag(name = "Autor", description = "Operaciones relacionadas con autor de blog")
public class AutorController {
    private final AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "Registra un nuevo autor", description = "Permite registrar un nuevo autor de blog")
    public ResponseEntity<?> crearAutor(@RequestBody AutorCreateDto dto) {
        System.out.println(dto);
        Integer idAAutor = service.crear(dto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(idAAutor)
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
