package org.prolis.tipo_orden.service;

import org.prolis.tipo_orden.entity.TipoOrden;

import java.util.List;

public interface TipoOrdenService {
    TipoOrden guardarPais(TipoOrden p);
    TipoOrden listarPorId(Long id);
    List<TipoOrden> obtenerPais();
    TipoOrden actualizarPais(TipoOrden p);
    void eliminarPais(Long id);
}
