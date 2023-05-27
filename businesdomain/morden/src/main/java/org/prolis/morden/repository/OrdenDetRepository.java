package org.prolis.morden.repository;

import org.prolis.morden.entity.Orden;
import org.prolis.morden.entity.OrdenDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenDetRepository extends JpaRepository<OrdenDetalle, Long> {
}
