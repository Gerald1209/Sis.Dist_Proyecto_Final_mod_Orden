package org.prolis.mperfil.service.Impl;

import lombok.RequiredArgsConstructor;
import org.prolis.mperfil.entity.Perfil;
import org.prolis.mperfil.repository.PerfilRepository;
import org.prolis.mperfil.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PerfilServiceImpl implements PerfilService {

    @Autowired
    private final PerfilRepository tipo_ordenRepository;

    @Override
    public Perfil listarPorId(Long id) {
        Optional<Perfil> optionalTipoOrden = tipo_ordenRepository.findById(id);
        return optionalTipoOrden.get();
    }

    @Override
    public List<Perfil> obtenerTipoOrden() {
        return tipo_ordenRepository.findAll();
    }
}