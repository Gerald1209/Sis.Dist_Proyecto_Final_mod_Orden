package org.prolis.orden_detalle.service;

import org.prolis.orden_detalle.entity.OrdenDetalle;

import java.util.List;

public interface OrdenDetalleService {
    OrdenDetalle guardarPais(OrdenDetalle p);
    OrdenDetalle listarPorId(Long id);
    List<OrdenDetalle> obtenerPais();
    OrdenDetalle actualizarPais(OrdenDetalle p);
    void eliminarPais(Long id);
}
