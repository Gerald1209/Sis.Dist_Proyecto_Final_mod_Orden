package org.prolis.orden.controller;

import lombok.AllArgsConstructor;
import org.prolis.orden.entity.Orden;
import org.prolis.orden.service.OrdenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pais")
public class OrdenController {
    private OrdenService ordenService;

    @PostMapping
    public ResponseEntity<Orden> guardarPais(@RequestBody Orden p)
    {
        Orden pais = ordenService.guardarPais(p);
        return new ResponseEntity<>(pais, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<Orden>> listarPais(){
        List<Orden> paises = ordenService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
