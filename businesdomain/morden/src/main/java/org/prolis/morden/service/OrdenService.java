package org.prolis.morden.service;

import org.prolis.morden.entity.Orden;
import org.prolis.morden.entity.OrdenDetalle;

import java.util.List;

public interface OrdenService {
    Orden guardarPais(Orden p);
   // Orden listarPorId(Long id);
    List<Orden> obtenerPais();

    List<OrdenDetalle> obtenerDet();
}
