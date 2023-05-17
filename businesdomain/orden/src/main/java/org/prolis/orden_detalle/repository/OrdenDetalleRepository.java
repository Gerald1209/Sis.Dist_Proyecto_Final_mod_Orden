package org.prolis.orden_detalle.repository;

import org.prolis.orden_detalle.entity.OrdenDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenDetalleRepository extends JpaRepository<OrdenDetalle, Long> {
}
