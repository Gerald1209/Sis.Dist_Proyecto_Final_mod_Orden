package org.prolis.orden.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.orden.entity.Orden;
import org.prolis.orden.repository.OrdenRepository;
import org.prolis.orden.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    private final OrdenRepository ordenRepository;
    @Override
    public Orden guardarPais(Orden p) {
        return ordenRepository.save(p);
    }

    @Override
    public Orden listarPorId(Long id) {
        return null;
    }

    @Override
    public List<Orden> obtenerPais() {
        return ordenRepository.findAll();
    }

    @Override
    public Orden actualizarPais(Orden p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
