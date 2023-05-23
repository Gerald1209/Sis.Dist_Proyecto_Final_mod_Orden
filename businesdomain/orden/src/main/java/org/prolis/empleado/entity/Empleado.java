package org.prolis.empleado.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpais;

    private Long IdIdentificacion;
    private Long IdPaisNac;
    private Long IdDepartamentoNac;
    private Long IdMunicipioNac;
    private Long IdPaisRes;
    private Long IdDepartamentoRes;
    private Long IdMunicipioRes;
    private Long IdEstadoCivil;
    private Long IdSexo;
    private Long IdNacionalidad;
    private String NumIdentificacion;
    private String NumINSS;
    private String CodMinsa;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private Date FechaNac;
    private String EdadIngreso;
    private String Email;
    private String DireccionDomiciliar;
    private String TelefonoDomiciliar;
    private String TelefonoMovil;
    private Date FechaContrato;
    private String UrlFoto;
    private String Activo;

}
