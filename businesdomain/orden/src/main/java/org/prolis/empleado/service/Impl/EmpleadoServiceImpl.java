package org.prolis.empleado.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.empleado.entity.Empleado;
import org.prolis.empleado.repository.EmpleadoRepository;
import org.prolis.empleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private final EmpleadoRepository paisRepository;
    @Override
    public Empleado guardarPais(Empleado p) {
        return paisRepository.save(p);
    }

    @Override
    public Empleado listarPorId(Long id) {
        return null;
    }

    @Override
    public List<Empleado> obtenerPais() {
        return paisRepository.findAll();
    }

    @Override
    public Empleado actualizarPais(Empleado p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
