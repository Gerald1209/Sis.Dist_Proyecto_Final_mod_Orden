package org.prolis.mreligion.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mreligion.entity.Religion;
import org.prolis.mreligion.repository.ReligionRepository;
import org.prolis.mreligion.service.ReligionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReligionServiceImpl implements ReligionService {

    @Autowired
    private final ReligionRepository tipo_ordenRepository;

    @Override
    public Religion listarPorId(Long id) {
        Optional<Religion> optionalTipoOrden = tipo_ordenRepository.findById(id);
        return optionalTipoOrden.get();
    }

    @Override
    public List<Religion> obtenerTipoOrden() {
        return tipo_ordenRepository.findAll();
    }
}