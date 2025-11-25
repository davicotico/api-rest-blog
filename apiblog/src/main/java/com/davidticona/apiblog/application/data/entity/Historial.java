package com.davidticona.apiblog.application.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Data
@Entity
@Table(name = "historial")
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_blog")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "id_tema")
    private Tema tema;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String contenido;

    private String periodicidad;

    @Column(name = "permite_comentarios")
    private Boolean permiteComentarios;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;
}
