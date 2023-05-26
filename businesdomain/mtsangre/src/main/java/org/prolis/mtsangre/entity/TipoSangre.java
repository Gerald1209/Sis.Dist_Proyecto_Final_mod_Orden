package org.prolis.mtsangre.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_tiposangre")
public class TipoSangre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtiposangre")
    private Long IdTipoSangre;

    @Column(name = "descripcion")
    private String Descripcion;
}
