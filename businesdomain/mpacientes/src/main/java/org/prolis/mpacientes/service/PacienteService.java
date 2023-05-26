package org.prolis.mpacientes.service;

import java.util.List;
import org.prolis.mpacientes.entity.Paciente;

public interface PacienteService {
    Paciente listarPorId(Long id);
    List<Paciente> obtenerPacientes();
}
