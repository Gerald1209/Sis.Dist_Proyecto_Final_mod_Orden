package org.prolis.mexamen.controller;

import lombok.AllArgsConstructor;
import org.prolis.mexamen.entity.Examen;
import org.prolis.mexamen.service.ExamenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("api/examen")
public class ExamenController {
    private ExamenService paisService;

    @PostMapping
    public ResponseEntity<Examen> guardarPais(@RequestBody Examen p)
    {
        Examen pais = paisService.guardarPais(p);
        return new ResponseEntity<>(pais, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<Examen>> listarPais(){
        List<Examen> paises = paisService.obtenerPais();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }
}
