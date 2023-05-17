package org.prolis.orden_detalle.controller;

import lombok.AllArgsConstructor;
import org.prolis.orden_detalle.entity.OrdenDetalle;
import org.prolis.orden_detalle.service.OrdenDetalleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pais")
public class OrdenDetalleController {
    private OrdenDetalleService ordenDetalleService;

    @PostMapping
    public ResponseEntity<OrdenDetalle> guardarPais(@RequestBody OrdenDetalle p)
    {
        OrdenDetalle ordenDetalle = ordenDetalleService.guardarPais(p);
        return new ResponseEntity<>(ordenDetalle, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<OrdenDetalle>> listarPais(){
        List<OrdenDetalle> paises = ordenDetalleService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
