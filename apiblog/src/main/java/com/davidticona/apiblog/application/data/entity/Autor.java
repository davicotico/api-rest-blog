package com.davidticona.apiblog.application.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Data
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    private String nombres;
    private String paterno;
    private String materno;
    
    @Column(name = "nacimiento")
    private LocalDate nacimiento;

    @Column(name = "correo_electronico")
    private String correoElectronico;
}
