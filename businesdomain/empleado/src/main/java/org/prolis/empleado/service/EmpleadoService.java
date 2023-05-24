package org.prolis.empleado.service;

import org.prolis.empleado.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado listarPorId(Long id);
    List<Empleado> obtenerEmpleados();
}
