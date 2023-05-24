package org.prolis.tipo_servicio.service;

import org.prolis.tipo_servicio.entity.TipoServicio;

import java.util.List;

public interface TipoServicioService {
    TipoServicio listarPorId(Long id);
    List<TipoServicio> obtenerTipoServicio();
}
