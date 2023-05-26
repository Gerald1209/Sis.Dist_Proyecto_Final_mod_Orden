package org.prolis.morden.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Table(name = "tbl_ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdOrden;

    private String N_Orden;

    private Long IdEmpleado;
    private Long IdPaciente;
    private Long IdTipoServicio;
    private Long IdTipoOrden;

    private String Asistencia;
    private String Observaciones;
    private Date FechaOrden;
    private String Activo;
    private LocalDateTime FechaImprime;

    //Para obtener todos sus detalles ?????
    //TODO: Confirmar si este es su funcionamiento
    @OneToMany(mappedBy = "orden")
    private Collection<OrdenDetalle> children;
}
