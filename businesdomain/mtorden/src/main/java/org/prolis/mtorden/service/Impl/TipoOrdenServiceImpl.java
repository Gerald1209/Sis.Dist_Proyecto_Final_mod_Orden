package org.prolis.mtorden.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mtorden.entity.TipoOrden;
import org.prolis.mtorden.repository.TipoOrdenRepository;
import org.prolis.mtorden.service.TipoOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoOrdenServiceImpl implements TipoOrdenService {

    @Autowired
    private final TipoOrdenRepository tipo_ordenRepository;

    @Override
    public TipoOrden listarPorId(Long id) {
        Optional<TipoOrden> optionalTipoOrden = tipo_ordenRepository.findById(id);
        return optionalTipoOrden.get();
    }

    @Override
    public List<TipoOrden> obtenerTipoOrden() {
        return tipo_ordenRepository.findAll();
    }
}
