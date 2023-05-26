package org.prolis.mtservicio.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mtservicio.entity.TipoServicio;
import org.prolis.mtservicio.repository.TipoServicioRepository;
import org.prolis.mtservicio.service.TipoServicioService;
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
