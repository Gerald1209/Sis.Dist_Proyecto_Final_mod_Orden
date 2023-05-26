package org.prolis.mpacientes.controller;

import lombok.AllArgsConstructor;
import org.prolis.mpacientes.entity.Paciente;
import org.prolis.mpacientes.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("api/paciente")
public class PacienteController {
    private PacienteService pacienteService;

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<Paciente>> listarPais(){
        List<Paciente> paciente = pacienteService.obtenerPacientes();
        return new ResponseEntity<>(paciente, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public  ResponseEntity<Paciente> listarPorId(@PathVariable("id") Long id){
        Paciente tiposervicio = pacienteService.listarPorId(id);
        return  new ResponseEntity<>(tiposervicio,HttpStatus.OK);
    }
}
