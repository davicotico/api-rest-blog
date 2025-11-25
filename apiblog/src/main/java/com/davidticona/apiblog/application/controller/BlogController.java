package com.davidticona.apiblog.application.controller;

import com.davidticona.apiblog.application.data.dto.BlogCreateDto;
import com.davidticona.apiblog.application.data.dto.BlogUpdateDto;
import com.davidticona.apiblog.application.data.dto.ComentarioCreateDto;
import com.davidticona.apiblog.application.service.BlogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@RestController
@RequestMapping("blog")
@Tag(name = "Blog", description = "Operaciones relacionadas con los blogs")
public class BlogController {
    private final BlogService service;

    public BlogController(BlogService service) {
        this.service = service;
    }
    
    @GetMapping
    @Operation(summary = "Lista Blogs", description = "Obtiene la lista de todos los blogs")
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    @Operation(summary = "Crea un nuevo blog", description = "Crea un registro de blog en la base de datos")
    public ResponseEntity<?> crear(@RequestBody BlogCreateDto dto) {
        Integer id = service.crear(dto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PostMapping("{id}/comentario")
    @Operation(summary = "Agrega comentario a blog", description = "Permite agregar comentario a blog específico")
    public ResponseEntity<?> agregarComentario(
            @PathVariable("id") Integer idBlog,
            @RequestBody ComentarioCreateDto dto) {
        Integer idComentario = service.agregarComentario(idBlog, dto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(idComentario)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("{id}")
    @Operation(summary = "Actualiza blog", description = "Permite actualizar un registro de blog")
    public ResponseEntity<?> actualizar(
            @PathVariable("id") Integer idBlog,
            @RequestBody BlogUpdateDto dto) {
        service.actualizar(idBlog, dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    @Operation(summary = "Consultar blog", description = "Permite consultar un blog específico por identificador")
    public ResponseEntity<?> obtenerBlogPorId(@PathVariable("id") Integer idBlog) {
        return ResponseEntity.ok(service.consultar(idBlog));
    }

    @GetMapping("{id}/comentarios")
    @Operation(summary = "Obtiene comentarios de un blog", description = "Obtiene los comentarios de un blog específico")
    public ResponseEntity<?> obtenerComentariosDeBlog(@PathVariable("id") Integer idBlog) {
        return ResponseEntity.ok(service.consultarComentariosDeBlog(idBlog));
    }

    @GetMapping("{id}/historico")
    @Operation(summary = "Obtiene histórico de un blog", description = "Obtiene el histórico de cambios de un blog específico")
    public ResponseEntity<?> obtenerHistoricoDeBlog(@PathVariable("id") Integer idBlog) {
        return ResponseEntity.ok(service.consultarHistorialDeBlog(idBlog));
    }
}
