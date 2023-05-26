package org.prolis.mpacientes.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mpacientes.entity.Paciente;
import org.prolis.mpacientes.repository.PacienteRepository;
import org.prolis.mpacientes.service.PacienteService;
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