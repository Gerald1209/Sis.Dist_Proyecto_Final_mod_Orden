package org.prolis.tipo_orden.controller;

import lombok.AllArgsConstructor;
import org.prolis.tipo_orden.entity.TipoOrden;
import org.prolis.tipo_orden.service.TipoOrdenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/tipo_orden")
public class TipoOrdenController {
    private TipoOrdenService tipoOrdenService;

    @PostMapping
    public ResponseEntity<TipoOrden> guardarTipoOrdenService(@RequestBody TipoOrden to)
    {
        TipoOrden tipoOrden = tipoOrdenService.guardarTipoOrden(to);
        return new ResponseEntity<>(tipoOrden, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<TipoOrden>> listarTipoOrden(){
        List<TipoOrden> tipo_orden = tipoOrdenService.obtenerTipoOrden();
        return new ResponseEntity<>(tipo_orden, HttpStatus.OK);
    }
}
