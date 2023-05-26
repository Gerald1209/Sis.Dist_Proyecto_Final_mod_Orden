package org.prolis.mempleado.controller;

import lombok.AllArgsConstructor;
import org.prolis.mempleado.entity.Empleado;
import org.prolis.mempleado.service.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("api/empleados")
public class EmpleadoController {
    private EmpleadoService empleadosService;

    // http://localhost:8080/api/empleados
    @GetMapping
    public ResponseEntity<List<Empleado>> listarEmpleados(){
        List<Empleado> emp = empleadosService.obtenerEmpleados();
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    // http://localhost:8080/api/empleados/1
    @GetMapping("{id}")
    public  ResponseEntity<Empleado> listarPorId(@PathVariable("id") Long id){
        Empleado emp = empleadosService.listarPorId(id);
        return  new ResponseEntity<>(emp,HttpStatus.OK);
    }
}

