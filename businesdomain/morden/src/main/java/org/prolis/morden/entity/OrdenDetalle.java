package org.prolis.morden.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_ordenesdetalle")
public class OrdenDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idordendetalle")
    private Long IdOrdenDetalle;

    @Column(name = "idorden", updatable = false,insertable = false)
    private Long IdOrden;

    @Column(name = "N_Orden")
    private Long N_Orden;

    @Column(name = "idexamen")
    private Long IdExamen;

    @Column(name = "activo")
    private String Activo;

    //TBD : Investigar Funcionamiento de relaciones en LOMBOK --
    //TODO: Para mientras queda asi https://medium.com/huawei-developers/database-relationships-in-spring-data-jpa-8d7181f50f60
   // @ManyToOne(fetch = FetchType.EAGER, targetEntity = Orden.class)
    //@JoinColumn(name = "idorden", referencedColumnName = "idorden")
   // private Orden orden;

}
