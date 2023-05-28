package org.prolis.mtservicio.controller;

import lombok.AllArgsConstructor;
import org.prolis.mtservicio.entity.TipoServicio;
import org.prolis.mtservicio.service.TipoServicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("api/tipo_servicio")
public class TipoServicioController {
    private TipoServicioService tipoServicioService;

    // http://localhost:8089/api/tipo_servicio
    @GetMapping
    public ResponseEntity<List<TipoServicio>> listarTipoServicio(){
        List<TipoServicio> tiposervicio = tipoServicioService.obtenerTipoServicio();
        return new ResponseEntity<>(tiposervicio, HttpStatus.OK);
    }

    // http://localhost:8089/api/tipo_servicio/1
    @GetMapping("{id}")
    public  ResponseEntity<TipoServicio> listarPorId(@PathVariable("id") Long id){
        TipoServicio tiposervicio = tipoServicioService.listarPorId(id);
        return  new ResponseEntity<>(tiposervicio,HttpStatus.OK);
    }
}
