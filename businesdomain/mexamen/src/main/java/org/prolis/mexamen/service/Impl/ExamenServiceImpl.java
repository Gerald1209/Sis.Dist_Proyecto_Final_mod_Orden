package org.prolis.mexamen.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mexamen.entity.Examen;
import org.prolis.mexamen.repository.ExamenRepository;
import org.prolis.mexamen.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private final ExamenRepository paisRepository;
    @Override
    public Examen guardarPais(Examen p) {
        return paisRepository.save(p);
    }

    @Override
    public Examen listarPorId(Long id) {
        Optional<Examen> optionalTipoOrden = paisRepository.findById(id);
        return optionalTipoOrden.get();
    }

    @Override
    public List<Examen> obtenerPais() {
        return paisRepository.findAll();
    }

    @Override
    public Examen actualizarPais(Examen p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
