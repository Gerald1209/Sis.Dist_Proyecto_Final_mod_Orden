package org.prolis.examen.service;

import org.prolis.examen.entity.Examen;

import java.util.List;

public interface ExamenService {
    Examen guardarPais(Examen p);
    Examen listarPorId(Long id);
    List<Examen> obtenerPais();
    Examen actualizarPais(Examen p);
    void eliminarPais(Long id);
}
