package org.prolis.empleado.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.empleado.entity.Empleado;
import org.prolis.empleado.repository.EmpleadoRepository;
import org.prolis.empleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private final EmpleadoRepository empleadoRepository;
    @Override
    public Empleado guardarEmpleados(Empleado e) {
        return empleadoRepository.save(e);
    }

    @Override
    public Empleado listarPorId(Long id) {
        Optional<Empleado> optionalEmpleado = empleadoRepository.findById(id);
        return optionalEmpleado.get();
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado actualizarPais(Empleado p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
