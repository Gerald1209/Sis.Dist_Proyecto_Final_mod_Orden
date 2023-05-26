package org.prolis.mtorden.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_tipoorden")
public class TipoOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdTipoOrden;
    private String Descripcion;
}

