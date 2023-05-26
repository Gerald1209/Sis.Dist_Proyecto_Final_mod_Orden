package org.prolis.mperfil.controller;

import lombok.AllArgsConstructor;
import org.prolis.mperfil.entity.Perfil;
import org.prolis.mperfil.service.PerfilService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/perfil")
public class PerfilController {
    private PerfilService tipoOrdenService;

    // http://localhost:8080/api/tipo_orden
    @GetMapping
    public ResponseEntity<List<Perfil>> listarTipoOrden(){
        List<Perfil> tipo_orden = tipoOrdenService.obtenerTipoOrden();
        return new ResponseEntity<>(tipo_orden, HttpStatus.OK);
    }

    // http://localhost:8080/api/tipo_orden/1
    @PutMapping("{id}")
    public  ResponseEntity<Perfil> listarPorId(@PathVariable("id") Long id){
        Perfil tipo_orden = tipoOrdenService.listarPorId(id);
        return  new ResponseEntity<>(tipo_orden,HttpStatus.OK);
    }
}
