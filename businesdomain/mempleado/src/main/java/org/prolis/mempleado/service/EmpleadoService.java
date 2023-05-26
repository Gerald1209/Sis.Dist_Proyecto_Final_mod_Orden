package org.prolis.mempleado.service;

import org.prolis.mempleado.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado listarPorId(Long id);
    List<Empleado> obtenerEmpleados();
}