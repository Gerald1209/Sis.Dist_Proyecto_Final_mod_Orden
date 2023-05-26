package org.prolis.mtsangre.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mtsangre.entity.TipoSangre;
import org.prolis.mtsangre.repository.TipoSangreRepository;
import org.prolis.mtsangre.service.TipoSangreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoSangreServiceImpl implements TipoSangreService {

    @Autowired
    private final TipoSangreRepository tipo_ordenRepository;

    @Override
    public TipoSangre listarPorId(Long id) {
        Optional<TipoSangre> optionalTipoOrden = tipo_ordenRepository.findById(id);
        return optionalTipoOrden.get();
    }

    @Override
    public List<TipoSangre> obtenerTipoOrden() {
        return tipo_ordenRepository.findAll();
    }
}