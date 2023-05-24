package org.prolis.paciente.service;

import org.prolis.paciente.entity.Paciente;

import java.util.List;

public interface PacienteService {
    Paciente listarPorId(Long id);
    List<Paciente> obtenerPacientes();
}
