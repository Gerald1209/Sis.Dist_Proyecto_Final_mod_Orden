package org.prolis.tipo_servicio.service;

import org.prolis.tipo_servicio.entity.TipoServicio;

import java.util.List;

public interface TipoServicioService {
    TipoServicio guardarPais(TipoServicio p);
    TipoServicio listarPorId(Long id);
    List<TipoServicio> obtenerPais();
    TipoServicio actualizarPais(TipoServicio p);
    void eliminarPais(Long id);
}
