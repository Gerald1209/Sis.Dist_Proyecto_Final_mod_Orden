package org.prolis.tipo_orden.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.tipo_orden.entity.TipoOrden;
import org.prolis.tipo_orden.repository.TipoOrdenRepository;
import org.prolis.tipo_orden.service.TipoOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoOrdenServiceImpl implements TipoOrdenService {

    @Autowired
    private final TipoOrdenRepository paisRepository;
    @Override
    public TipoOrden guardarPais(TipoOrden p) {
        return paisRepository.save(p);
    }

    @Override
    public TipoOrden listarPorId(Long id) {
        return null;
    }

    @Override
    public List<TipoOrden> obtenerPais() {
        return paisRepository.findAll();
    }

    @Override
    public TipoOrden actualizarPais(TipoOrden p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
