package org.prolis.morden.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "tbl_ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, orphanRemoval = true, targetEntity = OrdenDetalle.class)
    @JoinColumn(name = "idorden", referencedColumnName = "idorden")
    private Set<OrdenDetalle> detalles = new HashSet<OrdenDetalle>();
}
