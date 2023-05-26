package org.prolis.mperfil.service;

import org.prolis.mperfil.entity.Perfil;

import java.util.List;

public interface PerfilService {
    Perfil listarPorId(Long id);
    List<Perfil> obtenerTipoOrden();
}
