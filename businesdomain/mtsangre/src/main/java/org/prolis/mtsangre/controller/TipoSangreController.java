package org.prolis.mtsangre.controller;

import lombok.AllArgsConstructor;
import org.prolis.mtsangre.entity.TipoSangre;
import org.prolis.mtsangre.service.TipoSangreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("api/tsangre")
public class TipoSangreController {
    private TipoSangreService tipoOrdenService;

    // http://localhost:8086/api/tipo_orden
    @GetMapping
    public ResponseEntity<List<TipoSangre>> listarTipoOrden(){
        List<TipoSangre> tipo_orden = tipoOrdenService.obtenerTipoOrden();
        return new ResponseEntity<>(tipo_orden, HttpStatus.OK);
    }

    // http://localhost:8086/api/tipo_orden/1
    @GetMapping("{id}")
    public  ResponseEntity<TipoSangre> listarPorId(@PathVariable("id") Long id){
        TipoSangre tipo_orden = tipoOrdenService.listarPorId(id);
        return  new ResponseEntity<>(tipo_orden,HttpStatus.OK);
    }
}
