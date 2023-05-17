package org.prolis.empleado.controller;

import lombok.AllArgsConstructor;
import org.prolis.empleado.entity.Empleado;
import org.prolis.empleado.service.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pais")
public class EmpleadoController {
    private EmpleadoService paisService;

    @PostMapping
    public ResponseEntity<Empleado> guardarPais(@RequestBody Empleado p)
    {
        Empleado pais = paisService.guardarPais(p);
        return new ResponseEntity<>(pais, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<Empleado>> listarPais(){
        List<Empleado> paises = paisService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
