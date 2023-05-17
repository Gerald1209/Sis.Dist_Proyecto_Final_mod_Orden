package org.prolis.tipo_servicio.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.tipo_servicio.entity.TipoServicio;
import org.prolis.tipo_servicio.repository.TipoServicioRepository;
import org.prolis.tipo_servicio.service.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoServicioServiceImpl implements TipoServicioService {

    @Autowired
    private final TipoServicioRepository tipoServicioRepository;
    @Override
    public TipoServicio guardarPais(TipoServicio p) {
        return tipoServicioRepository.save(p);
    }

    @Override
    public TipoServicio listarPorId(Long id) {
        return null;
    }

    @Override
    public List<TipoServicio> obtenerPais() {
        return tipoServicioRepository.findAll();
    }

    @Override
    public TipoServicio actualizarPais(TipoServicio p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
