package org.prolis.mreligion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tblcatreligion")
public class Religion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreligion")
    private Long idReligion;

    @Column(name = "descripcion")
    private String Descripcion;
}
