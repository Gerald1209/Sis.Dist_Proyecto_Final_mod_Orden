package org.prolis.mempleado.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEmpleado;
    private Long IdProfesiones;
    private Long IdMunicipioRes;
    private Long IdMunicipioNac;
    private Long IdDepartamentoNac;
    private Long IdDepartamentoRes;
    private Long IdPaisNac;
    private Long IdPaisRes;
    private Long IdIdentificacion;
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
