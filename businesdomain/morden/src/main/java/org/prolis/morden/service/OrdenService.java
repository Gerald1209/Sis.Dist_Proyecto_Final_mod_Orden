package org.prolis.morden.service;

import org.prolis.morden.entity.Orden;

import java.util.List;

public interface OrdenService {
    Orden guardarPais(Orden p);
    Orden listarPorId(Long id);
    List<Orden> obtenerPais();
    Orden actualizarPais(Orden p);
    void eliminarPais(Long id);
}
