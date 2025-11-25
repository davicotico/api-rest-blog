package com.davidticona.apiblog.application.service.impl;

import com.davidticona.apiblog.application.data.dto.HistorialDto;
import com.davidticona.apiblog.application.data.dto.TemaDto;
import com.davidticona.apiblog.application.data.entity.Blog;
import com.davidticona.apiblog.application.data.entity.Historial;
import com.davidticona.apiblog.application.repository.HistorialRepository;
import com.davidticona.apiblog.application.service.HistorialService;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Service
public class HistoricoBlogServiceImpl implements HistorialService {
    private final HistorialRepository repository;

    public HistoricoBlogServiceImpl(HistorialRepository repository) {
        this.repository = repository;
    }

    @Override
    public void guardarHistorial(Blog blog) {
        Historial historial = new Historial();
        historial.setBlog(blog);
        historial.setTema(blog.getTema());
        historial.setTitulo(blog.getTitulo());
        historial.setContenido(blog.getContenido());
        historial.setPeriodicidad(blog.getPeriodicidad());
        historial.setPermiteComentarios(blog.getPermiteComentarios());
        historial.setFechaActualizacion(LocalDateTime.now());
        repository.save(historial);
    }

    @Override
    public List<HistorialDto> obtenerHistorialDeBlog(Integer idBlog) {
        List<Historial> historial = repository.findByBlogIdOrderByIdDesc(idBlog);
        return historial.stream().map(item -> {
            TemaDto temaDto = new TemaDto(item.getTema().getId(), item.getTema().getTema());
            return new HistorialDto(
                    item.getId(),
                    item.getBlog().getId(),
                    temaDto,
                    item.getTitulo(),
                    item.getContenido(),
                    item.getPeriodicidad(),
                    item.getPermiteComentarios(),
                    item.getFechaActualizacion());
        }).toList();
    }
}
