package org.prolis.mtorden.controller;

import org.prolis.mtorden.entity.TipoOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoOrdenRepository extends JpaRepository<TipoOrden, Long> {
}
