package org.prolis.empleado.service;

import org.prolis.empleado.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado guardarEmpleados(Empleado e);
    Empleado listarPorId(Long id);
    List<Empleado> obtenerEmpleados();


    Empleado actualizarPais(Empleado p);
    void eliminarPais(Long id);
}
