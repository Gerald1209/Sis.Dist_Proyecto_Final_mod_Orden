package org.prolis.mreligion.controller;

import lombok.AllArgsConstructor;
import org.prolis.mreligion.entity.Religion;
import org.prolis.mreligion.service.ReligionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = {"Access-Control-Allow-Origin","Access-Control-Allow-Credentials"})
@RequestMapping("api/religion")
public class ReligionController {
    private ReligionService tipoOrdenService;

    // http://localhost:8087/api/tipo_orden
    @GetMapping
    public ResponseEntity<List<Religion>> listarTipoOrden(){
        List<Religion> tipo_orden = tipoOrdenService.obtenerTipoOrden();
        return new ResponseEntity<>(tipo_orden, HttpStatus.OK);
    }

    // http://localhost:8087/api/tipo_orden/1
    @GetMapping("{id}")
    public  ResponseEntity<Religion> listarPorId(@PathVariable("id") Long id){
        Religion tipo_orden = tipoOrdenService.listarPorId(id);
        return  new ResponseEntity<>(tipo_orden,HttpStatus.OK);
    }
}
