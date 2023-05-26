package org.prolis.mempleado.repository;

import org.prolis.mempleado.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
