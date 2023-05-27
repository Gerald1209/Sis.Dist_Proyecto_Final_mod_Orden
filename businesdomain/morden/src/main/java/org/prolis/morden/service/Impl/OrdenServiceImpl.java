package org.prolis.morden.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.morden.entity.Orden;
import org.prolis.morden.entity.OrdenDetalle;
import org.prolis.morden.repository.OrdenDetRepository;
import org.prolis.morden.repository.OrdenRepository;
import org.prolis.morden.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdenServiceImpl implements OrdenService {

    @Autowired
    private final OrdenRepository ordenRepository;

    @Autowired
    private final OrdenDetRepository ordenDetRepository;
    @Override
    public Orden guardarPais(Orden p) {
        return ordenRepository.save(p);
    }

    @Override
    public List<Orden> obtenerPais() {
        return ordenRepository.findAll();
    }

    @Override
    public List<OrdenDetalle> obtenerDet() {
        return ordenDetRepository.findAll();
    }

}
