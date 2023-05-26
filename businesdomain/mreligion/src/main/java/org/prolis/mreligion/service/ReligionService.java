package org.prolis.mreligion.service;


import org.prolis.mreligion.entity.Religion;

import java.util.List;

public interface ReligionService {
    Religion listarPorId(Long id);
    List<Religion> obtenerTipoOrden();
}
