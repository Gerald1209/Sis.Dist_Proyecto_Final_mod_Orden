package org.prolis.paciente.controller;

import lombok.AllArgsConstructor;
import org.prolis.paciente.entity.Paciente;
import org.prolis.paciente.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/pais")
public class PacienteController {
    private PacienteService paisService;

    @PostMapping
    public ResponseEntity<Paciente> guardarPais(@RequestBody Paciente p)
    {
        Paciente pais = paisService.guardarPais(p);
        return new ResponseEntity<>(pais, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<Paciente>> listarPais(){
        List<Paciente> paises = paisService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
