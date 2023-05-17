package org.prolis.orden_detalle.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.prolis.empleado.entity.Empleado;
import org.prolis.examen.entity.Examen;
import org.prolis.orden.entity.Orden;
import org.prolis.paciente.entity.Paciente;

@Entity
@Data
@Table(name = "tbl_ordenesdetalle")
public class OrdenDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdOrdenDetalle;
    private Long IdOrden;
    private String N_Orden;
    private Long IdExamen;
    private String Activo;

    //TBD : Investigar Funcionamiento de relaciones en LOMBOK --
    //TODO: Para mientras queda asi https://medium.com/huawei-developers/database-relationships-in-spring-data-jpa-8d7181f50f60
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdOrden")
    private Orden orden;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdExamen")
    private Examen examen;
}
