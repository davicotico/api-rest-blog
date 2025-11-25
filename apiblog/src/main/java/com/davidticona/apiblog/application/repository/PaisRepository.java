package com.davidticona.apiblog.application.repository;

import com.davidticona.apiblog.application.data.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    Optional<Pais> findByCodigo(String codigo);
}
