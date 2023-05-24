package org.prolis.tipo_orden.service;

import org.prolis.tipo_orden.entity.TipoOrden;

import java.util.List;

public interface TipoOrdenService {
    TipoOrden listarPorId(Long id);
    List<TipoOrden> obtenerTipoOrden();
}
