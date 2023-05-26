package org.prolis.mtsangre.service;

import org.prolis.mtsangre.entity.TipoSangre;

import java.util.List;

public interface TipoSangreService {
    TipoSangre listarPorId(Long id);
    List<TipoSangre> obtenerTipoOrden();
}
