package com.davidticona.apiblog.application.repository;

import com.davidticona.apiblog.application.data.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {
}
