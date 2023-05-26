package org.prolis.mpacientes.repository;


import org.prolis.mpacientes.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
