package org.prolis.orden.service;

import org.prolis.orden.entity.Orden;

import java.util.List;

public interface OrdenService {
    Orden guardarPais(Orden p);
    Orden listarPorId(Long id);
    List<Orden> obtenerPais();
    Orden actualizarPais(Orden p);
    void eliminarPais(Long id);
}
