package org.prolis.orden.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.prolis.empleado.entity.Empleado;
import org.prolis.orden_detalle.entity.OrdenDetalle;
import org.prolis.paciente.entity.Paciente;
import org.prolis.tipo_orden.entity.TipoOrden;
import org.prolis.tipo_servicio.entity.TipoServicio;

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


    //TBD : Investigar Funcionamiento de relaciones en LOMBOK --
    //TODO: Para mientras queda asi https://medium.com/huawei-developers/database-relationships-in-spring-data-jpa-8d7181f50f60

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdEmpleado")
    private Empleado empleado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdPaciente")
    private Paciente pacientes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdTipoServicio")
    private TipoServicio servicio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdTipoOrden")
    private TipoOrden orden;

    //Para obtener todos sus detalles ?????
    //TODO: Confirmar si este es su funcionamiento
    @OneToMany(mappedBy = "orden")
    private Collection<OrdenDetalle> children;
}
