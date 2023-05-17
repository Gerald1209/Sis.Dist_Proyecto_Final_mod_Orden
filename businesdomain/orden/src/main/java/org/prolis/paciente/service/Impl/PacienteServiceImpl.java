package org.prolis.paciente.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.paciente.entity.Paciente;
import org.prolis.paciente.repository.PacienteRepository;
import org.prolis.paciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private final PacienteRepository paisRepository;
    @Override
    public Paciente guardarPais(Paciente p) {
        return paisRepository.save(p);
    }

    @Override
    public Paciente listarPorId(Long id) {
        return null;
    }

    @Override
    public List<Paciente> obtenerPais() {
        return paisRepository.findAll();
    }

    @Override
    public Paciente actualizarPais(Paciente p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
