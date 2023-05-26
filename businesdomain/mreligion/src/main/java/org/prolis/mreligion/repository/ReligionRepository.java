package org.prolis.mreligion.repository;

import org.prolis.mreligion.entity.Religion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReligionRepository extends JpaRepository<Religion, Long> {
}
