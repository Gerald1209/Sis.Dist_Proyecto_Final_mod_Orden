package org.prolis.mtorden.controller;

import lombok.AllArgsConstructor;
import org.prolis.mtorden.entity.TipoOrden;
import org.prolis.mtorden.service.TipoOrdenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/tipo_orden")
public class TipoOrdenController {
    private TipoOrdenService tipoOrdenService;

    // http://localhost:8080/api/tipo_orden
    @GetMapping
    public ResponseEntity<List<TipoOrden>> listarTipoOrden(){
        List<TipoOrden> tipo_orden = tipoOrdenService.obtenerTipoOrden();
        return new ResponseEntity<>(tipo_orden, HttpStatus.OK);
    }

    // http://localhost:8080/api/tipo_orden/1
    @PutMapping("{id}")
    public  ResponseEntity<TipoOrden> listarPorId(@PathVariable("id") Long id){
        TipoOrden tipo_orden = tipoOrdenService.listarPorId(id);
        return  new ResponseEntity<>(tipo_orden,HttpStatus.OK);
    }
}
