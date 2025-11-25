package com.davidticona.apiblog.application.repository;

import com.davidticona.apiblog.application.data.entity.Historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Repository
public interface HistorialRepository extends JpaRepository<Historial, Integer> {
    List<Historial> findByBlogIdOrderByIdDesc(Integer blogId);
}
