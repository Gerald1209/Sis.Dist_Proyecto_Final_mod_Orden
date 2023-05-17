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
    private final TipoOrdenRepository tipo_ordenRepository;
    @Override
    public TipoOrden guardarTipoOrden(TipoOrden to) {
        return tipo_ordenRepository.save(to);
    }

    @Override
    public TipoOrden listarPorId(Long id) {
        return null;
    }

    @Override
    public List<TipoOrden> obtenerTipoOrden() {
        return tipo_ordenRepository.findAll();
    }

    @Override
    public TipoOrden actualizarTipoOrden(TipoOrden p) {
        return null;
    }

    @Override
    public void eliminarTipoOrden(Long id) {

    }
}
