package org.prolis.empleado.service;

import org.prolis.empleado.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado guardarPais(Empleado p);
    Empleado listarPorId(Long id);
    List<Empleado> obtenerPais();
    Empleado actualizarPais(Empleado p);
    void eliminarPais(Long id);
}
