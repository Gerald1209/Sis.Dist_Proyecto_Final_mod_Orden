package org.prolis.mperfil.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_perfiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idperfiles")
    private Long IdPerfiles;

    @Column(name = "descripcion")
    private String Descripcion;

    @Column(name = "estado")
    private Integer Estado;
}
