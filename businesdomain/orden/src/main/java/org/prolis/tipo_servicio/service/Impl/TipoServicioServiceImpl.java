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
    public TipoServicio guardarTipoServicio(TipoServicio ts) {
        return tipoServicioRepository.save(ts);
    }

    @Override
    public TipoServicio listarPorId(Long id) {
        return null;
    }

    @Override
    public List<TipoServicio> obtenerTipoServicio() {
        return tipoServicioRepository.findAll();
    }

    @Override
    public TipoServicio actualizarTipoServicio(TipoServicio ts) {
        return null;
    }

    @Override
    public void eliminarTipoServicio(Long id) {

    }
}
