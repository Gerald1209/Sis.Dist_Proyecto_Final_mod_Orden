package org.prolis.tipo_servicio.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.tipo_servicio.entity.TipoServicio;
import org.prolis.tipo_servicio.repository.TipoServicioRepository;
import org.prolis.tipo_servicio.service.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoServicioServiceImpl implements TipoServicioService {

    @Autowired
    private final TipoServicioRepository tipoServicioRepository;

    @Override
    public TipoServicio listarPorId(Long id) {
        Optional<TipoServicio> optionalTipoServicio = tipoServicioRepository.findById(id);
        return optionalTipoServicio.get();
    }

    @Override
    public List<TipoServicio> obtenerTipoServicio() {
        return tipoServicioRepository.findAll();
    }
}
