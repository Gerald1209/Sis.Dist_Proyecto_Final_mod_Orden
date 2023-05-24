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
@RequestMapping("api/tipo_servicio")
public class TipoServicioController {
    private TipoServicioService tipoServicioService;

    // http://localhost:8080/api/tipo_servicio
    @GetMapping
    public ResponseEntity<List<TipoServicio>> listarTipoServicio(){
        List<TipoServicio> tiposervicio = tipoServicioService.obtenerTipoServicio();
        return new ResponseEntity<>(tiposervicio, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public  ResponseEntity<TipoServicio> listarPorId(@PathVariable("id") Long id){
        TipoServicio tiposervicio = tipoServicioService.listarPorId(id);
        return  new ResponseEntity<>(tiposervicio,HttpStatus.OK);
    }
}
