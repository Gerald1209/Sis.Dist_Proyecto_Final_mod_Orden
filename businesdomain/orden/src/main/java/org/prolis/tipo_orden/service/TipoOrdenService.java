package org.prolis.tipo_orden.service;

import org.prolis.tipo_orden.entity.TipoOrden;

import java.util.List;

public interface TipoOrdenService {
    TipoOrden guardarTipoOrden(TipoOrden to);
    TipoOrden listarPorId(Long id);
    List<TipoOrden> obtenerTipoOrden();
    TipoOrden actualizarTipoOrden(TipoOrden to);
    void eliminarTipoOrden(Long id);
}
