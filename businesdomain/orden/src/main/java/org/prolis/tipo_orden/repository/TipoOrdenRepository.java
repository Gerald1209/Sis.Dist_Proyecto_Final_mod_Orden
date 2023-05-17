package org.prolis.tipo_orden.repository;

import org.prolis.tipo_orden.entity.TipoOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoOrdenRepository extends JpaRepository<TipoOrden, Long> {
}
