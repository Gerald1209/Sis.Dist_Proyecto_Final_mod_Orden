package org.prolis.paciente.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.paciente.entity.Paciente;
import org.prolis.paciente.repository.PacienteRepository;
import org.prolis.paciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private final PacienteRepository pacienteRepository;

    @Override
    public Paciente listarPorId(Long id) {
        Optional<Paciente> optionalPaciente = pacienteRepository.findById(id);
        return optionalPaciente.get();
    }

    @Override
    public List<Paciente> obtenerPacientes() {
        return pacienteRepository.findAll();
    }
}