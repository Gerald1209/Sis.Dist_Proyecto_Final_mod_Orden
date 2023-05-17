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
@RequestMapping("api/pais")
public class TipoOrdenController {
    private TipoOrdenService paisService;

    @PostMapping
    public ResponseEntity<TipoOrden> guardarPais(@RequestBody TipoOrden p)
    {
        TipoOrden tipoOrden = paisService.guardarPais(p);
        return new ResponseEntity<>(tipoOrden, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<TipoOrden>> listarPais(){
        List<TipoOrden> paises = paisService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
