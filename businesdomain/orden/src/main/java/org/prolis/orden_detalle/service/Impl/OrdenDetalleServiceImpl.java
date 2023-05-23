package org.prolis.orden_detalle.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.prolis.orden_detalle.entity.OrdenDetalle;
import org.prolis.orden_detalle.repository.OrdenDetalleRepository;
import org.prolis.orden_detalle.service.OrdenDetalleService;
import org.prolis.tipo_servicio.entity.TipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdenDetalleServiceImpl implements OrdenDetalleService {

    @Autowired
    private final OrdenDetalleRepository paisRepository;
    @Override
    public OrdenDetalle guardarPais(OrdenDetalle p) {
        return paisRepository.save(p);
    }

    @Override

    public OrdenDetalle listarPorId(Long id) {
        Optional<OrdenDetalle> optionalOrdenDetalle = paisRepository.findById(id);
        return optionalOrdenDetalle.get();
    }

    @Override
    public List<OrdenDetalle> obtenerPais() {
        return paisRepository.findAll();
    }

    @Override
    public OrdenDetalle actualizarPais(OrdenDetalle p) {
        return null;
    }

    @Override
    public void eliminarPais(Long id) {

    }
}
