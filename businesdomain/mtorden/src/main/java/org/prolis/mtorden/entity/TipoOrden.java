package org.prolis.mtorden.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_tipoorden")
public class TipoOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idtipoorden")
    private Long IdTipoOrden;

    @Column(name = "descripcion")
    private String Descripcion;
}

