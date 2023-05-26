package org.prolis.mexamen.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_examenes")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexamen")
    private Long IdExamen;

    @Column(name = "idarealabservicio")
    private Long IdAreaLabServicio;

    @Column(name = "idtipomuestra")
    private Long IdTipoMuestra;

    @Column(name = "idunidadmedidas")
    private Long IdUnidadMedidas;

    @Column(name = "descripcion")
    private String Descripcion;

    @Column(name = "descripcioncorta")
    private String DescripcionCorta;

    @Column(name = "idperfil")
    private Long IdPerfil;
}
