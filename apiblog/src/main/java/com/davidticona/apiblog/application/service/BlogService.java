package com.davidticona.apiblog.application.service;

import com.davidticona.apiblog.application.data.dto.ComentarioDto;
import com.davidticona.apiblog.application.data.dto.HistorialDto;
import com.davidticona.apiblog.application.data.dto.BlogDto;
import com.davidticona.apiblog.application.data.dto.BlogUpdateDto;
import com.davidticona.apiblog.application.data.dto.ComentarioCreateDto;
import com.davidticona.apiblog.application.data.dto.BlogCreateDto;
import com.davidticona.apiblog.application.data.dto.BlogPlainDto;
import java.util.List;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public interface BlogService {

    List<BlogPlainDto> listar();

    BlogDto consultar(Integer id);

    Integer crear(BlogCreateDto dto);

    void actualizar(Integer idBlog, BlogUpdateDto dto);

    Integer agregarComentario(Integer idBlog, ComentarioCreateDto dto);

    List<ComentarioDto> consultarComentariosDeBlog(Integer idBlog);

    List<HistorialDto> consultarHistorialDeBlog(Integer idBlog);
}
