package org.prolis.tipo_servicio.controller;

import lombok.AllArgsConstructor;
import org.prolis.tipo_servicio.entity.TipoServicio;
import org.prolis.tipo_servicio.service.TipoServicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "{http://localhost:8080}") -- No olvides encargarte de las conexiones

@RestController
@AllArgsConstructor
@RequestMapping("api/tipo_servicio")
public class TipoServicioController {
    private TipoServicioService tipoServicioService;

    @PostMapping
    public ResponseEntity<TipoServicio> guardarTipoServicio(@RequestBody TipoServicio ts)
    {
        TipoServicio tipoServicio = tipoServicioService.guardarTipoServicio(ts);
        return new ResponseEntity<>(tipoServicio, HttpStatus.CREATED);
    }

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

   /* @PutMapping("{id}")
    public  ResponseEntity<TipoServicio> actualizarTipoServicio(@PathVariable("id") Long id, @RequestBody TipoServicio input){
        input.setIdTipoServicio(id);
        TipoServicio tiposervicio = tipoServicioService.actualizarTipoServicio(input);
        return  new ResponseEntity<>(tiposervicio,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminarTipoServicio(@PathVariable("id") Long id)
    {
        tipoServicioService.eliminarTipoServicio(id);
        return new ResponseEntity<>("Tipo de servicio eliminado correctamente!!", HttpStatus.OK);
    }*/
}
