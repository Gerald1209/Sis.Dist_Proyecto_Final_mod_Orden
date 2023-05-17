package org.prolis.tipo_servicio.controller;

import lombok.AllArgsConstructor;
import org.prolis.tipo_servicio.entity.TipoServicio;
import org.prolis.tipo_servicio.service.TipoServicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pais")
public class TipoServicioController {
    private TipoServicioService tipoServicioService;

    @PostMapping
    public ResponseEntity<TipoServicio> guardarPais(@RequestBody TipoServicio p)
    {
        TipoServicio tipoServicio = tipoServicioService.guardarPais(p);
        return new ResponseEntity<>(tipoServicio, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<TipoServicio>> listarPais(){
        List<TipoServicio> paises = tipoServicioService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
