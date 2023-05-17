package org.prolis.paciente.service;

import org.prolis.paciente.entity.Paciente;

import java.util.List;

public interface PacienteService {
    Paciente guardarPais(Paciente p);
    Paciente listarPorId(Long id);
    List<Paciente> obtenerPais();
    Paciente actualizarPais(Paciente p);
    void eliminarPais(Long id);
}
