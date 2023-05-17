package org.prolis.examen.repository;

import org.prolis.examen.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen, Long> {
}
