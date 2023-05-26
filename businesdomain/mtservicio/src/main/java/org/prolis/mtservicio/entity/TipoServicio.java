package org.prolis.mtservicio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_tiposervicio")
public class TipoServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idtiposervicio")
    private Long IdTipoServicio;

    @Column(name = "descripcion")
    private String Descripcion;
}

