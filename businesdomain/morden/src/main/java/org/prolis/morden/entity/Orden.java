package org.prolis.morden.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_ordenes")
@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorden")
    private Long IdOrden;

    @Column(name = "n_orden")
    private String N_Orden;

    @Column(name = "idempleado")
    private Long IdEmpleado;

    @Column(name = "idpaciente")
    private Long IdPaciente;

    @Column(name = "idtiposervicio")
    private Long IdTipoServicio;

    @Column(name = "idtipoorden")
    private Long IdTipoOrden;

    @Column(name = "asistencia")
    private String Asistencia;

    @Column(name = "observaciones")
    private String Observaciones;

    @Column(name = "fechaorden")
    private String FechaOrden;

    @Column(name = "activo")
    private String Activo;

    @Column(name = "fechaimprime")
    private String FechaImprime;

    //Para obtener todos sus detalles ?????
    //TODO: Confirmar si este es su funcionamiento
    @OneToMany(mappedBy = "orden" ,  cascade = CascadeType.ALL)
    private Set<OrdenDetalle> detalles;
}
