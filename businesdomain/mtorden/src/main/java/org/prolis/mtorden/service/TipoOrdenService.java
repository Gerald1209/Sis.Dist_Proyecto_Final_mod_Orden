package org.prolis.mtorden.service;

import org.prolis.mtorden.entity.TipoOrden;

import java.util.List;

public interface TipoOrdenService {
    TipoOrden listarPorId(Long id);
    List<TipoOrden> obtenerTipoOrden();
}
