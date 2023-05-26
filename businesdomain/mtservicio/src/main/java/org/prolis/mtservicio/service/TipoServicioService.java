package org.prolis.mtservicio.service;

import org.prolis.mtservicio.entity.TipoServicio;

import java.util.List;

public interface TipoServicioService {
    TipoServicio listarPorId(Long id);
    List<TipoServicio> obtenerTipoServicio();
}
