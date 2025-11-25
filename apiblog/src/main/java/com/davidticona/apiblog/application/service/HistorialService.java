package com.davidticona.apiblog.application.service;

import com.davidticona.apiblog.application.data.dto.HistorialDto;
import com.davidticona.apiblog.application.data.entity.Blog;
import java.util.List;

/**
 *
 * @author David Tomas Ticona Saravia
 */
public interface HistorialService {

    void guardarHistorial(Blog blog);

    List<HistorialDto> obtenerHistorialDeBlog(Integer idBlog);
}
